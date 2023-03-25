package pe.edu.utp.Generador.Reportes.ASSCIResumen;
import pe.edu.utp.Generador.Docente;
import static pe.edu.utp.Generador.FuncionesResumen.*;


public class AResumen {
    // El procedimiento drawResumen recibe un array del objeto docentes, un String "File" y dos int
    // de registrosOK y errores. Realiza el dibujo de nuestro resumen de datos mediante printf y
    // con la información obtenida llamando a funciones creadas en la clase FuncionesResumen.
    // //Miguel Ruiz
    public static void drawResumen(Docente[] docentes, String File, int registrosOK,
                                   int errores){

        //Realizamos los String del repote.
        String HeaderResumen = """
                           ════════════════════════════════════════════════════════════════════════════════════
                                                       -| REPORTE RESUMEN RANDOM |-
                           ════════════════════════════════════════════════════════════════════════════════════                        
                           """;

        String DataResumen = """
                         │ Nombre del archivo: %s
                         │ Cantidad de registros cargados: %d
                         │ Cantidad de registros con errores: %d                       
                         │-----------------------------------------------------------------------------------
                         │ Total de horas pedadogicas disponibles por cada día:
                         │ LUNES: %d
                         │ MARTES: %d 
                         │ MIERCOLES: %d
                         │ JUEVES: %d
                         │ VIERNES: %d
                         │ SABADO: %d
                         │ DOMINGO: %d
                         │-----------------------------------------------------------------------------------                    
                         │ Total de horas pedadogicas disponibles por cada bloque:                       
                         │ M: %d
                         │ T: %d
                         │ N: %d                        
                         │-----------------------------------------------------------------------------------                                     
                         """;

        String footerResumen = """
                           │ Total de horas disponibles en general: %d
                           │ Promedio de horas disponibles: %f    
                           ════════════════════════════════════════════════════════════════════════════════════
                             -> Docente con mayor cantidad de horas disponibles:
                                    - %s
                             -> Docente con menor cantidad de horas disponibles:
                                    - %s
                           ════════════════════════════════════════════════════════════════════════════════════
                           """;

        // Votamos en consola, el reporte
        System.out.printf(HeaderResumen);

        System.out.printf(DataResumen,nameFile(File),RegistrosOK(registrosOK),RegistrosERROR(errores),
                HorasTotalesLUNES(docentes),HorasTotalesMARTES(docentes),HorasTotalesMIERCOLES(docentes),
                HorasTotalesJUEVES(docentes), HorasTotalesVIERNES(docentes),HorasTotalesSABADO(docentes),
                HorasTotalesDOMINGO(docentes),HorasTotalesBloqueM(docentes), HorasTotalesBloqueT(docentes),
                HorasTotalesBloqueN(docentes),HorasTotalesBloqueN(docentes));

        System.out.printf(footerResumen,TotalHorasDisponibles(docentes),PromedioHorasDocentes(docentes),DocenteMasHorasDisponibles(docentes),DocenteMenosHorasDisponibles(docentes));
    }
}
