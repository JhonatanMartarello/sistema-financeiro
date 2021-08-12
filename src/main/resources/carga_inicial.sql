insert into tb_banco(numerodocumento, nome) values (00000000000191, 'Banco do Brasil');
insert into tb_banco(numerodocumento, nome) values (00360305000104, 'Caixa Econômica Federal');

insert into tb_dominio(dom_cod_dominio, dom_descricao) values (1, 'Tipo Movimento');
insert into tb_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (1, 1, 1, 'Compra', '');
insert into tb_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (2, 1, 2, 'Venda', '');

insert into tb_dominio(dom_cod_dominio, dom_descricao) values (2, 'Mercado');
insert into tb_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (3, 2, 1, 'Mercado à Vista', '');
insert into tb_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (4, 2, 2, 'Mercado Fracionário', '');
