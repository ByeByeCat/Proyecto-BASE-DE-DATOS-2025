package VISTA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuPrincipal extends JFrame implements ActionListener {
    private JButton btnVendedor, btnCliente, btnAdministrador;
    private JLabel lblTitulo;
    private final Color ROSADO_CLARO = new Color(255, 220, 230); // Fondo
    private final Color ROSADO_BOTON = new Color(200, 80, 120);    // Botones
    private final Color ROSADO_HOVER = new Color(230, 100, 140);  // Hover

    public MenuPrincipal() {
        setTitle("Taller de Ropa - Menú Principal");
        setSize(500, 450); // Tamaño más compacto para un menú
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        crearGUI();
        setVisible(true);
    }

    private void crearGUI() {
        JPanel panelFondo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(ROSADO_CLARO);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panelFondo.setLayout(new GridBagLayout());


        JPanel panelContenedor = new JPanel();
        panelContenedor.setLayout(new BoxLayout(panelContenedor, BoxLayout.Y_AXIS));
        panelContenedor.setOpaque(false); // Transparente



        lblTitulo = new JLabel("¿QUÉ TIPO DE USUARIO ERES?");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitulo.setForeground(new Color(100, 40, 60));
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 30, 0));


        btnVendedor = crearBoton("VENDEDOR");
        btnCliente = crearBoton("CLIENTE");
        btnAdministrador = crearBoton("ADMINISTRADOR");


        int espacio = 15;

        panelContenedor.add(lblTitulo);
        panelContenedor.add(btnVendedor);
        panelContenedor.add(Box.createVerticalStrut(espacio));
        panelContenedor.add(btnCliente);
        panelContenedor.add(Box.createVerticalStrut(espacio));
        panelContenedor.add(btnAdministrador);
        panelFondo.add(panelContenedor);

        add(panelFondo);
    }

    private JButton crearBoton(String texto) {
        JButton button = new JButton(texto);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setBackground(ROSADO_BOTON);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setPreferredSize(new Dimension(250, 50));
        button.setMaximumSize(new Dimension(250, 50));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(this);


        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(ROSADO_HOVER);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(ROSADO_BOTON);
            }
        });
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnVendedor) {

            new MenuVendedor().setVisible(true);
            this.dispose();
        } else if (e.getSource() == btnCliente) {
            new MenuCliente().setVisible(true);
            this.dispose();
        } else if (e.getSource() == btnAdministrador) {
            new MenuAdministrador().setVisible(true);
            this.dispose();
        }
    }


}
