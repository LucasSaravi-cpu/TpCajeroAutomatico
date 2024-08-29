package Model;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class Banco implements Serializable{
  
	private static final long serialVersionUID = 1L;


    private String nombre;
    private BigInteger minRango;
    private BigInteger maxRango;
    private ArrayList<TarjetaATM> listaTarjetas;
    private ArrayList<Usuario> listaUsuarios;
    
	
	public Banco(String nombre, BigInteger minRango, BigInteger maxRango) {
        super();
        this.setNombre(nombre);
        this.setMinRango(minRango);
        this.setMaxRango(maxRango);
        this.setListaTarjetas(listaTarjetas = new ArrayList<TarjetaATM>());
        this.setListaUsuarios(listaUsuarios = new ArrayList<Usuario>());
    }

   
    void validar(BigInteger idTarjeta,int PIN) {
        
    }
    
    public void agregar(Usuario a){
        listaUsuarios.add(a);
    }
    
    public void eliminar(Usuario a) {
    	listaUsuarios.remove(a);
    }
    
    public void agregar(TarjetaATM a) {
        listaTarjetas.add(a);
    }
    
    public void eliminar(TarjetaATM a) {
    	listaTarjetas.remove(a);
    }
    
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigInteger getMinRango() {
		return minRango;
	}

	public void setMinRango(BigInteger minRango) {
		this.minRango = minRango;
	}

	public BigInteger getMaxRango() {
		return maxRango;
	}

	public void setMaxRango(BigInteger maxRango) {
		this.maxRango = maxRango;
	}

	public ArrayList<TarjetaATM> getListaTarjetas() {
		return listaTarjetas;
	}

	public void setListaTarjetas(ArrayList<TarjetaATM> listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}
	
	public Iterator<TarjetaATM> getTarjetas(){
    	return listaTarjetas.iterator();
    }
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	
	public Iterator<Usuario> getUsuarios(){
		return listaUsuarios.iterator();
	}

	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	
	@Override
	public String toString() {
		return "Banco " + nombre + ", minRango=" + minRango + ", maxRango=" + maxRango;
	}
	
	
}