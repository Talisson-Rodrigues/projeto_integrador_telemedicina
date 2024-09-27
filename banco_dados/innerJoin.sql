SELECT m.nomeMed, cl.nomeClinica, cl.enderecoClinica FROM Medico m  INNER JOIN Atende ate ON m.ID = ate.ID_MEDICO INNER JOIN Clinica cl on cl.ID = ate.ID_CLINICA   WHERE cl.enderecoClinica LIKE "%DF";

SELECT m.nomeMed, cs.dataConsulta, cs.formatoConsulta FROM Medico m INNER JOIN Consulta cs ON m.ID = cs.ID_MEDICO;

SELECT m.nomeMed, cs.dataConsulta, cs.formatoConsulta, cs.pagamentoConsulta FROM Medico m INNER JOIN Consulta cs ON m.ID = cs.ID_MEDICO;

SELECT cl.nomeClinica, ex.descricaoExame, ex.dataExame, ex.statusExame, ex.diagnosticoExame, ex.valorExame FROM Clinica cl INNER JOIN Exame ex ON cl.ID = ex.ID_CLINICA WHERE cl.ID <= 10;

SELECT me.nomeMed, pa.nome, pr.dataPrescricao, pr.medicamento, pr.observacao FROM Medico me INNER JOIN prescricao pr ON me.ID = pr.ID_MEDICO INNER JOIN Paciente pa ON pa.ID = pr.ID_PACIENTE;

SELECT m.nomeMed, m.especializacao, ta.formato, cl.nomeClinica, cl.enderecoClinica, ta.valorConsulta FROM Medico m INNER JOIN Atende ate ON m.ID =ate.ID_MEDICO INNER JOIN Clinica cl ON cl.ID = ate.ID_CLINICA 
INNER JOIN TipoAtendimento ta ON ta.ID_MEDICO = m.ID WHERE cl.enderecoClinica LIKE '?' AND m.especializacao LIKE '?' AND ta.formato LIKE '?';

INSERT INTO Medico (nomeMed, cpfMed, nascimentoMed, generoMed, telefoneMed, enderecoMed, emailMed, rgMed, registroMed, especializacao, instituicaoEnsino, conclusaoGrad, certificacao, areaInteresse, credenciais, experiencias, senhaMed) VALUES 
(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); 

INSERT INTO Consulta (dataConsulta, formatoConsulta, ID_PACIENTE, ID_MEDICO, ID_CLINICA, pagamentoConsulta, areaProcura) VALUES (?, ?, ?, ?, ?, ?, ?);

SELECT cl.nomeClinica, cl.enderecoClinica, ex.valorExame FROM Clinica cl INNER JOIN Exame ex ON cl.ID = ex.ID_CLINICA WHERE cl.enderecoClinica LIKE '%DF';

UPDATE Exame SET descricaoExame = 'Raio-X' WHERE descricaoExame = 'Exame de sangue';

SELECT pg.tipoPagamento, pg.notaFiscal, pg.codigoPagamento, ta.valorConsulta FROM TipoAtendimento ta INNER JOIN Pagamento pg ON ta.ID = pg.ID_TipoAtendimento;

SELECT cs.ID, m.nomeMed, cs.dataConsulta, cs.formatoConsulta, cs.pagamentoConsulta FROM Consulta cs INNER JOIN Medico m ON m.ID = cs.ID_MEDICO;