# INFORME DE NORMALIZACIÓN HASTA TERCERA FORMA NORMAL (3FN)

## 1. Introducción

El presente informe describe el proceso de normalización realizado sobre el modelo de datos de una empresa dedicada a la confección de uniformes y prendas de vestir.  
El objetivo principal es garantizar:

- Eliminación de redundancia
- Integridad de los datos
- Eliminación de dependencias parciales y transitivas
- Evitar anomalías de actualización, inserción y eliminación
- Estructura normalizada que facilite la implementación y mantenimiento del sistema

El modelo final cumple completamente con **Primera, Segunda y Tercera Forma Normal (3FN)**.

---

## 2. Proceso de Normalización

A partir de los requerimientos del negocio, se identificaron entidades como:

- Clientes  
- Prendas  
- Uniformes  
- Colegios  
- Materias primas  
- Proveedores  
- Encargos  

Inicialmente, varias de estas entidades podrían quedar mezcladas o con información repetitiva.  
Se aplicó el proceso de normalización paso a paso para obtener un modelo limpio y eficiente.

---

## 3. Verificación de Cumplimiento de 1FN, 2FN y 3FN

### 3.1. Primera Forma Normal (1FN)

Una tabla está en 1FN si:

- Todos los atributos son atómicos  
- No existen grupos repetitivos  
- Cada registro es único  

### Cómo se cumple en el modelo:

Todas las tablas tienen clave primaria definida:

- CLIENTE(IdCliente)
- ENCARGO(NumPedido)
- PRENDA(IdPrenda)
- MATERIA_PRIMA(CodMateriaPrima)
- PROVEEDOR(NitProveedor)
- PRENDA_VESTIR(IdPrenda)
- UNIFORME(IdPrenda, IdColegio)
- SUMINISTRA(CodMateriaPrima, NitProveedor)
- SE_UTILIZA_EN(CodMateriaPrima, IdPrenda)

Además:

- No se permiten atributos con valores compuestos o listas.
- Relaciones de tipo lista se convirtieron en tablas intermedias M:N como SUMINISTRA y SE_UTILIZA_EN.

**Conclusión:**  
Todas las tablas cumplen con 1FN.

---

### 3.2. Segunda Forma Normal (2FN)

Una tabla está en 2FN si:

- Cumple 1FN  
- No existen dependencias parciales sobre claves primarias compuestas  

### Cómo se cumple en el modelo:

Las tablas con clave **simple** no pueden tener dependencias parciales:  
CLIENTE, PRENDA, MATERIA_PRIMA, PROVEEDOR, ENCARGO.

Las tablas con clave **compuesta**:

#### SE_UTILIZA_EN(CodMateriaPrima, IdPrenda)
- No posee atributos adicionales → imposible tener dependencias parciales.

#### SUMINISTRA(CodMateriaPrima, NitProveedor)
- Solo contiene la relación → dependencias correctas.

#### UNIFORME(IdPrenda, IdColegio)
- Los atributos adicionales dependen del par completo.

**Conclusión:**  
✔ No existen dependencias parciales.  
✔ El diseño cumple completamente 2FN.

---

### 3.3. Tercera Forma Normal (3FN)

Una tabla está en 3FN si:

- Cumple 2FN  
- No posee dependencias transitivas (atributo no clave → otro atributo no clave)

### Cómo se garantiza:

#### A) CLIENTE  
Todos los atributos dependen de IdCliente.  
No hay dependencias como:  
Documento → NombreCliente  
(Nada de eso ocurre)

#### B) ENCARGO  
ENCARGO(NumPedido, FechaEncargo, FechaProbEntrega, EstadoPedido, MedidaPersonal, Abono, ValorTotal, IdCliente)

- IdCliente no determina ningún atributo del pedido.
- No existen dependencias transitivas.

#### C) PRENDA  
Todos los atributos dependen únicamente de IdPrenda.

#### D) PROVEEDOR y MATERIA_PRIMA  
Cada entidad mantiene atributos propios sin transitividad.

#### E) Relaciones M:N  
SUMINISTRA y SE_UTILIZA_EN carecen de atributos adicionales → imposible tener transitividad.

#### F) Especializaciones  
- PRENDA_VESTIR depende completamente de IdPrenda.
- UNIFORME depende del par (IdPrenda, IdColegio).
- Sus atributos propios dependen del identificador, no entre sí.

**Conclusión:**  
No existen dependencias transitivas.  
La base de datos cumple completamente 3FN.

---

## 4. Justificación Global de 3FN

### Eliminación de redundancia
- Cada entidad tiene atributos propios.
- Relaciones M:N separadas (SUMINISTRA, SE_UTILIZA_EN).
- Colegios, clientes y prendas están estrictamente separados.

### Evita anomalías
- **Actualización:** la información se mantiene en un único lugar.
- **Inserción:** no se requieren datos adicionales para insertar registros.
- **Eliminación:** no se pierde información dependiente al borrar datos.

### Integridad del negocio
- Todas las relaciones están correctamente definidas con claves foráneas.
- El modelo permite registrar pedidos, clientes, inventarios y proveedores sin inconsistencias.

### Escalabilidad
- Permite agregar nuevos colegios, prendas, proveedores o materiales sin alterar el diseño estructural.

---

## 5. Conclusión

Después de analizar el diseño final y aplicar rigurosamente Primera, Segunda y Tercera Forma Normal, se concluye que la base de datos final:

- Elimina redundancia
- Mantiene integridad referencial
- Evita dependencias parciales y transitivas
- Organiza correctamente la información
- Es eficiente para consultas, informes y futuros cambios

**El modelo final está completamente normalizado hasta 3FN y es apto para implementarse en la empresa de confecciones.**

---

## 6. Esquema Final de la Base de Datos Relacional

```
CLIENTE(IdCliente, NombreCliente, TelContactoCliente)

ENCARGO(NumPedido, FechaEncargo, FechaProbEncargo, EstadoPedido,
        MedidaPersonal, Abono, ValorTotal, IdCliente)

PRENDA(IdPrenda, DiseñoPrenda, DescPrenda, Color, EsProductoTerminado,
       PrecioVenta, Sexo, Talla, TipoTela, CantExistPrenda, IdCliente)

PRENDA_VESTIR(IdPrenda, Estilo)

UNIFORME(IdPrenda, UbicacionBordado, Estampado, Bordado, IdColegio)

COLEGIOS(IdColegio, NombreColegio, Direccion)

SE_UTILIZA_EN(CodMateriaPrima, IdPrenda)

MATERIA_PRIMA(CodMateriaPrima, Tipo, DesMateriaPrima, UnidadMedida, StockMateriaPrima)

SUMINISTRA(CodMateriaPrima, NitProveedor)

PROVEEDOR(NitProveedor, NomProveedor, DirProveedor, TelProveedor,
          NomContacto, ProductProveedor)
```

