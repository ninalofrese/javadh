import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Livro livro1 = new Livro(1, "O Senhor dos Anéis", "Tolkien", 2019, 1, 10, 17);
        Livro livro2 = new Livro(2, "O Hobbit", "Tolkien", 2019, 1, 10, 15);
        Livro livro3 = new Livro(3, "tit3", "aut3", 2019, 1, 10, 13);
        Livro livro4 = new Livro(4, "tit4", "aut4", 2019, 1, 10, 2);
        Livro livro5 = new Livro(5, "tit5", "aut5", 2019, 1, 10, 1);

        Livraria livraria = new Livraria();
        livraria.CadastrarLivro(livro1);
        livraria.CadastrarLivro(livro2);
        livraria.CadastrarLivro(livro3);
        livraria.CadastrarLivro(livro4);
        livraria.CadastrarLivro(livro5);

        //um livro
        //livraria.ConsultarLivro(5);

        //varios livros
        List<Integer> codigos = new ArrayList<>();
        codigos.add(2);
        codigos.add(4);
        //livraria.ConsultarLivro(codigos);

        //livraria.EfetuarVenda(2);
//        livraria.EfetuarVenda(2);
//        livraria.EfetuarVenda(2);
//        livraria.EfetuarVenda(2);
        //livraria.EfetuarVenda(77);

        //Desafio
        List<Livro> colecao = new ArrayList<>();
        colecao.add(livro4);
        colecao.add(livro1);
        Colecao box1 = new Colecao(colecao, 12, 90.0,"Esse é o box do 1 e 4.");

        List<Livro> colecao2 = new ArrayList<>();
        colecao2.add(livro3);
        colecao2.add(livro2);
        Colecao box2 = new Colecao(colecao2, 12, 90.0,"Esse é o box 2.");

        List<Livro> colecao3 = new ArrayList<>();
        colecao3.add(livro1);
        colecao3.add(livro3);
        Colecao box3 = new Colecao(colecao3, 12, 90.0,"Esse é o box 3.");

        System.out.println();
        livraria.EfetuarVenda(box2);

    }
}
