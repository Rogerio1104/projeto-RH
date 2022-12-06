package model;

import java.time.LocalDate;

public class Candidato {

    private Integer codigo;
    private String descCandidato;
    private LocalDate dataNascimento;
    private String cpf;
    private String descCurriculo;
    private String emailCandidato;

    public String getEmailCandidato() {
        return emailCandidato;
    }

    public void setEmailCandidato(String emailCandidato) {
        this.emailCandidato = emailCandidato;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescCandidato() {
        return descCandidato;
    }

    public void setDescCandidato(String descCandidato) {
        this.descCandidato = descCandidato;
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