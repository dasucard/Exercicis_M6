package jobs;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleats_LVL1 {

	private String nombre;
	
	protected double sueldo;
	
	private Date altaContrato;
	
	
	public Empleats_LVL1(String nom, double sou, int any, int mes,int dia){ //Metode constructor
		
		nombre=nom;
		
		sueldo=sou;
		
		GregorianCalendar Calendario = new GregorianCalendar(any, mes-1, dia); //Instancìo la clase gregorianCalendar.
		
		altaContrato=Calendario.getTime(); //Metode que em retorna l'any, mes i dia de la clase GregorianCalendar.
		
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
}
