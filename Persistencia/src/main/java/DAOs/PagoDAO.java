import entity.Pago;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PagoDAO {
    public void agregarPago(Pago pago) throws SQLException {
        String sql = "INSERT INTO Pagos (orden_id, metodo_pago, monto) VALUES (?, ?, ?)";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, pago.getOrdenId());
            stmt.setString(2, pago.getMetodoPago());
            stmt.setBigDecimal(3, pago.getMonto());
            stmt.executeUpdate();
        }
    }

    public List<Pago> listarPagos() throws SQLException {
        List<Pago> pagos = new ArrayList<>();
        String sql = "SELECT * FROM Pagos";
        try (Connection conn = ConexionDB.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Pago pago = new Pago();
                pago.setId(rs.getInt("id"));
                pago.setOrdenId(rs.getInt("orden_id"));
                pago.setMetodoPago(rs.getString("metodo_pago"));
                pago.setMonto(rs.getBigDecimal("monto"));
                pago.setFecha(rs.getTimestamp("fecha"));
                pagos.add(pago);
            }
        }
        return pagos;
    }

    // Métodos para actualizar y eliminar pagos
}
