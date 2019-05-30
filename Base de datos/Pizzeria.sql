CREATE DATABASE  IF NOT EXISTS `pizzeria` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `pizzeria`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: pizzeria
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `detallepedidos`
--

DROP TABLE IF EXISTS `detallepedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `detallepedidos` (
  `idDetallePedidos` int(11) NOT NULL AUTO_INCREMENT,
  `cantidadPedidos` int(11) NOT NULL,
  `precioPedidos` double NOT NULL,
  `total` double NOT NULL,
  `fk_estadopedidos` int(11) NOT NULL,
  `fk_pedidos` int(11) NOT NULL,
  `fk_pizzas` int(11) NOT NULL,
  PRIMARY KEY (`idDetallePedidos`),
  KEY `FK_ah1wvd3wbardp87x8l5le0fow` (`fk_estadopedidos`),
  KEY `FK_7ie4t6n97lnoexjhbmn12ikbw` (`fk_pedidos`),
  KEY `FK_m8go4ckc8il5041tgnct7egyl` (`fk_pizzas`),
  CONSTRAINT `FK_7ie4t6n97lnoexjhbmn12ikbw` FOREIGN KEY (`fk_pedidos`) REFERENCES `pedidos` (`idPedidos`),
  CONSTRAINT `FK_ah1wvd3wbardp87x8l5le0fow` FOREIGN KEY (`fk_estadopedidos`) REFERENCES `estadopedidos` (`idEstadoPedidos`),
  CONSTRAINT `FK_m8go4ckc8il5041tgnct7egyl` FOREIGN KEY (`fk_pizzas`) REFERENCES `pizzas` (`idPizzas`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallepedidos`
--

