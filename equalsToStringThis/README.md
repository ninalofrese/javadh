# Equals, ToString e This

## .equals (se existe igual) - comparações entre objetos, strings e lists.

- método nativo do Java que pode ser sobrescrito para aplicar a própria lógica na comparação.
- por padrão, compara o objeto, que é um endereço de memória `package.Classe@endereco_de_memoria`, o que não vai ser igual, a não ser que estejamos falando do mesmo objeto (é como se usasse um `==`)
```
Objeto obj1 = new Objeto("Teste");
Objeto obj2 = obj1;

//isso retornaria true, pq ambos referenciam ao mesmo espaço na memória
obj1.equals(obj2);
```
- Sobrescrever o .equals altera o parâmetro de comparação também em **.contains** e **.indexOf**
- No caso de String, ele vai comparar toda a String, que deve estar exatamente igual

### .contains (se existe igual dentro de outro)
- **Collections do tipo Objeto:** Retorna o indexOf que usa o .equals para comparar cada item da lista, portanto, se sobrescrever o .equals, ele altera os parâmetros da comparação quando usa o .contains. (Aliás, o .contains está sobrescrito na classe ArrayList, e herda de AbstractCollection e implementa de List)
- **String:** Vê se parte da String é igual ao informado.


## toString - representação string de um objeto

- sempre que quiser demonstrar os dados de um objeto

## this - aponta a própria classe

```
this.raca = raca (parâmetro);
significa Animal.raca = raca;
```

## hashCode

É muito utilizado quando se tem que buscar em um grande banco de dados, ao invés do .equals ou .contains. Cada valor é convertido para um número,  e se tiver o mesmo valor, esse código será igual. A precisão de correspondência desse código com o valor é muito grande, mas pode ser que ele dê um falso positivo, então, depois de encontrar pelo hashCode, confirma-se se o objeto é o mesmo pelo .equals (que busca de forma mais lenta). 
