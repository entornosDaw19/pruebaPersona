package pruebaGit;

public class Persona 
{
	private String nombre;
	private String telefono;

	
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nomb)
	{
		nombre = nomb;
	}
	
	public String getTelefono()
	{
		return telefono;
	}
	
	public void setTelefono(String tel) 
	{
		telefono = tel;
	}
	//visualizar
	public void vis()
	{
		System.out.println("Nombre: "+ nombre +" Telefono: "+telefono);
	}
	
	public String toString ()
	{
		return "nombre= "+nombre+" Telefono "+telefono;
	}
}
	
	

