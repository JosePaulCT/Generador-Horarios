package pe.edu.utp.Capturador;
import pe.edu.utp.utils.SwingUTP2;
import pe.edu.utp.utils.TextUTP;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

//Alejandro + Gabriel
public class VentanaCapturador {
    // 1. Declarar controles y variables globales
    JLabel lblnombreapp;
    JLabel lblCodigo;
    JTextField txtCodigo;
    JLabel lblNombre;
    JTextField txtNombre;
    JLabel lblLunes;
    JTextField txtLunes;
    JLabel lblMartes;
    JTextField txtMartes;
    JLabel lblMiercoles;
    JTextField txtMiercoles;
    JLabel lblJueves;
    JTextField txtJueves;
    JLabel lblViernes;
    JTextField txtViernes;
    JLabel lblSabado;
    JTextField txtSabado;
    JLabel lblDomingo;
    JTextField txtDomingo;
    JLabel lblRutaCap;
    JTextField txtRutaCap;
    JButton btnRegistrar;
    JButton btnNroRegistros;
    JLabel lblRegisGuard;
    ErrorLog errorLog;
    String ruta;
    int Nro_registros_guardados = 0;

    // Creamos los controles, le asignamos posiciones en el formulario y asignamos los eventos.
    // Alejandro.
    public void prepararControles() {
        // 2. Crear controles
        lblRutaCap = new JLabel("Ingrese la ruta:");
        txtRutaCap = new JTextField(30);
        lblnombreapp = new JLabel("CAPTURADOR");
        lblCodigo = new JLabel("Código:");
        txtCodigo = new JTextField(30);
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(30);
        lblLunes = new JLabel("Lunes:");
        txtLunes = new JTextField(30);
        lblMartes = new JLabel("Martes:");
        txtMartes = new JTextField(30);
        lblMiercoles = new JLabel("Miércoles:");
        txtMiercoles = new JTextField(30);
        lblJueves = new JLabel("Jueves:");
        txtJueves = new JTextField(30);
        lblViernes = new JLabel("Viernes:");
        txtViernes = new JTextField(30);
        lblSabado = new JLabel("Sábado:");
        txtSabado = new JTextField(30);
        lblDomingo = new JLabel("Domingo:");
        txtDomingo = new JTextField(30);
        btnRegistrar = new JButton("Registrar");
        btnNroRegistros = new JButton("N° Registros");
        lblRegisGuard = new JLabel("Registros Guardados:");
        try {
            errorLog = new ErrorLog("D:\\PF-Random\\src\\main\\resources\\error.log");
        } catch (Exception e) {
            System.out.printf("Error: No se pudo encontrar la ruta del log.");
        }

        // 3. Agregar controles al formulario
        SwingUTP2.addControl(120, 0, 100, 20, lblnombreapp);
        SwingUTP2.addControl(10, 30, 100, 20, lblCodigo);
        SwingUTP2.addControl(120, 30, 200, 20, txtCodigo);//+20 a cada uno
        SwingUTP2.addControl(10, 50, 100, 20, lblNombre);
        SwingUTP2.addControl(120, 50, 200, 20, txtNombre);
        SwingUTP2.addControl(10, 70, 100, 20, lblLunes);
        SwingUTP2.addControl(120, 70, 200, 20, txtLunes);
        SwingUTP2.addControl(10, 90, 100, 20, lblMartes);
        SwingUTP2.addControl(120, 90, 200, 20, txtMartes);
        SwingUTP2.addControl(10, 110, 100, 20, lblMiercoles);
        SwingUTP2.addControl(120, 110, 200, 20, txtMiercoles);
        SwingUTP2.addControl(10, 130, 100, 20, lblJueves);
        SwingUTP2.addControl(120, 130, 200, 20, txtJueves);
        SwingUTP2.addControl(10, 150, 100, 20, lblViernes);
        SwingUTP2.addControl(120, 150, 200, 20, txtViernes);
        SwingUTP2.addControl(10, 170, 100, 20, lblSabado);
        SwingUTP2.addControl(120, 170, 200, 20, txtSabado);
        SwingUTP2.addControl(10, 190, 100, 20, lblDomingo);
        SwingUTP2.addControl(120, 190, 200, 20, txtDomingo);//+30 para el de abajo y hasta el último
        SwingUTP2.addControl(10, 220, 310, 22, btnRegistrar);
        SwingUTP2.addControl(120, 250,310,22,  lblRutaCap);
        SwingUTP2.addControl(10, 273, 310, 22, txtRutaCap);
        SwingUTP2.addControl(10, 310, 310, 22, btnNroRegistros);
        SwingUTP2.addControl(100, 335, 310, 22, lblRegisGuard);
        //Eventos
        SwingUTP2.addClickEvent(btnRegistrar, this::registrarDatos);
        SwingUTP2.addClickEvent(btnNroRegistros, this::nroDatosGuardados);

    }

