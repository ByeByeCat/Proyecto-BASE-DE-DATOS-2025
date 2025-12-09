# Modelo Lógico de la Base de Datos

## CLIENTE
- IdCliente (PK)
- Documento
- NombreCliente
- TelContactoCliente

## COLEGIO
- IdColegio (PK)
- NombreColegio
- Direccion

## MATERIA_PRIMA
- CodMateriaPrima (PK)
- Tipo
- DesMateriaPrima
- UnidadMedida
- StockMateriaPrima

## PROVEEDOR
- NitProveedor (PK)
- NomProveedor
- DirProveedor
- TelProveedor
- NomContacto
- ProductProveedor

## SUMINISTRA
- NitProveedor (FK → PROVEEDOR)
- CodMateriaPrima (FK → MATERIA_PRIMA)
- CantSuministrada

## PRENDA
- IdPrenda (PK)
- DisenoPrenda
- DescPrenda
- Color
- EsProductoTerminado
- PrecioVenta
- Sexo
- Talla
- TipoTela
- CantExistPrenda

## UNIFORME
- IdPrenda (PK, FK → PRENDA)
- IdColegio (FK → COLEGIO)

## PRENDA_VESTIR
- IdPrenda (PK, FK → PRENDA)
- Estilo

## SE_UTILIZA_EN
- IdPrenda (FK → PRENDA)
- CodMateriaPrima (FK → MATERIA_PRIMA)
- CantUsada

## ENCARGO
- NumPedido (PK)
- FechaEncargo
- FechaProbEntrega
- EstadoPedido
- MedidaPersonal
- Abono
- ValorTotal
- IdCliente (FK → CLIENTE)

## DETALLE_ENCARGO
- NumPedido (FK → ENCARGO)
- IdPrenda (FK → PRENDA)
- Cantidad
- PrecioUnitario

## FACTURA
- IdFactura (PK)
- FechaFactura
- NumPedido (FK → ENCARGO)
- IdCliente (FK → CLIENTE)
- TotalFactura

## DETALLE_FACTURA
- IdFactura (FK → FACTURA)
- IdPrenda (FK → PRENDA)
- Cantidad
- PrecioUnitario
