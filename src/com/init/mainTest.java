package com.init;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Cliente cl1 = new Cliente(5, "Pepe", 320000, 55000);
		System.out.println("Cliente:");
		System.out.println("Edad: " + cl1.getEdad());
		System.out.println("Nombre: " + cl1.getNombre());
		System.out.println("telefono: " + cl1.getTelefono());
		System.out.println("Credito: " + cl1.getCredito());
		
		Trabajador tbj1 = new Trabajador(18, "Juan", 320000, 5000);
		System.out.println("Trabajador:");
		System.out.println("Edad: " + tbj1.getEdad());
		System.out.println("Nombre: " + tbj1.getNombre());
		System.out.println("telefono: " +tbj1.getTelefono());
		System.out.println("Credito: " + tbj1.getSalario());
		
		
	}
	
	

	
	
}

class Persona {
	
	private int edad;
	private String nombre;
	private int telefono;
	
	
	
	public Persona(int edad, String nombre, int telefono) {
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}

class Cliente extends Persona{
	private int credito;
	
	public Cliente(int edad, String nombre, int  telefono, int credito) {
		super(edad,nombre,telefono);
		this.credito = credito;
		
		
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}
	
	
	
}

class Trabajador extends Persona{

	private int salario;
	public Trabajador(int edad, String nombre, int telefono, int salario) {
		super(edad, nombre, telefono);
		this.salario = salario;
		// TODO Auto-generated constructor stub
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	
}

