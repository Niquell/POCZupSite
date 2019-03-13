# language: pt
  @vagas
  Funcionalidade: Buscar uma vaga no site da Zup

    Cenario: Buscar uma vaga a partir da pagina inicial do site da Zup
      # scrollar
      Dado que o usuario acessa a pagina principal da Zup na parte VemPraZup
      Quando o usuario clicar para ver vagas
      E o usuario clicar na vaga "Customer Succes Manager"
      Entao A pagina carregada deve ter o titulo "Customer Succes Manager"

    Cenario: Buscar uma vaga no campo de busca da pagina de outra vaga
      Dado que o usuario acessa a pagina de uma vaga com url "https://jobs.kenoby.com/zupit/job/customer-succes-manager/5c61b7f005098d3e684152a3"
      Quando o usuario fornecer o termo de busca "Android"
      E clicar no link da vaga "Desenvolvedor Android Sênior"
      Entao A pagina carregada deve ter o titulo "Desenvolvedor Android Sênior"

# usar:
# DevOps Master
# Desenvolvedor Backend - Java
