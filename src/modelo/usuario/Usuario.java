package modelo.usuario;

import java.util.ArrayList;

import modelo.cuenta.Cuenta;





public class Usuario {
	
	private Integer id;
	private String apellido;
	private String nombre;
	private ArrayList<Cuenta> listaCuentas;
	
	public Usuario(Integer id, String apellido, String nombre) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.listaCuentas = new ArrayList<Cuenta>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Cuenta> getListaCuentas() {
		return listaCuentas;
	}

	public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}
    
	
	

	
	
	

}
