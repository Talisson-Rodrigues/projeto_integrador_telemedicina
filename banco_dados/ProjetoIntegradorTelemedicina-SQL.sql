CREATE DATABASE projetoIntegradorTelemedicina;

use projetoIntegradorTelemedicina;

CREATE TABLE Paciente 
( 
 ID INT PRIMARY KEY AUTO_INCREMENT,  
 nome VARCHAR(100),  
 cpf VARCHAR(15),  
 dataNascimento DATE,  
 genero CHAR(1),  
 telefone VARCHAR(15),  
 endereco VARCHAR(200),  
 email VARCHAR(100),  
 rg VARCHAR(16),
 senha VARCHAR(12)
); 

CREATE TABLE Medico 
( 
 ID INT PRIMARY KEY AUTO_INCREMENT,  
 nomeMed VARCHAR(100),  
 cpfMed VARCHAR(15),  
 nascimentoMed DATE,  
 generoMed CHAR(1),  
 telefoneMed VARCHAR(15),  
 enderecoMed VARCHAR(200),  
 emailMed VARCHAR(100),  
 rgMed VARCHAR(16),  
 registroMed VARCHAR(12),  
 especializacao VARCHAR(100),  
 instituicaoEnsino VARCHAR(100),  
 conclusaoGrad DATE,  
 certificacao VARCHAR(100),  
 areaInteresse VARCHAR(100),
 credenciais VARCHAR(100),  
 experiencias VARCHAR(1500),
 senhaMed VARCHAR(12)
); 

CREATE TABLE Consulta 
( 
 ID INT PRIMARY KEY AUTO_INCREMENT,  
 dataConsulta DATE,  
 formatoConsulta VARCHAR(10),  
 ID_PACIENTE INT,  
 ID_MEDICO INT,  
 ID_CLINICA INT,    
 pagamentoConsulta FLOAT,  
 areaProcura VARCHAR(200)  
); 

CREATE TABLE Clinica 
( 
 ID INT PRIMARY KEY AUTO_INCREMENT,  
 nomeClinica VARCHAR(100),  
 enderecoClinica VARCHAR(200),  
 cnpjClinica VARCHAR(18),  
 telefoneClinica VARCHAR(15),  
 emailClinica VARCHAR(100)  
); 

CREATE TABLE Exame 
( 
 ID INT PRIMARY KEY AUTO_INCREMENT,  
 diagnosticoExame VARCHAR(300),  
 statusExame VARCHAR(12),  
 ID_PACIENTE INT,  
 ID_MEDICO INT,  
 ID_CLINICA INT,  
 dataExame DATE, 
 descricaoExame VARCHAR(300),
 valorExame FLOAT
); 

CREATE TABLE Prescricao 
( 
 medicamento VARCHAR(300),
 observacao VARCHAR(500),
 ID INT PRIMARY KEY AUTO_INCREMENT,  
 ID_PACIENTE INT,  
 ID_MEDICO INT  
); 

CREATE TABLE Atende 
( 
 ID_MEDICO INT,  
 ID_CLINICA INT  
); 


ALTER TABLE Consulta ADD FOREIGN KEY(ID_PACIENTE) REFERENCES Paciente (ID);
ALTER TABLE Consulta ADD FOREIGN KEY(ID_MEDICO) REFERENCES Medico (ID);
ALTER TABLE Consulta ADD FOREIGN KEY(ID_CLINICA) REFERENCES Clinica (ID);
ALTER TABLE Exame ADD FOREIGN KEY(ID_PACIENTE) REFERENCES Paciente (ID);
ALTER TABLE Exame ADD FOREIGN KEY(ID_MEDICO) REFERENCES Medico (ID);
ALTER TABLE Exame ADD FOREIGN KEY(ID_CLINICA) REFERENCES Clinica (ID);
ALTER TABLE Prescricao ADD FOREIGN KEY(ID_PACIENTE) REFERENCES Paciente (ID);
ALTER TABLE Prescricao ADD FOREIGN KEY(ID_MEDICO) REFERENCES Medico (ID);
ALTER TABLE Atende ADD FOREIGN KEY(ID_MEDICO) REFERENCES Medico (ID);
ALTER TABLE Atende ADD FOREIGN KEY(ID_CLINICA) REFERENCES Clinica (ID);