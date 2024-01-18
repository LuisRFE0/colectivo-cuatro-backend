CREATE DATABASE  IF NOT EXISTS `colectivo_cuatro` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `colectivo_cuatro`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: colectivo_cuatro
-- ------------------------------------------------------
-- Server version	8.2.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `fk_id_roles` int DEFAULT NULL,
  `id_clientes` int NOT NULL AUTO_INCREMENT,
  `telefono` varchar(14) DEFAULT NULL,
  `apellido` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `direccion` varchar(200) DEFAULT NULL,
  `password` varchar(500) NOT NULL,
  PRIMARY KEY (`id_clientes`),
  UNIQUE KEY `UK_1c96wv36rk2hwui7qhjks3mvg` (`email`),
  KEY `FKs8u7scp9jjux3x1bhwkvj72mb` (`fk_id_roles`),
  CONSTRAINT `FKs8u7scp9jjux3x1bhwkvj72mb` FOREIGN KEY (`fk_id_roles`) REFERENCES `roles` (`id_roles`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (2,5,NULL,'Flores','Luis','ricardo@gmail.com',NULL,'$2a$10$JTQtFd0FkaAck73EoGy5jOCAsVabS8KqzOUnHVczYYzNGtoo2IYIq');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordenes`
--

DROP TABLE IF EXISTS `ordenes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ordenes` (
  `fecha_compra` date DEFAULT NULL,
  `id_cliente` int NOT NULL,
  `id_orden` int NOT NULL AUTO_INCREMENT,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`id_orden`),
  KEY `fk_id_cliente_idx` (`id_cliente`),
  CONSTRAINT `fk_id_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_clientes`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordenes`
--

LOCK TABLES `ordenes` WRITE;
/*!40000 ALTER TABLE `ordenes` DISABLE KEYS */;
INSERT INTO `ordenes` VALUES ('2024-01-05',5,7,598),('1970-01-20',5,8,598),('1970-01-20',5,9,598),('2024-01-16',5,10,598);
/*!40000 ALTER TABLE `ordenes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordenes_has_productos`
--

DROP TABLE IF EXISTS `ordenes_has_productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ordenes_has_productos` (
  `id_orden` int NOT NULL,
  `id_producto` int NOT NULL,
  `cantidad` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `fk_id_orden_idx` (`id_orden`),
  KEY `fk_id_product_idx` (`id_producto`),
  CONSTRAINT `fk_id_orden` FOREIGN KEY (`id_orden`) REFERENCES `ordenes` (`id_orden`),
  CONSTRAINT `fk_id_product` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id_producto`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordenes_has_productos`
--

LOCK TABLES `ordenes_has_productos` WRITE;
/*!40000 ALTER TABLE `ordenes_has_productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `ordenes_has_productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `id_categoria` int NOT NULL,
  `id_producto` int NOT NULL AUTO_INCREMENT,
  `precio` double NOT NULL,
  `stock` int NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` varchar(400) NOT NULL,
  `url_imagen` varchar(255) NOT NULL,
  PRIMARY KEY (`id_producto`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (2,1,299,30,'Bolsa Willys','Bolsa con estampado de Willys','../images/products-images/bolsa-willys.jpg'),(2,2,299,30,'Bolsa Horizonte','Bolsa con estampado de Horizonte','../images/products-images/bolsa-horizonte.jpg'),(1,3,299,30,'Playera Antidepresivos','Playera con estampado de Antidepresivos','../images/products-images/playera-antidepresivos-2.jpg'),(1,4,299,30,'Playera Benoni','Playera con estampado Benoni','../images/products-images/playera-benoni-2.jpg'),(1,5,299,30,'Playera Boyera','Playera con estapmado Boyera','../images/products-images/playera-boyera-2.jpg'),(1,6,299,30,'Playera Jacarandas Blanca','Playera con estampado de Jacarandas','../images/products-images/playera-jacarandas-blanca.jpg'),(1,7,299,30,'Playera Masuku','Player con estaampado de estilo oriental','../images/products-images/playera-masuku-2.jpg'),(1,8,299,30,'Playera Vocho Amarilla','Playera con estampado de Vocho amarilla','../images/products-images/playera-vocho-amarilla.jpg'),(1,9,299,30,'Playera Jacarandas Negro','Playera con estampado de Jacarandas negra','../images/products-images/playera-jacarandas-negro.jpg'),(1,10,299,30,'Playera Vocho Rosa','Playera con estampado de Voco rosa','../images/products-images/playera-vocho-rosa.jpg');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `id_roles` int NOT NULL AUTO_INCREMENT,
  `rol` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_roles`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'CUSTOMER'),(2,'ADMIN');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-18 10:24:20
