package br.com.correspondente.validators;

import br.com.correspondente.entity.Audiencia;

import java.util.ArrayList;
import java.util.List;

public class AudienciaValidator {

    public static List<String> validarCamposObrigatorios(Audiencia audiencia) {
        List<String> erros = new ArrayList<>();

        if (audiencia.getNumeroProcesso() == null || audiencia.getNumeroProcesso().isBlank()) {
            erros.add("Número do processo / protocolo é obrigatório");
        }

        if (audiencia.getData() == null) {
            erros.add("Data da audiência é obrigatória");
        }

        if (audiencia.getHonorarios() == null) {
            erros.add("Valor dos honorários é obrigatório");
        }

        if (audiencia.getAdvogado() == null || audiencia.getAdvogado().getId() == null) {
            erros.add("Advogado é obrigatório");
        }

        if (audiencia.getPrioridade() == null || audiencia.getPrioridade().getId() == null) {
            erros.add("Prioridade é obrigatória");
        }

        if (audiencia.getTipoServico() == null || audiencia.getTipoServico().getId() == null) {
            erros.add("Tipo de serviço é obrigatório");
        }

        if (audiencia.getAtividade() == null || audiencia.getAtividade().getId() == null) {
            erros.add("Atividade é obrigatória");
        }

        if (audiencia.getLocal() == null || audiencia.getLocal().getId() == null) {
            erros.add("Local é obrigatório");
        }

        if (audiencia.getStatus() == null || audiencia.getStatus().getId() == null) {
            erros.add("Status é obrigatório");
        }

        if (audiencia.getDataCriacao() == null) {
            erros.add("Data de criação é obrigatória");
        }

        return erros;
    }
}
