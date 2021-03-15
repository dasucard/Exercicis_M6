package jobs;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Sueldos_lvl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instacio les Clases  i poso en el metode constructor els valors dels parametres definits en el mateix que corresponen a les dades de cada treballador 
		
				TipusEmpleats_lvl2 Junior=new TipusEmpleats_lvl2("Pepito Perez", 1600);
				
				TipusEmpleats_lvl2 Mid=new TipusEmpleats_lvl2("Laia Gomez", 2500);
				
				TipusEmpleats_lvl2 Senior=new TipusEmpleats_lvl2("Marina Ferrer", 4000);
				
				gerencial_lvl2 Boss=new gerencial_lvl2("Eudald Ortiz", 8000);
				
				gerencial_lvl2 Manager=new gerencial_lvl2("Paco Salas", 3500);
				
				Volunteer_lvl2 volunteer= new Volunteer_lvl2("Juancho", "Ingeniero electronico");
				
				
				//Poso el percentatge que li correspon a cada treballador de sobresou o reducció
				
				
				Boss.SubeSueldo(50);
				
				Boss.EstableceSueldoNetoMensual(32); //Aplica el IRPF
				
				Boss.EstableceSueldoNetoAnual();
				
				Boss.Bonus(); //Bonus anual.
								
				Manager.SubeSueldo(10);
				
				Manager.EstableceSueldoNetoMensual(26);//Aplica el IRPF
				
				Manager.EstableceSueldoNetoAnual();
				
				Manager.Bonus();
				
				Senior.BajaSueldo(5);
				
				Senior.EstableceSueldoNetoMensual(24);//Aplica el IRPF
				
				Senior.EstableceSueldoNetoAnual();
				
				Senior.Bonus();
				
				Mid.BajaSueldo(10);
				
				Mid.EstableceSueldoNetoMensual(15);//Aplica el IRPF
				
				Mid.EstableceSueldoNetoAnual();
				
				Mid.Bonus();
				
				Junior.BajaSueldo(15);
				
				Junior.EstableceSueldoNetoMensual(2);//Aplica el IRPF
				
				Junior.EstableceSueldoNetoAnual();
				
				Junior.Bonus();

				volunteer.EstableceAyuda();
				
				
				//Imprimeixo per pantalla les dades amb els sous corregits d'acord al percentatge que li pertoca a cadascun.
				//Considero donarlis a tots els empleats el bonus de 10% sobre el seu sou anual :)
				System.out.println("Nombre Jefe: " + Boss.dameNombre() + " ;Sueldo neto Anual: " + Boss.DameSueldoNetoMensual()+ "€; " + "Sueldo Neto Anual: " + Boss.DameSueldoNetoAnual() + "€.");
				System.out.println("Nombre Manager: " + Manager.dameNombre() + " ;Sueldo neto Anual: " + Manager.DameSueldoNetoMensual()+ "€; " + "Sueldo Neto Anual: " + Manager.DameSueldoNetoAnual() + "€.");
				System.out.println("Nombre Senior: " + Senior.dameNombre() + " ;Sueldo neto Anual: " + Senior.DameSueldoNetoMensual()+ "€; " + "Sueldo Neto Anual: " + Senior.DameSueldoNetoAnual() + "€.");
				System.out.println("Nombre Mid: " + Mid.dameNombre() + " ;Sueldo neto Anual: " + Mid.DameSueldoNetoMensual()+ "€; " + "Sueldo Neto Anual: " + Mid.DameSueldoNetoAnual() + "€.");
				System.out.println("Nombre Junior: " + Junior.dameNombre() + " ;Sueldo neto Anual: " + Junior.DameSueldoNetoMensual()+ "€; " + "Sueldo Neto Anual: " + Junior.DameSueldoNetoAnual() + "€.");
				
				System.out.println("Nombre Voluntario: " + volunteer.dameNombre()+ " ;Sueldo:" + volunteer.DameAyuda());
			  	

	}

}

abstract class Persones_lvl2 { //faig una classe abstracta per herenciar el voluntari
	
	public Persones_lvl2(String nom){
		
		nombre=nom;
		
	}
	
