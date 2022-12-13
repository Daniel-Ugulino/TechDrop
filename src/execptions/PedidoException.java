package execptions;

public class PedidoException extends Exception{
    private static final long serialVersionUID = 1L;

    public PedidoException(String mensagem) {
        super(mensagem);
    }
}
