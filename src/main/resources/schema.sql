CREATE TABLE produto (
                         id                        INT  NOT NULL    PRIMARY KEY ,
                         nome                      VARCHAR(20)  NOT NULL,
                         descricao                 VARCHAR(100),
                         fotoUrl                   VARCHAR(2000),
                         dataCadastro              DATE     NOT NULL,
                         dataUltimaAtualizacao     TIMESTAMP    NOT NULL,
                         valorUnitario             DECIMAL  NOT NULL,
);

CREATE TABLE categoria(
                          id                  INT            NOT NULL PRIMARY KEY ,
                          nome                VARCHAR (20)   NOT NULL,
                          descricao           VARCHAR (100),
                          ImagemSimboloUrl    VARCHAR (2000),

);


CREATE TABLE produtoCategoria (
                                  id           INT  NOT NULL    PRIMARY KEY ,
                                  categoriaId  INT  NOT NULL,
                                  produtoId    INT  NOT NULL,


                                  FOREIGN KEY (produtoId)   REFERENCES produto(id),
                                  FOREIGN KEY (categoriaId) REFERENCES categoria(id),

);

CREATE TABLE promocaoItem (
                              id                    INT     NOT NULL    PRIMARY KEY ,
                              valorPromocao         DECIMAL     NOT NULL,
                              dataCadastro          DATE    NOT NULL,
                              dataUltimaAtualizacao TIMESTAMP   NOT NULL,
                              produtoId             INT NOT     NULL,
                              promocaoId            INT NOT     NULL,

                              FOREIGN KEY (produtoId) REFERENCES produto(id),
                              FOREIGN KEY (promocaoId) REFERENCES tabelaPromocao(id),

);

CREATE TABLE tabelaPromocao(
                               id                    INT    NOT NULL    PRIMARY KEY ,
                               nome                  VARCHAR(20)    NOT NULL,
                               descricao             VARCHAR(100) ,
                               dataCadastro          DATE   NOT NULL,
                               dataInicial           DATE   NOT NULL,
                               dataFinal             DATE   NOT NULL,
                               dataUltimaAtualizacao TIMESTAMP  NOT NULL,
);


