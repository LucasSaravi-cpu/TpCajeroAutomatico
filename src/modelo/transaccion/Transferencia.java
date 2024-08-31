package modelo.transaccion;

import java.math.BigDecimal;
import java.util.Date;

import modelo.cuenta.Cuenta;

public class Transferencia  extends Transaccion{
	
	private Cuenta otracuenta;
	
	
	









public Transferencia(Date fecha, BigDecimal valor, TipoTransaccion tipotransaccion) {
		super(fecha, valor, tipotransaccion);
		this.otracuenta=otracuenta;
	}








public Cuenta getOtracuenta() {
	return otracuenta;
}








public void setOtracuenta(Cuenta otracuenta) {
	this.otracuenta = otracuenta;
}








@Override
public void mostrar() {}

}
