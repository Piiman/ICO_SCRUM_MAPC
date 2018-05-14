/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.adapter;

import ico.fes.ClienteMoroso;
import ico.fes.ClienteNuevo;
import ico.fes.ClientePremium;

/**
 *
 * @author pc9
 */
public class Test {
    
    public static void main(String[] args) {
        
        Cliente[] carteraClientes={
           new ClienteNuevoAdapter(new ClienteNuevo()),
           new ClienteMorosoAdapter(new ClienteMoroso()),
           new ClientePremiumAdapter(new ClientePremium())
        } ;
        
        float Cuota=500.0f;
        float multa = 5.0f;
        float descuento = 10.0f;
        
        for (Cliente cliente : carteraClientes) {
            
            cliente.cobrarCuotaMensual(Cuota, multa, descuento);
            
        }
        
    }
    
}
