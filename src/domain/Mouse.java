package domain;

public class Mouse extends Produto {
    private Integer dpi;
    private Integer qtd_botoes;
    private Integer peso;

    public Mouse(Integer codigo) {
        super(codigo);
    }

    public String toString() {
        return String.format("\nMouse\n%sEspecificações:\nDpi: %d | Quantidade de Botões: %d | Peso: %d gramas\n",
                super.toString(),dpi,qtd_botoes,peso
        );
    }

    public float calcularDesconto(Integer desconto){
        return 0f;
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
