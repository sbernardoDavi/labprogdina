INSERT INTO produto(id, nome, descricao, valorUnitario, dataCadastro)
VALUES (1, 'Bolo de Cenoura', 'Um delicioso bolo de cenoura', 5, '2021-09-21');

INSERT INTO produto(id, nome, descricao, valorUnitario, dataCadastro)
VALUES (2, 'Bolo de Chocolate', 'Um delicioso bolo de chocolate', 3, '2021-09-21');

INSERT INTO categoria(id, nome, descricao)
VALUES (1, 'Bolos de pote', 'Todos os tipos de bolos vendidos no pote');

INSERT INTO categoria(id, nome, descricao)
VALUES (2, 'Bolos de casamento', 'Todos os tipos de bolos para casamento');

INSERT INTO  produtoCategoria(id, produtoId, categoriaId)
VALUES (1, 1, 1);

INSERT INTO  produtoCategoria(id, produtoId, categoriaId)
VALUES (2, 2, 2);

INSERT INTO promocao(id, valorPromocao, dataCadastro, dataInicio, dataFinal)
VALUES (1, 6, '2021-09-21', '2021-09-22', '2021-09-26');

INSERT INTO itemPromocao(id, valorPromocao, dataCadastro, produtoId, categoriaId)
VALUES (1, 8, '2021-09-21', 1, 1)

