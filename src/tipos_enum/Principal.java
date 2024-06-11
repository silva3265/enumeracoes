package tipos_enum;

public class Principal {

    public static void main(String[] args) {
//        System.out.println(StatusPedido.EMITIDO.ordinal()); 
//        System.out.println(StatusPedido.EMITIDO.name());

//        for (StatusPedido status : StatusPedido.values()) {
//            System.out.printf("%d - %s%n", status.ordinal(), status.name());
//        }

//        String textoStatus = "CANCELADO";
//        StatusPedido status = StatusPedido.valueOf(textoStatus); /* Vai converter ums String para 'Status pedido'*/
//        System.out.println(status.ordinal() + " - " + status.name()); /* vai printar na tela */

        int numero = 1;
        StatusPedido status = StatusPedido.values()[numero];
        System.out.println(status.ordinal() + " - " + status.name());
    }

}
