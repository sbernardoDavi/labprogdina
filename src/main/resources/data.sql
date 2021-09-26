INSERT into produto(id, nome, descricao, dataCadastro, valorUnitario)
VALUES('1', 'Chuteira Tiempo', 'Chuteira de campo da linha Tiempo', '2021-09-26 13:00:00.1021', '2');

INSERT into produto(id, nome, descricao, dataCadastro, valorUnitario)
VALUES('2', 'Chuteira Adidas', 'Chuteira de campo da Adidas', '2021-09-26 13:00:00.1021', '2');

INSERT into produto(id, nome, descricao, dataCadastro, valorUnitario)
VALUES('3', 'Chuteira Puma', 'Chuteira de futsal da Puma', '2021-09-26 13:00:00.1021', '2');


INSERT into categoria(id, nome, descricao)
VALUES ('2', 'Campo', 'Chuteiras para campo');

INSERT into categoria(id, nome, descricao)
VALUES ('3', 'Futsal', 'Chuteiras para futsal');

INSERT into produtoCategoria(id, categoriaId, produtoId)
VALUES (1, 2, 1);

INSERT into produtoCategoria(id, categoriaId, produtoId)
VALUES (2, 3, 2);

INSERT into promocaoItem(id, valorPromocao, produtoId, promocaoId)
VALUES (1, '3', 1, 1);

INSERT into tabelaPromocao(id, nome, descricao, dataInicial, dataFinal)
VALUES(1, 'Promoçao Adidas', 'Chuteiras para campo' '2021-09-26 13:00:00.1021', '021-09-26 23:00:00.1021')

