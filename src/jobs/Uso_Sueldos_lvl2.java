package jobs;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Sueldos_lvl2 {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		

		// Instacio les Clases  i poso en el metode constructor els valors dels parametres definits en el mateix que corresponen a les dades de cada treballador 
		
		TipusEmpleats Junior=new TipusEmpleats("Pepito Perez", 1600, 1992, 10,15);
		
		TipusEmpleats Mid=new TipusEmpleats("Laia Gomez", 2500, 1994, 8,10);
		
		TipusEmpleats Senior=new TipusEmpleats("Marina Ferrer", 4000, 2001,03,20);
		
		gerencial Boss=new gerencial("Eudald Ortiz", 8000, 2016,02,30);
		
		gerencial Manager=new gerencial("Paco Salas", 3500, 2018,05,20);
		
		Voluntari volunteer= new Voluntari("Juancho", "Ingeniero electronico");
		
		
		//Poso el percentatge que li correspon a cada treballador de sobresou o reducció
		
		Junior.BajaSueldo(15);
		
		Mid.BajaSueldo(10);
		
		Senior.BajaSueldo(5);
		
		Boss.SubeSueldo(50);
		
		Manager.SubeSueldo(10);
		
		
		//Imprimeixo per pantalla les dades amb els sous corregits d'acord al percentatge que li pertoca a cadascun.
		
		System.out.println("Nombre Jefe: " + Boss.dameNombre() + " ;Sueldo: " + Boss.DameSueldoBoss()+ "€"
				+ " ;Fecha de alta: " + Boss.dameFechaContrato());
		
		System.out.println("Nombre Manager: " + Manager.dameNombre() + " ;Sueldo: " + Manager.DameSueldoManager()+ "€"
				+ " ;Fecha de alta: " + Manager.dameFechaContrato());
		
		System.out.println("Nombre Empleado Junior: " + Junior.dameNombre() + " ;Sueldo: " + Junior.DameSueldoJunior()+ "€"
				+ " ;Fecha de alta: " + Junior.dameFechaContrato());
		
		System.out.println("Nombre Empleado Senior: " + Senior.dameNombre() + " ;Sueldo: " + Senior.DameSueldoSenior()+ "€"
				+ " ;Fecha de alta: " + Senior.dameFechaContrato());
		
		System.out.println("Nombre Empleado Mid: " + Mid.dameNombre() + " ;Sueldo: " + Mid.DameSueldoMid()+ "€"
				+ " ;Fecha de alta: " + Senior.dameFechaContrato());
		
		System.out.println("Nombre Voluntario: " + volunteer.dameNombre()+ " ;Sueldo:" + volunteer.dameDescripcion());
	  
	  

	}

}




abstract class Persones { //faig una classe abstracta que hera el voluntari
	
	public Persones(String nom){
		
		nombre=nom;
		
	}
	
	public String dameNombre(){
		
		return nombre;
		
		
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
	
	
}


	class Empleats extends Persones{ //Hereto la classe persones a empleats.
	
	public Empleats(String nom, double sou, int any, int mes,int dia){ //Metode constructor
		
		super(nom);
		
		sueldo=sou;
		
		GregorianCalendar Calendario = new GregorianCalendar(any, mes-1, dia); //Instancìo la clase gregorianCalendar.
		
		altaContrato=Calendario.getTime(); //Metode que em retorna l'any, mes i dia de la clase GregorianCalendar.
		
	}
	
	public String dameDescripcion(){
		
		return "Este empleado tiene un sueldo de : " + sueldo + "€";
	}

	public String DameNombre(){ //GETTER que em permet retornar la variable nombre encapsulada previment
		
		return nombre;
	}
	
	public double DameSueldo(){ //GETTER que em permet retornar la variable sueldo encapsulada previment
		
		return sueldo;
	}
	
	public Date dameFechaContrato(){ //GETTER que em permet retornar la variable de tipo Date (altaContrato) encapsulada previment
		
		return altaContrato;
	}
	
	public void SubeSueldo(double porcentaje){ //SETTER que em permet establir la formula per calcular el sobresou d'acord al valor que li donem a la variable percentatge del metode main.
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	public void BajaSueldo(double porcentaje){ //SETTER que em permet establir la formula per calcular la reduccio de sou d'acord al valor que li donem a la variable percentatge del metode main.
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo-=aumento;
		
	}
	

	private String nombre;
	
	protected double sueldo;
	
	private Date altaContrato;
	
}




	class TipusEmpleats extends Empleats { //Creo aquesta classe per posar les restriccions de rangs salarials corresponents als 3 tipus d'empleats.
	
	
	public TipusEmpleats(String nom, double sou, int any, int mes, int dia) { // constructor clase Empleats
		
		super(nom, sou, any, mes, dia);
		
		
	}
	

	public double DameSueldoJunior (){ //GETTER

		double sueldoJunior=super.DameSueldo();
		
			if (sueldo <= 1600 && sueldo >= 900){ 
				
				return sueldoJunior;
			}
			
			else {
				
			
				throw new ArithmeticException(" Sueldo fuera de rango para un empleado Junior.");	
				
			}
		
	}
	
	
	
	public double DameSueldoMid (){ //GETTER

		double sueldoMid=super.DameSueldo();
		
			
			if (sueldo <= 2500 && sueldo >= 1800){
				
				return sueldoMid;
				
			}
			
			else {
				
				throw new ArithmeticException(" Sueldo fuera de rango para un empleado Medio.");	
				
				
			}

	}
	
	
	
	public double DameSueldoSenior (){ //GETTER

		double sueldoSenior=super.DameSueldo();
		
			if (sueldo <= 4000 && sueldo >= 2700){
					
				return sueldoSenior;
				
			}
			else {
				
				throw new ArithmeticException(" Sueldo fuera de rango para un empleado Senior.");
				
			}
			
		}
	
	
	}
	
	
	class gerencial extends Empleats {//Creo aquesta classe per posar les bandes salarias corresponents a treballs mes gerencials
		
		
		public gerencial(String nom, double sou, int any, int mes, int dia) { // constructor clase Empleats
			
			super(nom, sou, any, mes, dia);
			
			
		}
	
		public double DameSueldoBoss (){ //GETTER
	
			double sueldoBoss=super.DameSueldo();
			
				if (sueldo >=8000){
					
					
					return sueldoBoss;
					
				}
				else {
					
					throw new ArithmeticException(" Sueldo fuera de rango para un Jefe.");	
					
				}
				
		}
		
		public double DameSueldoManager (){ //GETTER
	
			double sueldoSenior=super.DameSueldo();
			
				if (sueldo <= 5000 && sueldo >= 3000){
					
					
					return sueldoSenior;
					
				}
				else {
					
					throw new ArithmeticException(" Sueldo fuera de rango para un Manager.");	
					
				}
			
		}
		
		
	}
	
	class Voluntari extends Persones{ //Creació de la classe voluntari.
		
		public Voluntari(String nom, String car){
			
			super(nom);
			
			carrera=car;
			
		}
		
		public String dameDescripcion(){
			
			return " Este voluntario esta haciendo la carrera de " + carrera + ".  Los voluntarios no cobran en esta empresa.";
		}
		
		private String carrera;
		
	}
