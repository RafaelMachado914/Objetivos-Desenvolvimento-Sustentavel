package br.com.ifsc_plus.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "curso")

public class Curso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;    
    private String nome;
    private int cargaHoraria;
    
    @OneToMany(mappedBy = "curso")
    private List<Matricula> matriculas;

    public Curso() {
    }

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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }




    
    
    
    
            
            
}
