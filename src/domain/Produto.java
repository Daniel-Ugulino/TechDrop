package domain;

import execptions.DescontoException;
import execptions.ProdutoException;

public abstract class Produto {
    private Integer codigo;
    private String marca;
    private String modelo;
    private Integer quantidade;
    private Float valor;
    private String bluetooh_cable;
    private Boolean iluminacao;

    public Produto(Integer codigo, Float valor, Integer quantidade) throws ProdutoException {

        if(codigo < 0) {
            throw new ProdutoException("O codigo do produto está invalido!");
        }

        if(valor == 0) {
            throw new ProdutoException("O valor do produto está zerado!");
        }

        if(quantidade <= 0) {
            throw new ProdutoException("A quantidade está com valor invalido ou zerado");
        }

        this.quantidade = quantidade;
        this.valor = valor;
        this.codigo = codigo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Codigo: ");
        sb.append(codigo);
        sb.append(" | Marca: ");
        sb.append(marca);
        sb.append(" | Modelo: ");
        sb.append(modelo);
        sb.append(" | Quantidade: ");
        sb.append(quantidade);
        sb.append(" | Cabo ou Bluetooh: ");
        sb.append(bluetooh_cable);
        sb.append(" | Iluminação: ");
        sb.append(iluminacao ? "RGB" : "Não tem");
        sb.append(" | Valor: ");
        sb.append(valor);
        return sb.toString();
    }


    public void imprimir_pedido(){
        System.out.printf("Produto: %s\n",
                this
        );
    }

    public abstract float calcularDesconto() throws DescontoException;



    public void setMarca(String Marca){this.marca = Marca;}
    public void setModelo(String Modelo){this.modelo = Modelo;}
    public void setQuantidade(Integer qtd){this.quantidade = qtd;}
    public float setValor(Float Valor){return  this.valor = Valor;}
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
