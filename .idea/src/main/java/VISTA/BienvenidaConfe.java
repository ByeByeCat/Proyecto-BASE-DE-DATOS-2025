package VISTA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BienvenidaConfe extends JFrame implements ActionListener {
    private JButton btnContinuar;
    private JLabel lblBienvenida, lblEslogan;

    public BienvenidaConfe() {

        setTitle("Taller de Confecciones - Bienvenida");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        crearGUI();
        setVisible(true);
    }

    private void crearGUI() {
        // Panel personalizado con fondo
        JPanel panelFondo = new JPanel() {
            private  final  Color rosado = new Color(255, 220, 230);
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {

                    Graphics2D g2d = (Graphics2D) g;

                    g.setColor(rosado);
                    g.fillRect(0, 0, getWidth(), getHeight());

                } catch (Exception e) {
                    // Si hay error, fondo simple
                    g.setColor(new Color(240, 240, 240));
                    g.fillRect(0, 0, getWidth(), getHeight());
                }
            }
        };

        panelFondo.setLayout(new BorderLayout());


        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new BoxLayout(panelCentral, BoxLayout.Y_AXIS));
        panelCentral.setOpaque(false); // Transparente para ver el fondo


        lblBienvenida = new JLabel("BIENVENIDOS AL TALLER DE ROPA");
        lblBienvenida.setFont(new Font("Georgia", Font.BOLD, 48));
        lblBienvenida.setForeground(new Color(100,40,60));
        lblBienvenida.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblBienvenida.setBorder(BorderFactory.createEmptyBorder(50, 0, 30, 0));

        lblEslogan = new JLabel("Donde lo que quieras se hace realidad");
        lblEslogan.setFont(new Font("Arial", Font.ITALIC, 28));
        lblEslogan.setForeground(new Color(150, 60, 90)); // Amarillo claro
        lblEslogan.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblEslogan.setBorder(BorderFactory.createEmptyBorder(0, 0, 80, 0));

        btnContinuar = new JButton("SIGA POR FAVOR →");
        btnContinuar.setFont(new Font("Arial", Font.BOLD, 20));
        btnContinuar.setBackground(new Color(200, 80, 1200)); // Verde
        btnContinuar.setForeground(Color.WHITE);
        btnContinuar.setFocusPainted(false);
        btnContinuar.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        btnContinuar.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnContinuar.addActionListener(this);

        // Efecto hover para el botón
        btnContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContinuar.setBackground(new Color(230, 100, 140)); // Verde más claro
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnContinuar.setBackground(new Color(200, 80, 120)); // Verde original
            }
        });

        // Agregar componentes al panel central
        panelCentral.add(lblBienvenida);
        panelCentral.add(lblEslogan);
        panelCentral.add(btnContinuar);

        // Agregar panel central al panel fondo
        panelFondo.add(panelCentral, BorderLayout.CENTER);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnContinuar) {
            // Cerrar esta ventana y abrir el login
            new MenuPrincipal(); // Tu clase de login
            this.dispose(); // Cerrar ventana actual
        }
    }

    // Para probar directamente
    public static void main(String[] args) {
        // Usar SwingUtilities para thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BienvenidaConfe();
            }
        });
    }

}
