package modelo.cuenta;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CuentaCorriente extends Cuenta {
	
	private BigDecimal descubierto;
	
	
	
	

	public CuentaCorriente(BigInteger cBU, BigDecimal saldo, float importeDebOtroBanco) {
		super(cBU, saldo, importeDebOtroBanco);
		this.descubierto = descubierto;
	}

	
	
	
	
	public BigDecimal getDescubierto() {
		return descubierto;
	}





	public void setDescubierto(BigDecimal descubierto) {
		this.descubierto = descubierto;
	}





	@Override
	public String tipoCuenta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal GetSaldo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
