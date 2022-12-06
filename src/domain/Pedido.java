package domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Pedido {
    private String descricao;
    private LocalDateTime date;
    private Float valor_total = 0F ;
    private String pagamento;
    private List<Produto> produtos;
    private Cliente cliente;

    public Pedido(){
        this.date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        calcularValorTotal();
        return String.format("%s\nDescrição: %s | Data da compra: %s | Forma de Pagamento: %s | Valor Total: %.2f\n",
                cliente,descricao,date.format(formatter),pagamento,valor_total
        );
    }

    public void imprimirPedido() {
        String relatorio_produto = "";
        for(Produto produto : produtos){
            relatorio_produto += produto;
        }
        System.out.printf("%s\nProdutos: \n%s",
                this,
                relatorio_produto
        );
    }
    public void calcularValorTotal(){
        // TODO: 06/12/2022 fazer calculo do valor de todos os produtos
        for(Produto produto : produtos){
            this.valor_total += produto.getValor();
        }
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public void setPagamento(String pagamento){this.pagamento = pagamento;}
    public void setCliente(Cliente cliente){this.cliente = cliente;}
    public void setDescricao(String descricao){this.descricao = descricao;}

    public Float getValoTotal(){return this.valor_total;}
    public String getDescricao(){return this.descricao;}
    public String getPagamento(){return this.pagamento;}
    public Cliente getCliente(){return this.cliente;}
    public List<Produto> getProdutos() {
        return produtos;
    }

}
