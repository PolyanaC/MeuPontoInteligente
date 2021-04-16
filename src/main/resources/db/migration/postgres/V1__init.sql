CREATE TABLE empresa (
  id  SERIAL PRIMARY KEY,
  cnpj varchar(255) NOT NULL,
  data_atualizacao date NOT NULL,
  data_criacao date NOT NULL,
  razao_social varchar(255) NOT NULL
);

CREATE TABLE funcionario (
  id SERIAL PRIMARY KEY,
  cpf varchar(255) NOT NULL,
  data_atualizacao date NOT NULL,
  data_criacao date NOT NULL,
  email varchar(255) NOT NULL,
  nome varchar(255) NOT NULL,
  perfil varchar(255) NOT NULL,
  qtd_horas_almoco float DEFAULT NULL,
  qtd_horas_trabalho_dia float DEFAULT NULL,
  senha varchar(255) NOT NULL,
  valor_hora decimal(19,2) DEFAULT NULL,
  empresa_id bigint DEFAULT NULL REFERENCES empresa
);

CREATE TABLE lancamento (
  id SERIAL PRIMARY KEY,
  data date NOT NULL,
  data_atualizacao date NOT NULL,
  data_criacao date NOT NULL,
  descricao varchar(255) DEFAULT NULL,
  localizacao varchar(255) DEFAULT NULL,
  tipo varchar(255) NOT NULL,
  funcionario_id bigint DEFAULT NULL REFERENCES funcionario
);