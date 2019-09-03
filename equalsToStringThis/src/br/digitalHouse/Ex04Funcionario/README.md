# Exercício 4

1. Criar uma classe Funcionário que tenha como atributos nome (String) e
numeroDeRegistro (Integer).
2. Criar um construtor para a classe Funcionário que receba como parâmetro
o nome e o número de registro.
3. Criar na classe Main uma lista de funcionários e adicionar quatro
funcionários novos.
4. Criar um funcionário novo com um número de registro contido na lista e
perguntar se ele está na lista (utilizar o método contains)\
Usando o contains antes do override do equals, dá false. Ele procura o objeto "Funcionario@475" dentro do outro, mas como o .equals só vai dar true se tudo for igual, ele retorna false.
5. Sobrescrever o equals da classe Funcionário para que compare apenas o
número de registro.
6. Perguntar novamente se o funcionário novo está na lista. Qual é o
resultado? O que mudou? Por quê?\
Agora dá true, porque quando ele vai comparar dentro do for do indexOf, ele usa o .equals que sobrescrevemos no Funcionario, que usa apenas o numeroDeRegistro como parâmetro para retornar true.
