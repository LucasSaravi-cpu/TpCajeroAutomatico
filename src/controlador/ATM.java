package controlador;

import java.time.Month;
import java.util.ArrayList;

import modelo.Banco;
import modelo.Billetero;
import modelo.LectorTarjeta;
import modelo.ReconocedorBilletes;
import modelo.Tarifa;

public class ATM {

	private int ID;
    private String ubicacion;
    private boolean modoMantenimiento;
    private ArrayList<Banco> listaBancos;
    private ArrayList<Billetero> listaBilleteros;
    private LectorTarjeta lectortarjeta;
    private ArrayList<Tarifa> tarifas;
    private Banco admistrador;
    private ReconocedorBilletes reconocedorbilletes;
   


	public ATM(int iD, String ubicacion, boolean modoMantenimiento) {
		super();
		this.ID = iD;
		this.ubicacion = ubicacion;
		this.modoMantenimiento = modoMantenimiento;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public boolean isModoMantenimiento() {
		return modoMantenimiento;
	}

	public void setModoMantenimiento(boolean modoMantenimiento) {
		this.modoMantenimiento = modoMantenimiento;
	}

	public ArrayList<Banco> getListaBancos() {
		return listaBancos;
	}

	public void setListaBancos(ArrayList<Banco> listaBancos) {
		this.listaBancos = listaBancos;
	}

	public ArrayList<Billetero> getListaBilleteros() {
		return listaBilleteros;
	}

	public void setListaBilleteros(ArrayList<Billetero> listaBilleteros) {
		this.listaBilleteros = listaBilleteros;
	}
    
    
   public void validar(int idTarjetaATM , int PIN) { }
    
    public void extraer (double valor ) { }
    
    public void depositar (double valor) {}
    
    public void recarga ( Billetero billeteroo , double cantidad) {}
    
    public void descargar (Billetero billeteroo , double cantidad) {}
    
    public void mostrar () {}
    
    
    
	
}
