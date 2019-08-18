# Exceptions

São problemas na compilação do código.\
Exemplos:
- Divisão por zero
- Consultar atributos ou métodos de um objeto _null_
- Quando um arquivo é aberto incorretamente

## Try, catch e finally

Andam juntos, mas o finally não é obrigatório. Servem para não dar crash e não exibir o erro diretamente ao usuário, somente no desenvolvimento.

**Formato:**

````
try{
    //Aqui entra o código que você quer experimentar
} catch (Exception ex){ 
    //Aqui entra o código que controla a exceção
    //Trata tanto uma Exception genérica quanto uma mais específica como Null ou ArithmeticException
} finally{
    //Aqui entra o codigo que você quer que seja executado havendo falhas ou não.
    //É opcional, mas muito usado para, por exemplo, fechar a conexão com o banco de dados.
}
````

Destaque para o _catch (_**Exception ex**_)_: ele ajuda a identificar qual a exceção que o sistema vai mostrar e a mensagem de erro. Com ele, podemos tratar diretamente o erro e inclusive preparar o método para mostrar uma mensagem mais amigável ao usuário.

Exemplo:

````
public int dividir(int dividendo, int divisor) throws ArithmeticException {
    if (divisor == 0) {
        throw new ArithmeticException(dividendo + " não é divisível por " + divisor);
    } else{
        int divisao = dividendo / divisor;
        return divisao;
    }

}
````

Mais sobre **throw** no [exercício de divisão](\src\br\digitalHouse\Ex03)
