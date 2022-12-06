
package repository;

import model.Candidato;
import model.Vaga;
import java.util.ArrayList;
import java.util.List;

public final class CandidatoDAO{
    private static List<Candidato> candidatos = new ArrayList<>();

    public static List<Candidato> findCandidatos(){ return candidatos;}

    public static void save(Candidato candidato){candidatos.add(candidato);}

    public static void save(List<Candidato> candidatoList){
        candidatos.addAll(candidatoList);
    }
}
