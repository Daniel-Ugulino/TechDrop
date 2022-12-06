package tests;

import domain.*;

import java.util.ArrayList;
import java.util.List;

public class PedidoTeste {
    public static void main(String[] args) {
        Headset p1 = new Headset(0);
        p1.setMarca("Redragon");
        p1.setModelo("Zeus");
        p1.setBluetooh_cable("Cable");
        p1.setValor(350F);
        p1.setIluminacao(true);
        p1.setQuantidade(1);


        p1.setSom("Surround 7.1");
        p1.setSensibilidade("98 ± 3dB S.P.L. at 1KHz");
        p1.setFrequencia("50Hz até 20000Hz");
        p1.setCancelamentoRuido("Sim");

        Mouse p2 = new Mouse(1);
        p2.setMarca("Redragon");
        p2.setModelo("Cobra");
        p2.setBluetooh_cable("Cable");
        p2.setValor(150F);
        p2.setIluminacao(true);
        p2.setQuantidade(1);

        p2.setDpi(10000);
        p2.setQtd_botoes(8);
        p2.setPeso(26);

        Teclado p3 = new Teclado(3);
        p3.setMarca("Redragon");
        p3.setModelo("Mitra");
        p3.setBluetooh_cable("Cable");
        p3.setValor(250F);
        p3.setIluminacao(true);
        p3.setQuantidade(1);

        p3.setGhosting("Full");
        p3.setTipo("Mecanico");
        p3.setSwitch_type("Brown");

        Cliente c1 = new Cliente("Daniel","190.737.607-04",20,"Sahy","23860000");

        List<Produto> listaProdutos = new ArrayList<Produto>();
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);

        try {
            Pedido pedido = new Pedido();
            pedido.setCliente(c1);
            pedido.setProdutos(listaProdutos);
            pedido.setPagamento("Cartão");
            pedido.setDescricao("Compras de perifericos");
            pedido.calcularValorTotal();
            pedido.imprimirPedido();
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }

    }
}
