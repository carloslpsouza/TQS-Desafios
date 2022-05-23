
package dominio;

public class Lance {

    private Usuario usuario;
    private double valor;
    
    public Usuario getUsuario() {
        return usuario;
    }

    public double getValor() {
        return valor;
    }
    
    public Lance(Usuario usuario, double valor) {
        this.usuario = usuario;
        this.valor = valor;
    }    
    
}