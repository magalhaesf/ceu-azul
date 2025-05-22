package com.magalhaes.modelo;

public class Petshop {
    private String nome;
    private String email;
    private String telefone;
    private String cnpj;
 
@Deprecated
    public Petshop() {
}


public Petshop(String nome, String email, String telefone, String cnpj) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
      
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
     
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

