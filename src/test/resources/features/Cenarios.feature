#language: pt
#enconding: UTF-8

@login
Funcionalidade: login

Cenario: Realizar Login
Quando clicar no botao Login
E informar o email "teste1@123.com"
E clicar no botao Criar Login
#Então o sistema deve ser redirecionado para o Formulario
E selecionar a opcao Title
E informar o First Name "Joao"
E informar o Last Name "Neto"
E informar o Password "Teste123"
#E clicar no combo Dia
E selecionar o Dia 7
#E clicar no combo Mes
E selecionar o Mes "5"
#E clicar no combo Ano
E selecionar o ano 1999
E informar a Company "ISH"
E informar o Address "Rua Teste"
E informar o Address2 "Apt 1"
E informar City "Salvador"
#E clicar no combo State
E selecionar o State "9"
E informar o Postal Code "41150"
E informar Mobile Phone "99999-9999"
E clicar no botao Registrar


 



 

