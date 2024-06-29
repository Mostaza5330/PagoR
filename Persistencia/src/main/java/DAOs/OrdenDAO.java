package DAOs;

import entity.Orden;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrdenDAO {

    public List<Orden> listarOrdenes() throws SQLException {
        List<Orden> ordenes = new ArrayList<>();
        String sql = "SELECT id, mesa, platillos, total, fecha FROM Ordenes";
        try (Connection conn = ConexionDB.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Orden orden = new Orden();
                orden.setId(rs.getInt("id"));
                orden.setMesa(rs.getInt("mesa"));
                orden.setPlatillos(rs.getString("platillos"));
                orden.setTotal(rs.getFloat("total"));
                orden.setFecha(rs.getTimestamp("fecha"));
                ordenes.add(orden);
            }
        }
        return ordenes;
    }

    public Orden getOrden(int id) throws SQLException {
        Orden orden = new Orden();
        String sql = "SELECT id, mesa, platillos, total, fecha FROM Ordenes WHERE id = ?";
        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    orden.setId(rs.getInt("id"));
                    orden.setMesa(rs.getInt("mesa"));
                    orden.setPlatillos(rs.getString("platillos"));
                    orden.setTotal(rs.getFloat("total"));
                    orden.setFecha(rs.getTimestamp("fecha"));
                }
            }
        }
        return orden;
    }
}
