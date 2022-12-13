package tests;

import domain.*;
import execptions.ClienteException;
import execptions.PedidoException;
import execptions.ProdutoException;

import java.util.ArrayList;
import java.util.List;

public class PedidoTeste {
    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<Produto>();

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
            listaProdutos.add(p1);

        }
        catch (ProdutoException e){
            System.out.println("[ERRO] " + e.getMessage());
        }

        try {
            Mouse p2 = new Mouse(1, Float.valueOf(200), 1);
            p2.setMarca("Redragon");
            p2.setModelo("Cobra");
            p2.setBluetooh_cable("Cable");
            p2.setIluminacao(true);

            p2.setDpi(10000);
            p2.setQtd_botoes(8);
            p2.setPeso(26);
            listaProdutos.add(p2);

        }
        catch (ProdutoException e){
            System.out.println("[ERRO] " + e.getMessage());
        }

        try {
            Teclado p3 = new Teclado(3,250F,1);
            p3.setMarca("Redragon");
            p3.setModelo("Mitra");
            p3.setBluetooh_cable("Cable");
            p3.setIluminacao(true);

            p3.setGhosting("Full");
            p3.setTipo("Mecanico");
            p3.setSwitch_type("Brown");
            listaProdutos.add(p3);
        }
        catch (ProdutoException e){
            System.out.println("[ERRO] " + e.getMessage());
        }
        try {
            Pedido pedido = new Pedido(new Cliente("Daniel","190.737.607-04",20,"Sahy","23860000"),listaProdutos);
            pedido.setProdutos(listaProdutos);
            pedido.setPagamento("Cartão");
            pedido.setDescricao("Compras de perifericos");
            System.out.println(pedido.imprimirPedido());
        } catch (PedidoException | ClienteException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }

    }
}
