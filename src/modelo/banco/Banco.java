package modelo.banco;

import java.math.BigInteger;
import java.util.ArrayList;

import modelo.atm.TarjetaATM;
import modelo.cuenta.Cuenta;

public class Banco {
	
	private String nombre;
	private BigInteger minRango;
	private BigInteger maxRango;
	private ArrayList<TarjetaATM> tarjetas;
	
	
	
	
	
	public Banco(String nombre, BigInteger minRango, BigInteger maxRango) {
		super();
		this.nombre = nombre;
		this.minRango = minRango;
		this.maxRango = maxRango;
		this.tarjetas = new ArrayList<TarjetaATM>();
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





	public ArrayList<TarjetaATM> getTarjetas() {
		return tarjetas;
	}





	public void setTarjetas(ArrayList<TarjetaATM> tarjetas) {
		this.tarjetas = tarjetas;
	}





	public void validar (BigInteger idTarjeta , int PIN) {}

}
