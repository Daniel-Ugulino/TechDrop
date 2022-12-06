package domain;

public class Teclado extends Produto {

    private String tipo;
    private String switch_type;
    private String ghosting;

    public Teclado(Integer codigo) {
        super(codigo);
    }

    public String toString() {
        return String.format("\nTeclado\n%sEspecificações: \nTipo de Teclado: %s | Tipo de Switch: %s | Nivel de Ghosting: %s\n",
                super.toString(),tipo,switch_type,ghosting
        );
    }
    public void imprimir_pedido(){
        System.out.printf(String.valueOf(this));
    }

    public float calcularDesconto(Integer desconto){
        return 0f;
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
