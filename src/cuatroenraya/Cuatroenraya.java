/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Desarrollar un juego cuatro en raya
debe tener un marcador
debe tener un boton para borrar y volver a jugar

 */
package cuatroenraya;

/**
 *
 * @author Marcos Canul
 */
public class Cuatroenraya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ventana1 vista=new ventana1(); 
       juego j=new juego();
       controladores c=new controladores(vista,j);
       
       c.iniciar_vista();
       vista.setVisible(true);
       
       
       
    }
    
}
