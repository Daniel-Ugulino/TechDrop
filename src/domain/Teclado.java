package domain;

import execptions.DescontoException;
import execptions.ProdutoException;

public class Teclado extends Produto {

    private String tipo;
    private String switch_type;
    private String ghosting;

    public Teclado(Integer codigo, Float valor, Integer quantidade) throws ProdutoException {
        super(codigo,valor,quantidade);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTeclado\n");
        sb.append(super.toString());
        sb.append("\nEspecificações: ");
        sb.append("\nTipo de Teclado: ");
        sb.append(tipo);
        sb.append(" | Tipo de Switch: ");
        sb.append(switch_type);
        sb.append(" | Nivel de Ghosting: ");
        sb.append(ghosting);
        sb.append("\n");
        return sb.toString();
    }
    public void imprimir_pedido(){
        System.out.printf(String.valueOf(this));
    }

    public float calcularDesconto() throws DescontoException {
        Float desconto = 0f;

        if(tipo == "" || switch_type == "" || ghosting == ""){
            throw new DescontoException("Não é possivel gerar desconto, os campos estão invalidos");
        }

        if(tipo.equalsIgnoreCase( "membrana"))
        {
            desconto += 10;
        }
        if(switch_type.equalsIgnoreCase("nenhum"))
        {
            desconto += 10;
        }
        if(ghosting.equalsIgnoreCase("nenhum"))
        {
            desconto += 10;
        }

        Float valor = this.getValor();
        Float valor_desconto = valor * (desconto / 100);
        valor = valor - valor_desconto;
        return setValor(valor);
    };


    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setSwitch_type(String switch_type){
        this.switch_type = switch_type;
    }
    public void setGhosting(String ghosting){
        this.ghosting = ghosting;
    }

    public String getTipo(){
        return tipo;
    }
    public String getSwitch_type(){
        return switch_type;
    }
    public String getGhosting(){
        return ghosting;
    }

}
