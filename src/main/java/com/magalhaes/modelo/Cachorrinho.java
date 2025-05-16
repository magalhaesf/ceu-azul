package com.magalhaes.modelo;

public class Cachorrinho {
    private String nome;
    private String raca;
    private String idade;

    @Deprecated
    public Cachorrinho() {
    }

    public Cachorrinho(String nome, String raca, String idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cachorrinho [nome=" + nome + ", raca=" + raca + ", idade=" + idade + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((raca == null) ? 0 : raca.hashCode());
        result = prime * result + ((idade == null) ? 0 : idade.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cachorrinho other = (Cachorrinho) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (raca == null) {
            if (other.raca != null)
                return false;
        } else if (!raca.equals(other.raca))
            return false;
        if (idade == null) {
            if (other.idade != null)
                return false;
        } else if (!idade.equals(other.idade))
            return false;
        return true;
    }

 


    
}
