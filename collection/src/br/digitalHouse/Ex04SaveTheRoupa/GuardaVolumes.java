package br.digitalHouse.Ex04SaveTheRoupa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {
    private Integer contador = 0;
    private Map<Integer, List<Peca>> dicionario = new HashMap<>();

    public Integer guardarPecas(List<Peca> listaDePeca) {
        contador++;
        dicionario.put(contador, listaDePeca);
        return contador;
    }

    public void mostrarPecas() {
        for (Integer chave : dicionario.keySet()) {
            List<Peca> pecas = dicionario.get(chave);
            System.out.println(pecas.toString());
        }
    }

    public void mostrarPecas(Integer numero) {
        for (Integer chave : dicionario.keySet()) {
            if (chave == numero) {
                List<Peca> pecas = dicionario.get(chave);
                System.out.println(pecas.toString());
            }
        }
    }

    public void devolverPecas(Integer numero) {
        for (Integer chave : dicionario.keySet()) {
            if (chave == numero) {
                dicionario.remove(chave);
            }
        }
    }
}
