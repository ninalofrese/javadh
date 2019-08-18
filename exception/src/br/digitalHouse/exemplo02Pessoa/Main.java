package br.digitalHouse.exemplo02Pessoa;

public class Main {
    public static void main(String[] args) {

        //documenta o problema, não necessariamente trata
        try {
            Pessoa pessoa = new Pessoa();
//          Pessoa pessoa = null;

//            pessoa.setRg(123456);

            System.out.println(pessoa.getRg() + 00000);
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            //com ou sem exceção, o que estiver aqui dentro vai acontecer na aplicação
            //ex: encerrar a conexão do banco de dados
            //tá sempre junto do try/catch

            System.out.println("Aconteceu o print dentro do finally");
        }
    }
}
