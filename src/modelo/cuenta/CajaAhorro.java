package modelo.cuenta;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CajaAhorro extends Cuenta {
	
	private double tasaInteres;
	private BigDecimal limiteExtraccionDia;
	
	
	

	public CajaAhorro(BigInteger cBU, BigDecimal saldo, float importeDebOtroBanco) {
		super(cBU, saldo, importeDebOtroBanco);
	    this.tasaInteres = tasaInteres;
	    this.limiteExtraccionDia = limiteExtraccionDia;
	}
	
	
	

	public double getTasaInteres() {
		return tasaInteres;
	}




	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}




	public BigDecimal getLimiteExtraccionDia() {
		return limiteExtraccionDia;
	}




	public void setLimiteExtraccionDia(BigDecimal limiteExtraccionDia) {
		this.limiteExtraccionDia = limiteExtraccionDia;
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
