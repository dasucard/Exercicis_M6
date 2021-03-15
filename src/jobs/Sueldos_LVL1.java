package jobs;

public class Sueldos_LVL1 {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		

		// Instacio la Clase empleats i poso en el metode constructor els valors dels parametres definits en el mateix que corresponen a les dades de cada treballador 
		Empleats Boss=new Empleats("Pepito Perez", 6000, 1992, 10,15);
		
		Empleats Manager=new Empleats("Laia Gomez", 4000, 1994, 8,10);
		
		Empleats Employee=new Empleats("Marina Ferrer", 2500, 2001,03,20);
		
		Empleats Volunteer=new Empleats("Eudald Ortiz", 0, 2016,02,30);
		
		
		//Poso el percentatge que li correspon a cada treballador de sobresou o reducció
		Boss.SubeSueldo(50);
		
		Manager.SubeSueldo(10);
		
		Employee.BajaSueldo(15);
		
		//Imprimeixo per pantalla les dades amb els sous corregits d'acord al percentatge que li pertoca a cadascun.
		System.out.println("Nombre Jefe: " + Boss.DameNombre() + " ;Sueldo: " + Boss.DameSueldo()+ "€"
				+ " ;Fecha de alta: " + Boss.dameFechaContrato());
		
		System.out.println("Nombre Manager: " + Manager.DameNombre() + " ;Sueldo: " + Manager.DameSueldo()+ "€"
				+ " ;Fecha de alta: " + Manager.dameFechaContrato());
		
		System.out.println("Nombre Empleado: " + Employee.DameNombre() + " ;Sueldo: " + Employee.DameSueldo()+ "€"
				+ " ;Fecha de alta: " + Employee.dameFechaContrato());
		
		System.out.println("Nombre Voluntario: " + Volunteer.DameNombre() + " ;Sueldo: " + Volunteer.DameSueldo()+ "€"
				+ " ;Fecha de alta: " + Volunteer.dameFechaContrato());
	  
	  

}

}
