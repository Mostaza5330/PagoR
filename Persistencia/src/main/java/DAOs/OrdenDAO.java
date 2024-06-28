/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import entity.DetalleOrden;
import entity.Orden;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author osval
 */
public class OrdenDAO {

    public List<Orden> listarOrdenes() throws SQLException {
        List<Orden> ordenes = new ArrayList<>();
        String sql = "SELECT o.id, o.mesa, o.fecha, SUM(do.cantidad * p.precio) AS total "
                + "FROM Ordenes o "
                + "JOIN DetalleOrdenes do ON o.id = do.orden_id "
                + "JOIN Productos p ON do.producto_id = p.id "
                + "GROUP BY o.id";
        try (Connection conn = ConexionDB.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Orden orden = new Orden();
                orden.setId(rs.getInt("id"));
                orden.setMesa(rs.getInt("mesa"));
                orden.setFecha(rs.getTimestamp("fecha"));
                orden.setTotal(rs.getFloat("total"));
                ordenes.add(orden);
            }
        }
        return ordenes;
    }

    public Orden getOrden(int id) throws SQLException {
        Orden orden = new Orden();
        String sqlOrden = "SELECT id, mesa, fecha FROM Ordenes WHERE id = ?";
        String sqlDetalles = "SELECT do.id, do.producto_id, p.nombre, do.cantidad, p.precio "
                + "FROM DetalleOrdenes do "
                + "JOIN Productos p ON do.producto_id = p.id "
                + "WHERE do.orden_id = ?";
        try (Connection conn = ConexionDB.getConnection(); PreparedStatement stmtOrden = conn.prepareStatement(sqlOrden); PreparedStatement stmtDetalles = conn.prepareStatement(sqlDetalles)) {
            // Obtener la orden
            stmtOrden.setInt(1, id);
            try (ResultSet rs = stmtOrden.executeQuery()) {
                if (rs.next()) {
                    orden.setId(rs.getInt("id"));
                    orden.setMesa(rs.getInt("mesa"));
                    orden.setFecha(rs.getTimestamp("fecha"));
                }
            }

            // Obtener los detalles de la orden
            stmtDetalles.setInt(1, id);
            try (ResultSet rs = stmtDetalles.executeQuery()) {
                List<DetalleOrden> detalles = new ArrayList<>();
                while (rs.next()) {
                    DetalleOrden detalle = new DetalleOrden();
                    detalle.setId(rs.getInt("id"));
                    detalle.setProductoId(rs.getInt("producto_id"));
                    detalle.setNombreProducto(rs.getString("nombre"));
                    detalle.setCantidad(rs.getInt("cantidad"));
                    detalle.setPrecio(rs.getFloat("precio"));
                    detalles.add(detalle);
                }
                orden.setDetalles(detalles);
            }
        }
        return orden;
    }
}
