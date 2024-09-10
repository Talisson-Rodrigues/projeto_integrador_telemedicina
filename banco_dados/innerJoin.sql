SELECT m.nomeMed, cl.nomeClinica, cl.enderecoClinica FROM Medico m  inner join Atende ate ON m.ID = ate.ID_MEDICO inner join Clinica cl on cl.ID = ate.ID_CLINICA   WHERE cl.enderecoClinica 
like "%DF";


SELECT m.nomeMed, cs.dataConsulta, cs.formatoConsulta FROM Medico m INNER JOIN Consulta cs ON m.ID = cs.ID_MEDICO;

SELECT m.nomeMed, cs.dataConsulta, cs.formatoConsulta, cs.pagamentoConsulta FROM Medico m INNER JOIN Consulta cs ON m.ID = cs.ID_MEDICO;

SELECT cl.nomeClinica, ex.descricaoExame, ex.dataExame, ex.statusExame, ex.diagnosticoExame, ex.valorExame FROM Clinica cl INNER JOIN Exame ex ON cl.ID = ex.ID_CLINICA WHERE cl.ID <= 10;