	public String dameNombre(){
		
		return nombre;
		
		
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
	
}


class Empleats_lvl2 extends Persones{ //Hereto la classe persones a empleats.
	
public Empleats_lvl2(String nom, double sou_Brut){ //Metode constructor
	
	super(nom);
	
	sueldo=sou_Brut;
	

}

public String dameDescripcion(){
	
	return "Este empleado tiene un sueldo de : " + sueldo + "€";
}

public String DameNombre(){ //GETTER que em permet retornar la variable nombre encapsulada previment
	
	return nombre;
}

public double DameSueldoBrutoMensual(){ //GETTER que em permet retornar la variable sueldo encapsulada previment
	
	return sueldo;
}

public double DameSueldoBrutoAnual(){ //GETTER que em permet retornar la variable sueldo encapsulada previment
	
	SouBrutA=sueldo*12;
	
	return SouBrutA;
}

public void EstableceSueldoNetoMensual(double IRPF){ //SETTER 
	
	double neto=sueldo*IRPF/100;
	
	SouNet = sueldo-=neto;
	
}

public void EstableceSueldoNetoAnual(){ //SETTER 

	SouNetA = SouNet*12;
	
}

public double DameSueldoNetoMensual(){ //GETTER que em permet retornar la variable sueldo encapsulada previment
	
	return SouNet;
}

public double DameSueldoNetoAnual(){ //GETTER que em permet retornar la variable sueldo encapsulada previment
	
	
	return SouNetA;
}


public void SubeSueldo(double porcentaje){ //SETTER que em permet establir la formula per calcular el sobresou d'acord al valor que li donem a la variable percentatge del metode main.
	
	double aumento=sueldo*porcentaje/100;
	
	sueldo+=aumento;
	
}

public void BajaSueldo(double porcentaje){ //SETTER que em permet establir la formula per calcular la reduccio de sou d'acord al valor que li donem a la variable percentatge del metode main.
	
	double aumento=sueldo*porcentaje/100;
	
	sueldo-=aumento;
	
}

public void Bonus(){ //SETTER del bonus anual del 10%
	
	double Bono=SouNetA*10/100;
	
	SouNetA+=Bono;
	
}

public String DameBonus(){
	
	return "Por tu buena disposicion con nuestra empresa te damos un 10% sobre tu sueldo : " + SouNetA;
}







private String nombre;

protected double sueldo;

protected double SouNet;

protected double SouNetA;

protected double SouBrutA;
}

class TipusEmpleats_lvl2 extends Empleats_lvl2 { //Creo aquesta classe per posar les restriccions de rangs salarials corresponents als 3 tipus d'empleats.
	
	
public TipusEmpleats_lvl2(String nom, double sou) { // constructor clase Empleats
	
	super(nom, sou);
	
	
}


public double DameSueldoJunior (){ //GETTER

	double sueldoJunior=super.DameSueldoBrutoMensual();
	
		if (sueldo <= 1600 && sueldo >= 900){ 
			
			return sueldoJunior;
		}
		
		else {
			
		
			throw new ArithmeticException(" Sueldo fuera de rango para un empleado Junior.");	
			
		}
	
}



public double DameSueldoMid (){ //GETTER

	double sueldoMid=super.DameSueldoBrutoMensual();
	
		
		if (sueldo <= 2500 && sueldo >= 1800){
			
			return sueldoMid;
			
		}
		
		else {
			
			throw new ArithmeticException(" Sueldo fuera de rango para un empleado Medio.");	
			
			
		}

}



public double DameSueldoSenior (){ //GETTER

	double sueldoSenior=super.DameSueldoBrutoMensual();
	
		if (sueldo <= 4000 && sueldo >= 2700){
				
			return sueldoSenior;
			
		}
		else {
			
			throw new ArithmeticException(" Sueldo fuera de rango para un empleado Senior.");
			
		}
		
	}


}


class gerencial_lvl2 extends Empleats_lvl2 {//Creo aquesta classe per posar les bandes salarias corresponents a treballs mes gerencials
	
	
	public gerencial_lvl2(String nom, double sou) { // constructor clase Empleats
		
		super(nom, sou);
		
		
	}

	public double DameSueldoBoss (){ //GETTER

		double sueldoBoss=super.DameSueldoBrutoMensual();
		
			if (sueldo >=8000){
				
				
				return sueldoBoss;
				
			}
			else {
				
				throw new ArithmeticException(" Sueldo fuera de rango para un Jefe.");	
				
			}
			
	}
	
	public double DameSueldoManager (){ //GETTER

		double sueldoSenior=super.DameSueldoBrutoMensual();
		
			if (sueldo <= 5000 && sueldo >= 3000){
				
				
				return sueldoSenior;
				
			}
			else {
				
				throw new ArithmeticException(" Sueldo fuera de rango para un Manager.");	
				
			}
		
	}
	
	
}

class Volunteer_lvl2 extends Persones_lvl2{ //Creació de la classe voluntari.
	
	public Volunteer_lvl2(String nom, String car){
		
		super(nom);
		
		carrera=car;
		
	}
	
	public String DameAyuda(){ //GETTER
		
		return " El voluntario recibira una ayuda de: " + Ajut + " €.";
	}
	
	public void EstableceAyuda(){ //SETTER
		
		Ajut = 300;
	}
	
	public String dameDescripcion(){
		
		return " Este voluntario esta haciendo la carrera de " + carrera + ".  Los voluntarios no cobran en esta empresa.";
	}
	
	private String carrera;
	
	private int Ajut;
}


