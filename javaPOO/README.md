# javacomobjetos

# Gets e sets
são a forma de pedir as informações em atributos private ou protected.
para atribuir valor para atributos encapsulados, precisa usar get e sets.



# Métodos acessores - get
- geralmente não tem parâmetros
- sempre retorna alguma coisa

# Métodos modificadores - set
- ele geralmente não retorna, modifica (sempre é void)
- this = a esse atributo aqui, desta classe que está recebendo esse valor.

# Construtores
- são responsáveis por criar o objeto em memória, ou seja, instanciar a classe que foi definida
- não tem retorno definido (nem void, nem nada)
- construtor sempre terá o nome da classe
- o construtor é usado sempre para setar um valor inicial
- o Java cria um construtor vazio se não tem nenhum, mas a partir do momento em que se cria um construtor específico, ele não criará um vazio.
dois construtores não podem ser iguais em termos de tipo e quantidade.

# Objetos

tipo nomeDoObjeto = new Construtor();

- recebem o endereço de memória, do construtor.
- o construtor pode ser diferenciado pelos parâmetros.

# Encapsulamento
- a grande maioria dos construtores e métodos são públicos, exceto os métodos que podem servir somente dentro da classe, assim ele pode ser privado.
- atributos são na maioria privados ou protegidos.
- dentro de uma classe pública, você pode ter uma classe privada, mas como raiz não tem lógica uma classe privada

