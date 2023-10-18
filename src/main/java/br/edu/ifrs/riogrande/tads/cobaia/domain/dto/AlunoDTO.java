package br.edu.ifrs.riogrande.tads.cobaia.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlunoDTO { // dado público
  
  private Integer matricula;
  @JsonProperty("nomeCompleto")
  private String nome;

  public Integer getMatricula() {
    return matricula;
  }

  public void setMatricula(Integer matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
}
