create table `medicos` (
CRM int not null auto_increment,
`nome` varchar(30) NOT NULL,
CPF char(11) not null,
RG char(11) not null,
telefone char(14),
`endereco` varchar(50),
sexo enum('M', 'F'),
`senha` varchar(30),
primary key (crm)
)default charset = utf8;