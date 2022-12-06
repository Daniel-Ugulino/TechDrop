package domain;

public abstract class Produto {
    private Integer codigo;
    private String marca;
    private String modelo;
    private Integer quantidade;
    private Float valor;
    private String bluetooh_cable;
    private Boolean iluminacao;

    public Produto(Integer codigo){
        this.codigo = codigo;
    }

    public String toString() {
        return String.format("Id: %d | Marca: %s | Modelo: %s | Quantidade: %d | Cabo ou Bluetooh: %s | Iluminação: %s | Valor: %.2f\n",
                codigo,marca,modelo,quantidade,bluetooh_cable, iluminacao ? "RGB" : "Não tem",valor
        );
    }


    public void imprimir_pedido(){
        System.out.printf("Produto: %s\n",
                this
        );
    }

    public abstract float calcularDesconto(Integer desconto);



    public void setMarca(String Marca){this.marca = Marca;}
    public void setModelo(String Modelo){this.modelo = Modelo;}
    public void setQuantidade(Integer qtd){this.quantidade = qtd;}
    public void setValor(Float Valor){this.valor = Valor;}
    public void setBluetooh_cable(String bluetooh_cable){this.bluetooh_cable = bluetooh_cable;}
    public void setIluminacao(Boolean iluminacao){this.iluminacao = iluminacao;}

    public Float getValor(){return this.valor;}
    public String getModelo(){return modelo;}
    public String getMarca(){return marca;}
    public Integer getCodigo(){return codigo;}
    public Integer getQuantidade(){return quantidade;}
    public String getBluetooh_cable(){return bluetooh_cable;}
    public Boolean getIluminacao(){return iluminacao;}




}
