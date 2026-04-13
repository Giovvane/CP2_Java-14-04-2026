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

    //Construtor vazio
    public Aluno(int registroMatricula, String nomeCompleto, LocalDate dataDeNascimento) {
        this.registroMatricula = registroMatricula;
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
    }
    
}
