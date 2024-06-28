/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.verificapago;

/**
 *
 * @author osval
 */
public interface IVerificaPago {

    boolean verificarPago(String numeroTarjeta, double monto, String vcc, String fechaCaducidad);
}
