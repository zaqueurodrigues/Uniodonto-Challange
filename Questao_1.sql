SELECT p.pess_id AS ID, p.nome AS NOME
FROM Pessoa p
LEFT JOIN Fisica f ON (p.pess_id = f.fisc_pessoa)
WHERE f.fisc_pessoa IS NULL;
