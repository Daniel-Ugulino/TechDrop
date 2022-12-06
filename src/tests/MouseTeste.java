package tests;

import domain.Mouse;

public class MouseTeste {

    public static void main(String[] args) {

        Mouse teste = new Mouse(1);
        teste.setMarca("Redragon");
        teste.setModelo("Cobra");
        teste.setIluminacao(true);
        teste.setValor(Float.valueOf(200));
        teste.setBluetooh_cable("Cable");
        teste.setQuantidade(1);

        teste.setDpi(10000);
        teste.setPeso(100);
        teste.setQtd_botoes(5);
        teste.imprimir_pedido();

    }
}
