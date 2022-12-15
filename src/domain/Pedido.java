package domain;

import execptions.PedidoException;

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

    public Pedido(Cliente cliente, List<Produto> produtos) throws PedidoException {

        if(cliente == null) {
            throw new PedidoException("Não existe cliente associado ao pedido!");
        }

        if(produtos == null) {
            throw new PedidoException("Não existe nenhum produto associado ao pedido!");
        }

        this.cliente = cliente;
        this.produtos = produtos;
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

    public String imprimirPedido() {
        String relatorio_produto = "";
        for(Produto produto : produtos){
            relatorio_produto += produto;
        }
        return this+"\nProdutos\n"+ relatorio_produto;
    }
    public float calcularValorTotal(){
        for(Produto produto : produtos){
            this.valor_total += produto.getValor();
        }
        return this.valor_total;
    }

    public String obterLinha() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/yyyy");

        return this.getData().format(formato)+";"+
                this.getDescricao()+";"+
                this.getPagamento()+";"+
                this.getCliente().getNome()+";"+
                this.getProdutos().size()+";"+
                this.calcularValorTotal() + "\r\n";
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public void setPagamento(String pagamento){this.pagamento = pagamento;}
    public void setCliente(Cliente cliente){this.cliente = cliente;}
    public void setDescricao(String descricao){this.descricao = descricao;}

    public Float getValorTotal(){return this.valor_total;}
    public String getDescricao(){return this.descricao;}
    public String getPagamento(){return this.pagamento;}
    public Cliente getCliente(){return this.cliente;}
    public List<Produto> getProdutos() {
        return produtos;
    }
    public LocalDateTime getData() {
        return date;
    }
}
