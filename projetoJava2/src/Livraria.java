import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private List<Livro> livros = new ArrayList<>();

    public void CadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    //individual
    public Livro ConsultarLivro(int codigo) {
        boolean achou = false;
        Livro livroAchado = null;

        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getCodigo() == codigo) {
                achou = true;
                System.out.println(livros.get(i).toString());
                livroAchado = livros.get(i);
            }
        }
        if (achou == false) {
            System.out.println("Livro não encontrado.");
        }
        return livroAchado;
    }

    //varios codigos de livros
    public void ConsultarLivro(List<Integer> codigos) {

        for (int j = 0; j < codigos.size(); j++) {
            Livro livro = ConsultarLivro(codigos.get(j));
        }

    }

    public void EfetuarVenda(int codigo) {
        Livro livro = ConsultarLivro(codigo);

        if (livro != null && livro.getQuantidade() > 0) {
            //System.out.println("Quantidade anterior: " + livro.getQuantidade());
            livro.setQuantidade(livro.getQuantidade() - 1);
            //System.out.println("Quantidade atual: " + livro.getQuantidade());
        } else {
            System.out.println("Estoque esgotado.");
        }

    }

    public void EfetuarVenda(Colecao colecao) {
        List<Livro> livros = colecao.getListaColecao();
        for (int i = 0; i < livros.size(); i++) {
            EfetuarVenda(livros.get(i).getCodigo());
            if (livros.get(i).getQuantidade() >= 1) {
                System.out.println("Coleção: " + colecao.getDescricao() + " venda do livro: " + livros.get(i).getCodigo() + " - estoque: " + livros.get(i).getQuantidade());
            }
        }

    }

}