package org.example;

public class TarefaEstadoEmProgresso implements TarefaEstado {

    private TarefaEstadoEmProgresso() {};
    private static TarefaEstadoEmProgresso instance = new TarefaEstadoEmProgresso();
    public static TarefaEstadoEmProgresso getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em Progresso";
    }
}
