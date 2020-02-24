# Java com Objetos (Paradigma Orientado a Objetos)

Antes de qualquer coisa, algumas coisas sobre o paradigma de orientação a objetos:

O que realmente diferencia programas OO de outros é o polimorfismo, e o mecanismo de polimorfismo não deve criar uma dependência no código do que chama para o que é chamado. Exemplo: `f(o)` parece ter uma dependência da função f. É possível inferir isso porque inferimos que só existe um f, então o que chama, neste caso, deve conhecer o que foi chamado. Mas se pensarmos na expressão `o.f()`, inferimos algo diferente. Sabemos que deve existir várias implementações de f, e não sabemos exatamente quais dessas funções f serão chamadas. Por isso é que a última expressão não tem uma dependência da função que está sendo chamada.

Em termos concretos, isso significa que os módulos que contém chamadas polimórficas não devem referenciar, de forma alguma, módulos que contém implementação dessas funções. Não pode ter `include` ou `use` ou `require`, ou nenhuma outra declaração que faça com que um arquivo dependa de outro.

> A definição de OO é: a técnica de usar polimorfismo dinâmico para chamar funções sem o código do chamador dependendo do código do que chamou.

## Gets e sets
são a forma de pedir as informações em atributos private ou protected.
para atribuir valor para atributos encapsulados, precisa usar get e sets.

### Métodos acessores - get
- geralmente não tem parâmetros
- sempre retorna alguma coisa

### Métodos modificadores - set
- ele geralmente não retorna, modifica (sempre é void)
- this = a esse atributo aqui, desta classe que está recebendo esse valor.

## Construtores
- são responsáveis por criar o objeto em memória, ou seja, instanciar a classe que foi definida
- não tem retorno definido (nem void, nem nada)
- construtor sempre terá o nome da classe
- o construtor é usado sempre para setar um valor inicial
- o Java cria um construtor vazio se não tem nenhum, mas a partir do momento em que se cria um construtor específico, ele não criará um vazio.
dois construtores não podem ser iguais em termos de tipo e quantidade.

## Objetos

tipo nomeDoObjeto = new Construtor();

- recebem o endereço de memória, do construtor.
- o construtor pode ser diferenciado pelos parâmetros.

## Encapsulamento
- a grande maioria dos construtores e métodos são públicos, exceto os métodos que podem servir somente dentro da classe, assim ele pode ser privado.
- atributos são na maioria privados ou protegidos.
- dentro de uma classe pública, você pode ter uma classe privada, mas como raiz não tem lógica uma classe privada

### Diferença entre privado e protegido

O **privado** não permite acessar/alterar diretamente nem pelos herdeiros. Ou seja, o atributo/método só fica visível dentro da própria classe.

O **protected** deixa visível para outras classes e subclasses que pertencem ao mesmo pacote. Neste caso, só as classes do mesmo pacote tem acesso ao membro, o pacote da subclasse não.

### Visibilidade de variáveis herdadas

|    | Private | Default | Protected | Public  |
| ------------- | ------------- | ------------- | ------------- | ------------- |
| Mesma classe  | Sim  | Sim  | Sim  | Sim  |
| Mesmo pacote  | Não  | Sim  | Sim  | Sim  |
| Pacotes diferentes (subclasses)  | Não  | Não  | Sim  | Sim  |
| Pacotes diferentes (sem subclasses)  | Não  | Não  | Não  | Sim  |

***

[Functional Programming vs. Object Oriented Programming](https://blog.cleancoder.com/uncle-bob/2018/04/13/FPvsOO.html)
