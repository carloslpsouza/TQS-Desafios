
package dominio;

public class Avaliador {
    
    private double maiorDeTodos = Double.NEGATIVE_INFINITY;
    private double menorDeTodos = Double.POSITIVE_INFINITY;
    private Usuario ganhador;
    
    public double getMaiorLance(){
    	return maiorDeTodos;
    }

    public double getMenorLance() {
    	return menorDeTodos;
    }
    
    public Usuario getGanhador() {
    	return ganhador;
    }
    
    public void avalia(Leilao leilao){
        for(Lance lance : leilao.getLances()){
            if(lance.getValor() > maiorDeTodos) { 
            	maiorDeTodos = lance.getValor();
            	ganhador = lance.getUsuario();            
            }
            if (lance.getValor() < menorDeTodos) menorDeTodos = lance.getValor();
        }
    }
}