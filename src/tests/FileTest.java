package tests;

import domain.*;
import execptions.ClienteException;
import execptions.DescontoException;
import execptions.PedidoException;
import execptions.ProdutoException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileTest {
    public static void main(String[] args) {

        try {
            String arq = "pedidos.txt";

            try {
                FileReader fileR = new FileReader(arq);
                BufferedReader leitura = new BufferedReader(fileR);

                FileWriter fileW = new FileWriter("out_"+arq);
                BufferedWriter escrita = new BufferedWriter(fileW);

                String linha = leitura.readLine();
                String[] campos = null;

                List<Produto> produtos = new ArrayList<Produto>();
                Pedido pedido = null;

                while(linha != null) {

                    campos = linha.split(";");

                    switch (campos[0].toUpperCase()) {
                        case "P":
                            try {
                                pedido = new Pedido(new Cliente(campos[1], campos[2], Integer.valueOf(campos[3]),campos[4],campos[5]), produtos);
                                pedido.setDescricao(campos[6]);
                                pedido.setPagamento(campos[7]);
                            } catch (ClienteException | PedidoException e) {
                                System.out.println("[ERRO] " + e.getMessage());
                            }

                            break;
                        case "H":
                            try {
                                Headset headset = new Headset(Integer.valueOf(campos[1]), Float.valueOf(campos[5]), Integer.valueOf(campos[4]));
                                headset.setMarca(campos[2]);
                                headset.setModelo(campos[3]);
                                headset.setBluetooh_cable(campos[6]);
                                headset.setIluminacao(Boolean.valueOf(campos[7]));

                                headset.setSom(campos[8]);
                                headset.setFrequencia(campos[9]);
                                headset.setSensibilidade(campos[10]);
                                headset.setCancelamentoRuido(campos[11]);

                                headset.calcularDesconto();

                                produtos.add(headset);

                            } catch (ProdutoException | DescontoException e) {
                                System.out.println("[ERRO] " + e.getMessage());
                            }

                            break;
                        case "M":
                            try {
                                Mouse mouse = new Mouse(Integer.valueOf(campos[1]), Float.valueOf(campos[5]), Integer.valueOf(campos[4]));
                                mouse.setMarca(campos[2]);
                                mouse.setModelo(campos[3]);
                                mouse.setIluminacao(Boolean.valueOf(campos[7]));
                                mouse.setBluetooh_cable(campos[6]);

                                mouse.setDpi(Integer.valueOf(campos[8]));
                                mouse.setQtd_botoes(Integer.valueOf(campos[9]));
                                mouse.setPeso(Integer.valueOf(campos[10]));

                                mouse.calcularDesconto();

                                produtos.add(mouse);

                            } catch (ProdutoException | DescontoException e) {
                                System.out.println("[ERRO] " + e.getMessage());
                            }
                            break;
                        case "T":
                            try {
                                Teclado teclado = new Teclado(Integer.valueOf(campos[1]), Float.valueOf(campos[5]), Integer.valueOf(campos[4]));

                                teclado.setMarca(campos[2]);
                                teclado.setModelo(campos[3]);
                                teclado.setIluminacao(Boolean.valueOf(campos[7]));
                                teclado.setBluetooh_cable(campos[6]);

                                teclado.setTipo(campos[8]);
                                teclado.setSwitch_type(campos[9]);
                                teclado.setGhosting(campos[10]);

                                teclado.calcularDesconto();

                                produtos.add(teclado);

                            } catch (ProdutoException | DescontoException e) {
                                System.out.println("[ERRO] " + e.getMessage());
                            }
                            break;

                        default:
                            System.out.println("Registro inválido!!!");
                            break;
                    }

                    linha = leitura.readLine();
                }

                escrita.write(pedido.obterLinha());

                escrita.close();
                leitura.close();
                fileR.close();
            } catch (IOException e) {
                System.out.println("[ERRO] " + e.getMessage());
            }
        } finally {
            System.out.println("Processamento realizado com sucesso!!!");
        }
    }
}
