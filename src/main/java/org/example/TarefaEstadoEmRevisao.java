package org.example;

public class TarefaEstadoEmRevisao implements TarefaEstado {

    private TarefaEstadoEmRevisao() {};
    private static TarefaEstadoEmRevisao instance = new TarefaEstadoEmRevisao();
    public static TarefaEstadoEmRevisao getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em Revisão";
    }
}
