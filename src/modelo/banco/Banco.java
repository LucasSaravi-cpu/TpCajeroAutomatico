package modelo.banco;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import modelo.atm.TarjetaATM;
import modelo.cuenta.Cuenta;
import modelo.usuario.Usuario;

public class Banco {
	
	private String nombre;
	private BigInteger minRango;
	private BigInteger maxRango;
	private List<TarjetaATM> tarjetas;
	private List <Usuario> clientes;
	
	
	

	public Banco(String nombre, BigInteger minRango, BigInteger maxRango) {
		super();
		this.nombre = nombre;
		this.minRango = minRango;
		this.maxRango = maxRango;
		this.tarjetas = new ArrayList<TarjetaATM>();
		this.clientes = new ArrayList<Usuario>();
		
	}

	 public void agregarTarjetaATM(TarjetaATM tarjeta) {
	        tarjetas.add(tarjeta);
	    }

	 public void agregarUsuario(Usuario usuario) {
	        clientes.add(usuario);
	    }

	


	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public BigInteger getMinRango() {
		return minRango;
	}





	public void setMinRango(BigInteger minRango) {
		this.minRango = minRango;
	}





	public BigInteger getMaxRango() {
		return maxRango;
	}





	public void setMaxRango(BigInteger maxRango) {
		this.maxRango = maxRango;
	}




	public void setTarjetas(ArrayList<TarjetaATM> tarjetas) {
		this.tarjetas = tarjetas;
	}





	public List<Usuario> getUsuarios() {
		return clientes;
	}





	public void setUsuarios(List<Usuario> usuarios) {
		this.clientes = usuarios;
	}





	public void setTarjetas(List<TarjetaATM> tarjetas) {
		this.tarjetas = tarjetas;
	}





	public void validar (BigInteger idTarjeta , int PIN) {}

}
