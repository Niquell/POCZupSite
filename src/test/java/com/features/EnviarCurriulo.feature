# language: pt

Funcionalidade: Enviar um curriculo para uma vaga específica no site da Zup.
#
#    Cenario: Enviar um curriculo para uma vaga a partir da pagina inicial do site da zup.
#      Dado que o usuario acessa a pagina inicial do site da Zup
#      Quando o usuario clicar em 'PT'
#      E descer a pagina até o botão 'Veja Nossas Vagas'
#      E clicar no botão 'Veja Nossas Vagas'
#      E clicar na vaga "DESENVOLVEDOR BACKEND PYTHON PLENO"
#      E clicar em ENVIE SEU CURRÍCULO
#      E inserir o email "nick@gmail.com" no campo de email
#      E clicar em CONTINUAR
#      Entao a pagina carregada deve conter um título "Crie uma conta"
#      E apresentar o email "nick@gmail.com" fornecido
#      E apresentar um campo com o título 'Confirme seu endereço de email'
#
#    Cenario: Enviar um curriculo para uma vaga a partir do site da vaga
#      Dado que o usuario acessa a pagina da vaga 'DESENVOLVEDOR BACKEND PYTHON PLENO'
#      Quando clicar em ENVIE SEU CURRÍCULO
#      E inserir o email "nick@gmail.com" no campo de email
#      Entao a pagina carregada deve conter o título "Crie uma conta" com o email "nick@gmail.com" fornecido
#      # evitar usar mais de 1 Entao