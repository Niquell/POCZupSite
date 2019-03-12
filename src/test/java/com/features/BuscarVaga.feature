# language: pt
  Funcionalidade: Buscar uma vaga no site da Zup

    Cenario: Buscar uma vaga a partir da pagina inicial do site da Zup
#       scrollar
      Dado que o usuario acessa a pagina principal da Zup na parte VemPraZup
      Quando o usuario clicar para ver vagas
      E o usuario clicar na vaga "DevOps Master"
      Entao A pagina carregada deve ter o titulo "DevOps Master"

    Cenario: Buscar uma vaga no campo de busca da pagina de outra vaga
      Dado que o usuario acessa a pagina de uma vaga com url "https://jobs.kenoby.com/zupit/job/devops-master/5c23d3c5335d54372d7bbcbc"
      Quando o usuario fornecer o termo de busca "Java"
      E clicar no link da vaga "Desenvolvedor Backend - Java"
      Entao A pagina carregada deve ter o titulo "Desenvolvedor Backend - Java"

# usar:
# DevOps Master
# Desenvolvedor Backend - Java
