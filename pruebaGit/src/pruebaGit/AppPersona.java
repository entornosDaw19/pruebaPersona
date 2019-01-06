package pruebaGit;

import java.util.Scanner;

public class AppPersona {
	    static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {	    
		        Persona  pers1=new Persona(); 
		        pers1.setNombre("Jose");
		        pers1.setTelefono("777654321");
		        pers1.vis();
		        System.out.println("Los datos de la persona son");
		        System.out.println(pers1.toString());
		    //  Persona persona2=new Persona();
	}

}
