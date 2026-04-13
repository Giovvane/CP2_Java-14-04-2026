package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import java.time.LocalDate;

//CP2 de JAVA - 14/04/2026 - Pro.Gilberto
//Tárik Moussa Alma - RM: 571411
//Giovane Dias Chicoli - RM: 569750
//Fabricio Aquiles Sales da Silva - RM: 570985
public class MainAluno {
    //Atributos
    private int registroMatricula;
    private String nomeCompleto;
    private LocalDate dataDeNascimento;

    //Construtor vazio, inicializar valor padrão.
    public MainAluno() {
    }
    // Construtor com parâmetros
    public MainAluno(int registroMatricula, String nomeCompleto, LocalDate dataDeNascimento) {
        this.registroMatricula = registroMatricula;
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
    }
    //Método para regras de negócio

    public int getRegistroMatricula() {
        return registroMatricula;
    }
    public void setRegistroMatricula(int registroMatricula) {
        this.registroMatricula = registroMatricula;
    }
}
