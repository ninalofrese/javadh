# Introdução ao Java (sem objetos)

Java precisa de compilador para traduzir a linguagem de alto nível para uma de nível mais baixo, compreendida pelo computador.

JVM permite que o código rode em diferentes sistemas operacionais (Java, Kotlin e outras linguagens)

JDK é o kit de desenvolvimento do Java, que a cada versão tem funcionalidades novas (Java SE). O Java 8 é o mais utilizado em sistemas legados (já criados), portanto, atingem uma maioria de mercado.

## Tipos de dados primitivos
int, double, float, char, boolean
- são escritos em minúsculo

## Tipos de dados Wrapper (tipo referência/ tipo classe)

**Por que é mais vantajoso usar?**
Integer, Float, Double, String, Character, Boolean
- aceita naturalmente valor nulo

### Classes BigDecimal e BigInteger
O Java não é uma linguagem feita para ter precisão em cálculos de números decimais. 

**BigDecimal**\
Usar `float` ou `double` quando precisa de precisão decimal em cálculos não é a melhor forma. Neste caso, usa-se `BigDecimal`.

```
double a = 0.03;
double b = 0.04;
sout(b-a); //retorna 0.010000000000000002

BigDecimal _a = new BigDecimal("0.03");
BigDecimal _b = new BigDecimal("0.04");
BigDecimal _c = _b.subtract(_a);
sout(_c);
```

**BigInteger**\
Mesmo o `long` pode não ser o suficiente para o número de dígitos que precisa para calcular. O BigInteger é utilizado para quando tem necessidade de precisão em cálculos de números inteiros.
