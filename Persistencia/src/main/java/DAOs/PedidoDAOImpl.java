package DAOs;

import DAOs.PedidoDAO;
import entity.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAOImpl implements PedidoDAO {
    // Simulación de una base de datos en memoria
    private static List<Pedido> pedidosDB = new ArrayList<>();

    @Override
    public void crearPedido(Pedido pedido) {
        pedidosDB.add(pedido);
        System.out.println("Pedido creado correctamente: " + pedido.getId());
    }

    @Override
    public List<Pedido> listarPedidos() {
        return pedidosDB;
    }

    @Override
    public Pedido consultarPedido(int id) {
        for (Pedido pedido : pedidosDB) {
            if (pedido.getId() == id) {
                return pedido;
            }
        }
        return null;
    }
}
