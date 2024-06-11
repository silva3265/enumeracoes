package tipos_enum;

public enum StatusPedido {

    RASCUNHO,
    EMITIDO(12), /* 'tempoEntregaEmHoras' vai ser passado dentro do enum, ai o enum pode receber o valor, que no caso � o tempo em horas */
    FATURADO(10), /* esse numeros s�o '10' horas  */
    SEPARADO(8),
    DESPACHADO(6),
    ENTREGUE(0),
    CANCELADO;

    private Integer tempoEntregaEmHoras;

    StatusPedido() { /* sobrecarga de Contrutor pra poder passar informa��es para dentro dos ENUNS */
    }

    StatusPedido(int tempoEntregaEmHoras) {
        this.tempoEntregaEmHoras = tempoEntregaEmHoras;
    }

    public Integer getTempoEntregaEmHoras() {
        return tempoEntregaEmHoras;
    }

}
