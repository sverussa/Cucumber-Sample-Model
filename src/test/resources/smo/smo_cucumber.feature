#language: pt
Funcionalidade: Meu Cucumber PT BR
  Como um desenvolvedor
  Eu quero validar o funcionamento do cucumber
  Para melhor meus testes

Cenario: Simples Cenario Ler Arquivo
  Dado que criei o arquivo corretamente
  Quando executar o arquivo
  Entao a executação deve finalizar com sucesso

Cenario: Checar Numero Primo é o Primeiro
  Dado uma lista de numeros primos
  Quando verificar o numero primo 2
  Entao o resultado será verdadeiro para a primeira posicao