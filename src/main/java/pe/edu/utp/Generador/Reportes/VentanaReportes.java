package pe.edu.utp.Generador.Reportes;
import pe.edu.utp.Capturador.ErrorLog;
import pe.edu.utp.Generador.Docente;
import pe.edu.utp.utils.SwingUTP3;
import pe.edu.utp.utils.SwingUTP4;
import pe.edu.utp.utils.TextUTP;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import static pe.edu.utp.Generador.FuncionPLOT.PLOTAPP;
import static pe.edu.utp.Generador.Reportes.ASSCIResumen.AResumen.drawResumen;
import static pe.edu.utp.Generador.Reportes.HTML.AHtml.showHTML;
import static pe.edu.utp.Generador.Reportes.HTML.AHtml.showIndexHTML;

//Alejandro + Gabriel
public class VentanaReportes {
    // 1. Declarar controles y variables globales
    JLabel lblNombreVentana;
    JButton btnASCII_RESUMEN;
    JButton btnASCII_PLOT;
    JButton btnHTML;
    static Docente[] datadocentes;
    static String dataFile;
    static int registrosOK;
    static int registrosErrores;
    ErrorLog errorLog;

    // Basandonos en la lógica de los objetos, para traer la data de otras clases
    // se encontró la forma de hacerlo simulando los getter an setter de un objeto.
    // En este sentido las funciones getDatadocentes, setDatadocentes ,getDataFile
    // setDataFile, setDataregistrosOK, getDataregistrosOK, setDataregistrosErrores,
    // getDataRegistrosErrores sirven para traer data de otras clases y asignarlas a
    // nuestras funciones de esta clase.
    // Alumno: Gabriel

    public static Docente[] getDatadocentes() {
        return datadocentes;
    }

    public static void setDatadocentes(Docente[] datadocentes) {
        VentanaReportes.datadocentes = datadocentes;
    }

    public static String getDataFile() {
        return dataFile;
    }

    public static void setDataFile(String dataFile) {
        VentanaReportes.dataFile = dataFile;
    }

    public static void setDataregistrosOK(int registrosOK){
        VentanaReportes.registrosOK = registrosOK;
    }

    public static int getDataregistrosOK(){
        return registrosOK;
    }

    public static void setDataregistrosErrores(int registrosErrores){
        VentanaReportes.registrosErrores = registrosErrores;
    }

    public static int getDataRegistrosErrores(){
        return registrosErrores;
    }



    //prepararControles es un procedimiento que va a crear la ventana y
    // mostrar los controles.
    public void prepararControles() {
        // 2. Crear controles
        lblNombreVentana = new JLabel("REPORTES");
        btnASCII_RESUMEN= new JButton("ASCII RESUMEN");
        btnASCII_PLOT = new JButton("ASCII PLOT");
        btnHTML = new JButton("HTML");

        // 3. Agregar controles al formulario
        SwingUTP4.addControl(115, 0, 100, 50, lblNombreVentana);
        SwingUTP4.addControl(70, 50, 150, 50, btnASCII_RESUMEN);
        SwingUTP4.addControl(70, 120, 150, 50, btnASCII_PLOT);
        SwingUTP4.addControl(70, 190 , 150, 50, btnHTML);

        //Agregar eventos
        SwingUTP3.addClickEvent(btnASCII_RESUMEN,this::generarResumen);
        SwingUTP3.addClickEvent(btnASCII_PLOT,this::generarPlot);
        SwingUTP3.addClickEvent(btnHTML,this::generarHTML);
    }

    //El procedimiento generarResumen se va a asignar al botón ASCII_RESUMEN para enseñar el ASCII de resumen en la consola
    private void generarResumen(Object o) {
        drawResumen(getDatadocentes(),getDataFile(),getDataregistrosOK(),getDataRegistrosErrores());
    }

    //El procedimiento generarPlot se va a asignar al botón ASCII_PLOT para enseñar el ASCII PLOT en la consola
    public void generarPlot(Object o) {
        PLOTAPP(getDatadocentes());
    }

    //El procedimiento generarHTML va a crear archivos HTML según el código y nombre
    //además, valida si previamente existe un archivo para evitar la sobreescritura.
    //Alumno: Gabriel
    private void generarHTML(Object o) {

        Docente[] docentes = getDatadocentes();
        String[] links = new String[docentes.length];
        String[] codigos = new String[docentes.length];

        for (int i = 0; i < docentes.length; i++) {
            String linkPresent = String.format("D:\\PF-Random\\src\\main\\resources\\Html\\%s.html",docentes[i].getCodigo());

            links[i] = linkPresent;

            codigos[i] = String.valueOf(docentes[i].getCodigo());

            try {
                esArchivoExistenteEntoncesBorrar(linkPresent);
                TextUTP.append(showHTML(docentes[i],docentes,i),linkPresent);
            } catch (IOException e) {
                try {
                    errorLog.log(e.getMessage(), ErrorLog.Level.ERROR,"Generador");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

        try {
            String filename = "D:\\PF-Random\\src\\main\\resources\\Html\\index.html";
            esArchivoExistenteEntoncesBorrar(filename);
            TextUTP.append(showIndexHTML(links,codigos),filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //



    //El procedimiento mostrar crea la ventana y establece los controles en esta misma.
    //Alumno: Alejandro
    public void mostrar(){
        prepararControles();
        SwingUTP4.runWindow("Reportes",
                300, 300);
    }



    //Este procedimiento verifica si el archivo nuevo previamente existe
    //y lo elimina.
    //Alumno: Gabriel
    public static void esArchivoExistenteEntoncesBorrar (String ruta){
        File ArchivoNuevo = new File(ruta);
        if (ArchivoNuevo.exists()){
            ArchivoNuevo.delete();
        }
    }
}
