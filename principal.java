import java.util.Scanner;

public class principal{
	public static void main(String[] args){

		jugador jugador_uno = new jugador("borre");
		jugador_uno.consultar_id();
		jugador_uno.correr(10);
		if(jugador_uno.patear(5,"buena")){
			
			System.out.println("gol");

		}
		else{
			System.out.println("no gol");
		}

		if(jugador_uno.pasar(5.7,"james")){
			System.out.println("buen pase");
		}
		else{
			System.out.println("mal pase");

		}


	}






}
