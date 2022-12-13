package tests;

import domain.Headset;
import domain.Mouse;
import execptions.DescontoException;
import execptions.ProdutoException;

public class HeadsetTeste {
    public static void main(String[] args) {

        //Caso normal
        try {
            Headset p1 = new Headset(0,350F,1);
            p1.setMarca("Redragon");
            p1.setModelo("Zeus");
            p1.setBluetooh_cable("Cable");
            p1.setIluminacao(true);

            p1.setSom("Surround 7.1");
            p1.setSensibilidade("98 ± 3dB S.P.L. at 1KHz");
            p1.setFrequencia("50Hz até 20000Hz");
            p1.setCancelamentoRuido("Sim");
            p1.calcularDesconto();
            p1.imprimir_pedido();
        }catch (ProdutoException | DescontoException e) {
            System.out.println("\n[ERRO] " + e.getMessage());
        }

        //Caso de desconto
        try {
            Headset p2 = new Headset(1,350F,1);
            p2.setMarca("Redragon");
            p2.setModelo("Zeus");
            p2.setBluetooh_cable("Cable");
            p2.setIluminacao(true);

            p2.setSom("Stereo");
            p2.setFrequencia("baixa");
            p2.setSensibilidade("alta");
            p2.setCancelamentoRuido("Não");
            p2.calcularDesconto();
            p2.imprimir_pedido();

        }catch (ProdutoException | DescontoException e) {
            System.out.println("\n[ERRO] " + e.getMessage());
        }

        //Caso de erro com quantidade errada
        try {
            Headset p3 = new Headset(5,400F,0);
            p3.setMarca("Redragon");
            p3.setModelo("Zeus");
            p3.setBluetooh_cable("Cable");
            p3.setIluminacao(true);

            p3.setSom("Surround 7.1");
            p3.setSensibilidade("98 ± 3dB S.P.L. at 1KHz");
            p3.setFrequencia("50Hz até 20000Hz");
            p3.setCancelamentoRuido("Sim");
            p3.calcularDesconto();
            p3.imprimir_pedido();
        }catch (ProdutoException | DescontoException e) {
            System.out.println("\n[ERRO] " + e.getMessage());
        }

    }
}
