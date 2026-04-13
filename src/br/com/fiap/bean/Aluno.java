package br.com.fiap.bean;

import java.time.LocalDate;

public class Aluno {
    //Atributos
    private int registroMatricula;
    private String nomeCompleto;
    private LocalDate dataDeNascimento;

    //Construtor vazio
    public Aluno(){

    }

    //Construtor com parâmetros
    public Aluno(int registroMatricula, String nomeCompleto, LocalDate dataDeNascimento) {
        this.registroMatricula = registroMatricula;
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
    }
    //Métodos Getters e Setters
    public int getRegistroMatricula() {
        return registroMatricula;
    }
    public void setRegistroMatricula(int registroMatricula) {
        this.registroMatricula = registroMatricula;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    //Métodos

}
