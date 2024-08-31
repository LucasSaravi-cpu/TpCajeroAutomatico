package modelo.atm;

import java.math.BigInteger;

import modelo.usuario.Usuario;

public class TarjetaATM {
	
	private Usuario usuario;
	private BigInteger id;
	private int PIN;
	private boolean habilitada;
	
	public TarjetaATM(Usuario usuario, BigInteger id, int pIN, boolean habilitada) {
		super();
		this.usuario = usuario;
		this.id = id;
		PIN = pIN;
		this.habilitada = habilitada;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}

	public boolean isHabilitada() {
		return habilitada;
	}

	public void setHabilitada(boolean habilitada) {
		this.habilitada = habilitada;
	}
	
	

}
