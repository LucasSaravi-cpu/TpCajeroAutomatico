package modelo.cuenta;

import java.math.BigDecimal;
import java.math.BigInteger;


public class CuentaSueldo extends CajaAhorro {
	
	private String cuitEmpleador ;
	
	public CuentaSueldo(BigInteger cBU, BigDecimal saldo, float importeDebOtroBanco) {
		super(cBU, saldo, importeDebOtroBanco);
		this.cuitEmpleador=cuitEmpleador;
	}

	
	  @Override
	    public String tipoCuenta() {
	        return "Cuenta de Sueldo";
	    }

	    @Override
	    public BigDecimal calcularSaldo() {
	        return getSaldo(); // Puede ser modificado según los cálculos adicionales
	    }
	
	

}
