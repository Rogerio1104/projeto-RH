package model;

import repository.CandidatoDAO;
import repository.ProcessoSeletivoDAO;
import repository.VagaDAO;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
    try {
        menuOpcaoSistemas();
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,"Erro no sistema!\n Entre em contato com o suporte!!!",
                "ERRO", 0);;
    }
    }
    private static void chamaConfirmacao () {
        int confirmacaoCadastroPaciente = JOptionPane.showConfirmDialog(null, "Deseja cadastrar uma vaga? ");
        if (confirmacaoCadastroPaciente == 0) {
            chamaCadastroVagas();
        } else if (confirmacaoCadastroPaciente == 1) {
            menuOpcaoSistemas();
        } else if (confirmacaoCadastroPaciente == 2) {
            JOptionPane.showMessageDialog(null, "PROGRAMA CANCELADO PELO USUÁRIO!",
                    "AVISO", 0);
            exit(0);
        }

    }



    private static void chamaProcessoSeletivo(){
        List<ProcessoSeletivo> processoSeletivos = new ArrayList<>();
        ProcessoSeletivo processoSeletivo = new ProcessoSeletivo();
        processoSeletivos.add(processoSeletivo);

        String[] opcaoMenuProcessoSeletivo = {"DADOS", "VOLTAR"};
        int menuCadastroProcessoSeletivo = JOptionPane.showOptionDialog(null, "Escolha uma opção:",
                "Menu Cadastro Processo Seletivo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcaoMenuProcessoSeletivo, opcaoMenuProcessoSeletivo[0]);

        switch (menuCadastroProcessoSeletivo) {
            case 0:
                processoSeletivo.setCodigoProcessoSeletivo(1);
                String dsStatusProcessoSeletivo = JOptionPane.showInputDialog("Escreva a descrição do status do processo seletivo: ");
                processoSeletivo.setDescStatusProcesso(dsStatusProcessoSeletivo);

                String dtInicio = JOptionPane.showInputDialog("Escreva a data inicio do processo seletivo: ");
                processoSeletivo.setDataInicio(LocalDate.parse(dtInicio));

                String dtFim = JOptionPane.showInputDialog("Escreva a data fim do processo seletivo: ");
                processoSeletivo.setDataFim(LocalDate.parse(dtFim));


                processoSeletivos.add(processoSeletivo);
                ProcessoSeletivoDAO.save(processoSeletivo);

                chamaProcessoSeletivo();
                break;

            case 1:
                menuOpcaoSistemas();
                break;
        }
        ProcessoSeletivoDAO.save(processoSeletivo);
    }

    private static Integer chamaOpcaoCrud(){
        String[] opcao = {"Inserção", "Alteração", "Exclusão"};
        int tipoOpcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:",
                "Operação no cadastro: ",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);
        return tipoOpcao;
    }

    private static void chamaCadastroCandidato(){
        Integer opcaoCrud = chamaOpcaoCrud();
        Candidato candidato = null;
        List<Candidato> candidatos = new ArrayList<>();

        switch (opcaoCrud){
            case 0:
                seguro = cadastro
        }
        candidatos.add(candidato);

        String[] opcaoMenuCandidato = {"DADOS", "VOLTAR"};
        int menuCadastroCurriculo = JOptionPane.showOptionDialog(null, "Escolha uma opção:",
                "Menu Cadastro",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcaoMenuCandidato, opcaoMenuCandidato[0]);

        switch (menuCadastroCurriculo) {
            case 0:
                candidato.setCodigo(1);
                String dsCandidato = JOptionPane.showInputDialog("Escreva a descrição do candidato: ");
                candidato.setDescCandidato(dsCandidato);

                String dtNascimento = JOptionPane.showInputDialog("Escreva a sua data de nascimento: ");
                candidato.setDataNascimento(LocalDate.parse(dtNascimento));

                String cpf = JOptionPane.showInputDialog("Escreva seu cpf: ");
                candidato.setCpf(cpf);

                String descCurriculo = JOptionPane.showInputDialog("Escreva a descrição do seu curriculo: ");
                candidato.setDescCurriculo(descCurriculo);

                String descEmail = JOptionPane.showInputDialog("Escreva o seu email: ");
                candidato.setDescEmail(descEmail);

                candidatos.add(candidato);
                CandidatoDAO.save(candidato);

                chamaCadastroCandidato();
                break;

            case 1:
                menuOpcaoSistemas();
                break;
        }
        CandidatoDAO.save(candidato);
    }



    private static void chamaCadastroVagas() {
            List<Vaga> vagas = new ArrayList<>();
            Vaga vaga = new Vaga();
            vagas.add(vaga);
            String[] opcaoMenuVaga = {"DADOS", "VOLTAR"};
            int menuCadastroVaga = JOptionPane.showOptionDialog(null, "Escolha uma opção:",
                    "Menu Cadastro",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcaoMenuVaga, opcaoMenuVaga[0]);

            switch (menuCadastroVaga) {
                case 0:
                    vaga.setCodigoVaga(1);

                    Object[] status = {Status.status.ABERTO,Status.status.ANDAMENTO,Status.status.CONCLUIDO};
                    Object selecionado = JOptionPane.showInputDialog(null, "Selecione qual o status da vaga:",
                            "MENU", 1, null, status, " ");

                    if(selecionado == (Status.status.ABERTO)){
                        vaga.setDescStatus("ABERTO");
                    }else if (selecionado == (Status.status.ANDAMENTO)){
                        vaga.setDescStatus("ANDAMENTO");
                    }else if (selecionado == (Status.status.CONCLUIDO)){
                        vaga.setDescStatus("CONCLUIDOS");
                    }


                    String dsVaga = JOptionPane.showInputDialog("Escreva a descrição da vaga: ");
                    vaga.setDescVaga(dsVaga);

                    String dsRequisitos = JOptionPane.showInputDialog("Escreva a descrição dos requisitos: ");
                    vaga.setDescRequisitos(dsRequisitos);



                    vagas.add(vaga);
                    VagaDAO.save(vaga);

                    chamaCadastroVagas();
                    break;

                case 1:
                    menuOpcaoSistemas();
                    break;
            }
            VagaDAO.save(vagas);
        }

     static Object menuOpcaoSistemas() {
        Object[] opcaoInicial = {Candidato.CargosSistema.RH, Candidato.CargosSistema.CANDIDATO, Candidato.CargosSistema.PROCESSOSELETIVO};
        Object selecionado = JOptionPane.showInputDialog(null, "Selecione qual sistema você quer acessar:",
                "MENU", 1, null, opcaoInicial, " ");

        if (selecionado == (Candidato.CargosSistema.RH)) {
            chamaRh();
        } else if (selecionado == (Candidato.CargosSistema.CANDIDATO)) {
            chamaCandidato();
        }else if(selecionado == Candidato.CargosSistema.PROCESSOSELETIVO){
            chamaProcessoSeletivo();
        }
        return selecionado;
    }

    private static void chamaRh() {
        chamaConfirmacao();
    }

    private static void chamaCandidato(){
        chamaCadastroCandidato();
    }

    public static class ProcessoSeletivo {
        private LocalDate dataInicio;
        private LocalDate dataFim;
        private Integer codigoProcessoSeletivo;
        private String descStatusProcesso;

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

        public Integer getCodigoProcessoSeletivo() {
            return codigoProcessoSeletivo;
        }

        public void setCodigoProcessoSeletivo(Integer codigoProcessoSeletivo) {
            this.codigoProcessoSeletivo = codigoProcessoSeletivo;
        }

        public String getDescStatusProcesso() {
            return descStatusProcesso;
        }

        public void setDescStatusProcesso(String descStatusProcesso) {
            this.descStatusProcesso = descStatusProcesso;
        }
    }
}

