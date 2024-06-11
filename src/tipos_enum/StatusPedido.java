package tipos_enum;

public enum StatusPedido {

    RASCUNHO {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return true;
        }
    },
    EMITIDO(12) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return valorPedido < 100; /* ele só sera emitido caso o valorPedido for menor de 100 */
        }
    },
    EM_ANALISE(11) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return valorPedido < 100;
        }
    },
    FATURADO(10) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false; /* retorna false porque nao pode */
        }
    },
    SEPARADO(8) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    },
    DESPACHADO(6) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    },
    ENTREGUE(0) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    },
    CANCELADO {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    };

    private Integer tempoEntregaEmHoras;

    StatusPedido() {
    }

    StatusPedido(int tempoEntregaEmHoras) {
        this.tempoEntregaEmHoras = tempoEntregaEmHoras;
    }

    public Integer getTempoEntregaEmHoras() {
        return tempoEntregaEmHoras;
    }

    public abstract boolean podeMudarParaCancelado(double valorPedido); /* o metodo abstrato nao tem implementação */
    /* precisamos sobrescrever esse metodo dentro do bloco da condtante 'Override '*/
}
