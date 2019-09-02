# Aulas de Java - Digital House

- [Java Sem Objetos](https://github.com/ninalofrese/javadh/tree/master/javaSemObjetos#introdução-ao-java-sem-objetos)
- [Programação Orientada a Objetos em Java](https://github.com/ninalofrese/javadh/tree/master/javaPOO#javacomobjetos)
- [Herança e Classe Abstrata](https://github.com/ninalofrese/javadh/tree/master/herancaClasseAbstrata#classe-abstrata-e-heranças)
- [Collections](https://github.com/ninalofrese/javadh/tree/master/collection#collection-em-java)
- [Equals, toString e this](https://github.com/ninalofrese/javadh/tree/master/equalsToStringThis#equals-tostring-e-this)
- [Exceptions](https://github.com/ninalofrese/javadh/tree/master/exception#exceptions)

## Informações extra

### Membros estáticos (classes, métodos e variáveis)
- não podem ser instanciadas
- os valores dos cálculos não mudam para objetos diferentes
- dentro de uma classe, você não pode chamar um método que não é estático dentro de um estático
- Não use variáveis estáticas como variáveis globais.
- Os métodos estáticos são geralmente auxiliares, para alguns cálculos, processamento de strings, execuções simples. Geralmente em classes utilitárias.

Uso:

```
Classe.metodo(parametro)
Classe.ATRIBUTO
```

**Diferença entre pensamento estruturado e OO**
```
//Pensando estruturado
acelerar(carro);

//Pensando Orientado a Objetos
carro.acelerar();
```

**Static import**
Usado quando você não quer ter que ficar referenciando a classe toda vez que precisar usar um método static.

Exemplo (Math)
```
import static java.lang.Math.*;

//Math.max(a,b);
max(a,b);
```

### Final
Usado em métodos e atributos para determinar que o valor não pode mudar. Ou seja, é uma constante. O padrão de nome é maiúscula, com underline entre as palavras. Ex.: `NET_SALARY`

```
public static final double PI = 3.14159;
```
