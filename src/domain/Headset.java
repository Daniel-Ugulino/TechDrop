package domain;

public class Headset extends Produto {

    private String som;
    private String frequencia;
    private String sensibilidade;

    private String cancelamentoRuido;


    public Headset(Integer codigo) {
        super(codigo);
    }

    public String toString() {
        return String.format("\nHeadset\n%sEspecificações: \nSom: %s | Frquencia: %s | Sensibilidade do Microfone: %s | Cancelamento de Ruido: %s\n",
                super.toString(),som,frequencia,sensibilidade,cancelamentoRuido
        );
    }

    public void imprimir_pedido(){
        System.out.printf(String.valueOf(this));
    }

    public float calcularDesconto(Integer desconto){
        return 0f;
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
