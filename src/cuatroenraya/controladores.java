/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatroenraya;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * @web www.jc-mouse.net/
 * @author Mouse
 */
public class controladores implements ActionListener {
    
    private ventana1 vista;
    private juego juego;
    private String titulo = "Cuatro en raya";
    

    //En el constructor inicializamos nuestros objetos 
    public controladores(ventana1 vista, juego modelo) {
        this.vista = vista;
        this.juego = modelo;
      
    }

    //Inicia los valores del jFrame VISTA con los datos del MODELO
    // tambien añadimos el ActionListener a los botones de la VISTA
    public void iniciar_vista() {
        vista.setTitle(this.titulo);
        vista.setLocationRelativeTo(null);
        
        
        this.vista.Uno.addActionListener(this);
        this.vista.Dos.addActionListener(this);
        this.vista.Tres.addActionListener(this);
        this.vista.Cuatro.addActionListener(this);
        this.vista.Cinco.addActionListener(this);
        this.vista.Seis.addActionListener(this);
        this.vista.Siete.addActionListener(this);
        this.vista.Ocho.addActionListener(this);
        this.vista.Nueve.addActionListener(this);
        this.vista.Diez.addActionListener(this);
        this.vista.Once.addActionListener(this);
        this.vista.Doce.addActionListener(this);
        this.vista.Trece.addActionListener(this);
        this.vista.Catorce.addActionListener(this);
        this.vista.Quince.addActionListener(this);  
        this.vista.Dieciseis.addActionListener(this);
        this.vista.ReiniciaM.addActionListener(this);
        
    }

    //La accion de los botones de la VISTA es capturado, asi como los valores
    //dependiendo del boton pulsado, se envia la informacion al modelo
    //y se espera la respuesta
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        
        if (this.juego.ganador() == 0) {
            if (boton == this.vista.Uno) {
                this.vista.Uno.setText(this.juego.set_movimiento(1));
                this.vista.Uno.setEnabled(false);
            } else if (boton == this.vista.Dos) {
                this.vista.Dos.setText(this.juego.set_movimiento(2));
                this.vista.Dos.setEnabled(false);
            } else if (boton == this.vista.Tres) {
                this.vista.Tres.setText(this.juego.set_movimiento(3));
                this.vista.Tres.setEnabled(false);
            } else if (boton == this.vista.Cuatro) {
                this.vista.Cuatro.setText(this.juego.set_movimiento(4));
                this.vista.Cuatro.setEnabled(false);
            } else if (boton == this.vista.Cinco) {
                this.vista.Cinco.setText(this.juego.set_movimiento(5));
                this.vista.Cinco.setEnabled(false);
            } else if (boton == this.vista.Seis) {
                this.vista.Seis.setText(this.juego.set_movimiento(6));
                this.vista.Seis.setEnabled(false);
            } else if (boton == this.vista.Siete) {
                this.vista.Siete.setText(this.juego.set_movimiento(7));
                this.vista.Siete.setEnabled(false);
            } else if (boton == this.vista.Ocho) {
                this.vista.Ocho.setText(this.juego.set_movimiento(8));
                this.vista.Ocho.setEnabled(false);
            } else if (boton == this.vista.Nueve) {
                this.vista.Nueve.setText(this.juego.set_movimiento(9));
                this.vista.Nueve.setEnabled(false);
            } else if (boton == this.vista.Diez) {
                this.vista.Diez.setText(this.juego.set_movimiento(10));
                this.vista.Diez.setEnabled(false);
            } else if(boton == this.vista.Once){
                this.vista.Once.setText(this.juego.set_movimiento(11));
                this.vista.Once.setEnabled(false);
            } else if(boton == this.vista.Doce){
                this.vista.Doce.setText(this.juego.set_movimiento(12));
                this.vista.Doce.setEnabled(false);
            } else if(boton == this.vista.Trece){
                this.vista.Trece.setText(this.juego.set_movimiento(13));
                this.vista.Trece.setEnabled(false);
            } else if(boton ==this.vista.Catorce){
                this.vista.Catorce.setText(this.juego.set_movimiento(14));
                this.vista.Catorce.setEnabled(false);
            }else if(boton == this.vista.Quince){
                this.vista.Quince.setText(this.juego.set_movimiento(15));
                this.vista.Quince.setEnabled(false);
            } else if (boton == this.vista.Dieciseis){
                this.vista.Dieciseis.setText(this.juego.set_movimiento(16));
                this.vista.Dieciseis.setEnabled(false);
            }  
            
            /*if (this.juego.get_error()) {
                JOptionPane.showMessageDialog(null, "Error: la casilla ya esta marcada \n Perdiste tu turno");
            }*/            
            
            
             this.vista.ContadorTurnos.setText(this.juego.get_turno());
             
             
          //this.vista.ReiniciaM.setText("Jugador X:"+String.valueOf(this.juego.Reiniciar())+this.vista.JugadorUnoVictorias);
          if(boton==this.vista.ReiniciaM){
            this.vista.JugadorUnoVictorias.setText("Jugador X: "+String.valueOf(this.juego.ReinicioMarca()));
            this.vista.JugadorDosVictorias.setText("Jugador O: "+String.valueOf(this.juego.ReinicioMarca2()));
          }
            
            
            
            
        }
        
