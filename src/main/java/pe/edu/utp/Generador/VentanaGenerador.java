package pe.edu.utp.Generador;

import pe.edu.utp.Capturador.ErrorLog;
import pe.edu.utp.Capturador.Validadores;
import pe.edu.utp.Disponibilidad;
import pe.edu.utp.Generador.Reportes.VentanaReportes;
import pe.edu.utp.utils.SwingUTP3;
import pe.edu.utp.utils.TextUTP;
import javax.swing.*;
import java.io.IOException;

//Alejandro + Gabriel
public class VentanaGenerador {

    // 1. Declarar controles y variables globales
    JLabel lblRuta;
    JTextField txtRuta;
    JButton btnCargar;
    JLabel lblDatosOK;
    JLabel lblDatosError;
    JButton btnReportes;
    ErrorLog errorLog;
    Docente[] dataDocentes;
    int errores = 0;
    int DatosOK = 0;

    //El procedimiento prepararControles crea los botones
    // y los añade a la ventana con la librería SwingUTP3.
    //Alumno Alejandro
    public void prepararControles() {
        // 2. Crear controles
        lblRuta = new JLabel("Nombre del archivo:");
        txtRuta = new JTextField(30);
        btnCargar = new JButton("Cargar archivo CSV");
        lblDatosOK = new JLabel("REGISTROS OK:");
        lblDatosError = new JLabel("REGISTROS ERROR:");
        btnReportes = new JButton("Reportes");
        // 3. Agregar controles al formulario
        SwingUTP3.addControl(95, 10, 150,30,lblRuta);
        SwingUTP3.addControl(70, 50, 150,30,txtRuta);
        SwingUTP3.addControl(70, 100,150,30, btnCargar);
        SwingUTP3.addControl(105, 130, 150,30,lblDatosOK);
        SwingUTP3.addControl(95,150,150,30,lblDatosError);
        SwingUTP3.addControl(70, 180, 150,30,btnReportes);
        //Asigna una ubicación para guardar el archivo errorLog.
        try {
            errorLog = new ErrorLog("D:\\PF-Random\\src\\main\\resources\\error.log");
        } catch (Exception e) {
            e.printStackTrace();
        }


        //Agregar eventos
        SwingUTP3.addClickEvent(btnCargar,this::cargardata);
        SwingUTP3.addClickEvent(btnReportes,this::abrirventana4);
    }
        //El procedimiento cargardata recibe la ruta registrada, valida y
        // guarda los datos para los reportes.
        //Alumno: Gabriel
        private void cargardata(Object o) {
        // 1. Abrir el archivo CSV
        String filename = txtRuta.getText();
        try {
            Validadores.esRutaInvalida(filename);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),
                    "ERROR",JOptionPane.ERROR_MESSAGE);
            try {
                errorLog.log(e.getMessage(), ErrorLog.Level.ERROR,"Generador");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

            // 2. Leerlo (split) y crear objetos Usuario
        try {
            //Para no desperdiciar arrays
            int j = 0;
            String[] lineas = TextUTP.readlinesAsArray(filename, TextUTP.OS.WINDOWS);
            Docente[] dataDocentes = new Docente[lineasCorrectas(lineas,filename)];
            // 3. Mientras se lee, identificar errores
            for (int i = 0; i < lineas.length; i++) {

                // Dividir la cadena
                String[] registros = lineas[i].split(":");

                try{
                Validadores.esLineaRegistroValida(registros);

                //Arreglo para que solo coja los datos que se nesecitan en registros.
                String[]registrosLunes = registros[3].split(",");
                String[]registrosMartes = registros[4].split(",");
                String[]registrosMiercoles = registros[5].split(",");
                String[]registrosJueves = registros[6].split(",");
                String[]registrosViernes = registros[7].split(",");
                String[]registrosSabado = registros[8].split(",");
                String[]registrosDomingo = registros[9].split("}");

                // Capturando los datos
                String codigo = registros[0].strip();
                String nombre = registros[1];
                String disponibilidadLunes = registrosLunes[0].strip();
                String disponibilidadMartes = registrosMartes[0].strip();
                String disponibilidadMiercoles = registrosMiercoles[0].strip();
                String disponibilidadJueves = registrosJueves[0].strip();
                String disponibilidadViernes = registrosViernes[0].strip();
                String disponibilidadSabado = registrosSabado[0].strip();
                String disponibilidadDomingo = registrosDomingo[0].strip();

                // Validar los datos

                    Validadores.esCodigoValido(codigo);
                    Validadores.ComparaciónCodigoIgualesPARAGENERADOR(codigo,filename,i);
                    Validadores.esNombreValido(nombre);
                    Validadores.esDisponibilidadValidad(disponibilidadLunes,"Lunes");
                    Validadores.esDisponibilidadValidad(disponibilidadMartes,"Martes");
                    Validadores.esDisponibilidadValidad(disponibilidadMiercoles,"Miercoles");
                    Validadores.esDisponibilidadValidad(disponibilidadJueves,"Jueves");
                    Validadores.esDisponibilidadValidad(disponibilidadViernes,"Viernes");
                    Validadores.esDisponibilidadValidad(disponibilidadSabado,"Sábado");
                    Validadores.esDisponibilidadValidad(disponibilidadDomingo,"Domingo");

                    //Convierte el String en un enum con el valueOf.
                    Disponibilidad DisponibilidadLunes = Disponibilidad.valueOf(disponibilidadLunes);
                    Disponibilidad DisponibilidadMartes = Disponibilidad.valueOf(disponibilidadMartes);
                    Disponibilidad DisponibilidadMiercoles = Disponibilidad.valueOf(disponibilidadMiercoles);
                    Disponibilidad DisponibilidadJueves = Disponibilidad.valueOf(disponibilidadJueves);
                    Disponibilidad DisponibilidadViernes = Disponibilidad.valueOf(disponibilidadViernes);
                    Disponibilidad DisponibilidadSabado = Disponibilidad.valueOf(disponibilidadSabado);
                    Disponibilidad DisponibilidadDomingo = Disponibilidad.valueOf(disponibilidadDomingo);

                    // si se superaron los validadores, crear objeto y aumentar registros ok
                    // Crear objeto Usuario
                    StringBuffer BufferCodigo= new StringBuffer(codigo);
                    StringBuffer BufferNombre= new StringBuffer(nombre);

                    dataDocentes[j] = new Docente(BufferCodigo,DisponibilidadLunes,DisponibilidadMartes,
                            DisponibilidadMiercoles,DisponibilidadJueves,DisponibilidadViernes,
                            DisponibilidadSabado,DisponibilidadDomingo,BufferNombre);
                    j++;
                    DatosOK++;
                }catch(Exception e){
                    errores++;
                    try {
                        errorLog.log(e.getMessage(), ErrorLog.Level.ERROR,"Generador");
                    }catch (Exception ex){
                        System.out.printf("Error al registrar logs");
                    }
                }
            }

            //Guardar datos para los reportes
            VentanaReportes.setDatadocentes(dataDocentes);
            VentanaReportes.setDataFile(filename);

        }catch (Exception e){
        }

        lblDatosOK.setText("REGISTROS OK: " + DatosOK);
        lblDatosError.setText("REGISTROS ERROR:" + errores);

        //Guardar datos para los reportes
        VentanaReportes.setDataregistrosErrores(errores);
        VentanaReportes.setDataregistrosOK(DatosOK);

        DatosOK = 0;
        errores = 0;
    }


