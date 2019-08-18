import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Nina");
        lista.add("Edson");
        lista.add("Armando");
        lista.add("Amanda");
        lista.add("Márcia");
        lista.add("Márcia"); //não ignora, nem sobrescreve

        //remove pelo índice
        lista.remove(4);

        String valor = lista.get(2);

        for(String nomes :lista){
            System.out.println(nomes);
        }



    }
}
