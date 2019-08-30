package br.digitalHouse.Ex01Pessoa;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private Integer rg;

    public Pessoa(String nome, Integer rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(getRg(), pessoa.getRg());
    }

    //    @Override
//    public boolean equals(Object outraPessoa) {
//
//        if (this == outraPessoa){
//            return true;
//        }
//
//        if(!(outraPessoa instanceof Pessoa)){
//            return false;
//        }
//
//        return this.rg == ((Pessoa) outraPessoa).getRg();
//
//    }
}
