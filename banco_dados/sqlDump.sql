-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: projetointegradortelemedicina
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `atende`
--

DROP TABLE IF EXISTS `atende`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `atende` (
  `ID_MEDICO` int DEFAULT NULL,
  `ID_CLINICA` int DEFAULT NULL,
  KEY `ID_MEDICO` (`ID_MEDICO`),
  KEY `ID_CLINICA` (`ID_CLINICA`),
  CONSTRAINT `atende_ibfk_1` FOREIGN KEY (`ID_MEDICO`) REFERENCES `medico` (`ID`),
  CONSTRAINT `atende_ibfk_2` FOREIGN KEY (`ID_CLINICA`) REFERENCES `clinica` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atende`
--

LOCK TABLES `atende` WRITE;
/*!40000 ALTER TABLE `atende` DISABLE KEYS */;
INSERT INTO `atende` VALUES (1,12),(1,39),(1,26),(11,44),(11,40),(11,52),(21,20),(21,9),(21,25),(32,33),(32,16),(32,24),(42,20),(42,19),(42,29),(2,9),(2,15),(2,49),(12,10),(12,3),(12,48),(22,16),(22,4),(22,50),(33,17),(33,5),(33,52),(43,39),(43,43),(43,23),(3,24),(3,25),(3,52),(13,28),(13,23),(13,30),(23,47),(23,16),(23,29),(31,28),(31,25),(31,22),(34,24),(34,32),(34,34),(44,28),(44,16),(44,31),(52,47),(52,25),(52,46),(4,22),(4,1),(4,25),(14,34),(14,2),(14,9),(24,34),(24,3),(24,30),(35,46),(35,4),(35,24),(45,34),(45,5),(45,48),(5,26),(5,35),(5,6),(10,35),(10,49),(10,17),(15,49),(15,35),(15,24),(20,35),(20,26),(20,25),(25,26),(25,35),(25,22),(30,35),(30,49),(30,34),(36,49),(36,35),(36,31),(41,35),(41,26),(41,25),(46,26),(46,35),(46,15),(51,35),(51,49),(51,48),(6,25),(6,23),(6,22),(16,48),(16,24),(16,12),(26,25),(26,32),(26,9),(37,48),(37,25),(37,34),(47,25),(47,51),(47,35),(7,30),(7,24),(7,25),(17,31),(17,28),(17,12),(27,45),(27,47),(27,26),(38,31),(38,28),(38,22),(48,30),(48,24),(48,9),(8,27),(8,30),(8,12),(18,37),(18,31),(18,9),(28,27),(28,45),(28,24),(39,37),(39,31),(39,22),(49,27),(49,30),(49,26),(9,52),(9,44),(19,52),(19,10),(29,52),(29,28),(40,52),(40,34),(50,52),(50,35);
/*!40000 ALTER TABLE `atende` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clinica`
--

DROP TABLE IF EXISTS `clinica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clinica` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `nomeClinica` varchar(100) DEFAULT NULL,
  `enderecoClinica` varchar(200) DEFAULT NULL,
  `cnpjClinica` varchar(18) DEFAULT NULL,
  `telefoneClinica` varchar(15) DEFAULT NULL,
  `emailClinica` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clinica`
--

LOCK TABLES `clinica` WRITE;
/*!40000 ALTER TABLE `clinica` DISABLE KEYS */;
INSERT INTO `clinica` VALUES (1,'Clinica Saúde e Vida','Rua das Flores, 123, Centro, São Paulo, SP','12.345.678/0001-90','(11) 1234-5678','contato@saudevida.com.br'),(2,'Clínica Boa Saúde','Av. Paulista, 456, Bela Vista, São Paulo, SP','23.456.789/0001-91','(11) 2345-6789','atendimento@boasaude.com.br'),(3,'Centro Médico Vital','Rua da Esperança, 789, Jardim das Acácias, São Paulo, SP','34.567.890/0001-92','(11) 3456-7890','info@vitalmedico.com.br'),(4,'Clínica Coração Feliz','Praça da República, 101, República, São Paulo, SP','45.678.901/0001-93','(11) 4567-8901','suporte@coracaofeliz.com.br'),(5,'Clínica Bem-Estar','Rua dos Jardins, 202, Vila Nova, São Paulo, SP','56.789.012/0001-94','(11) 5678-9012','contato@bemeestar.com.br'),(6,'Clínica Total Saúde','Av. São João, 303, Santana, São Paulo, SP','67.890.123/0001-95','(11) 6789-0123','atendimento@totalsaude.com.br'),(7,'Clínica Vida Nova','Rua dos Pinheiros, 404, Pinheiros, São Paulo, SP','78.901.234/0001-96','(11) 7890-1234','info@vidanova.com.br'),(8,'Clínica Saúde Plena','Rua da Paz, 505, Vila Madalena, São Paulo, SP','89.012.345/0001-97','(11) 8901-2345','suporte@saudeplena.com.br'),(9,'Clínica Prime Saúde','Av. Rio Branco, 606, Centro, Rio de Janeiro, RJ','90.123.456/0001-98','(21) 1234-5678','contato@primesaude.com.br'),(10,'Clínica Bem Cuidado','Rua do Catete, 707, Catete, Rio de Janeiro, RJ','01.234.567/0001-99','(21) 2345-6789','atendimento@bemcuidado.com.br'),(11,'Clínica Total Sul','Rua dos Anjos, 123, Morumbi, São Paulo, SP','11.234.567/0001-00','(11) 1111-2222','contato@saudetotal.com.br'),(12,'Clínica Vida e Saúde','Av. dos Bandeirantes, 234, Jardim Paulista, São Paulo, SP','22.345.678/0001-01','(11) 2222-3333','info@vidaesaude.com.br'),(13,'Centro Clínico Novo Horizonte','Rua Augusta, 345, Consolação, São Paulo, SP','33.456.789/0001-02','(11) 3333-4444','suporte@novohorizonte.com.br'),(14,'Clínica Família Saudável','Av. Ibirapuera, 456, Moema, São Paulo, SP','44.567.890/0001-03','(11) 4444-5555','contato@familiasaudavel.com.br'),(15,'Clínica Saúde e Bem-Estar','Rua da Consolação, 567, Vila Mariana, São Paulo, SP','55.678.901/0001-04','(11) 5555-6666','info@saudebemestar.com.br'),(16,'Clínica Esperança Viva','Rua do Riachuelo, 678, Centro, Rio de Janeiro, RJ','66.789.012/0001-05','(21) 6666-7777','contato@esperancaviva.com.br'),(17,'Clínica São Lucas','Av. das Américas, 789, Barra da Tijuca, Rio de Janeiro, RJ','77.890.123/0001-06','(21) 7777-8888','info@saolucas.com.br'),(18,'Clínica Vida Plena','Rua da Glória, 890, Glória, Rio de Janeiro, RJ','88.901.234/0001-07','(21) 8888-9999','suporte@vidaplena.com.br'),(19,'Clínica Saúde Ideal','Rua das Palmeiras, 1010, Jardim Botânico, Rio de Janeiro, RJ','99.012.345/0001-08','(21) 9999-0000','contato@saudeideal.com.br'),(20,'Clínica Nova Era','Av. Paraná, 1212, Jardim América, São Paulo, SP','10.123.456/0001-09','(11) 1010-2020','info@novaera.com.br'),(21,'Clínica Norte Sul','Rua São Jorge, 123, São Sebastião, Manaus, AM','21.234.567/0001-10','(92) 1111-2222','contato@saudedonorte.com.br'),(22,'Clínica Estrela do Sul','Av. Paraná, 234, Centro, Curitiba, PR','32.345.678/0001-11','(41) 2222-3333','info@estreladosul.com.br'),(23,'Clínica Bem-Estar do Oeste','Rua das Palmeiras, 345, Bairro Oeste, Goiânia, GO','43.456.789/0001-12','(62) 3333-4444','suporte@bemestardooeste.com.br'),(24,'Clínica Saúde do Sertão','Rua da Paz, 456, Sertãozinho, Belo Horizonte, MG','54.567.890/0001-13','(31) 4444-5555','contato@saudedosertao.com.br'),(25,'Clínica Nova Esperança','Av. São João, 567, Bairro das Laranjeiras, Brasília, DF','65.678.901/0001-14','(61) 5555-6666','info@novaesperanca.com.br'),(26,'Clínica São Pedro','Rua dos Cedros, 678, Vila Madalena, Porto Alegre, RS','76.789.012/0001-15','(51) 6666-7777','contato@saopedro.com.br'),(27,'Clínica Vitalidade','Av. Amazonas, 789, Bairro de Lourdes, Recife, PE','87.890.123/0001-16','(81) 7777-8888','info@vitalidade.com.br'),(28,'Clínica Vida Serena','Rua da Alegria, 890, São João del-Rei, São João del-Rei, MG','98.901.234/0001-17','(32) 8888-9999','suporte@vidaseren.com.br'),(29,'Clínica Horizonte Azul','Av. das Nações, 1010, Centro, Fortaleza, CE','09.012.345/0001-18','(85) 9999-0000','contato@horizonteazul.com.br'),(30,'Clínica Nova Vida','Rua dos Trabalhadores, 1212, Centro, Salvador, BA','10.123.456/0001-19','(71) 1010-2020','info@novavida.com.br'),(31,'Clínica Saúde e Harmonia','Rua das Flores, 111, Centro, Salvador, BA','21.234.567/0001-20','(71) 2345-6789','contato@saudeharmonia.com.br'),(32,'Clínica Bem-Estar Total','Av. Brasília, 222, Setor Bueno, Goiânia, GO','32.345.678/0001-21','(62) 3456-7890','info@bemestartotal.com.br'),(33,'Clínica Nova Vida','Rua das Acácias, 333, Vila São Francisco, São Paulo, SP','43.456.789/0001-22','(11) 4567-8901','suporte@novavida.com.br'),(34,'Clínica Luz e Vida','Av. Nove de Julho, 444, Centro, Curitiba, PR','54.567.890/0001-23','(41) 5678-9012','contato@luzvida.com.br'),(35,'Clínica São Lucas','Rua das Palmeiras, 555, Centro, Porto Alegre, RS','65.678.901/0001-24','(51) 6789-0123','info@saolucas.com.br'),(36,'Clínica Vitalidade Saúde','Av. Amazonas, 666, Centro, Manaus, AM','76.789.012/0001-25','(92) 7890-1234','suporte@vitalidadesaude.com.br'),(37,'Clínica Saúde Alegre','Rua da Paz, 777, Vila das Flores, Recife, PE','87.890.123/0001-26','(81) 8901-2345','contato@saudealegre.com.br'),(38,'Clínica Harmonia Vital','Rua das Orquídeas, 888, Centro, Fortaleza, CE','98.901.234/0001-27','(85) 9012-3456','info@harmoniavital.com.br'),(39,'Clínica Vida e Saúde','Av. Rio Branco, 999, Centro, Rio de Janeiro, RJ','09.012.345/0001-28','(21) 0123-4567','suporte@vidaesaude.com.br'),(40,'Clínica Nova Esperança','Rua do Catete, 1010, Flamengo, Rio de Janeiro, RJ','10.123.456/0001-29','(21) 1234-5678','contato@novaesperanca.com.br'),(41,'Clínica Integrada','Rua São Pedro, 2020, Bairro da Liberdade, São Paulo, SP','21.234.567/0001-30','(11) 2345-6789','info@clinicaintegrada.com.br'),(42,'Clínica Saúde do Futuro','Av. Paulista, 3030, Consolação, São Paulo, SP','32.345.678/0001-31','(11) 3456-7890','suporte@saudefuturo.com.br'),(43,'Clínica Viva Melhor','Rua dos Bandeirantes, 4040, Bela Vista, São Paulo, SP','43.456.789/0001-32','(11) 4567-8901','contato@vivamelhor.com.br'),(44,'Clínica Zen Saúde','Av. Ibirapuera, 5050, Moema, São Paulo, SP','54.567.890/0001-33','(11) 5678-9012','info@zensaude.com.br'),(45,'Clínica Saúde Plena','Rua da Glória, 6060, Centro, Salvador, BA','65.678.901/0001-34','(71) 6789-0123','suporte@saudeplena.com.br'),(46,'Clínica Bem Cuidado','Rua das Flores, 7070, Bairro Alto, Curitiba, PR','76.789.012/0001-35','(41) 7890-1234','contato@bemcuidado.com.br'),(47,'Clínica Saúde Integral','Av. Afonso Pena, 8080, Centro, Belo Horizonte, MG','87.890.123/0001-36','(31) 8901-2345','info@saudeintegral.com.br'),(48,'Clínica Horizonte Alegre','Rua do Comércio, 9090, Centro, Brasília, DF','98.901.234/0001-37','(61) 9012-3456','suporte@horizontealegre.com.br'),(49,'Clínica Vida em Equilíbrio','Rua dos Anjos, 1212, Bairro das Laranjeiras, Porto Alegre, RS','09.012.345/0001-38','(51) 0123-4567','contato@vidaemequilibrio.com.br'),(50,'Clínica Saúde e Esperança','Av. Santos Dumont, 1313, Bairro do Centro, Fortaleza, CE','10.123.456/0001-39','(85) 1234-5678','info@saudeeesperanca.com.br'),(51,'Clínica Nova Saúde','Rua dos Cedros, 1414, Centro, Goiânia, GO','21.234.567/0001-40','(62) 2345-6789','suporte@novasaude.com.br'),(52,'Clínica Total Bem-Estar','Av. João Pessoa, 1515, Centro, São Luís, MA','32.345.678/0001-41','(98) 3456-7890','contato@totalbemestar.com.br');
/*!40000 ALTER TABLE `clinica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consulta`
--

DROP TABLE IF EXISTS `consulta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consulta` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `dataConsulta` date DEFAULT NULL,
  `formatoConsulta` varchar(10) DEFAULT NULL,
  `ID_PACIENTE` int DEFAULT NULL,
  `ID_MEDICO` int DEFAULT NULL,
  `ID_CLINICA` int DEFAULT NULL,
  `pagamentoConsulta` float DEFAULT NULL,
  `areaProcura` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID_PACIENTE` (`ID_PACIENTE`),
  CONSTRAINT `consulta_ibfk_1` FOREIGN KEY (`ID_PACIENTE`) REFERENCES `paciente` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consulta`
--

LOCK TABLES `consulta` WRITE;
/*!40000 ALTER TABLE `consulta` DISABLE KEYS */;
INSERT INTO `consulta` VALUES (1,'2024-09-10','Online',5,17,32,100,'Cardiologia'),(2,'2024-09-12','Presencial',12,3,45,75.5,'Dermatologia'),(3,'2024-09-14','Online',8,26,7,110,'Ortopedia'),(4,'2024-09-16','Presencial',22,11,19,90,'Pediatria'),(5,'2024-09-18','Online',36,9,28,60,'Gastroenterologia'),(6,'2024-09-20','Presencial',48,30,50,120,'Neurologia'),(7,'2024-09-22','Online',27,6,12,85.5,'Oftalmologia'),(8,'2024-09-24','Presencial',14,23,38,70,'Psicologia'),(9,'2024-09-26','Online',1,52,44,110,'Endocrinologia'),(10,'2024-09-28','Presencial',50,14,29,100,'Urologia'),(11,'2024-09-30','Online',10,20,31,90,'Cardiologia'),(12,'2024-10-02','Presencial',3,45,11,65,'Dermatologia'),(13,'2024-10-04','Online',15,28,23,115,'Ortopedia'),(14,'2024-10-06','Presencial',41,7,39,105.5,'Pediatria'),(15,'2024-10-08','Online',9,34,5,120,'Gastroenterologia'),(16,'2024-10-10','Presencial',18,12,27,85.75,'Neurologia'),(17,'2024-10-12','Online',25,42,13,95,'Oftalmologia'),(18,'2024-10-14','Presencial',33,4,46,110,'Psicologia'),(19,'2024-10-16','Online',52,22,35,120,'Endocrinologia'),(20,'2024-10-18','Presencial',6,19,20,60,'Urologia'),(21,'2024-10-20','Online',11,36,21,105,'Cardiologia'),(22,'2024-10-22','Presencial',7,5,18,70,'Dermatologia'),(23,'2024-10-24','Online',28,13,9,120,'Ortopedia'),(24,'2024-10-26','Presencial',42,50,2,95.5,'Pediatria'),(25,'2024-10-28','Online',30,1,37,75,'Gastroenterologia'),(26,'2024-10-30','Presencial',19,24,14,115.75,'Neurologia'),(27,'2024-11-01','Online',35,40,30,85,'Oftalmologia'),(28,'2024-11-03','Presencial',21,46,25,100,'Psicologia'),(29,'2024-11-05','Online',47,8,41,95,'Endocrinologia'),(30,'2024-11-07','Presencial',2,31,6,110,'Urologia'),(31,'2024-11-09','Online',13,48,15,70,'Cardiologia'),(32,'2024-11-11','Presencial',44,2,33,50,'Dermatologia'),(33,'2024-11-13','Online',17,43,26,120,'Ortopedia'),(34,'2024-11-15','Presencial',29,35,40,80,'Pediatria'),(35,'2024-11-17','Online',4,38,16,90,'Gastroenterologia'),(36,'2024-11-19','Presencial',51,27,22,100.75,'Neurologia'),(37,'2024-11-21','Online',20,10,3,115,'Oftalmologia'),(38,'2024-11-23','Presencial',24,21,48,90,'Psicologia'),(39,'2024-11-25','Online',38,29,34,105,'Endocrinologia'),(40,'2024-11-27','Presencial',16,18,52,75,'Urologia'),(41,'2024-11-29','Online',31,9,42,85,'Cardiologia'),(42,'2024-12-01','Presencial',6,33,24,95,'Dermatologia'),(43,'2024-12-03','Online',23,25,4,120.5,'Ortopedia'),(44,'2024-12-05','Presencial',39,15,43,100,'Pediatria'),(45,'2024-12-07','Online',26,47,17,110,'Gastroenterologia'),(46,'2024-12-09','Presencial',9,16,36,115.75,'Neurologia'),(47,'2024-12-11','Online',32,49,8,120,'Oftalmologia'),(48,'2024-12-13','Presencial',18,37,10,100,'Psicologia'),(49,'2024-12-15','Online',5,32,51,110,'Endocrinologia'),(50,'2024-12-17','Presencial',12,41,20,105,'Urologia');
/*!40000 ALTER TABLE `consulta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exame`
--

DROP TABLE IF EXISTS `exame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exame` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `diagnosticoExame` varchar(300) DEFAULT NULL,
  `statusExame` varchar(12) DEFAULT NULL,
  `ID_PACIENTE` int DEFAULT NULL,
  `ID_MEDICO` int DEFAULT NULL,
  `ID_CLINICA` int DEFAULT NULL,
  `dataExame` date DEFAULT NULL,
  `descricaoExame` varchar(300) DEFAULT NULL,
  `valorExame` float DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID_PACIENTE` (`ID_PACIENTE`),
  KEY `ID_MEDICO` (`ID_MEDICO`),
  KEY `ID_CLINICA` (`ID_CLINICA`),
  CONSTRAINT `exame_ibfk_1` FOREIGN KEY (`ID_PACIENTE`) REFERENCES `paciente` (`ID`),
  CONSTRAINT `exame_ibfk_2` FOREIGN KEY (`ID_MEDICO`) REFERENCES `medico` (`ID`),
  CONSTRAINT `exame_ibfk_3` FOREIGN KEY (`ID_CLINICA`) REFERENCES `clinica` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exame`
--

LOCK TABLES `exame` WRITE;
/*!40000 ALTER TABLE `exame` DISABLE KEYS */;
INSERT INTO `exame` VALUES (1,'Normal','Finalizado',5,12,28,'2024-09-01','Exame de sangue',150),(2,'Anormalidade detectada','Em andamento',17,34,14,'2024-09-02','Raio-X',220.5),(3,'Normal','Finalizado',9,21,7,'2024-09-03','Tomografia',350),(4,'Resultado pendente','Em andamento',23,15,20,'2024-09-04','Exame de urina',120),(5,'Anormalidade detectada','Finalizado',2,8,32,'2024-09-05','Ecocardiograma',400),(6,'Normal','Finalizado',44,11,19,'2024-09-06','Ultrassonografia',250.75),(7,'Resultado pendente','Em andamento',16,27,18,'2024-09-07','Exame de vista',180),(8,'Normal','Finalizado',13,22,4,'2024-09-08','Exame de audição',175),(9,'Anormalidade detectada','Em andamento',29,36,41,'2024-09-09','Exame de esforço',210),(10,'Normal','Finalizado',33,30,24,'2024-09-10','Endoscopia',300),(11,'Normal','Finalizado',6,18,39,'2024-09-11','Exame de sangue',150),(12,'Anormalidade detectada','Em andamento',25,7,33,'2024-09-12','Raio-X',220.5),(13,'Normal','Finalizado',42,29,5,'2024-09-13','Tomografia',350),(14,'Resultado pendente','Em andamento',10,40,13,'2024-09-14','Exame de urina',120),(15,'Anormalidade detectada','Finalizado',48,20,22,'2024-09-15','Ecocardiograma',400),(16,'Normal','Finalizado',1,4,9,'2024-09-16','Ultrassonografia',250.75),(17,'Resultado pendente','Em andamento',32,17,35,'2024-09-17','Exame de vista',180),(18,'Normal','Finalizado',30,50,8,'2024-09-18','Exame de audição',175),(19,'Anormalidade detectada','Em andamento',4,13,46,'2024-09-19','Exame de esforço',210),(20,'Normal','Finalizado',38,28,25,'2024-09-20','Endoscopia',300),(21,'Normal','Finalizado',21,45,16,'2024-09-21','Exame de sangue',150),(22,'Anormalidade detectada','Em andamento',18,3,27,'2024-09-22','Raio-X',220.5),(23,'Normal','Finalizado',35,43,2,'2024-09-23','Tomografia',350),(24,'Resultado pendente','Em andamento',12,46,23,'2024-09-24','Exame de urina',120),(25,'Anormalidade detectada','Finalizado',41,49,6,'2024-09-25','Ecocardiograma',400),(26,'Normal','Finalizado',7,9,26,'2024-09-26','Ultrassonografia',250.75),(27,'Resultado pendente','Em andamento',28,19,12,'2024-09-27','Exame de vista',180),(28,'Normal','Finalizado',50,32,11,'2024-09-28','Exame de audição',175),(29,'Anormalidade detectada','Em andamento',15,37,15,'2024-09-29','Exame de esforço',210),(30,'Normal','Finalizado',11,2,40,'2024-09-30','Endoscopia',300),(31,'Normal','Finalizado',31,6,3,'2024-10-01','Exame de sangue',150),(32,'Anormalidade detectada','Em andamento',46,24,21,'2024-10-02','Raio-X',220.5),(33,'Normal','Finalizado',26,33,10,'2024-10-03','Tomografia',350),(34,'Resultado pendente','Em andamento',3,16,30,'2024-10-04','Exame de urina',120),(35,'Anormalidade detectada','Finalizado',8,44,45,'2024-10-05','Ecocardiograma',400),(36,'Normal','Finalizado',34,14,50,'2024-10-06','Ultrassonografia',250.75),(37,'Resultado pendente','Em andamento',39,48,31,'2024-10-07','Exame de vista',180),(38,'Normal','Finalizado',22,5,47,'2024-10-08','Exame de audição',175),(39,'Anormalidade detectada','Em andamento',24,35,38,'2024-10-09','Exame de esforço',210),(40,'Normal','Finalizado',36,42,29,'2024-10-10','Endoscopia',300),(41,'Normal','Finalizado',12,8,14,'2024-10-11','Exame de sangue',150),(42,'Anormalidade detectada','Em andamento',22,19,32,'2024-10-12','Raio-X',220.5),(43,'Normal','Finalizado',33,4,26,'2024-10-13','Tomografia',350),(44,'Resultado pendente','Em andamento',44,12,21,'2024-10-14','Exame de urina',120),(45,'Anormalidade detectada','Finalizado',18,29,40,'2024-10-15','Ecocardiograma',400),(46,'Normal','Finalizado',7,20,37,'2024-10-16','Ultrassonografia',250.75),(47,'Resultado pendente','Em andamento',39,33,15,'2024-10-17','Exame de vista',180),(48,'Normal','Finalizado',26,42,9,'2024-10-18','Exame de audição',175),(49,'Anormalidade detectada','Em andamento',11,25,48,'2024-10-19','Exame de esforço',210),(50,'Normal','Finalizado',30,7,51,'2024-10-20','Endoscopia',300);
/*!40000 ALTER TABLE `exame` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico`
--

DROP TABLE IF EXISTS `medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medico` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `nomeMed` varchar(100) DEFAULT NULL,
  `cpfMed` varchar(15) DEFAULT NULL,
  `nascimentoMed` date DEFAULT NULL,
  `generoMed` varchar(10) DEFAULT NULL,
  `telefoneMed` varchar(15) DEFAULT NULL,
  `enderecoMed` varchar(200) DEFAULT NULL,
  `emailMed` varchar(100) DEFAULT NULL,
  `rgMed` varchar(16) DEFAULT NULL,
  `registroMed` varchar(12) DEFAULT NULL,
  `especializacao` varchar(100) DEFAULT NULL,
  `instituicaoEnsino` varchar(100) DEFAULT NULL,
  `conclusaoGrad` date DEFAULT NULL,
  `certificacao` varchar(100) DEFAULT NULL,
  `areaInteresse` varchar(100) DEFAULT NULL,
  `credenciais` varchar(100) DEFAULT NULL,
  `experiencias` varchar(1500) DEFAULT NULL,
  `senhaMed` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico`
--

LOCK TABLES `medico` WRITE;
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
INSERT INTO `medico` VALUES (1,'João Silva','123.456.789-00','1980-05-10','M','(11) 99999-9999','Rua A, 123, São Paulo, SP','joao.silva@email.com','12.345.678-9','CRM12345','Cardiologia','USP','2004-12-15','Certificado ABC','Cardiologia Intervencionista','Membro da SBC','10 anos de experiência em hospitais renomados.','senha123'),(2,'Maria Souza','987.654.321-00','1985-08-20','F','(21) 88888-8888','Rua B, 456, Rio de Janeiro, RJ','maria.souza@email.com','98.765.432-1','CRM54321','Neurologia','UFRJ','2008-06-20','Certificado XYZ','Neurologia Pediátrica','Membro da ABN','12 anos de atuação em hospitais públicos e privados.','senha456'),(3,'Carlos Pereira','123.789.456-01','1979-03-25','M','(31) 77777-7777','Rua C, 789, Belo Horizonte, MG','carlos.pereira@email.com','21.123.456-7','CRM98765','Ortopedia','UFMG','2003-11-10','Certificação DEF','Traumatologia Esportiva','Membro da SBOT','15 anos atuando em grandes hospitais de ortopedia.','senha789'),(4,'Ana Costa','321.654.987-02','1990-11-15','F','(41) 66666-6666','Rua D, 321, Curitiba, PR','ana.costa@email.com','32.654.987-4','CRM67890','Pediatria','UFPR','2012-09-18','Certificado GHI','Pediatria Geral','Membro da SBP','8 anos de experiência em atendimento pediátrico.','senha012'),(5,'Luiz Fernandes','456.123.789-03','1975-07-07','M','(51) 55555-5555','Rua E, 654, Porto Alegre, RS','luiz.fernandes@email.com','43.876.543-2','CRM11223','Dermatologia','UFRGS','2000-05-22','Certificação JKL','Dermatologia Estética','Membro da SBD','20 anos atuando em clínicas estéticas renomadas.','senha345'),(6,'Patrícia Lima','789.456.123-04','1988-09-30','F','(61) 44444-4444','Rua F, 987, Brasília, DF','patricia.lima@email.com','54.321.987-6','CRM33445','Ginecologia','UnB','2011-03-05','Certificado MNO','Ginecologia e Obstetrícia','Membro da FEBRASGO','9 anos de experiência em clínicas e hospitais de renome.','senha678'),(7,'Ricardo Almeida','147.258.369-05','1982-04-18','M','(71) 33333-3333','Rua G, 159, Salvador, BA','ricardo.almeida@email.com','65.789.123-8','CRM55667','Oftalmologia','UFBA','2006-07-30','Certificação PQR','Cirurgia Refrativa','Membro da CBO','14 anos de experiência em cirurgia ocular.','senha901'),(8,'Juliana Martins','963.852.741-06','1983-06-27','F','(81) 22222-2222','Rua H, 753, Recife, PE','juliana.martins@email.com','76.543.219-0','CRM77889','Psiquiatria','UFPE','2007-11-11','Certificado STU','Psiquiatria Infantil','Membro da ABP','13 anos atuando em clínicas de saúde mental.','senha234'),(9,'Fernando Ribeiro','258.369.147-07','1978-12-05','M','(91) 11111-1111','Rua I, 357, Belém, PA','fernando.ribeiro@email.com','87.654.321-2','CRM99001','Cirurgia Geral','UFPA','2002-02-14','Certificação VWX','Cirurgia Minimamente Invasiva','Membro do CBC','18 anos atuando como cirurgião em grandes hospitais.','senha567'),(10,'Carla Oliveira','159.753.486-08','1992-01-22','F','(51) 99999-0000','Rua J, 951, Porto Alegre, RS','carla.oliveira@email.com','98.765.432-9','CRM22334','Endocrinologia','UFRGS','2015-08-12','Certificado YZA','Endocrinologia Clínica','Membro da SBEM','5 anos de experiência em tratamento de doenças endócrinas.','senha890'),(11,'Gabriel Mendes','852.963.741-09','1986-02-14','M','(11) 12345-6789','Avenida Paulista, 1234, São Paulo, SP','gabriel.mendes@email.com','23.456.789-0','CRM44556','Anestesiologia','USP','2010-10-20','Certificado ABC','Anestesia Geral','Membro da SBA','10 anos de atuação em hospitais públicos e privados.','senha111'),(12,'Renata Alves','741.852.963-10','1981-12-01','F','(21) 23456-7890','Rua das Flores, 567, Rio de Janeiro, RJ','renata.alves@email.com','12.345.678-0','CRM11234','Oncologia','UFRJ','2005-08-15','Certificação XYZ','Oncologia Clínica','Membro da SBOC','15 anos de experiência em tratamento oncológico.','senha222'),(13,'Eduardo Gonçalves','963.741.852-11','1977-05-23','M','(31) 34567-8901','Rua Diamante, 456, Belo Horizonte, MG','eduardo.goncalves@email.com','54.321.987-1','CRM22345','Radiologia','UFMG','2001-12-19','Certificação DEF','Radiologia Intervencionista','Membro da CBR','20 anos de atuação em diagnóstico por imagem.','senha333'),(14,'Paula Santos','159.753.486-12','1993-07-10','F','(41) 45678-9012','Rua Esmeralda, 789, Curitiba, PR','paula.santos@email.com','43.210.987-2','CRM33456','Neurologia','UFPR','2016-04-25','Certificado GHI','Neurocirurgia','Membro da ABN','4 anos atuando em clínicas especializadas.','senha444'),(15,'Marcos Oliveira','357.159.852-13','1974-11-11','M','(51) 56789-0123','Rua Opala, 321, Porto Alegre, RS','marcos.oliveira@email.com','23.210.654-3','CRM44567','Urologia','UFRGS','1999-06-30','Certificação JKL','Cirurgia Urológica','Membro da SBU','22 anos de atuação em clínicas e hospitais de renome.','senha555'),(16,'Beatriz Figueiredo','654.321.987-14','1984-03-08','F','(61) 67890-1234','Rua Rubi, 987, Brasília, DF','beatriz.figueiredo@email.com','87.654.321-0','CRM55678','Dermatologia','UnB','2009-01-10','Certificado MNO','Dermatologia Clínica','Membro da SBD','11 anos de experiência em clínicas dermatológicas.','senha666'),(17,'Thiago Lima','789.654.123-15','1990-09-20','M','(71) 78901-2345','Rua Ametista, 159, Salvador, BA','thiago.lima@email.com','65.789.123-4','CRM66789','Endocrinologia','UFBA','2013-07-17','Certificação PQR','Endocrinologia Pediátrica','Membro da SBEM','7 anos de atuação em hospitais pediátricos.','senha777'),(18,'Camila Ribeiro','123.789.456-16','1987-04-27','F','(81) 89012-3456','Rua Topázio, 753, Recife, PE','camila.ribeiro@email.com','98.765.432-7','CRM77890','Geriatria','UFPE','2011-09-15','Certificado STU','Geriatria Clínica','Membro da SBGG','9 anos de atuação em clínicas geriátricas.','senha888'),(19,'Daniel Fernandes','147.963.258-17','1985-01-16','M','(91) 90123-4567','Rua Safira, 357, Belém, PA','daniel.fernandes@email.com','76.543.219-8','CRM88901','Cirurgia Plástica','UFPA','2010-05-12','Certificação VWX','Cirurgia Estética','Membro da SBCP','10 anos atuando em cirurgias plásticas estéticas e reparadoras.','senha999'),(20,'Larissa Costa','963.258.147-18','1991-08-05','F','(51) 01234-5678','Rua Cristal, 951, Porto Alegre, RS','larissa.costa@email.com','12.345.678-4','CRM99012','Otorrinolaringologia','UFRGS','2014-03-22','Certificado YZA','Otorrinolaringologia Clínica','Membro da ABORL-CCF','6 anos de experiência em clínicas especializadas.','senha000'),(21,'Felipe Castro','852.741.963-19','1984-02-18','M','(11) 23456-7890','Rua dos Jardins, 123, São Paulo, SP','felipe.castro@email.com','12.345.678-1','CRM99887','Imunologia','USP','2008-11-15','Certificado ABC','Imunologia Clínica','Membro da SBI','12 anos de experiência em clínicas especializadas.','senha1111'),(22,'Juliana Ferreira','963.852.741-20','1986-06-12','F','(21) 34567-8901','Avenida Atlântica, 456, Rio de Janeiro, RJ','juliana.ferreira@email.com','98.765.432-2','CRM88765','Medicina de Família','UFRJ','2010-03-20','Certificação XYZ','Cuidados Primários','Membro da SBMFC','9 anos de atuação em atendimento primário.','senha2222'),(23,'Marcelo Lima','741.963.852-21','1979-04-07','M','(31) 45678-9012','Rua das Palmeiras, 789, Belo Horizonte, MG','marcelo.lima@email.com','21.123.456-8','CRM55678','Oftalmologia','UFMG','2003-08-25','Certificação DEF','Oftalmologia Pediátrica','Membro da CBO','20 anos de experiência em cirurgias oftalmológicas.','senha3333'),(24,'Vanessa Oliveira','852.963.147-22','1990-10-30','F','(41) 56789-0123','Rua do Sol, 321, Curitiba, PR','vanessa.oliveira@email.com','32.654.321-0','CRM66789','Hematologia','UFPR','2014-07-18','Certificado GHI','Hematologia Clínica','Membro da SBH','7 anos de atuação em hospitais e clínicas especializadas.','senha4444'),(25,'Lucas Martins','963.741.852-23','1982-03-14','M','(51) 67890-1234','Rua das Acácias, 654, Porto Alegre, RS','lucas.martins@email.com','54.321.987-3','CRM77890','Cirurgia Torácica','UFRGS','2007-05-12','Certificação JKL','Cirurgia Torácica e Pulmonar','Membro da SBCT','15 anos de experiência em cirurgias torácicas.','senha5555'),(26,'Letícia Costa','741.852.963-24','1988-09-05','F','(61) 78901-2345','Rua do Comércio, 987, Brasília, DF','leticia.costa@email.com','65.432.109-5','CRM88901','Nefrologia','UnB','2011-04-22','Certificação MNO','Nefrologia Clínica','Membro da SBN','9 anos de experiência em tratamento de doenças renais.','senha6666'),(27,'Roberto Silva','852.963.741-25','1983-07-15','M','(71) 89012-3456','Rua das Acácias, 456, Salvador, BA','roberto.silva@email.com','76.543.210-6','CRM99012','Cardiologia','UFBA','2006-12-08','Certificação PQR','Cardiologia Intervencionista','Membro da SBC','16 anos de experiência em cardiologia.','senha7777'),(28,'Gabriela Almeida','963.852.741-26','1992-11-20','F','(81) 90123-4567','Rua da Esperança, 159, Recife, PE','gabriela.almeida@email.com','87.654.321-7','CRM22334','Ginecologia','UFPE','2016-03-10','Certificado STU','Ginecologia e Obstetrícia','Membro da FEBRASGO','5 anos de experiência em ginecologia.','senha8888'),(29,'Fernando Castro','741.963.852-27','1987-05-09','M','(91) 01234-5678','Rua do Ouro, 753, Belém, PA','fernando.castro@email.com','98.765.432-8','CRM33445','Cirurgia Plástica','UFPA','2012-02-15','Certificação VWX','Cirurgia Estética e Reparadora','Membro da SBCP','9 anos de atuação em cirurgia plástica.','senha9999'),(30,'Amanda Fernandes','852.741.963-28','1984-01-28','F','(51) 12345-6789','Rua das Flores, 951, Porto Alegre, RS','amanda.fernandes@email.com','21.987.654-1','CRM44556','Endocrinologia','UFRGS','2009-07-22','Certificado YZA','Endocrinologia Geral','Membro da SBEM','14 anos de experiência em endocrinologia.','senha0000'),(31,'Rodrigo Lima','963.258.147-29','1978-12-04','M','(31) 23456-7890','Rua dos Jasmins, 357, Belo Horizonte, MG','rodrigo.lima@email.com','32.654.987-6','CRM55667','Oncologia','UFMG','2001-09-19','Certificação ZYX','Oncologia Clínica e Experimental','Membro da SBOC','22 anos de experiência em oncologia.','senha1111'),(32,'Roberta Lima','852.741.963-30','1989-03-21','F','(11) 34567-8901','Rua dos Lírios, 123, São Paulo, SP','roberta.lima@email.com','12.456.789-3','CRM99888','Ortopedia','USP','2013-05-18','Certificado ABC','Cirurgia Ortopédica','Membro da SBOT','8 anos de experiência em cirurgia ortopédica.','senha1234'),(33,'Maurício Souza','963.852.741-31','1980-12-09','M','(21) 45678-9012','Avenida Brasil, 456, Rio de Janeiro, RJ','mauricio.souza@email.com','98.765.432-4','CRM88766','Pediatria','UFRJ','2004-11-22','Certificação XYZ','Pediatria Geral','Membro da SBP','15 anos de atuação em clínicas pediátricas.','senha2345'),(34,'Mariana Costa','741.963.852-32','1976-09-18','F','(31) 56789-0123','Rua das Palmeiras, 789, Belo Horizonte, MG','mariana.costa@email.com','54.321.987-4','CRM55679','Geriatria','UFMG','2000-06-30','Certificação DEF','Geriatria Clínica','Membro da SBGG','24 anos de experiência em geriatria.','senha3456'),(35,'Paulo Rocha','852.963.147-33','1985-02-10','M','(41) 67890-1234','Rua do Bosque, 321, Curitiba, PR','paulo.rocha@email.com','76.543.210-5','CRM66790','Endocrinologia','UFPR','2010-03-19','Certificado GHI','Endocrinologia Clínica','Membro da SBEM','14 anos de atuação em endocrinologia.','senha4567'),(36,'Sofia Oliveira','963.741.852-34','1991-06-15','F','(51) 78901-2345','Rua dos Cedros, 654, Porto Alegre, RS','sofia.oliveira@email.com','87.654.321-6','CRM77891','Radiologia','UFRGS','2015-09-12','Certificação JKL','Radiologia Intervencionista','Membro da CBR','6 anos de experiência em diagnóstico por imagem.','senha5678'),(37,'Jorge Almeida','741.852.963-35','1978-11-27','M','(61) 89012-3456','Rua do Rio, 987, Brasília, DF','jorge.almeida@email.com','98.765.432-7','CRM88902','Cardiologia','UnB','2002-12-05','Certificação MNO','Cardiologia Intervencionista','Membro da SBC','22 anos de experiência em cardiologia.','senha6789'),(38,'Fernanda Santos','852.963.741-36','1984-07-12','F','(71) 90123-4567','Rua das Palmeiras, 753, Salvador, BA','fernanda.santos@email.com','65.432.109-8','CRM99013','Ginecologia','UFBA','2008-10-22','Certificado PQR','Ginecologia e Obstetrícia','Membro da FEBRASGO','16 anos de atuação em ginecologia.','senha7890'),(39,'Rafael Martins','963.852.741-37','1982-04-30','M','(81) 01234-5678','Rua do Sol, 951, Recife, PE','rafael.martins@email.com','54.321.098-9','CRM22335','Cirurgia Geral','UFPE','2006-06-15','Certificação STU','Cirurgia Geral e Abdominal','Membro do CBC','18 anos de experiência em cirurgia geral.','senha8901'),(40,'Tatiane Ferreira','741.963.852-38','1990-08-25','F','(91) 12345-6789','Rua dos Jacarandás, 123, Belém, PA','tatiane.ferreira@email.com','23.456.789-0','CRM33446','Nefrologia','UFPA','2014-05-10','Certificação VWX','Nefrologia Clínica','Membro da SBN','9 anos de atuação em nefrologia.','senha9012'),(41,'Eduardo Costa','852.741.963-39','1987-03-29','M','(51) 23456-7890','Rua das Palmeiras, 987, Porto Alegre, RS','eduardo.costa@email.com','87.654.321-1','CRM44567','Oftalmologia','UFRGS','2011-08-22','Certificado YZA','Cirurgia Refrativa','Membro da CBO','13 anos de experiência em oftalmologia.','senha0123'),(42,'Claudia Mendes','963.741.852-40','1985-06-14','F','(11) 34567-8901','Rua dos Jardins, 123, São Paulo, SP','claudia.mendes@email.com','32.654.987-2','CRM99899','Gastroenterologia','USP','2009-05-22','Certificado ABC','Gastroenterologia Clínica','Membro da SBG','15 anos de experiência em gastroenterologia.','senha12345'),(43,'Thiago Almeida','852.963.741-41','1979-10-30','M','(21) 45678-9012','Rua das Flores, 456, Rio de Janeiro, RJ','thiago.almeida@email.com','21.987.654-3','CRM88777','Ortopedia','UFRJ','2003-03-18','Certificação XYZ','Cirurgia Ortopédica','Membro da SBOT','20 anos de experiência em ortopedia.','senha23456'),(44,'Amanda Lima','741.852.963-42','1988-08-12','F','(31) 56789-0123','Rua das Palmeiras, 789, Belo Horizonte, MG','amanda.lima@email.com','65.432.109-3','CRM55680','Pneumologia','UFMG','2012-09-10','Certificação DEF','Pneumologia Clínica','Membro da SBPT','12 anos de atuação em pneumologia.','senha34567'),(45,'Felipe Rocha','963.741.852-43','1982-02-25','M','(41) 67890-1234','Rua do Bosque, 321, Curitiba, PR','felipe.rocha@email.com','87.654.321-4','CRM66791','Endocrinologia','UFPR','2006-04-15','Certificado GHI','Endocrinologia Pediátrica','Membro da SBEM','18 anos de experiência em endocrinologia pediátrica.','senha45678'),(46,'Juliana Costa','852.963.741-44','1989-07-07','F','(51) 78901-2345','Rua dos Cedros, 654, Porto Alegre, RS','juliana.costa@email.com','98.765.432-5','CRM77892','Oftalmologia','UFRGS','2013-12-20','Certificação JKL','Cirurgia Oftalmológica','Membro da CBO','11 anos de experiência em oftalmologia.','senha56789'),(47,'Roberto Santos','741.852.963-45','1975-01-10','M','(61) 89012-3456','Rua do Comércio, 987, Brasília, DF','roberto.santos@email.com','23.456.789-0','CRM88903','Cardiologia','UnB','1999-11-25','Certificação MNO','Cardiologia Intervencionista','Membro da SBC','25 anos de experiência em cardiologia.','senha67890'),(48,'Mariana Almeida','852.963.741-46','1983-09-12','F','(71) 90123-4567','Rua das Acácias, 753, Salvador, BA','mariana.almeida@email.com','54.321.098-6','CRM99014','Dermatologia','UFBA','2007-06-15','Certificado PQR','Dermatologia Clínica','Membro da SBD','16 anos de atuação em dermatologia.','senha78901'),(49,'Lucas Pereira','963.852.741-47','1991-12-20','M','(81) 01234-5678','Rua do Sol, 951, Recife, PE','lucas.pereira@email.com','87.654.321-7','CRM22336','Geriatria','UFPE','2015-01-10','Certificação STU','Geriatria Clínica','Membro da SBGG','9 anos de experiência em geriatria.','senha89012'),(50,'Fernanda Almeida','741.963.852-48','1984-04-30','F','(91) 12345-6789','Rua do Rio, 753, Belém, PA','fernanda.almeida@email.com','98.765.432-8','CRM33447','Nefrologia','UFPA','2008-07-20','Certificação VWX','Nefrologia Clínica','Membro da SBN','16 anos de experiência em nefrologia.','senha90123'),(51,'Rafael Gomes','852.741.963-49','1976-11-23','M','(51) 23456-7890','Rua das Flores, 951, Porto Alegre, RS','rafael.gomes@email.com','32.654.987-0','CRM44568','Cirurgia Torácica','UFRGS','2001-05-15','Certificado YZA','Cirurgia Torácica e Pulmonar','Membro da SBCT','23 anos de experiência em cirurgia torácica.','senha01234'),(52,'Beatriz Almeida','963.741.852-50','1989-07-20','F','(31) 34567-8901','Rua dos Jasmins, 123, Belo Horizonte, MG','beatriz.almeida@email.com','21.987.654-1','CRM55681','Hematologia','UFMG','2014-10-22','Certificação ZYX','Hematologia Clínica','Membro da SBH','10 anos de experiência em hematologia.','senha12345');
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL,
  `dataNascimento` date DEFAULT NULL,
  `genero` varchar(10) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `rg` varchar(16) DEFAULT NULL,
  `senha` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (1,'João Silva','123.456.789-00','1990-01-15','M','(11) 91234-5678','Rua das Flores, 123','joao.silva@example.com','MG-12.345.678',NULL),(2,'Maria Oliveira','234.567.890-11','1985-02-20','F','(21) 98765-4321','Avenida Paulista, 456','maria.oliveira@example.com','SP-23.456.789','123456'),(3,'Carlos Santos','345.678.901-22','1992-03-10','M','(31) 99876-5432','Rua do Comércio, 789','carlos.santos@example.com','RJ-34.567.890',NULL),(4,'Ana Pereira','456.789.012-33','1988-04-25','F','(41) 92345-6789','Travessa da Alegria, 101','ana.pereira@example.com','PR-45.678.901',NULL),(5,'Fernando Costa','567.890.123-44','1995-05-30','M','(51) 93456-7890','Rua das Palmeiras, 202','fernando.costa@example.com','RS-56.789.012',NULL),(6,'Juliana Lima','678.901.234-55','1993-06-15','F','(61) 94567-8901','Avenida Central, 303','juliana.lima@example.com','DF-67.890.123',NULL),(7,'Ricardo Almeida','789.012.345-66','1987-07-20','M','(71) 95678-9012','Rua do Sol, 404','ricardo.almeida@example.com','BA-78.901.234',NULL),(8,'Tatiane Rocha','890.123.456-77','1994-08-05','F','(81) 96789-0123','Rua da Paz, 505','tatiane.rocha@example.com','PE-89.012.345',NULL),(9,'Roberto Martins','901.234.567-88','1982-09-10','M','(91) 97890-1234','Avenida Brasil, 606','roberto.martins@example.com','AM-90.123.456',NULL),(10,'Claudia Ferreira','012.345.678-99','1996-10-25','F','(61) 98901-2345','Rua das Acácias, 707','claudia.ferreira@example.com','DF-01.234.567',NULL),(11,'Eduardo Souza','123.456.789-01','1984-11-12','M','(11) 91234-6789','Rua das Margaridas, 808','eduardo.souza@example.com','SP-12.345.678',NULL),(12,'Beatriz Silva','234.567.890-12','1991-12-23','F','(21) 92345-6789','Avenida Rio Branco, 909','beatriz.silva@example.com','RJ-23.456.789',NULL),(13,'Paulo Santos','345.678.901-23','1986-01-30','M','(31) 93456-7890','Rua das Palmeiras, 1010','paulo.santos@example.com','MG-34.567.890',NULL),(14,'Laura Lima','456.789.012-34','1994-02-14','F','(41) 94567-8901','Travessa das Andorinhas, 1212','laura.lima@example.com','PR-45.678.901',NULL),(15,'Jorge Almeida','567.890.123-45','1989-03-19','M','(51) 95678-9012','Rua do Limoeiro, 1313','jorge.almeida@example.com','RS-56.789.012',NULL),(16,'Mariana Costa','678.901.234-56','1992-04-29','F','(61) 96789-0123','Avenida das Nações, 1414','mariana.costa@example.com','DF-67.890.123',NULL),(17,'Fábio Rocha','789.012.345-67','1987-05-10','M','(71) 97890-1234','Rua dos Eucaliptos, 1515','fabio.rocha@example.com','BA-78.901.234',NULL),(18,'Sabrina Pereira','890.123.456-78','1995-06-22','F','(81) 98901-2345','Rua dos Jasmins, 1616','sabrina.pereira@example.com','PE-89.012.345',NULL),(19,'Gabriel Martins','901.234.567-89','1983-07-16','M','(91) 99012-3456','Avenida das Rosas, 1717','gabriel.martins@example.com','AM-90.123.456',NULL),(20,'Patrícia Ferreira','012.345.678-90','1997-08-05','F','(61) 99123-4567','Rua dos Lírios, 1818','patricia.ferreira@example.com','DF-01.234.567',NULL),(21,'Rafael Santos','123.456.789-12','1980-09-23','M','(11) 91234-5670','Rua das Orquídeas, 1919','rafael.santos@example.com','SP-12.345.679',NULL),(22,'Fernanda Costa','234.567.890-23','1986-10-17','F','(21) 92345-6780','Avenida dos Bandeirantes, 2020','fernanda.costa@example.com','RJ-23.456.790',NULL),(23,'Vitor Almeida','345.678.901-34','1990-11-05','M','(31) 93456-7801','Rua das Azaleias, 2121','vitor.almeida@example.com','MG-34.567.891',NULL),(24,'Marcelia Lima','456.789.012-45','1992-12-25','F','(41) 94567-8912','Travessa das Acácias, 2222','marcelia.lima@example.com','PR-45.678.902',NULL),(25,'Leonardo Pereira','567.890.123-56','1988-01-18','M','(51) 95678-9023','Rua das Hortênsias, 2323','leonardo.pereira@example.com','RS-56.789.023',NULL),(26,'Isabela Rocha','678.901.234-67','1994-02-08','F','(61) 96789-0134','Avenida dos Cedros, 2424','isabela.rocha@example.com','DF-67.890.234',NULL),(27,'Gustavo Ferreira','789.012.345-78','1985-03-20','M','(71) 97890-1245','Rua dos Jacarandás, 2525','gustavo.ferreira@example.com','BA-78.901.345',NULL),(28,'Paola Silva','890.123.456-89','1991-04-15','F','(81) 98901-2356','Rua das Magnólias, 2626','paola.silva@example.com','PE-89.012.456',NULL),(29,'André Martins','901.234.567-90','1983-05-12','M','(91) 99012-3467','Avenida dos Manacás, 2727','andre.martins@example.com','AM-90.123.567',NULL),(30,'Carla Souza','012.345.678-01','1997-06-28','F','(61) 99123-4578','Rua das Begônias, 2828','carla.souza@example.com','DF-01.234.678',NULL),(31,'Thiago Rodrigues','123.456.789-23','1990-07-09','M','(11) 91234-5671','Rua das Cebolas, 2929','thiago.rodrigues@example.com','SP-12.345.680',NULL),(32,'Aline Alves','234.567.890-34','1987-08-17','F','(21) 92345-6781','Avenida dos Jardins, 3030','aline.alves@example.com','RJ-23.456.791',NULL),(33,'Lucas Ferreira','345.678.901-45','1992-09-26','M','(31) 93456-7802','Rua das Flores, 3131','lucas.ferreira@example.com','MG-34.567.892',NULL),(34,'Letícia Carvalho','456.789.012-56','1995-10-15','F','(41) 94567-8913','Travessa dos Eucaliptos, 3232','leticia.carvalho@example.com','PR-45.678.903',NULL),(35,'João Pedro Lima','567.890.123-67','1989-11-30','M','(51) 95678-9024','Rua dos Cedros, 3333','joao.pedro.lima@example.com','RS-56.789.034',NULL),(36,'Vanessa Martins','678.901.234-78','1994-12-14','F','(61) 96789-0145','Avenida das Jacarandás, 3434','vanessa.martins@example.com','DF-67.890.345',NULL),(37,'Marcelo Silva','789.012.345-89','1986-01-05','M','(71) 97890-1356','Rua dos Lírios, 3535','marcelo.silva@example.com','BA-78.901.456',NULL),(38,'Tais Rocha','890.123.456-90','1992-02-18','F','(81) 98901-2467','Rua dos Jasmins, 3636','tais.rocha@example.com','PE-89.012.567',NULL),(39,'Rodrigo Costa','901.234.567-01','1984-03-12','M','(91) 99012-3578','Avenida dos Manacás, 3737','rodrigo.costa@example.com','AM-90.123.678',NULL),(40,'Juliana Almeida','012.345.678-12','1997-04-22','F','(61) 99123-4689','Rua das Orquídeas, 3838','juliana.almeida@example.com','DF-01.234.689',NULL),(41,'Rogério Andrade','123.456.789-34','1991-05-25','M','(11) 91234-5672','Rua das Violetas, 3939','rogerio.andrade@example.com','SP-12.345.681',NULL),(42,'Larissa Ferreira','234.567.890-45','1987-06-30','F','(21) 92345-6782','Avenida das Margaridas, 4040','larissa.ferreira@example.com','RJ-23.456.792',NULL),(43,'Daniel Costa','345.678.901-56','1994-07-21','M','(31) 93456-7803','Rua dos Lírios, 4141','daniel.costa@example.com','MG-34.567.893',NULL),(44,'Monique Silva','456.789.012-67','1989-08-12','F','(41) 94567-8914','Travessa das Begônias, 4242','monique.silva@example.com','PR-45.678.904',NULL),(45,'Felipe Martins','567.890.123-78','1992-09-30','M','(51) 95678-9025','Rua das Azaleias, 4343','felipe.martins@example.com','RS-56.789.045',NULL),(46,'Cristina Rocha','678.901.234-89','1988-10-18','F','(61) 96789-0256','Avenida das Rosas, 4444','cristina.rocha@example.com','DF-67.890.456',NULL),(47,'Bruno Almeida','789.012.345-90','1990-11-22','M','(71) 97890-1467','Rua dos Jasmins, 4545','bruno.almeida@example.com','BA-78.901.567',NULL),(48,'Sueli Costa','890.123.456-01','1993-12-10','F','(81) 98901-2578','Rua das Margaridas, 4646','sueli.costa@example.com','PE-89.012.678',NULL),(49,'Guilherme Souza','901.234.567-12','1985-01-05','M','(91) 99012-3689','Avenida dos Manacás, 4747','guilherme.souza@example.com','AM-90.123.789',NULL),(50,'Viviane Lima','012.345.678-23','1996-02-27','F','(61) 99123-5790','Rua das Orquídeas, 4848','viviane.lima@example.com','DF-01.234.790',NULL),(51,'Beatriz Almeida','963.741.852-50','1989-07-20','F','(31) 34567-8901','Rua dos Jasmins, 123, Belo Horizonte, MG','beatriz.almeida@email.com','MG-21.987.654',NULL),(52,'Rafael Gomes','852.741.963-49','1976-11-23','M','(51) 23456-7890','Rua das Flores, 951, Porto Alegre, RS','rafael.gomes@email.com','RS-32.654.987',NULL);
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagamento`
--

DROP TABLE IF EXISTS `pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagamento` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `tipoPagamento` varchar(20) DEFAULT NULL,
  `notaFiscal` varchar(100) DEFAULT NULL,
  `codigoPagamento` varchar(100) DEFAULT NULL,
  `ID_TipoAtendimento` int DEFAULT NULL,
  `ID_PACIENTE` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID_TipoAtendimento` (`ID_TipoAtendimento`),
  KEY `ID_PACIENTE` (`ID_PACIENTE`),
  CONSTRAINT `pagamento_ibfk_1` FOREIGN KEY (`ID_TipoAtendimento`) REFERENCES `tipoatendimento` (`ID`),
  CONSTRAINT `pagamento_ibfk_2` FOREIGN KEY (`ID_PACIENTE`) REFERENCES `paciente` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagamento`
--

LOCK TABLES `pagamento` WRITE;
/*!40000 ALTER TABLE `pagamento` DISABLE KEYS */;
INSERT INTO `pagamento` VALUES (1,'Pix','NF-12345678901234567890123456789012345678901234567890','COD-0012345678901234567890123456789012345678901234567890',35,12),(2,'Boleto','NF-23456789012345678901234567890123456789012345678901','COD-002345678901234567890123456789012345678901234567891',12,45),(3,'Cartão de Crédito','NF-34567890123456789012345678901234567890123456789012','COD-003456789012345678901234567890123456789012345678912',50,9),(4,'Débito','NF-45678901234567890123456789012345678901234567890123','COD-004567890123456789012345678901234567890123456789123',8,27),(5,'Pix','NF-56789012345678901234567890123456789012345678901234','COD-005678901234567890123456789012345678901234567890234',21,14),(6,'Boleto','NF-67890123456789012345678901234567890123456789012345','COD-006789012345678901234567890123456789012345678901345',45,33),(7,'Cartão de Crédito','NF-78901234567890123456789012345678901234567890123456','COD-007890123456789012345678901234567890123456789012456',19,25),(8,'Débito','NF-89012345678901234567890123456789012345678901234567','COD-008901234567890123456789012345678901234567890123567',26,8),(9,'Pix','NF-90123456789012345678901234567890123456789012345678','COD-009012345678901234567890123456789012345678901234678',7,30),(10,'Boleto','NF-01234567890123456789012345678901234567890123456789','COD-010123456789012345678901234567890123456789012345789',40,31),(11,'Débito','NF-11234567890123456789012345678901234567890123456789','COD-011123456789012345678901234567890123456789012345789',32,13),(12,'Pix','NF-21234567890123456789012345678901234567890123456780','COD-012123456789012345678901234567890123456789012345780',15,50),(13,'Boleto','NF-31234567890123456789012345678901234567890123456781','COD-013123456789012345678901234567890123456789012345781',5,35),(14,'Cartão de Crédito','NF-41234567890123456789012345678901234567890123456782','COD-014123456789012345678901234567890123456789012345782',28,20),(15,'Débito','NF-51234567890123456789012345678901234567890123456783','COD-015123456789012345678901234567890123456789012345783',14,2),(16,'Pix','NF-61234567890123456789012345678901234567890123456784','COD-016123456789012345678901234567890123456789012345784',42,11),(17,'Boleto','NF-71234567890123456789012345678901234567890123456785','COD-017123456789012345678901234567890123456789012345785',48,5),(18,'Cartão de Crédito','NF-81234567890123456789012345678901234567890123456786','COD-018123456789012345678901234567890123456789012345786',10,17),(19,'Débito','NF-91234567890123456789012345678901234567890123456787','COD-019123456789012345678901234567890123456789012345787',22,29),(20,'Pix','NF-01234567890123456789012345678901234567890123456788','COD-020123456789012345678901234567890123456789012345788',3,1),(21,'Boleto','NF-12345678901234567890123456789012345678901234567890','COD-021123456789012345678901234567890123456789012345789',18,38),(22,'Cartão de Crédito','NF-23456789012345678901234567890123456789012345678901','COD-022123456789012345678901234567890123456789012345790',4,18),(23,'Débito','NF-34567890123456789012345678901234567890123456789012','COD-023123456789012345678901234567890123456789012345791',33,36),(24,'Pix','NF-45678901234567890123456789012345678901234567890123','COD-024123456789012345678901234567890123456789012345792',29,7),(25,'Boleto','NF-56789012345678901234567890123456789012345678901234','COD-025123456789012345678901234567890123456789012345793',20,40),(26,'Cartão de Crédito','NF-67890123456789012345678901234567890123456789012345','COD-026123456789012345678901234567890123456789012345794',9,23),(27,'Débito','NF-78901234567890123456789012345678901234567890123456','COD-027123456789012345678901234567890123456789012345795',47,4),(28,'Pix','NF-89012345678901234567890123456789012345678901234567','COD-028123456789012345678901234567890123456789012345796',31,15),(29,'Boleto','NF-90123456789012345678901234567890123456789012345678','COD-029123456789012345678901234567890123456789012345797',1,6),(30,'Cartão de Crédito','NF-01234567890123456789012345678901234567890123456789','COD-030123456789012345678901234567890123456789012345798',50,32),(31,'Pix','NF-12345678901234567890123456789012345678901234567890','COD-031123456789012345678901234567890123456789012345799',25,37),(32,'Boleto','NF-23456789012345678901234567890123456789012345678901','COD-032123456789012345678901234567890123456789012345800',36,34),(33,'Cartão de Crédito','NF-34567890123456789012345678901234567890123456789012','COD-033123456789012345678901234567890123456789012345801',11,21),(34,'Débito','NF-45678901234567890123456789012345678901234567890123','COD-034123456789012345678901234567890123456789012345802',43,10),(35,'Pix','NF-56789012345678901234567890123456789012345678901234','COD-035123456789012345678901234567890123456789012345803',17,3),(36,'Boleto','NF-67890123456789012345678901234567890123456789012345','COD-036123456789012345678901234567890123456789012345804',23,42),(37,'Cartão de Crédito','NF-78901234567890123456789012345678901234567890123456','COD-037123456789012345678901234567890123456789012345805',30,22),(38,'Débito','NF-89012345678901234567890123456789012345678901234567','COD-038123456789012345678901234567890123456789012345806',46,26),(39,'Pix','NF-90123456789012345678901234567890123456789012345678','COD-039123456789012345678901234567890123456789012345807',24,41),(40,'Boleto','NF-01234567890123456789012345678901234567890123456789','COD-040123456789012345678901234567890123456789012345808',37,19),(41,'Cartão de Crédito','NF-12345678901234567890123456789012345678901234567890','COD-041123456789012345678901234567890123456789012345809',41,16),(42,'Débito','NF-23456789012345678901234567890123456789012345678901','COD-042123456789012345678901234567890123456789012345810',34,24),(43,'Pix','NF-34567890123456789012345678901234567890123456789012','COD-043123456789012345678901234567890123456789012345811',16,43),(44,'Boleto','NF-45678901234567890123456789012345678901234567890123','COD-044123456789012345678901234567890123456789012345812',13,28),(45,'Cartão de Crédito','NF-56789012345678901234567890123456789012345678901234','COD-045123456789012345678901234567890123456789012345813',6,44),(46,'Débito','NF-67890123456789012345678901234567890123456789012345','COD-046123456789012345678901234567890123456789012345814',39,52),(47,'Pix','NF-78901234567890123456789012345678901234567890123456','COD-047123456789012345678901234567890123456789012345815',44,39),(48,'Boleto','NF-89012345678901234567890123456789012345678901234567','COD-048123456789012345678901234567890123456789012345816',2,47),(49,'Cartão de Crédito','NF-90123456789012345678901234567890123456789012345678','COD-049123456789012345678901234567890123456789012345817',49,48),(50,'Débito','NF-01234567890123456789012345678901234567890123456789','COD-050123456789012345678901234567890123456789012345818',38,46),(53,'PIX','962503952213200739762757878869896639885388902','532615829261449347269815548153604484972',NULL,2);
/*!40000 ALTER TABLE `pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prescricao`
--

DROP TABLE IF EXISTS `prescricao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prescricao` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `medicamento` varchar(300) DEFAULT NULL,
  `observacao` varchar(500) DEFAULT NULL,
  `ID_PACIENTE` int DEFAULT NULL,
  `ID_MEDICO` int DEFAULT NULL,
  `dataPrescricao` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID_PACIENTE` (`ID_PACIENTE`),
  KEY `ID_MEDICO` (`ID_MEDICO`),
  CONSTRAINT `prescricao_ibfk_1` FOREIGN KEY (`ID_PACIENTE`) REFERENCES `paciente` (`ID`),
  CONSTRAINT `prescricao_ibfk_2` FOREIGN KEY (`ID_MEDICO`) REFERENCES `medico` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prescricao`
--

LOCK TABLES `prescricao` WRITE;
/*!40000 ALTER TABLE `prescricao` DISABLE KEYS */;
INSERT INTO `prescricao` VALUES (1,'Paracetamol','Tomar 1 comprimido de 500mg a cada 8 horas por 5 dias',35,12,'2024-09-01'),(2,'Amoxicilina','Tomar 1 comprimido de 1g a cada 12 horas por 7 dias',7,24,'2024-09-02'),(3,'Ibuprofeno','Tomar 2 comprimidos de 200mg a cada 6 horas por 3 dias',22,50,'2024-09-03'),(4,'Losartana','Tomar 1 comprimido de 50mg uma vez ao dia',45,31,'2024-09-04'),(5,'Omeprazol','Tomar 1 cápsula de 20mg em jejum por 10 dias',9,18,'2024-09-05'),(6,'Azitromicina','Tomar 1 comprimido de 500mg uma vez ao dia por 3 dias',29,6,'2024-09-06'),(7,'Simvastatina','Tomar 1 comprimido de 40mg à noite',4,42,'2024-09-07'),(8,'Metformina','Tomar 1 comprimido de 850mg duas vezes ao dia',12,36,'2024-09-08'),(9,'Clonazepam','Tomar 1 comprimido de 2mg antes de dormir',50,3,'2024-09-09'),(10,'Cetirizina','Tomar 1 comprimido de 10mg uma vez ao dia',17,28,'2024-09-10'),(11,'Dipirona','Tomar 40 gotas a cada 6 horas por 3 dias',10,23,'2024-09-11'),(12,'Loratadina','Tomar 1 comprimido de 10mg uma vez ao dia',18,41,'2024-09-12'),(13,'Cefalexina','Tomar 1 comprimido de 500mg a cada 6 horas por 7 dias',3,14,'2024-09-13'),(14,'Prednisona','Tomar 1 comprimido de 20mg uma vez ao dia por 5 dias',25,32,'2024-09-14'),(15,'Ranitidina','Tomar 1 comprimido de 150mg duas vezes ao dia por 14 dias',11,8,'2024-09-15'),(16,'Hidroxicloroquina','Tomar 2 comprimidos de 200mg uma vez ao dia',36,5,'2024-09-16'),(17,'Furosemida','Tomar 1 comprimido de 40mg uma vez ao dia',40,27,'2024-09-17'),(18,'Levotiroxina','Tomar 1 comprimido de 100mcg em jejum todos os dias',6,13,'2024-09-18'),(19,'Fluconazol','Tomar 1 cápsula de 150mg em dose única',21,37,'2024-09-19'),(20,'Tramadol','Tomar 1 comprimido de 50mg a cada 8 horas se necessário',2,16,'2024-09-20'),(21,'Atenolol','Tomar 1 comprimido de 50mg uma vez ao dia',16,9,'2024-09-21'),(22,'Captopril','Tomar 1 comprimido de 25mg a cada 12 horas',28,35,'2024-09-22'),(23,'Dexametasona','Tomar 1 comprimido de 4mg uma vez ao dia por 5 dias',47,44,'2024-09-23'),(24,'Carbamazepina','Tomar 1 comprimido de 200mg a cada 12 horas',8,33,'2024-09-24'),(25,'Bromoprida','Tomar 30 gotas a cada 8 horas antes das refeições',14,22,'2024-09-25'),(26,'Cloridrato de Sertralina','Tomar 1 comprimido de 50mg uma vez ao dia pela manhã',33,11,'2024-09-26'),(27,'Diclofenaco','Tomar 1 comprimido de 50mg a cada 8 horas por 5 dias',19,25,'2024-09-27'),(28,'Clindamicina','Tomar 1 cápsula de 300mg a cada 6 horas por 7 dias',41,30,'2024-09-28'),(29,'Fenitoína','Tomar 1 comprimido de 100mg a cada 8 horas',27,20,'2024-09-29'),(30,'Omeprazol','Tomar 1 cápsula de 20mg em jejum todos os dias',13,4,'2024-09-30'),(31,'Cetoprofeno','Tomar 1 comprimido de 150mg uma vez ao dia por 5 dias',5,26,'2024-10-01'),(32,'Lorazepam','Tomar 1 comprimido de 1mg antes de dormir',34,15,'2024-10-02'),(33,'Amiodarona','Tomar 1 comprimido de 200mg uma vez ao dia',43,29,'2024-10-03'),(34,'Alprazolam','Tomar 1 comprimido de 0.5mg duas vezes ao dia',31,48,'2024-10-04'),(35,'Clonidina','Tomar 1 comprimido de 100mcg duas vezes ao dia',26,19,'2024-10-05'),(36,'Propranolol','Tomar 1 comprimido de 40mg duas vezes ao dia',20,46,'2024-10-06'),(37,'Aspirina','Tomar 1 comprimido de 100mg uma vez ao dia',48,21,'2024-10-07'),(38,'Escitalopram','Tomar 1 comprimido de 10mg uma vez ao dia',30,17,'2024-10-08'),(39,'Levomepromazina','Tomar 1 comprimido de 25mg antes de dormir',49,39,'2024-10-09'),(40,'Metoprolol','Tomar 1 comprimido de 50mg uma vez ao dia',15,7,'2024-10-10'),(41,'Naproxeno','Tomar 1 comprimido de 500mg a cada 12 horas por 7 dias',12,8,'2024-10-11'),(42,'Metronidazol','Tomar 1 comprimido de 500mg a cada 8 horas por 5 dias',22,14,'2024-10-12'),(43,'Moxicam','Tomar 1 comprimido de 15mg uma vez ao dia por 10 dias',29,35,'2024-10-13'),(44,'Desloratadina','Tomar 1 comprimido de 5mg uma vez ao dia',40,17,'2024-10-14'),(45,'Ranitidina','Tomar 1 comprimido de 150mg duas vezes ao dia por 14 dias',33,21,'2024-10-15'),(46,'Sulfato Ferroso','Tomar 1 comprimido de 325mg uma vez ao dia',19,12,'2024-10-16'),(47,'Claritromicina','Tomar 1 comprimido de 500mg a cada 12 horas por 7 dias',6,45,'2024-10-17'),(48,'Doxazosina','Tomar 1 comprimido de 4mg uma vez ao dia',38,30,'2024-10-18'),(49,'Fluticasona','Inalar 2 vezes ao dia, 1 dose de 50mcg por vez',15,28,'2024-10-19'),(50,'Nifedipina','Tomar 1 comprimido de 30mg uma vez ao dia',26,37,'2024-10-20');
/*!40000 ALTER TABLE `prescricao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoatendimento`
--

DROP TABLE IF EXISTS `tipoatendimento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipoatendimento` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `ID_MEDICO` int DEFAULT NULL,
  `formato` varchar(15) DEFAULT NULL,
  `valorConsulta` float DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID_MEDICO` (`ID_MEDICO`),
  CONSTRAINT `tipoatendimento_ibfk_1` FOREIGN KEY (`ID_MEDICO`) REFERENCES `medico` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoatendimento`
--

LOCK TABLES `tipoatendimento` WRITE;
/*!40000 ALTER TABLE `tipoatendimento` DISABLE KEYS */;
INSERT INTO `tipoatendimento` VALUES (1,12,'Presencial',120),(2,7,'Telemedicina',80),(3,18,'Presencial',100),(4,3,'Telemedicina',75),(5,25,'Presencial',90),(6,14,'Telemedicina',85),(7,9,'Presencial',110),(8,21,'Telemedicina',70),(9,36,'Presencial',95),(10,30,'Telemedicina',65),(11,5,'Presencial',85),(12,28,'Telemedicina',60),(13,11,'Presencial',100),(14,42,'Telemedicina',75),(15,16,'Presencial',95),(16,19,'Telemedicina',65),(17,34,'Presencial',90),(18,8,'Telemedicina',70),(19,50,'Presencial',105),(20,6,'Telemedicina',55),(21,4,'Presencial',80),(22,17,'Telemedicina',65),(23,22,'Presencial',90),(24,29,'Telemedicina',60),(25,33,'Presencial',85),(26,13,'Telemedicina',70),(27,41,'Presencial',95),(28,2,'Telemedicina',55),(29,47,'Presencial',100),(30,26,'Telemedicina',75),(31,23,'Presencial',85),(32,44,'Telemedicina',60),(33,31,'Presencial',95),(34,15,'Telemedicina',65),(35,49,'Presencial',90),(36,27,'Telemedicina',55),(37,32,'Presencial',100),(38,38,'Telemedicina',70),(39,1,'Presencial',105),(40,20,'Telemedicina',75),(41,23,'Presencial',85),(42,44,'Telemedicina',60),(43,31,'Presencial',95),(44,15,'Telemedicina',65),(45,49,'Presencial',90),(46,27,'Telemedicina',55),(47,32,'Presencial',100),(48,38,'Telemedicina',70),(49,1,'Presencial',105),(50,20,'Telemedicina',75);
/*!40000 ALTER TABLE `tipoatendimento` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-04  9:45:09
