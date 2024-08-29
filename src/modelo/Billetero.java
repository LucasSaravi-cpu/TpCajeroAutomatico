package modelo;

import java.math.BigDecimal;



public class Billetero {
	
	private BigDecimal valorBillete;
    private int cantidad;
 
    
    public Billetero(BigDecimal valorBillete, int cantidad) {
		super();
		this.valorBillete = valorBillete;
		this.cantidad = cantidad;
	}

	public BigDecimal getValorBillete() {
		return valorBillete;
	}

	public void setValorBillete(BigDecimal valorBillete) {
		this.valorBillete = valorBillete;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	

	public void recargar(int cantidad) {}
    
    public void descargar(int cantidad) {}
	

}
