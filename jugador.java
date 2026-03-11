



public class jugador{



	private static int contador = 0;
	private int id;

	public jugador(String nombre){
		
		contador = contador + 1;
		this.id  = contador;
		this.nombre = nombre;
	}

	public String nombre;
	public int dorsal;;
	public String fecha_nacimiento;
	public float altura;
	public float peso;
	public String equipo;


	public void consultar_id(){

		System.out.println(this.id);

	}

	public void correr(int impulso){
		if(impulso>7){
			System.out.println(this.nombre + " va muy rapido");	

		}
		if(impulso<=7 && impulso > 4){
			System.out.println(this.nombre + " va corriendo medio");

		}
		if(impulso<=4 && impulso > 0){
			System.out.println(this.nombre + " corre despacio");
		
		}
		if(impulso <0){
			System.out.println(this.nombre + " corre demaciado lento");

		}
	}

	public boolean patear(float fuerza, String direccion){

	if(this.nombre == "borre" || this.nombre == "cordoba"){
		return false;
	}	
	
	if(direccion == "buena" && fuerza >5 && fuerza <10 ){
		return true;
	}
	if(direccion == "normal" && fuerza >5 && fuerza <10 ){
		return true;
	}
	if(fuerza >10  || fuerza <3 || direccion!="buena" || direccion !="normal"){
		return false;
	}
	
	return true;
	}

	public boolean pasar(double fuerza, String jugador){

	if(fuerza > 10){
		return false;
	}
	if(fuerza > 5 && fuerza <= 10){
		return true;	
	}
	if(fuerza <= 5){
		return false;
	}
		
	return false;

	}





}