        switch (this.juego.ganador()) {
            case 1:
                mensaje(" El jugador 1 (X) ha ganado ");
                this.vista.JugadorUnoVictorias.setText("Jugador X: "+String.valueOf(this.juego.contador_victoriasJ1()));
                break;
            case 2:
                mensaje(" El jugador 2 (O) ha ganado ");
                this.vista.JugadorDosVictorias.setText("Jugador O: "+String.valueOf(this.juego.contador_victoriasJ2()));
                break;
            case 3:
                mensaje(" EMPATE ");
                break;
            default:
                break;
        }
    }

    //dependiendo de la respuesta del modelo, se muestra un mensaje al usuario
    private void mensaje(String s) {
        this.vista.Uno.setEnabled(true);
                this.vista.Dos.setEnabled(true);
                this.vista.Tres.setEnabled(true);
                this.vista.Cuatro.setEnabled(true);
                this.vista.Cinco.setEnabled(true);
                this.vista.Seis.setEnabled(true);
                this.vista.Siete.setEnabled(true);
                this.vista.Ocho.setEnabled(true);
                this.vista.Nueve.setEnabled(true);
                this.vista.Diez.setEnabled(true);
                this.vista.Once.setEnabled(true);
                this.vista.Doce.setEnabled(true);
                this.vista.Trece.setEnabled(true);
                this.vista.Catorce.setEnabled(true);
                this.vista.Quince.setEnabled(true);
                this.vista.Dieciseis.setEnabled(true);
        int seleccion = JOptionPane.showOptionDialog(null, s + "\n ¿Que desea hacer?", "Fin del juego",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{" Jugar otra vez ", " Salir de Programa "},
                "Marcadores");
        
        if (seleccion != -1) {
            if ((seleccion + 1) == 1) {
                this.juego.Jugar_otra_vez();
                this.vista.setTitle(titulo);
                this.vista.Uno.setText("");
                this.vista.Dos.setText("");
                this.vista.Tres.setText("");
                this.vista.Cuatro.setText("");
                this.vista.Cinco.setText("");
                this.vista.Seis.setText("");
                this.vista.Siete.setText("");
                this.vista.Ocho.setText("");
                this.vista.Nueve.setText("");
                this.vista.Diez.setText("");
                this.vista.Once.setText("");
                this.vista.Doce.setText("");
                this.vista.Trece.setText("");
                this.vista.Catorce.setText("");
                this.vista.Quince.setText("");
                this.vista.Dieciseis.setText("");
                
            } else {
                System.exit(0);
            }
        }
    }
}
