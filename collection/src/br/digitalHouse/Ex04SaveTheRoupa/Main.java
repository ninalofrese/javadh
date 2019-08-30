package br.digitalHouse.Ex04SaveTheRoupa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GuardaVolumes guardaVolumes = new GuardaVolumes();

        List<Peca> meusPertences = new ArrayList<>();
        Casaco casaco = new Casaco("Versace", "Couro");
        GuardaChuva guardaChuva = new GuardaChuva("Umbrella Company", "Bolas Amarelas");

        //adiciona os pertences à lista de pertences
        meusPertences.add(casaco);
        meusPertences.add(guardaChuva);

        //como ele retorna o identificador, é atribuído para a variável
        int codigo = guardaVolumes.guardarPecas(meusPertences);

        guardaVolumes.mostrarPecas();

        guardaVolumes.devolverPecas(codigo);

    }
}