LOCK TABLES `detallepedidos` WRITE;
/*!40000 ALTER TABLE `detallepedidos` DISABLE KEYS */;
INSERT INTO `detallepedidos` VALUES (4,1,150,150,4,1,2),(5,2,160,320,4,2,3);
/*!40000 ALTER TABLE `detallepedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadofacturas`
--

DROP TABLE IF EXISTS `estadofacturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `estadofacturas` (
  `idEstadoFacturas` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idEstadoFacturas`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadofacturas`
--

LOCK TABLES `estadofacturas` WRITE;
/*!40000 ALTER TABLE `estadofacturas` DISABLE KEYS */;
INSERT INTO `estadofacturas` VALUES (3,'Generada'),(4,'Pendiente');
/*!40000 ALTER TABLE `estadofacturas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadopedidos`
--

DROP TABLE IF EXISTS `estadopedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `estadopedidos` (
  `idEstadoPedidos` int(11) NOT NULL AUTO_INCREMENT,
  `nombreEstadoPedidos` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idEstadoPedidos`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadopedidos`
--

LOCK TABLES `estadopedidos` WRITE;
/*!40000 ALTER TABLE `estadopedidos` DISABLE KEYS */;
INSERT INTO `estadopedidos` VALUES (3,'Pendiente de Facturación'),(4,'Facturado');
/*!40000 ALTER TABLE `estadopedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturas`
--

DROP TABLE IF EXISTS `facturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `facturas` (
  `idFacturas` int(11) NOT NULL AUTO_INCREMENT,
  `fechaHoraEmision` date DEFAULT NULL,
  `numero` int(11) NOT NULL,
  `pedido_id` int(11) NOT NULL,
  `estado_id` int(11) NOT NULL,
  PRIMARY KEY (`idFacturas`),
  KEY `FK_pedido` (`pedido_id`),
  KEY `FK_estado` (`estado_id`),
  CONSTRAINT `FK_estado` FOREIGN KEY (`estado_id`) REFERENCES `estadofacturas` (`idEstadoFacturas`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_pedido` FOREIGN KEY (`pedido_id`) REFERENCES `pedidos` (`idPedidos`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturas`
--

LOCK TABLES `facturas` WRITE;
/*!40000 ALTER TABLE `facturas` DISABLE KEYS */;
INSERT INTO `facturas` VALUES (1,'2017-04-11',1237,1,3);
/*!40000 ALTER TABLE `facturas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pedidos` (
  `idPedidos` int(11) NOT NULL AUTO_INCREMENT,
  `fechaHoraCreacion` date DEFAULT NULL,
  `fechaHoraEntrega` date DEFAULT NULL,
  `nombreCliente` varchar(255) DEFAULT NULL,
  `numeroPedidos` int(11) NOT NULL,
  `pendienteFactura` bit(1) NOT NULL,
  `fk_estadopedidos` int(11) NOT NULL,
  PRIMARY KEY (`idPedidos`),
  KEY `FK_b0oo5puptln8o7227vdw0c4fw` (`fk_estadopedidos`),
  CONSTRAINT `FK_b0oo5puptln8o7227vdw0c4fw` FOREIGN KEY (`fk_estadopedidos`) REFERENCES `estadopedidos` (`idEstadoPedidos`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` VALUES (1,'2017-04-11','2017-04-11','Joaquín',1237,_binary '\0',4),(2,'2017-05-12','2017-05-12','Mariano',1238,_binary '\0',4);
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pizzas`
--

DROP TABLE IF EXISTS `pizzas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pizzas` (
  `idPizzas` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double NOT NULL,
  `fk_tamanioPizzas` int(11) NOT NULL,
  `fk_tipoPizzas` int(11) NOT NULL,
  `fk_variedadPizzas` int(11) NOT NULL,
  PRIMARY KEY (`idPizzas`),
  KEY `FK_smso21g0x63cay0432gs1emy8` (`fk_tamanioPizzas`),
  KEY `FK_klt7mnx1s2kqfeas69aw5lvs3` (`fk_tipoPizzas`),
  KEY `FK_6mmw3x6wv9hhe9xhp0t2vih0r` (`fk_variedadPizzas`),
  CONSTRAINT `FK_6mmw3x6wv9hhe9xhp0t2vih0r` FOREIGN KEY (`fk_variedadPizzas`) REFERENCES `variedadpizzas` (`idVariedadPizzas`),
  CONSTRAINT `FK_klt7mnx1s2kqfeas69aw5lvs3` FOREIGN KEY (`fk_tipoPizzas`) REFERENCES `tipopizzas` (`idTipoPizzas`),
  CONSTRAINT `FK_smso21g0x63cay0432gs1emy8` FOREIGN KEY (`fk_tamanioPizzas`) REFERENCES `tamaniopizzas` (`idTamanioPizzas`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pizzas`
--

LOCK TABLES `pizzas` WRITE;
/*!40000 ALTER TABLE `pizzas` DISABLE KEYS */;
INSERT INTO `pizzas` VALUES (1,'Napolitana Normal',125,2,2,2),(2,'Especial grande',150,3,2,3),(3,'Mozzarella chica',80,1,1,3);
/*!40000 ALTER TABLE `pizzas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tamaniopizzas`
--

DROP TABLE IF EXISTS `tamaniopizzas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tamaniopizzas` (
  `idTamanioPizzas` int(11) NOT NULL AUTO_INCREMENT,
  `cantPorciones` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idTamanioPizzas`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tamaniopizzas`
--

LOCK TABLES `tamaniopizzas` WRITE;
/*!40000 ALTER TABLE `tamaniopizzas` DISABLE KEYS */;
INSERT INTO `tamaniopizzas` VALUES (1,4,'Pequeña'),(2,8,'Normal'),(3,12,'Grande');
/*!40000 ALTER TABLE `tamaniopizzas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipopizzas`
--

DROP TABLE IF EXISTS `tipopizzas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tipopizzas` (
  `idTipoPizzas` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idTipoPizzas`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipopizzas`
--

LOCK TABLES `tipopizzas` WRITE;
/*!40000 ALTER TABLE `tipopizzas` DISABLE KEYS */;
INSERT INTO `tipopizzas` VALUES (1,'Pizza cocinada en horno industrial.','Horno'),(2,'Pizza cocinada en parrilla.','Parrilla');
/*!40000 ALTER TABLE `tipopizzas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `variedadpizzas`
--

DROP TABLE IF EXISTS `variedadpizzas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `variedadpizzas` (
  `idVariedadPizzas` int(11) NOT NULL AUTO_INCREMENT,
  `ingredientes` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idVariedadPizzas`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `variedadpizzas`
--

LOCK TABLES `variedadpizzas` WRITE;
/*!40000 ALTER TABLE `variedadpizzas` DISABLE KEYS */;
INSERT INTO `variedadpizzas` VALUES (1,'muzarella, salsa, tomates, aceitunas, oregano, ajo','Napolitana'),(2,'mozzarella, salsa, jamón cocido, morrón, aceitunas, oregano','Especial'),(3,'mozzarella, salsa, aceitunas, oregano','Mozzarella');
/*!40000 ALTER TABLE `variedadpizzas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'pizzeria'
--

--
-- Dumping routines for database 'pizzeria'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-30 10:58:33
