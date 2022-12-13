package domain;

import execptions.DescontoException;
import execptions.ProdutoException;

public class Mouse extends Produto {
    private Integer dpi;
    private Integer qtd_botoes;
    private Integer peso;

    public Mouse(Integer codigo, Float valor, Integer quantidade) throws ProdutoException {
        super(codigo,valor,quantidade);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMouse\n");
        sb.append(super.toString());
        sb.append("\nEspecificações:");
        sb.append("\nDpi: ");
        sb.append(dpi);
        sb.append(" | Quantidade de Botões: ");
        sb.append(qtd_botoes);
        sb.append(" | Peso: ");
        sb.append(peso);
        sb.append("\n");
        return sb.toString();
    }
    @Override
    public float calcularDesconto() throws DescontoException {
        Float desconto = 0f;

        if(dpi == 0 || qtd_botoes == 0 || peso == 0){
            throw new DescontoException("Não há desconto a ser dado");
        }

        if(dpi < 10000)
        {
            desconto += 10;
        }
        if(qtd_botoes < 8)
        {
            desconto += 10;
        }
        if(peso > 300)
        {
            desconto += 10;
        }
        Float valor = this.getValor();
        Float valor_desconto = valor * (desconto / 100);
        valor = valor - valor_desconto;
        return setValor(valor);
    };



    public void imprimir_pedido(){
        System.out.printf(String.valueOf(this));
    }

    public void setDpi(Integer dpi){this.dpi = dpi;}
    public void setQtd_botoes(Integer qtd){this.qtd_botoes = qtd;}
    public void setPeso(Integer peso){this.peso = peso;}

    public Integer getDpi(){return dpi;}
    public Integer getPeso(){return peso;}

    public Integer getQtd_botoes(){return qtd_botoes;}


}
