insert into tb_banco(numerodocumento, nome) values (00000000000191, 'Banco do Brasil');
insert into tb_banco(numerodocumento, nome) values (00360305000104, 'Caixa Econômica Federal');

insert into tb_dominio(dom_cod_dominio, dom_descricao) values (1, 'Tipo Movimento');
insert into tb_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (1, 1, 1, 'Compra', '');
insert into tb_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (2, 1, 2, 'Venda', '');

insert into tb_dominio(dom_cod_dominio, dom_descricao) values (2, 'Mercado');
insert into tb_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (3, 2, 1, 'Mercado à Vista', '');
insert into tb_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (4, 2, 2, 'Mercado Fracionário', '');

insert into tb_dominio(dom_cod_dominio, dom_descricao) values (3, 'Tipo Operacao');
insert into tb_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (5, 3, 1, 'DayTrade', '');
insert into tb_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (6, 3, 2, 'SwingTrade', '');

insert into tb_dominio(dom_cod_dominio, dom_descricao) values (4, 'Entrada/Saída');
insert into tb_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (7, 4, 1, 'Credito', '');
insert into tb_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (8, 4, 2, 'Debito', '');

insert into tb_dominio(dom_cod_dominio, dom_descricao) values (5, 'Movimentação');
insert into tb_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (9, 5, 1, 'Rendimento', '');



insert into tb_operacao_taxa(opt_cod_operacao_taxa, opt_descricao, opt_taxa_liquidacao, 
opt_emolumento, opt_tipo_operacao, opt_data_inicial, opt_data_final) values (1, 'OPERACAO SWING TRADE', 0.0275, 0.003248, 6, '2021-01-01', null);