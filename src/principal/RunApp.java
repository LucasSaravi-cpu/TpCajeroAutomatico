package principal;

import java.math.BigDecimal;
import java.math.BigInteger;

import controlador.ATM;
import modelo.atm.Billetero;
import modelo.atm.TarjetaATM;
import modelo.banco.Banco;
import modelo.usuario.Usuario;

public class RunApp {

	public static void main(String[] args) {
		
	Banco banco1 = new Banco("Banco de la plaza",new BigInteger("10000000"),new BigInteger("19999999"));

		
		ATM atm = new ATM(1234,"Colon y independencia",false,banco1);
		
		Usuario usuario1 = new Usuario (1234,"Lucas","millo");
	    Usuario usuario2 = new Usuario(4569,"Loa","Acade");
	    Usuario usuario3 = new Usuario(7894,"car","ton");
	    
	    TarjetaATM tarjeta1 = new TarjetaATM(usuario1,new BigInteger("789654"),1234,true);
	    TarjetaATM tarjeta2 = new TarjetaATM(usuario2,new BigInteger("578548"),1234,true);
		
	
		
		
		Billetero billetero1 = new Billetero(new BigDecimal("500"),10000);
		Billetero billetero2 = new Billetero(new BigDecimal("1000"),10000);
		Billetero billetero3 = new Billetero(new BigDecimal("2000"),10000);
		
		
		atm.getListaBilleteros().add(billetero1);
		atm.getListaBilleteros().add(billetero2);
		atm.getListaBilleteros().add(billetero3);
		
		
		
		
	   	banco1.agregarTarjetaATM(tarjeta1);
		banco1.agregarTarjetaATM(tarjeta2);
		banco1.agregarUsuario(usuario1);
		banco1.agregarUsuario(usuario2);
		
		
	 
		
		
	}

}
