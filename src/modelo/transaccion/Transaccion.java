package modelo.transaccion;

import java.math.BigDecimal;
import java.util.Date;

public class Transaccion {
	
	private Date fecha;
	private BigDecimal valor;
	private TipoTransaccion tipotransaccion;
	
	


	public Transaccion(Date fecha, BigDecimal valor, TipoTransaccion tipotransaccion) {
		super();
		this.fecha = fecha;
		this.valor = valor;
		this.tipotransaccion = tipotransaccion;
	}





	public Date getFecha() {
		return fecha;
	}





	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}





	public BigDecimal getValor() {
		return valor;
	}





	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}





	public void mostrar() {}

}
