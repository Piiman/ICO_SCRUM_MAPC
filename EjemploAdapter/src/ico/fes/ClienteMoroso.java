/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes;

/**
 *
 * @author S1PC26
 */
public class ClienteMoroso {
    
     public void cobrarCuotaMensual(float cuota, float multa){
        System.out.println(" Se encuentra trasado el pago");
        System.out.println("Se le impone una multa de: "+multa+"%");
        System.out.println("Cuota: $"+cuota);
        System.out.println("Multa: $"+cuota*(multa/100));
        System.out.println("Total: $"+(cuota+cuota*(multa/100)));
    }
    
    
}
