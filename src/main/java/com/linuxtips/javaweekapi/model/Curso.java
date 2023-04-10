package com.linuxtips.javaweekapi.model;


import jakarta.persistence.*;

@Entity
@Table(name="curso")
public class Curso {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getPessoaInstrutora() {
        return pessoaInstrutora;
    }

    public void setPessoaInstrutora(String pessoaInstrutora) {
        this.pessoaInstrutora = pessoaInstrutora;
    }

    public String getPerfilGithub() {
        return perfilGithub;
    }

    public void setPerfilGithub(String perfilGithub) {
        this.perfilGithub = perfilGithub;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Double preco;
    @Column(nullable = false)
    private String pessoaInstrutora;

    @Column(nullable = false)
    private String perfilGithub;
}
