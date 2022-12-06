package repository;

import model.Main;

import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivoDAO {
    private static List<Main.ProcessoSeletivo> processoSeletivos = new ArrayList<>();

    public static List<Main.ProcessoSeletivo> findProcessoSeletivo(){return processoSeletivos;}

    public static void save(Main.ProcessoSeletivo processoSeletivo){processoSeletivos.add(processoSeletivo);}

    public static void save(List<Main.ProcessoSeletivo> processoSeletivoList){processoSeletivos.addAll(processoSeletivoList);}
}
