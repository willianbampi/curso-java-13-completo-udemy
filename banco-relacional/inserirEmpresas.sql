ALTER TABLE empresas MODIFY cnpj VARCHAR (14);

INSERT INTO empresas
    (nome, cnpj)
VALUES
    ('Bradesco', 84810644000135),
    ('Vale', 97742115000193),
    ('Cielo', 02476875000171);

DESC empresas;

SELECT * FROM empresas;

SELECT * FROM cidades;

INSERT INTO empresas_unidades
    (empresa_id, cidade_id, sede)
VALUES
    (1, 1, 1),
    (1, 2, 0),
    (2, 1, 0),
    (2, 2, 1);