package model;

import java.time.LocalDate;

public class ProcessoSeletivo {

    private Integer codigo;
    private String descStatusProcesso;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    public String getDescStatusProcesso() {
        return descStatusProcesso;
    }

    public void setDescStatusProcesso(String descStatusProcesso) {
        this.descStatusProcesso = descStatusProcesso;
    }
}
