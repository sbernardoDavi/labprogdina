CREATE Table produto(
    id int not null,
    nome varchar(30) not null,
    descricao varchar(200),
    valorUnitario decimal,
    dataCadastro date,

)

CREATE Table categoria(
    id int not null,
    nome varchar(30),
    descricao varchar(200),

)

CREATE Table produtoCategoria(
    id int not null,
    produtoId int not null,
    categoriaId int not null,

    FOREIGN KEY (produtoId) references produto(id),
    FOREIGN KEY (categoriaId) references categoria(id),

)

CREATE Table Promocao(
    id int not null,
    valorPromocao decimal,
    dataCadastro date,
    dataInicio date,
    dataFinal date,

)

CREATE Table itemPromocao(
    id int not null,
    valorPromocao decimal,
    dataCadastro date,
    produtoId int not null,
    categoriaId int not null,

    FOREIGN KEY (produtoId) references produto(id),
    FOREIGN KEY (categoriaId) references categoria(id),

)