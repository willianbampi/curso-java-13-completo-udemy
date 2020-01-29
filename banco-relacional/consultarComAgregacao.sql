SELECT regiao AS 'Região', sum(populacao) AS 'Total' FROM estados GROUP BY regiao ORDER BY Total DESC;

SELECT sum(populacao) AS 'Total' FROM estados;

SELECT avg(populacao) AS 'Média' FROM estados;