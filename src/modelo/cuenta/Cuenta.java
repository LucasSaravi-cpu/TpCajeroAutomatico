package modelo.cuenta;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

import modelo.transaccion.Transaccion;

public abstract class Cuenta {
	
	private BigInteger CBU;
    private BigDecimal saldo;
    private float importeDebOtroBanco;
    private ArrayList<Transaccion> movimientos;
     
    
    public Cuenta(BigInteger cBU, BigDecimal saldo, float importeDebOtroBanco) {
		super();
		this.CBU = cBU;
		this.saldo = saldo;
		this.importeDebOtroBanco = importeDebOtroBanco;
		this.movimientos=new ArrayList<Transaccion>();
	}
    
    
    
	public ArrayList<Transaccion> getMovimientos() {
		return movimientos;
	}



	public void setMovimientos(ArrayList<Transaccion> movimientos) {
		this.movimientos = movimientos;
	}



	public BigInteger getCBU() {
		return CBU;
	}



	public void setCBU(BigInteger cBU) {
		CBU = cBU;
	}



	public BigDecimal getSaldo() {
		return saldo;
	}



	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}



	public float getImporteDebOtroBanco() {
		return importeDebOtroBanco;
	}



	public void setImporteDebOtroBanco(float importeDebOtroBanco) {
		this.importeDebOtroBanco = importeDebOtroBanco;
	}



	public abstract String tipoCuenta();
    public abstract BigDecimal calcularSaldo();
    

}
