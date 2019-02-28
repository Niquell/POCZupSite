# language: pt
  Funcionalidade: Buscar uma vaga no site da Zup

    Cenario: Buscar uma vaga a partir da pagina inicial do site da Zup
      # scrollar
      Dado que o usuario acessa a pagina principal da Zup na parte VemPraZup
      Quando o usuario clicar para ver vagas
      E o usuario clicar na vaga "DESENVOLVEDOR BACKEND PYTHON PLENO"
      Entao A pagina carregada deve ter o titulo "Desenvolvedor Backend Python Pleno"

#    Cenario: Buscar uma vaga no campo de busca da pagina de outra vaga
#      Dado que o usuario acessa a pagina da vaga "Desenvolvedor Backend Python Pleno"
#      Quando o usuario fornecer o termo de busca "Java" e teclar Enter
#      E clicar no link da vaga "ARQUITETO JAVA"
#      Entao A pagina carregada deve ter o titulo "Arquiteto Java"
#
