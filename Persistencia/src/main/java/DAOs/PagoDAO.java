package DAOs;

import entity.Pago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PagoDAO {

    public void agregarPago(Pago pago) throws SQLException {
        String sql = "INSERT INTO Pagos (monto, descripcion, metodoPago) VALUES (?, ?, ?)";
        Connection connection = ConexionDB.getConnection(); 
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setFloat(1, pago.getMonto());
            statement.setString(2, pago.getDescripcion());
            statement.setString(3, pago.getMetodoPago());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public List<Pago> listarPagos() throws SQLException {
        List<Pago> pagos = new ArrayList<>();
        String sql = "SELECT * FROM Pagos";
        try (Connection conn = ConexionDB.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Pago pago = new Pago();
                pago.setId(rs.getInt("id"));
                pago.setId(rs.getInt("orden_id"));
                pago.setMetodoPago(rs.getString("metodo_pago"));
                pago.setMonto(rs.getFloat("monto"));
                //pago.setFecha(rs.getTimestamp("fecha"));
                pago.setFecha(rs.getString("fecha"));
                pagos.add(pago);
            }
        }
        return pagos;
    }

    public Pago getPago(int Id) throws SQLException {
        String sql = "SELECT * FROM Pagos where id = " + Id;
        Pago pago = new Pago();
        try (Connection conn = ConexionDB.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                pago.setId(rs.getInt("id"));
                pago.setId(rs.getInt("orden_id"));
                pago.setMetodoPago(rs.getString("metodo_pago"));
                pago.setMonto(rs.getFloat("monto"));
                //pago.setFecha(rs.getTimestamp("fecha"));
                pago.setFecha(rs.getString("fecha"));
            }
        }
        return pago;
    }
    // Métodos para actualizar y eliminar pagos
}
