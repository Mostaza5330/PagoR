package Tarjeta;


import Tarjeta.IVerificaTarjeta;
import com.mycompany.banco.Banco;

public class VerificaTarjeta implements IVerificaTarjeta {

    private Banco sistemaBanco;

    // Constructor que recibe el sistema del banco
    public VerificaTarjeta(Banco sistemaBanco) {
        this.sistemaBanco = sistemaBanco;
    }

    // Constructor sin argumentos
    public VerificaTarjeta() {
        this.sistemaBanco = new Banco(); // Crear una instancia de Banco por defecto
    }


    @Override
    public boolean verificarTarjeta(String numeroTarjeta, double monto, String vcc, String fechaCaducidad) {
        return sistemaBanco.verificarPago(numeroTarjeta, monto, vcc, fechaCaducidad);
    }
}
