use projetoIntegradorTelemedicina;

INSERT INTO Paciente (nome, cpf, dataNascimento, genero, telefone, endereco, email, rg) VALUES
('João Silva', '123.456.789-00', '1990-01-15', 'M', '(11) 91234-5678', 'Rua das Flores, 123', 'joao.silva@example.com', 'MG-12.345.678'),
('Maria Oliveira', '234.567.890-11', '1985-02-20', 'F', '(21) 98765-4321', 'Avenida Paulista, 456', 'maria.oliveira@example.com', 'SP-23.456.789'),
('Carlos Santos', '345.678.901-22', '1992-03-10', 'M', '(31) 99876-5432', 'Rua do Comércio, 789', 'carlos.santos@example.com', 'RJ-34.567.890'),
('Ana Pereira', '456.789.012-33', '1988-04-25', 'F', '(41) 92345-6789', 'Travessa da Alegria, 101', 'ana.pereira@example.com', 'PR-45.678.901'),
('Fernando Costa', '567.890.123-44', '1995-05-30', 'M', '(51) 93456-7890', 'Rua das Palmeiras, 202', 'fernando.costa@example.com', 'RS-56.789.012'),
('Juliana Lima', '678.901.234-55', '1993-06-15', 'F', '(61) 94567-8901', 'Avenida Central, 303', 'juliana.lima@example.com', 'DF-67.890.123'),
('Ricardo Almeida', '789.012.345-66', '1987-07-20', 'M', '(71) 95678-9012', 'Rua do Sol, 404', 'ricardo.almeida@example.com', 'BA-78.901.234'),
('Tatiane Rocha', '890.123.456-77', '1994-08-05', 'F', '(81) 96789-0123', 'Rua da Paz, 505', 'tatiane.rocha@example.com', 'PE-89.012.345'),
('Roberto Martins', '901.234.567-88', '1982-09-10', 'M', '(91) 97890-1234', 'Avenida Brasil, 606', 'roberto.martins@example.com', 'AM-90.123.456'),
('Claudia Ferreira', '012.345.678-99', '1996-10-25', 'F', '(61) 98901-2345', 'Rua das Acácias, 707', 'claudia.ferreira@example.com', 'DF-01.234.567'),
('Eduardo Souza', '123.456.789-01', '1984-11-12', 'M', '(11) 91234-6789', 'Rua das Margaridas, 808', 'eduardo.souza@example.com', 'SP-12.345.678'),
('Beatriz Silva', '234.567.890-12', '1991-12-23', 'F', '(21) 92345-6789', 'Avenida Rio Branco, 909', 'beatriz.silva@example.com', 'RJ-23.456.789'),
('Paulo Santos', '345.678.901-23', '1986-01-30', 'M', '(31) 93456-7890', 'Rua das Palmeiras, 1010', 'paulo.santos@example.com', 'MG-34.567.890'),
('Laura Lima', '456.789.012-34', '1994-02-14', 'F', '(41) 94567-8901', 'Travessa das Andorinhas, 1212', 'laura.lima@example.com', 'PR-45.678.901'),
('Jorge Almeida', '567.890.123-45', '1989-03-19', 'M', '(51) 95678-9012', 'Rua do Limoeiro, 1313', 'jorge.almeida@example.com', 'RS-56.789.012'),
('Mariana Costa', '678.901.234-56', '1992-04-29', 'F', '(61) 96789-0123', 'Avenida das Nações, 1414', 'mariana.costa@example.com', 'DF-67.890.123'),
('Fábio Rocha', '789.012.345-67', '1987-05-10', 'M', '(71) 97890-1234', 'Rua dos Eucaliptos, 1515', 'fabio.rocha@example.com', 'BA-78.901.234'),
('Sabrina Pereira', '890.123.456-78', '1995-06-22', 'F', '(81) 98901-2345', 'Rua dos Jasmins, 1616', 'sabrina.pereira@example.com', 'PE-89.012.345'),
('Gabriel Martins', '901.234.567-89', '1983-07-16', 'M', '(91) 99012-3456', 'Avenida das Rosas, 1717', 'gabriel.martins@example.com', 'AM-90.123.456'),
('Patrícia Ferreira', '012.345.678-90', '1997-08-05', 'F', '(61) 99123-4567', 'Rua dos Lírios, 1818', 'patricia.ferreira@example.com', 'DF-01.234.567'),
('Rafael Santos', '123.456.789-12', '1980-09-23', 'M', '(11) 91234-5670', 'Rua das Orquídeas, 1919', 'rafael.santos@example.com', 'SP-12.345.679'),
('Fernanda Costa', '234.567.890-23', '1986-10-17', 'F', '(21) 92345-6780', 'Avenida dos Bandeirantes, 2020', 'fernanda.costa@example.com', 'RJ-23.456.790'),
('Vitor Almeida', '345.678.901-34', '1990-11-05', 'M', '(31) 93456-7801', 'Rua das Azaleias, 2121', 'vitor.almeida@example.com', 'MG-34.567.891'),
('Marcelia Lima', '456.789.012-45', '1992-12-25', 'F', '(41) 94567-8912', 'Travessa das Acácias, 2222', 'marcelia.lima@example.com', 'PR-45.678.902'),
('Leonardo Pereira', '567.890.123-56', '1988-01-18', 'M', '(51) 95678-9023', 'Rua das Hortênsias, 2323', 'leonardo.pereira@example.com', 'RS-56.789.023'),
('Isabela Rocha', '678.901.234-67', '1994-02-08', 'F', '(61) 96789-0134', 'Avenida dos Cedros, 2424', 'isabela.rocha@example.com', 'DF-67.890.234'),
('Gustavo Ferreira', '789.012.345-78', '1985-03-20', 'M', '(71) 97890-1245', 'Rua dos Jacarandás, 2525', 'gustavo.ferreira@example.com', 'BA-78.901.345'),
('Paola Silva', '890.123.456-89', '1991-04-15', 'F', '(81) 98901-2356', 'Rua das Magnólias, 2626', 'paola.silva@example.com', 'PE-89.012.456'),
('André Martins', '901.234.567-90', '1983-05-12', 'M', '(91) 99012-3467', 'Avenida dos Manacás, 2727', 'andre.martins@example.com', 'AM-90.123.567'),
('Carla Souza', '012.345.678-01', '1997-06-28', 'F', '(61) 99123-4578', 'Rua das Begônias, 2828', 'carla.souza@example.com', 'DF-01.234.678'),
('Thiago Rodrigues', '123.456.789-23', '1990-07-09', 'M', '(11) 91234-5671', 'Rua das Cebolas, 2929', 'thiago.rodrigues@example.com', 'SP-12.345.680'),
('Aline Alves', '234.567.890-34', '1987-08-17', 'F', '(21) 92345-6781', 'Avenida dos Jardins, 3030', 'aline.alves@example.com', 'RJ-23.456.791'),
('Lucas Ferreira', '345.678.901-45', '1992-09-26', 'M', '(31) 93456-7802', 'Rua das Flores, 3131', 'lucas.ferreira@example.com', 'MG-34.567.892'),
('Letícia Carvalho', '456.789.012-56', '1995-10-15', 'F', '(41) 94567-8913', 'Travessa dos Eucaliptos, 3232', 'leticia.carvalho@example.com', 'PR-45.678.903'),
('João Pedro Lima', '567.890.123-67', '1989-11-30', 'M', '(51) 95678-9024', 'Rua dos Cedros, 3333', 'joao.pedro.lima@example.com', 'RS-56.789.034'),
('Vanessa Martins', '678.901.234-78', '1994-12-14', 'F', '(61) 96789-0145', 'Avenida das Jacarandás, 3434', 'vanessa.martins@example.com', 'DF-67.890.345'),
('Marcelo Silva', '789.012.345-89', '1986-01-05', 'M', '(71) 97890-1356', 'Rua dos Lírios, 3535', 'marcelo.silva@example.com', 'BA-78.901.456'),
('Tais Rocha', '890.123.456-90', '1992-02-18', 'F', '(81) 98901-2467', 'Rua dos Jasmins, 3636', 'tais.rocha@example.com', 'PE-89.012.567'),
('Rodrigo Costa', '901.234.567-01', '1984-03-12', 'M', '(91) 99012-3578', 'Avenida dos Manacás, 3737', 'rodrigo.costa@example.com', 'AM-90.123.678'),
('Juliana Almeida', '012.345.678-12', '1997-04-22', 'F', '(61) 99123-4689', 'Rua das Orquídeas, 3838', 'juliana.almeida@example.com', 'DF-01.234.689'),
('Rogério Andrade', '123.456.789-34', '1991-05-25', 'M', '(11) 91234-5672', 'Rua das Violetas, 3939', 'rogerio.andrade@example.com', 'SP-12.345.681'),
('Larissa Ferreira', '234.567.890-45', '1987-06-30', 'F', '(21) 92345-6782', 'Avenida das Margaridas, 4040', 'larissa.ferreira@example.com', 'RJ-23.456.792'),
('Daniel Costa', '345.678.901-56', '1994-07-21', 'M', '(31) 93456-7803', 'Rua dos Lírios, 4141', 'daniel.costa@example.com', 'MG-34.567.893'),
('Monique Silva', '456.789.012-67', '1989-08-12', 'F', '(41) 94567-8914', 'Travessa das Begônias, 4242', 'monique.silva@example.com', 'PR-45.678.904'),
('Felipe Martins', '567.890.123-78', '1992-09-30', 'M', '(51) 95678-9025', 'Rua das Azaleias, 4343', 'felipe.martins@example.com', 'RS-56.789.045'),
('Cristina Rocha', '678.901.234-89', '1988-10-18', 'F', '(61) 96789-0256', 'Avenida das Rosas, 4444', 'cristina.rocha@example.com', 'DF-67.890.456'),
('Bruno Almeida', '789.012.345-90', '1990-11-22', 'M', '(71) 97890-1467', 'Rua dos Jasmins, 4545', 'bruno.almeida@example.com', 'BA-78.901.567'),
('Sueli Costa', '890.123.456-01', '1993-12-10', 'F', '(81) 98901-2578', 'Rua das Margaridas, 4646', 'sueli.costa@example.com', 'PE-89.012.678'),
('Guilherme Souza', '901.234.567-12', '1985-01-05', 'M', '(91) 99012-3689', 'Avenida dos Manacás, 4747', 'guilherme.souza@example.com', 'AM-90.123.789'),
('Viviane Lima', '012.345.678-23', '1996-02-27', 'F', '(61) 99123-5790', 'Rua das Orquídeas, 4848', 'viviane.lima@example.com', 'DF-01.234.790'),
('Beatriz Almeida', '963.741.852-50', '1989-07-20', 'F', '(31) 34567-8901', 'Rua dos Jasmins, 123, Belo Horizonte, MG', 'beatriz.almeida@email.com', 'MG-21.987.654'),
('Rafael Gomes', '852.741.963-49', '1976-11-23', 'M', '(51) 23456-7890', 'Rua das Flores, 951, Porto Alegre, RS', 'rafael.gomes@email.com', 'RS-32.654.987');

select * from Paciente;