package modelo.atm;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class ReconocedorBilletes {

    private Set<Integer> billeteroPermitido; // Conjunto de valores permitidos para billetes
    private Set<BigDecimal> validos; // Conjunto de billetes válidos

    // Constructor
    public ReconocedorBilletes() {
        this.billeteroPermitido = new HashSet<>();
        this.validos = new HashSet<>();
    }

    // Método para vaciar el conjunto de billetes válidos
    public void vaciar() {
        validos.clear();
    }

    // Método para agregar un billete al conjunto de billetes válidos
    public void agregarBillete(BigDecimal billete) {
        if (billeteroPermitido.contains(billete.intValue())) {
            validos.add(billete);
        } else {
            throw new IllegalArgumentException("Billete no permitido.");
        }
    }

    // Método para verificar si un billete es válido
    public boolean esBilleteValido(BigDecimal billete) {
        return validos.contains(billete);
    }

    // Método para agregar un valor permitido para billetes
    public void agregarBilleteroPermitido(int valor) {
        billeteroPermitido.add(valor);
    }

    // Método para eliminar un valor permitido para billetes
    public void eliminarBilleteroPermitido(int valor) {
        billeteroPermitido.remove(valor);
    }
}