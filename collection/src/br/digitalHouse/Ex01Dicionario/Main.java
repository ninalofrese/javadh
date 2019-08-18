package Ex01Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> loteria = new HashMap<>();

        loteria.put(0, "Ovos");
        loteria.put(1, "Água");
        loteria.put(2, "Escopeta");
        loteria.put(3, "Cavalo");
        loteria.put(4, "Fogo");

        for (Integer valor : loteria.keySet()) {
            System.out.println(valor + " > " + loteria.get(valor));
        }

        Map<String, String> apelidos = new HashMap<>();

        apelidos.put("João", "Juan, Fissura, Maromba");
        apelidos.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        apelidos.put("Maria", "Wonder Woman, Mary, Marilene");
        apelidos.put("Lucas", "Lukinha, Jorge, George");

        for (String valor : apelidos.keySet()) {
            System.out.println(valor + " > " + apelidos.get(valor));
        }

    }
}
