package model;

import java.time.LocalDate;

public class Vaga {

    private Integer codigo;
    private String descVaga;
    private String descRequisitos;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescVaga() {
        return descVaga;
    }

    public void setDescVaga(String descVaga) {
        this.descVaga = descVaga;
    }

    public String getDescRequisitos() {
        return descRequisitos;
    }

    public void setDescRequisitos(String descRequisitos) {
        this.descRequisitos = descRequisitos;
    }
}
