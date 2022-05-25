package controle;

import org.junit.Assert;

import dominio.Avaliador;
import dominio.Lance;
import dominio.Leilao;
import dominio.Usuario;

public class Programa {

	public static void main(String[] args) {
        //Usuários
        Usuario arthur = new Usuario("Arthur");
        Usuario emilia = new Usuario("Emilia");
        Usuario carlos = new Usuario("Carlos");
        
        Leilao leilao = new Leilao("Playstation 4");
        
        leilao.propoe(new Lance(carlos, 350.0));
        leilao.propoe(new Lance(emilia, 600.0));
        leilao.propoe(new Lance(arthur, 1400.0));
        
        //Ação
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        System.out.println("Objeto do Leilão: " + leilao.getDescricao());
        System.out.println("Lance ganhador: " + leiloeiro.getMaiorLance());
        System.out.println("Ganhador: " + leiloeiro.getGanhador().getNome());
	}

}
