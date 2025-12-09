# Diccionario de Datos

## CLIENTE
| Atributo | Tipo | Descripción |
|----------|------|-------------|
| IdCliente | INT | Identificador del cliente |
| Documento | VARCHAR | Número de documento |
| NombreCliente | VARCHAR | Nombre completo |
| TelContactoCliente | VARCHAR | Teléfono |

## COLEGIO
| Atributo | Tipo | Descripción |
|----------|------|-------------|
| IdColegio | INT | Identificador del colegio |
| NombreColegio | VARCHAR | Nombre |
| Direccion | VARCHAR | Dirección |

## MATERIA_PRIMA
| Atributo | Tipo | Descripción |
|----------|------|-------------|
| CodMateriaPrima | INT | Código de la materia prima |
| Tipo | VARCHAR | Tipo de material |
| DesMateriaPrima | VARCHAR | Descripción |
| UnidadMedida | VARCHAR | Unidad de medida |
| StockMateriaPrima | INT | Existencias |

## PROVEEDOR
| Atributo | Tipo | Descripción |
|----------|------|-------------|
| NitProveedor | VARCHAR | Identificador del proveedor |
| NomProveedor | VARCHAR | Nombre |
| DirProveedor | VARCHAR | Dirección |
| TelProveedor | VARCHAR | Teléfono |
| NomContacto | VARCHAR | Persona de contacto |
| ProductProveedor | VARCHAR | Producto suministrado |

## SUMINISTRA
| Atributo | Tipo | Descripción |
|----------|------|-------------|
| NitProveedor | VARCHAR | FK proveedor |
| CodMateriaPrima | INT | FK materia prima |
| CantSuministrada | INT | Cantidad suministrada |

## PRENDA
| Atributo | Tipo | Descripción |
|----------|------|-------------|
| IdPrenda | INT | Identificador |
| DisenoPrenda | VARCHAR | Diseño |
| DescPrenda | VARCHAR | Descripción |
| Color | VARCHAR | Color principal |
| EsProductoTerminado | BOOLEAN | Si el producto está terminado |
| PrecioVenta | DECIMAL | Precio |
| Sexo | VARCHAR | Masculino / Femenino |
| Talla | VARCHAR | Talla |
| TipoTela | VARCHAR | Tipo de tela |
| CantExistPrenda | INT | Existencias |

## UNIFORME
| Atributo | Tipo | Descripción |
|----------|------|-------------|
| IdPrenda | INT | FK prenda |
| IdColegio | INT | FK colegio |

## PRENDA_VESTIR
| Atributo | Tipo | Descripción |
|----------|------|-------------|
| IdPrenda | INT | FK prenda |
| Estilo | VARCHAR | Estilo de prenda |

## SE_UTILIZA_EN
| Atributo | Tipo | Descripción |
|----------|------|-------------|
| IdPrenda | INT | FK prenda |
| CodMateriaPrima | INT | FK materia prima |
| CantUsada | INT | Cantidad usada |

## ENCARGO
| Atributo | Tipo | Descripción |
|----------|------|-------------|
| NumPedido | INT | Identificador del pedido |
| FechaEncargo | DATE | Fecha |
| FechaProbEntrega | DATE | Fecha estimada |
| EstadoPedido | VARCHAR | Estado actual |
| MedidaPersonal | TEXT | Medidas del cliente |
| Abono | DECIMAL | Abono realizado |
| ValorTotal | DECIMAL | Valor total |
| IdCliente | INT | FK cliente |

## DETALLE_ENCARGO
| Atributo | Tipo | Descripción |
|----------|------|-------------|
| NumPedido | INT | FK encargo |
| IdPrenda | INT | FK prenda |
| Cantidad | INT | Cantidad |
| PrecioUnitario | DECIMAL | Precio |

## FACTURA
| Atributo | Tipo | Descripción |
|----------|------|-------------|
| IdFactura | INT | Identificador |
| FechaFactura | DATE | Fecha |
| NumPedido | INT | FK encargo |
| IdCliente | INT | FK cliente |
| TotalFactura | DECIMAL | Total facturado |

## DETALLE_FACTURA
| Atributo | Tipo | Descripción |
|----------|------|-------------|
| IdFactura | INT | FK factura |
| IdPrenda | INT | FK prenda |
| Cantidad | INT | Cantidad |
| PrecioUnitario | DECIMAL | Precio |
