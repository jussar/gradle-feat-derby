# gradle-feat-derby

esta atividade tem o intuito de ser feita para demonstração de conhecimentos sobre as ferramentas gradle feat apache derby onde a primeira vai gerenciar as builder do projeto e a outra sera responsável por persistir os dados. a app consiste em sistema que modela uma entidade funcionario e utiliza-se do padrao DAO para acessar e persistir os dados, so isso.


# SCRIPT PARA CRIAÇÃO DA TABELA

create table app.funcionario(
nome varchar(30),
salario float,
entrada date,
cpf varchar(10),
idade int,
primary key (cpf)
)
