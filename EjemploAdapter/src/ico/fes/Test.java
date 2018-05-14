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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Object[] carteraClientes = {new ClienteNuevo(),new ClienteMoroso()};
        float cuota=500.0f;
        float multa=5.0f;
        float descuento=10.0f;
        
        
        for (Object cliente : carteraClientes) {
            
            if (cliente.getClass().getSimpleName().equals("ClienteNuevo")) {
                ((ClienteNuevo)cliente).cobrarCuotaMensual(cuota);
            }else if ( cliente.getClass().getSimpleName().equals("ClienteMoroso")){
                ((ClienteMoroso)cliente).cobrarCuotaMensual(cuota,multa);
            }
        }
    }
    
    
}
