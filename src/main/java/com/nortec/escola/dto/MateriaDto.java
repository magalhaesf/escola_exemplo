package com.nortec.escola.dto;

public class MateriaDto {
    
    private String nome;

    private ProfessorDto professorDto;

    @Deprecated
    public MateriaDto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProfessorDto getProfessorDto() {
        return professorDto;
    }

    public void setProfessorDto(ProfessorDto professorDto) {
        this.professorDto = professorDto;
    }

    @Override
    public String toString() {
        return "MateriaDto [nome=" + nome + ", professorDto=" + professorDto + "]";
    }    
    
   
}
