/*
 * 3.Certo aço é classificado de acordo com o resultado de três testes, que 
 * devem verificar se o mesmo satisfaz as seguintes especificações:
 *Teste 1- conteúdo de carbono abaixo de 7%;
 *Teste 2- dureza Rokwell maior que 50;
 *Teste 3- resistência à tração maior do que 80.000 psi.

 *Ao aço é atribuído o grau 10, se passa pelos três testes;
 *9, se passa apenas nos testes 1 e 2; 
 *8 , se passa no teste 1; 
 *e 7, para as outras alternativas. 

 *Supondo que sejam lidos de uma unidade de entrada o número de amostra, 
 *conteúdo de carbono, a dureza Rokwell e a resistência a tração fará um
 *programa que leia os dados de uma amostra de aço, escrevendo para ela 
 *o grau obtido
*/

package controle;
import java.util.Scanner;
import dominio.Amostra;

public class ControlaAmostra {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o codigo da amostra: ");
		int codigo = leia.nextInt();
		System.out.print("O conte�do de carbono.....: ");
		int carbono = leia.nextInt();
		System.out.print("A dureza Rokwell..........: ");
		int dureza = leia.nextInt();
		System.out.print("A resist�ncia a tra��o....: ");
		int resistencia = leia.nextInt();

		leia.close();
		
		Amostra amostra = new Amostra(codigo, carbono, dureza, resistencia);
		System.out.print("Grau da amostra do a��o....: "+ amostra.informaGrau());
	}

}
