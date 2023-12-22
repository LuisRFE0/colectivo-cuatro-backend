
SELECT * FROM colectivo_cuatro.roles;
INSERT INTO `colectivo_cuatro`.`roles` (`rol`) VALUES ('cliente');
INSERT INTO `colectivo_cuatro`.`roles` (`rol`) VALUES ('admin');

-- 
SELECT * FROM colectivo_cuatro.clientes;
INSERT INTO `colectivo_cuatro`.`clientes` (`nombre`, `apellido`, `email`, `password`, `direccion`, `id_rol`) VALUES ('Luis', 'Flores', 'luis.r.flores.e@hotmail.com', 'qwerTy1123%', 'Calle 1', '2');
INSERT INTO `colectivo_cuatro`.`clientes` (`nombre`, `apellido`, `email`, `password`, `direccion`, `id_rol`) VALUES ('Victor', 'Hernandez', 'vicmoysen@gmail.com', 'qwerTy1123%', 'Calle 2', '2');
INSERT INTO `colectivo_cuatro`.`clientes` (`nombre`, `apellido`, `email`, `password`, `direccion`, `id_rol`) VALUES ('Fernanda', 'Maro', 'fernanda.maro.mo@gmail.com', 'qwerTy1123%', 'Calle 3', '2');
INSERT INTO `colectivo_cuatro`.`clientes` (`nombre`, `apellido`, `email`, `password`, `direccion`, `id_rol`) VALUES ('Cinthia', 'Cardos', 'cardoscinthia@gmail.com', 'qwerTy1123%', 'Calle 4', '2');
INSERT INTO `colectivo_cuatro`.`clientes` (`nombre`, `apellido`, `email`, `password`, `direccion`, `id_rol`) VALUES ('Liliana', 'Orozco', 'lilianaorozco.learning@gmail.com', 'qwerTy1123%', 'Calle 5', '2');
INSERT INTO `colectivo_cuatro`.`clientes` (`nombre`, `apellido`, `email`, `password`, `direccion`, `id_rol`) VALUES ('Ana', 'Hernández', 'fheer.love@gmail.com', 'qwerTy1123%', 'Calle de la Grana', '1');
INSERT INTO `colectivo_cuatro`.`clientes` (`nombre`, `apellido`, `email`, `password`, `direccion`, `id_rol`) VALUES ('Ricardo', 'Osorio', 'ricardo02_dragon@hotmail.com', 'qwerTy1123%', 'Calle Valle Verde', '1');
INSERT INTO `colectivo_cuatro`.`clientes` (`nombre`, `apellido`, `email`, `password`, `direccion`, `id_rol`) VALUES ('Rosa', 'Compra', 'mmartinez.rojas@fad.unam.mx', 'qwerTy1123%', 'Calle Inglaterra', '1');
INSERT INTO `colectivo_cuatro`.`clientes` (`nombre`, `apellido`, `email`, `password`, `direccion`, `id_rol`) VALUES ('Luis', 'Comunicador', 'l181080133@iztapalapa.tecnm.mx', 'qwerTy1123%', 'Calle Del Sol', '1');


SELECT * FROM colectivo_cuatro.categorias;

INSERT INTO `colectivo_cuatro`.`categorias` (`nombre`, `descripcion`) VALUES ('ropa', 'ropa unisex');
INSERT INTO `colectivo_cuatro`.`categorias` (`nombre`, `descripcion`) VALUES ('accesorios', 'accesorios unisex');


