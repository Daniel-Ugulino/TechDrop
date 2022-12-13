package domain;

import execptions.DescontoException;
import execptions.ProdutoException;

public class Headset extends Produto {

    private String som;
    private String frequencia;
    private String sensibilidade;

    private String cancelamentoRuido;


    public Headset(Integer codigo, Float valor, Integer quantidade) throws ProdutoException {
        super(codigo,valor,quantidade);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nHeadset\n");
        sb.append(super.toString());
        sb.append("\nEspecificações: ");
        sb.append("\nSom: ");
        sb.append(som);
        sb.append(" | Frequencia: ");
        sb.append(frequencia);
        sb.append(" | Sensibilidade do Microfone: ");
        sb.append(sensibilidade);
        sb.append(" | Cancelamento de Ruido: ");
        sb.append(cancelamentoRuido);
        sb.append("\n");
        return sb.toString();
    }

    public void imprimir_pedido(){
        System.out.printf(String.valueOf(this));
    }

    public float calcularDesconto() throws DescontoException {
        Float desconto = 0f;

        if(som == "" || frequencia == "" || sensibilidade == "" || cancelamentoRuido == ""){
            throw new DescontoException("Não é possivel gerar desconto, os campos estão invalidos");
        }

        if(som.equalsIgnoreCase("Stereo"))
        {
            desconto += 10;
        }
        if(frequencia.equalsIgnoreCase("baixa"))
        {
            desconto += 10;
        }
        if(sensibilidade.equalsIgnoreCase("alta"))
        {
            desconto += 10;
        }
        if(cancelamentoRuido.equalsIgnoreCase("Não"))
        {
            desconto += 10;
        }
        Float valor = this.getValor();
        Float valor_desconto = valor * (desconto / 100);
        valor = valor - valor_desconto;
        return setValor(valor);
    };

    public void setSom(String som){
        this.som = som;
    }
    public void setFrequencia(String frequencia){
        this.frequencia = frequencia;
    }
    public void setSensibilidade(String sensibilidade){
        this.sensibilidade = sensibilidade;
    }
    public void setCancelamentoRuido(String cancelamentoRuido){
        this.cancelamentoRuido = cancelamentoRuido;
    }

    public String getSensibilidade(){
        return sensibilidade;
    }
    public String getFrequencia(){
        return frequencia;
    }
    public String getSom(){
        return som;
    }
    public String getCancelamentoRuido(){
        return cancelamentoRuido;
    }

}
