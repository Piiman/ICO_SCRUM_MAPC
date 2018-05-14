/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.adapter;

import ico.fes.ClientePremium;

/**
 *
 * @author pc9
 */
public class ClientePremiumAdapter implements Cliente{
    private ClientePremium adaptado;
    public ClientePremiumAdapter(ClientePremium cli){
        this.adaptado = cli;
    }
    
    @Override
    public void cobrarCuotaMensual(float cuota,float multa, float descuento){
        adaptado.cobrarCuotaMensual(cuota, descuento);
    }
}
