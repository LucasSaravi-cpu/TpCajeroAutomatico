package Model;
import java.io.Serializable;
import java.math.*;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import principal.ATM;

public class Billetero implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Billetero(BigDecimal valorBillete, int cantidad) {
		super();
		this.setValorBillete(valorBillete);
		this.setCantidad(cantidad);
	}
	
	private ArrayList<Billetero> listaBilleteros = new ArrayList<Billetero>();
	
	private int topeBillete = 7000;
	
	public int getTopeBillete() {
		return topeBillete;
	}

	public void setTopeBillete(int topeBillete) {
		this.topeBillete = topeBillete;
	}

	private BigDecimal valorBillete;
    private int cantidad;
    
    public void recargar(BigDecimal tipoBill, ATM cajero, int CantBilletes) {
		//BigDecimal tipoBill = new BigDecimal(cbTipoBillete.getSelectedItem().toString());
		if (tipoBill.compareTo(new BigDecimal("100"))==0 && this.getValorBillete().compareTo(new BigDecimal("100"))==0) {
			if (CantBilletes > 0 || this.getCantidad()+CantBilletes <= topeBillete) {
				this.setCantidad(this.getCantidad()+CantBilletes);
			}
		}
		else
			if (tipoBill.compareTo(new BigDecimal("500"))==0 && this.getValorBillete().compareTo(new BigDecimal("500"))==0) {
				if (CantBilletes > 0 || this.getCantidad()+CantBilletes <= topeBillete) {
					this.setCantidad(this.getCantidad()+CantBilletes);
				}
			}
			else
				if (tipoBill.compareTo(new BigDecimal("1000"))==0 && this.getValorBillete().compareTo(new BigDecimal("1000"))==0) {
					if (CantBilletes > 0 || this.getCantidad()+CantBilletes <= topeBillete) {
						this.setCantidad(this.getCantidad()+CantBilletes);
					}
				}
    }
    
    public void descargar(int cantBill) {
		if (this.getValorBillete().compareTo(new BigDecimal("100"))==0) {
			if (cantBill > 0 && cantBill<=this.getCantidad()) {
				this.setCantidad(this.getCantidad()-cantBill);
			}
		}
		else
			if (this.getValorBillete().compareTo(new BigDecimal("500"))==0) {
				if (cantBill > 0 && cantBill<=this.getCantidad()) {
					this.setCantidad(this.getCantidad()-cantBill);
				}
			}
			else
				if (this.getValorBillete().compareTo(new BigDecimal("1000"))==0) {
					if (cantBill > 0 && cantBill<=this.getCantidad()) {
						this.setCantidad(this.getCantidad()-cantBill);
					}
				}
		
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
	
	public ArrayList<Billetero> getListaBilleteros() {
		return listaBilleteros;
	}

	public void setListaBilleteros(ArrayList<Billetero> listaBilleteros) {
		this.listaBilleteros = listaBilleteros;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Valor billete: "+getValorBillete()+" Cantidad: "+getCantidad()+" ");
		return sb.toString();
	}
}