package br.senac.rn.agenda.model;

public class Contato {
    private Long id;
    private String nome;
    private String fone;

    public Contato() {}
    public Contato(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