    //El procedimiento abrirVentana4 muestra la ventana Reportes y
    // valida que las rutas no estén vacías.
    //Alumno: Alejandro
    private void abrirventana4 (Object o){
        VentanaReportes mostrar = new VentanaReportes();
        try {
            Validadores.esReporteVacío(txtRuta.getText());
            mostrar.mostrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),
                    "ERROR",JOptionPane.ERROR_MESSAGE);
            try {
                errorLog.log(e.getMessage(), ErrorLog.Level.ERROR,"Generador");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


    //El procedimiento mostrar crea la ventana y establece los controles en esta misma.
    //Alumno: Alejandro
    public void mostrar(){
        prepararControles();
        SwingUTP3.runWindow("Análisis de datos",
                300, 300);
    }


    // La función lineasCorrectas pide el ingreso del array de líneas y un String filename
    // y devuelve el número de líneas que están correctas, esto nos servirá para inicializar
    // el array de docente.
    // Alumno: Gabriel
    public int lineasCorrectas(String[] lineas,String filename) {

        int lineasCorrecta = 0;
        for (int i = 0; i < lineas.length; i++) {


            // Dividir la cadena
            String[] registros = lineas[i].split(":");

            try {
                Validadores.esLineaRegistroValida(registros);

                //Arreglo para que solo coja los datos que se nesecitan en registros.
                String[] registrosLunes = registros[3].split(",");
                String[] registrosMartes = registros[4].split(",");
                String[] registrosMiercoles = registros[5].split(",");
                String[] registrosJueves = registros[6].split(",");
                String[] registrosViernes = registros[7].split(",");
                String[] registrosSabado = registros[8].split(",");
                String[] registrosDomingo = registros[9].split("}");

                // Capturando los datos
                String codigo = registros[0].strip();
                String nombre = registros[1];
                String disponibilidadLunes = registrosLunes[0].strip();
                String disponibilidadMartes = registrosMartes[0].strip();
                String disponibilidadMiercoles = registrosMiercoles[0].strip();
                String disponibilidadJueves = registrosJueves[0].strip();
                String disponibilidadViernes = registrosViernes[0].strip();
                String disponibilidadSabado = registrosSabado[0].strip();
                String disponibilidadDomingo = registrosDomingo[0].strip();

                // Validar los datos

                try {
                    Validadores.esCodigoValido(codigo);
                    Validadores.ComparaciónCodigoIgualesPARAGENERADOR(codigo,filename,i);
                    Validadores.esNombreValido(nombre);
                    Validadores.esDisponibilidadValidad(disponibilidadLunes, "Lunes");
                    Validadores.esDisponibilidadValidad(disponibilidadMartes, "Martes");
                    Validadores.esDisponibilidadValidad(disponibilidadMiercoles, "Miercoles");
                    Validadores.esDisponibilidadValidad(disponibilidadJueves, "Jueves");
                    Validadores.esDisponibilidadValidad(disponibilidadViernes, "Viernes");
                    Validadores.esDisponibilidadValidad(disponibilidadSabado, "Sábado");
                    Validadores.esDisponibilidadValidad(disponibilidadDomingo, "Domingo");
                    lineasCorrecta++;
                } catch (Exception e) {
                }

            } catch (Exception e) {
            }
        }
        return lineasCorrecta;
    }
}
