# Exercício 3

1. Criar uma classe Aluno que tenha como atributos nome (String) e
numeroDeAluno (Integer).
2. Criar um construtor para a classe Aluno que receba como parâmetro o
nome e o número de aluno.
3. Na classe Main, criar uma lista de alunos e adicionar quatro alunos novos.
4. Criar um aluno novo com um número de aluno contido na lista e perguntar
se ele está na lista (utilizar o método contains).\
Retorna false, se o .equals não foi sobrescrito.
5. Sobrescrever o equals da classe Aluno para que compare apenas o
número de aluno.
6. Perguntar novamente se o aluno novo está na lista. Qual é o resultado? O
que mudou? Por quê?\
O contains, quando está no escopo de uma ArrayList, retorna o indexOf do objeto, que passa por uma lógica de verificar se o elemento deste index é igual a algum item da lista, quando ele não é nulo.

## Como resolver usando o .equals direto?

Não tem necessidade de usar diretamente o equals, mesmo porque o .contains fará a pesquisa pela lista, item por item, sem precisar criar um loop.

Usando o exercicio como exemplo, o equals só seria útil caso fosse passado um parâmetro direto de código de Aluno para se comparar. Por exemplo, se tivesse um método para conferir se o aluno está cadastrado, passando como parâmetro o código de Aluno.
 
```
public boolean verificarCadastro(Integer codigoAluno){
    for (int i = 0; i < lista.size(); i++) {
        if (lista.get(i).getNumeroAluno().equals(codigoAluno)) {
            System.out.println("Já tem alguém com o mesmo código " + lista.get(i).getNome());
        }
    }
}
```

Não é a forma mais eficiente (como dito acima, o contains resolve esse problema melhor do que usar o .equals direto), mas é possível criar um loop e verificar os objetos, sem precisar comparar diretamente o `numeroAluno`.

```
// Para pesquisar em uma lista, seria assim:
for (int i = 0; i < lista.size(); i++) {
    if (lista.get(i).equals(alunoCinco)) {
        System.out.println("Já tem alguém com o mesmo código " + lista.get(i).getNome());
    }
}

//Ou usando o foreach aprimorado
for (Aluno valor : lista) {
    if (valor.equals(alunoCinco)) {
        System.out.println("Já tem alguém com o mesmo código: " + valor.getNome());
    }
}
```

Seria totalmente errado tentar usar o .equals diretamente da lista, porque são objetos completamente diferentes, e de tipos diferentes também.

```
System.out.println("O aluno " + alunoCinco.getNome() + " está na lista de alunos?\n EQUALS lista e alunoCinco" + lista.equals(alunoCinco));
```

O equals é melhor utilizado para comparar objetos diretamente.

```
System.out.println("O aluno " + alunoCinco.getNome() + " está na lista de alunos?\n" + alunoQuatro.equals(alunoCinco));
```
