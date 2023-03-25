package pe.edu.utp;

import pe.edu.utp.Capturador.VentanaCapturador;
import pe.edu.utp.Generador.VentanaGenerador;
import pe.edu.utp.utils.SwingUTP;

import javax.swing.*;
//ALEJANDRO
public class VentanaPrincipal {
    // 1. Declarar controles y variables globales
    JLabel lblNombreAplicativo;
    JButton btnCapturador;
    JButton btnGenerador;

    public void prepararControles(){
        // 2. Crear controles
        lblNombreAplicativo = new JLabel("ᴘʀᴏʏᴇᴄᴛᴏ ʀᴀɴᴅᴏᴍ");
        btnCapturador = new JButton("ᴄᴀᴘᴛᴜʀᴀᴅᴏʀ");
        btnGenerador = new JButton("ɢᴇɴᴇʀᴀᴅᴏʀ");

        // 3. Agregar controles al formulario
        SwingUTP.addControl(80,10, 100,50, lblNombreAplicativo);
        SwingUTP.addControl(60,70,150, 50, btnCapturador);
        SwingUTP.addControl(60,140,150,50, btnGenerador);

        // 4. Agregar eventos
        SwingUTP.addClickEvent(btnCapturador,this::abrirVentana2);
        SwingUTP.addClickEvent(btnGenerador,this::abrirVentana3);
    }

    //abrirVentana2 contiene el procedimiento mostrar que ejecuta la ventana Capturador.
    private void abrirVentana2(Object o) {
        VentanaCapturador mostrar = new VentanaCapturador();
        mostrar.mostrar();
    }
    //abrirVentana3 contiene el procedimiento mostrar que ejecuta la ventana Generador.
    private void abrirVentana3(Object o) {
        VentanaGenerador generar = new VentanaGenerador();
        generar.mostrar();
    }
    //El procedimiento prepararControles establece estos mismos y runWindow crea la ventana.
    public void mostrar(){
        prepararControles();
        SwingUTP.runWindow("RandomAPP",
                300, 300);
    }
    //OpenApp es un procedimiento que crea la ventana(principal) y lo muestra.
    public static void OpenAPP (){
        VentanaPrincipal window = new VentanaPrincipal();
        window.mostrar();
    }
    //Alumno: Alejandro
}
