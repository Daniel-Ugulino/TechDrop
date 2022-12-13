package tests;

import domain.Mouse;
import execptions.DescontoException;
import execptions.ProdutoException;

public class MouseTeste {

    public static void main(String[] args) {

        //Caso normal
        try {
            Mouse teste = new Mouse(1, Float.valueOf(200), 1);
            teste.setMarca("Redragon");
            teste.setModelo("Cobra");
            teste.setIluminacao(true);
            teste.setBluetooh_cable("Cable");
            teste.setQuantidade(1);

            teste.setDpi(10000);
            teste.setPeso(200);
            teste.setQtd_botoes(8);
            teste.calcularDesconto();
            teste.imprimir_pedido();
        }catch (ProdutoException | DescontoException e) {
            System.out.println("[ERRO] " + e.getMessage());
        }

        //Caso de desconto
        try {
            Mouse teste2 = new Mouse(2, Float.valueOf(300), 1);
            teste2.setMarca("Redragon");
            teste2.setModelo("Cobra");
            teste2.setIluminacao(true);
            teste2.setBluetooh_cable("Cable");
            teste2.setQuantidade(1);

            teste2.setDpi(5000);
            teste2.setPeso(500);
            teste2.setQtd_botoes(5);
            teste2.calcularDesconto();
            teste2.imprimir_pedido();

        }catch (ProdutoException | DescontoException e) {
            System.out.println("\n[ERRO] " + e.getMessage());
        }

        //Caso de erro com codigo invalido
        try {
            Mouse teste3 = new Mouse(-1, Float.valueOf(0), -1);
            teste3.setMarca("Redragon");
            teste3.setModelo("Cobra");
            teste3.setIluminacao(true);
            teste3.setBluetooh_cable("Cable");
            teste3.setQuantidade(1);

            teste3.setDpi(10000);
            teste3.setPeso(100);
            teste3.setQtd_botoes(5);
            teste3.calcularDesconto();
            teste3.imprimir_pedido();

        }catch (ProdutoException | DescontoException e) {
            System.out.println("\n[ERRO] " + e.getMessage());
        }

    }
}
