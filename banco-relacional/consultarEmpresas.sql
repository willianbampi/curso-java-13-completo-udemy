SELECT e.nome AS 'Nome da Empresa', c.nome AS 'Nome da Cidade'
FROM empresas e, empresas_unidades eu, cidades c
WHERE e.id = eu.empresa_id
AND c.id = eu.cidade_id
AND eu.sede