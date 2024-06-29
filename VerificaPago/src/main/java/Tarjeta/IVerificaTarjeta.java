/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tarjeta;

/**
 *
 * @author osval
 */
public interface IVerificaTarjeta {

    boolean verificarTarjeta(String numeroTarjeta, double monto, String vcc, String fechaCaducidad);
}
