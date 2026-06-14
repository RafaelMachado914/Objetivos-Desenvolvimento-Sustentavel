package br.com.ifsc_plus.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Curso")

public class Curso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;    
    private String nome;
    private int cargaHoraria;
    
    @OneToMany(mappedBy = "Curso")
    private List<Aluno> alunos;

    public Curso() {
    }

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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
    
    
            
            
}
