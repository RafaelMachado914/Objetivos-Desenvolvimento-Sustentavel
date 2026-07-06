package br.com.ifsc_plus.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Aluno")

public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String nome;
    private String email;
    
    @OneToMany(mappedBy = "aluno")
    private List<Matricula> matriculas;
    

    public Aluno() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    
    @Override
    public String toString() {
       return nome;
    }
    
    
}
