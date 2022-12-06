package model;

import java.time.LocalDate;

public class Candidato {

    private Integer codigo;
    private String nomeCandidato;
    private LocalDate dataNascimento;
    private String cpf;
    private String descCurriculo;
    private String emailCandidato;

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getEmailCandidato() {
        return emailCandidato;
    }

    public void setEmailCandidato(String emailCandidato) {
        this.emailCandidato = emailCandidato;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public int setCodigo(Integer codigo) {
        this.codigo = codigo;
        return 0;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDescCurriculo() {
        return descCurriculo;
    }

    public void setDescCurriculo(String descCurriculo) {
        this.descCurriculo = descCurriculo;
    }
}
