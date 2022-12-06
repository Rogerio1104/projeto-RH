package model;

import java.time.LocalDate;

public class ProcessoSeletivo {

    private Integer codigo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String descStatusProcesso;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

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

    public String getDescStatusProcesso() {
        return descStatusProcesso;
    }

    public void setDescStatusProcesso(String descStatusProcesso) {
        this.descStatusProcesso = descStatusProcesso;
    }
}
