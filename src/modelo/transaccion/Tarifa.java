package modelo.transaccion;

import java.math.BigDecimal;

public class Tarifa {
	
	private BigDecimal valor;
	private TipoTransaccion tipotransaccion;
	
	public Tarifa(BigDecimal valor, TipoTransaccion tipotransaccion) {
		super();
		this.valor = valor;
		this.tipotransaccion = tipotransaccion;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoTransaccion getTipotransaccion() {
		return tipotransaccion;
	}

	public void setTipotransaccion(TipoTransaccion tipotransaccion) {
		this.tipotransaccion = tipotransaccion;
	}
	
	

}
