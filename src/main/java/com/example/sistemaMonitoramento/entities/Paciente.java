package com.example.sistemaMonitoramento.entities;


import jakarta.persistence.*;


@Entity
@Table(name = "pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "idade", nullable = false)
    private int idade;

    @Column(name = "historico_medico")
    private String historicoMedico;

    @Column(name = "contato", length = 100)
    private String contato;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "senha", length = 45)
    private String senha;

    @ManyToOne
    @JoinColumn(name = "id_comorbidade")
    private Comorbidade comorbidade;

    @ManyToOne
    @JoinColumn(name = "id_clinica")
    private Clinica clinica;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Comorbidade getComorbidade() {
        return comorbidade;
    }

    public void setComorbidade(Comorbidade comorbidade) {
        this.comorbidade = comorbidade;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }
}
