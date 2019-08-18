import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Erika");
        conjunto.add("Jessica");
        conjunto.add("Camila");
        conjunto.add("Rafa");
        conjunto.add("Rafa"); //ignora duplicados

        for(String nome:conjunto){
            System.out.println(nome);
        }

    }
}
