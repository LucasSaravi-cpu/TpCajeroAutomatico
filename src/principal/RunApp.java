package principal;

import java.math.BigDecimal;

import controlador.ATM;
import modelo.atm.Billetero;
import modelo.usuario.Usuario;

public class RunApp {

	public static void main(String[] args) {
		
		
		ATM atm = new ATM(1234,"Colon y independencia",false);
		
		Usuario usuario1 = new Usuario (1234,"Lucas","Saravi");
		Usuario usuario2 = new Usuario (1234,"Sinun","Mango");
		Usuario usuario3 = new Usuario (1234,"Elmillo","Nario");
		
		
		
		
		
		Billetero billetero1 = new Billetero(new BigDecimal("500"),10000);
		Billetero billetero2 = new Billetero(new BigDecimal("1000"),10000);
		Billetero billetero3 = new Billetero(new BigDecimal("2000"),10000);
		
		
		atm.getListaBilleteros().add(billetero1);
		atm.getListaBilleteros().add(billetero2);
		atm.getListaBilleteros().add(billetero3);
	}

}
