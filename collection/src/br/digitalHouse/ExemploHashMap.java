import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(2, "Segundo lugar");
        mapa.put(3, "Terceiro lugar");
        mapa.put(1, "Primeiro lugar");
        mapa.put(1, "1o lugar"); //sobrescreve duplicados

        mapa.remove(3);

        for(Integer valor:mapa.keySet()){
            String lugares = mapa.get(valor);
            System.out.println(lugares);
        }


    }
}
