import java.util.Scanner;

public class principal{
	public static void main(String[] args){
		//juador uno: borre
		jugador jugador_uno = new jugador("borre");
		jugador_uno.dorsal = 12;
		jugador_uno.fecha_nacimiento = "14/01/2000";
		jugador_uno.altura = 1.70;
		jugador_uno.peso = 70.0;
		jugador_uno.equipo = "internacional de brazil";



		//juador dos: diaz
                jugador jugador_dos = new jugador("diaz");
                jugador_dos.dorsal = 14;
                jugador_dos.fecha_nacimiento = "30/11/1998";
                jugador_dos.altura = 1.80;
                jugador_dos.peso = 60.0;
                jugador_dos.equipo = "bayern";

		

		//juador tres: james
                jugador jugador_tres = new jugador("james");
                jugador_tres.dorsal = 10;
                jugador_tres.fecha_nacimiento = "20/06/1996";
                jugador_tres.altura = 1.82;
                jugador_tres.peso = 75.0;
                jugador_tres.equipo = "ni idea";
		
	
		//mostrar los datos

		jugador_uno.informacion();
		jugador_dos.informacion();
		jugador_tres.informacion();








		// acciones
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
