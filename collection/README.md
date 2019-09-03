# Collection em java

[Apostila de collections da Caelum](https://www.caelum.com.br/apostila-java-orientacao-objetos/collections-framework/)

- as listas só aceitam tipo de dados wrapper: Integer, Double, String... não pode ser primitivo

### Hashset

- Ignora itens que são iguais, ou seja, não repetem
- não grava ordem, é aleatória (pode usar um compare())

```
Set<TipoValor> conjunto = new HashSet<>();
```

### Hashmap
Associa uma chave a um valor. Ex.: em um dicionário a palavra é a chave, e o significado é o valor.

- Os valores só podem ser acessados por meio da chave
- Usado quando você quer 2 valores iguais (mas a chave não se repete). Se 2 valores forem adicionados à mesma chave, ele vai sobrescrever.
- remove por chave

```
Map<TipoChave, TipoValor> map = new HashMap<>();
```

### ArrayList

- coleção de dados do mesmo tipo
- pode haver repetições
- ordem é importante, começa por 0
- acessa por índice ou pelo valor

Basicamente, o contrário do HashSet\

```
List<TipoValor> lista = new ArrayList<>();
```

**Boxing**

É o processo de conversão de um objeto tipo valor (primitivo) para um objeto tipo referência (wrapper)

```
int x = 20;
Object obj = x;
//Ao invés de alocar o valor em um espaço na memória stack, ele copia o valor para um espaço na memória heap e referencia no obj no stack.
```

Existe o processo contrário, chamado de **unboxing**, que precisa de cast para converter um tipo objeto para tipo int (no caso do exemplo).