-- 
SELECT * FROM colectivo_cuatro.productos;
INSERT INTO `colectivo_cuatro`.`productos` (`nombre`, `precio`, `descripcion`, `stock`, `id_categoria`, `url_imagen`) VALUES ('Bolsa Willys', '299', 'Bolsa de manta con estampado en serigrafía de insectos willys', '13', '2', '../images/products-images/bolsa-willys.jpg');
INSERT INTO `colectivo_cuatro`.`productos` (`nombre`, `precio`, `descripcion`, `stock`, `id_categoria`, `url_imagen`) VALUES ('Bolsa Horizonte', '299', 'Bolsa de manta con estampado en serigrafía de horizonte', '6', '2', '../images/products-images/bolsa-horizonte.jpg');
INSERT INTO `colectivo_cuatro`.`productos` (`nombre`, `precio`, `descripcion`, `stock`, `id_categoria`, `url_imagen`) VALUES ('Playera Antidepresivos', '299', 'Playera de algodón con estampado en serigrafía de carita triste', '12', '1', '../images/products-images/playera-antidepresivos-2.jpg');
INSERT INTO `colectivo_cuatro`.`productos` (`nombre`, `precio`, `descripcion`, `stock`, `id_categoria`, `url_imagen`) VALUES ('Playera Benoni', '299', 'Playera de algodón con estampado en serigrafía de ajedrez', '6', '1', '../images/products-images/playera-benoni-2.jpg');
INSERT INTO `colectivo_cuatro`.`productos` (`nombre`, `precio`, `descripcion`, `stock`, `id_categoria`, `url_imagen`) VALUES ('Playera Boyera', '299', 'Playera de algodón con estampado en serigrafía de garza', '8', '1', '../images/products-images/playera-boyera-2.jpg');
INSERT INTO `colectivo_cuatro`.`productos` (`nombre`, `precio`, `descripcion`, `stock`, `id_categoria`, `url_imagen`) VALUES ('Playera Jacarandas Blanca', '299', 'Playera de algodón color blanco con estampado en serigrafía de Bellas Artes y jacarandas', '10', '1', '../images/products-images/playera-jacarandas-blanca.jpg');
INSERT INTO `colectivo_cuatro`.`productos` (`nombre`, `precio`, `descripcion`, `stock`, `id_categoria`, `url_imagen`) VALUES ('Playera Masuku', '299', 'Playera de algodón con estampado en serigrafía de máscaras japonesas', '12', '1', '../images/products-images/playera-masuku-2.jpg');
INSERT INTO `colectivo_cuatro`.`productos` (`nombre`, `precio`, `descripcion`, `stock`, `id_categoria`, `url_imagen`) VALUES ('Playera Vocho Amarilla', '299', 'Playera de algodón color amarillo con estampado en serigrafía de vocho ', '11', '1', '../images/products-images/playera-vocho-amarilla.jpg');
INSERT INTO `colectivo_cuatro`.`productos` (`nombre`, `precio`, `descripcion`, `stock`, `id_categoria`, `url_imagen`) VALUES ('Playera Jacarandas Negro', '299', 'Playera de algodón color negro con estampado en serigrafía de Bellas Artes y jacarandas ', '5', '1', '../images/products-images/playera-jacarandas-negro.jpg');
INSERT INTO `colectivo_cuatro`.`productos` (`nombre`, `precio`, `descripcion`, `stock`, `id_categoria`, `url_imagen`) VALUES ('Playera Vocho Rosa', '299', 'Playera de algodón color rosa con estampado en serigrafía de vocho', '6', '1', '../images/products-images/playera-vocho-rosa.jpg');

-- 
SELECT * FROM colectivo_cuatro.ordenes;
INSERT INTO `colectivo_cuatro`.`ordenes` (`id_cliente`) VALUES ('6');
INSERT INTO `colectivo_cuatro`.`ordenes` (`id_cliente`) VALUES ('7');
INSERT INTO `colectivo_cuatro`.`ordenes` (`id_cliente`) VALUES ('8');
INSERT INTO `colectivo_cuatro`.`ordenes` (`id_cliente`) VALUES ('9');
INSERT INTO `colectivo_cuatro`.`ordenes` (`id_cliente`) VALUES ('9');

-- 
SELECT * FROM colectivo_cuatro.ordenes_has_productos;
INSERT INTO `colectivo_cuatro`.`ordenes_has_productos` (`id_orden`, `id_producto`, `cantidad`) VALUES ('1', '2', '1');
INSERT INTO `colectivo_cuatro`.`ordenes_has_productos` (`id_orden`, `id_producto`, `cantidad`) VALUES ('1', '7', '2');
INSERT INTO `colectivo_cuatro`.`ordenes_has_productos` (`id_orden`, `id_producto`, `cantidad`) VALUES ('1', '3', '1');
INSERT INTO `colectivo_cuatro`.`ordenes_has_productos` (`id_orden`, `id_producto`, `cantidad`) VALUES ('2', '9', '1');
INSERT INTO `colectivo_cuatro`.`ordenes_has_productos` (`id_orden`, `id_producto`, `cantidad`) VALUES ('2', '10', '2');
INSERT INTO `colectivo_cuatro`.`ordenes_has_productos` (`id_orden`, `id_producto`, `cantidad`) VALUES ('3', '1', '1');
INSERT INTO `colectivo_cuatro`.`ordenes_has_productos` (`id_orden`, `id_producto`, `cantidad`) VALUES ('4', '2', '2');
INSERT INTO `colectivo_cuatro`.`ordenes_has_productos` (`id_orden`, `id_producto`, `cantidad`) VALUES ('4', '6', '3');
