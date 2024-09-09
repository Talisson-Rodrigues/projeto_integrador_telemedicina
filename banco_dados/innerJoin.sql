SELECT m.nomeMed, cl.nomeClinica, cl.enderecoClinica FROM Medico m  inner join Atende ate ON m.ID = ate.ID_MEDICO inner join Clinica cl on cl.ID = ate.ID_CLINICA   WHERE cl.enderecoClinica 
like "%DF";


SELECT m.nomeMed, cs.dataConsulta, cs.formatoConsulta FROM Medico m INNER JOIN Consulta cs ON m.ID = cs.ID_MEDICO;