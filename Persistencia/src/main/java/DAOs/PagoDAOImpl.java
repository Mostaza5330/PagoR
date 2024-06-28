package DAOs;

import DAOs.PagoDAO;
import entity.Pago;
import java.util.ArrayList;
import java.util.List;

public class PagoDAOImpl implements PagoDAO {
    // Simulación de una base de datos en memoria
    private static List<Pago> pagosDB = new ArrayList<>();

    @Override
    public void crearPago(Pago pago) {
        pagosDB.add(pago);
        System.out.println("Pago creado correctamente: " + pago.getId());
    }

    @Override
    public List<Pago> listarPagos() {
        return pagosDB;
    }

    @Override
    public Pago consultarPago(int id) {
        for (Pago pago : pagosDB) {
            if (pago.getId() == id) {
                return pago;
            }
        }
        return null;
    }
}