    //Función para registrar datos.
    //Alumno: Alejandro
    private void registrarDatos(Object o) {

        ruta = txtRutaCap.getText();
        File ArchivoDisponibilidad= new File(ruta);
        //Si no existe un archivo, lo crea.
        if (!(ArchivoDisponibilidad.isFile())){
            try {
                ArchivoDisponibilidad.createNewFile();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Validación", JOptionPane.ERROR_MESSAGE );
                try {
                    errorLog.log(e.getMessage(), ErrorLog.Level.ERROR,"Capturador");
                } catch (IOException ex) {
                }
            }
        }
        try {
            Validadores.esRutaInvalida(ruta);
            String data = String.format("%s:%s:{LUN:%s,MAR:%s,MIE:%s,JUE:%s,VIE:%s,SAB:%s,DOM:%s}\r\n", txtCodigo.getText(), txtNombre.getText(),
                    txtLunes.getText(), txtMartes.getText(), txtMiercoles.getText(), txtJueves.getText(), txtViernes.getText(),
                    txtSabado.getText(), txtDomingo.getText());

            try {
                //Colocamos los validadores.
                Validadores.esCodigoValido(txtCodigo.getText());
                Validadores.ComparaciónCodigoIguales(txtCodigo.getText(),ruta);
                Validadores.esNombreValido(txtNombre.getText());
                Validadores.esDisponibilidadValidad(txtLunes.getText(),"Lunes");
                Validadores.esDisponibilidadValidad(txtMartes.getText(),"Martes");
                Validadores.esDisponibilidadValidad(txtMiercoles.getText(),"Miercoles");
                Validadores.esDisponibilidadValidad(txtJueves.getText(),"Jueves");
                Validadores.esDisponibilidadValidad(txtViernes.getText(),"Viernes");
                Validadores.esDisponibilidadValidad(txtSabado.getText(),"Sábado");
                Validadores.esDisponibilidadValidad(txtDomingo.getText(),"Domingo");
                //Solo cogerá los datos si la validación fué correcta.
                TextUTP.append(data, ruta);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Validación", JOptionPane.ERROR_MESSAGE );
                try {
                    errorLog.log(e.getMessage(), ErrorLog.Level.ERROR,"Capturador");
                }catch (Exception ex){
                    System.out.printf("Error al registrar logs");
                }
            }

        } catch (Exception e) {
            try {
                errorLog.log(e.getMessage(), ErrorLog.Level.ERROR,"Capturador");
            } catch (IOException ex) {
                System.out.printf("Error: ", ex.getMessage());
            }
        }


    }

    //Función que lee cuantos datos han sido registrados.
    //Alumno: Alejandro
    private void nroDatosGuardados(Object o){
        try {
            Validadores.esRutaInvalida(ruta);
            //Lee cada linea del archivo .txt
            Nro_registros_guardados = TextUTP.readlinesAsArray(ruta).length;
            //Establece los registros guardados para que aparezcan en la ventana
            lblRegisGuard.setText("Registros Guardados: " + Nro_registros_guardados);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Validación", JOptionPane.ERROR_MESSAGE );
                try {
                    errorLog.log(e.getMessage(), ErrorLog.Level.ERROR,"Capturador");
                } catch (IOException ex) {
                }
            }
    }

    //Función para mostrar ventana, se especifica el tamaño de esta misma.
    //Alumno: Alejandro
    public void mostrar(){
       prepararControles();
        SwingUTP2.runWindow("Registro de Persona",
                350, 400);
    }
}
