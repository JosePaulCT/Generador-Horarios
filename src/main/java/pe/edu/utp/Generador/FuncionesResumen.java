package pe.edu.utp.Generador;

public class FuncionesResumen {

    //La funcion nameFile recibe el archivo y te lo devuelve (String).
    // ALUMNO: Miguel Ruiz
    public static String nameFile (String File){
        return File;
    }

    // La funcion RegistrosOK recibe el número registros validos y los devuelve (int).
    // ALUMNO: Miguel Ruiz
    public static int RegistrosOK (int registrosOK){
        return registrosOK;
    }

    // La funcion RegistrosERROR recibe el número de registros erroneos y los devuelve (int).
    // ALUMNO: Miguel Ruiz
    public static int RegistrosERROR (int errores){
        return errores;
    }

    // La funcion HorasTotalesLUNES recibe un array de docentes y nos devuelve las horas
    // totales en el dia lunes en un int.
    // ALUMNO: Miguel Ruiz
    public static int HorasTotalesLUNES(Docente[] Docentes){

        int HorasTotales = 0;

        //Asigna el número de horas de cada docente y luego lo suma
        for (int i = 0; i < Docentes.length; i++) {
            // La funcion Docentes[i].getDisponibilidadLunes(), nos da la dispinibilidad
            // de un docente en un dia.
            int Horas = switch (Docentes[i].getDisponibilidadLunes()){
                case M -> 6;
                case T -> 6;
                case N -> 4;
                case ALL -> 16;
                default -> 0;
            };

            //Acumulador de horas totales.
            HorasTotales = HorasTotales + Horas;
        }

        return HorasTotales;
    }

    // La funcion HorasTotalesMARTES recibe un array de docentes y nos devuelve las horas
    // totales en el dia Martes en un int.
    // ALUMNO: Miguel Ruiz
    public static int HorasTotalesMARTES(Docente[] Docentes){

            int HorasTotales = 0;

            //Asigna el número de horas de cada docente y luego lo suma
            for (int i = 0; i < Docentes.length; i++) {
                int Horas = switch (Docentes[i].getDisponibilidadMartes()){
                    case M -> 6;
                    case T -> 6;
                    case N -> 4;
                    case ALL -> 16;
                    default -> 0;
                };

                HorasTotales = HorasTotales + Horas;
            }

        return HorasTotales;
    }

    // La funcion HorasTotalesMIERCOLES recibe un array de docentes y nos devuelve las horas
    // totales en el dia miercoles en un int.
    // ALUMNO: Miguel Ruiz
    public static int HorasTotalesMIERCOLES(Docente[] Docentes){

            int HorasTotales = 0;

            //Asigna el número de horas de cada docente y luego lo suma
            for (int i = 0; i < Docentes.length; i++) {
                int Horas = switch (Docentes[i].getDisponibilidadMiercoles()){
                    case M -> 6;
                    case T -> 6;
                    case N -> 4;
                    case ALL -> 16;
                    default -> 0;
                };

                HorasTotales = HorasTotales + Horas;
            }

        return HorasTotales;
    }

    // La funcion HorasTotalesJUEVES recibe un array de docentes y nos devuelve las horas
    // totales en el dia jueves en un int.
    // ALUMNO: Miguel Ruiz
    public static int HorasTotalesJUEVES(Docente[] Docentes){

        int HorasTotales = 0;

        //Asigna el número de horas de cada docente y luego lo suma
        for (int i = 0; i < Docentes.length; i++) {
            int Horas = switch (Docentes[i].getDisponibilidadJueves()){
                case M -> 6;
                case T -> 6;
                case N -> 4;
                case ALL -> 16;
                default -> 0;
            };

            HorasTotales = HorasTotales + Horas;
        }

        return HorasTotales;
    }

    // La funcion HorasTotalesVIERNES recibe un array de docentes y nos devuelve las horas
    // totales en el dia viernes en un int.
    // ALUMNO: Miguel Ruiz
    public static int HorasTotalesVIERNES(Docente[] Docentes){

        int HorasTotales = 0;

        //Asigna el número de horas de cada docente y luego lo suma
        for (int i = 0; i < Docentes.length; i++) {
            int Horas = switch (Docentes[i].getDisponibilidadViernes()){
                case M -> 6;
                case T -> 6;
                case N -> 4;
                case ALL -> 16;
                default -> 0;
            };

            HorasTotales = HorasTotales + Horas;
        }

        return HorasTotales;
    }

    // La funcion HorasTotalesSABADO recibe un array de docentes y nos devuelve las horas
    // totales en el dia sabado en un int.
    // ALUMNO: Miguel Ruiz
    public static int HorasTotalesSABADO(Docente[] Docentes){

        int HorasTotales = 0;

        //Asigna el número de horas de cada docente y luego lo suma
        for (int i = 0; i < Docentes.length; i++) {
            int Horas = switch (Docentes[i].getDisponibilidadSabado()){
                case M -> 6;
                case T -> 6;
                case N -> 4;
                case ALL -> 16;
                default -> 0;
            };

            HorasTotales = HorasTotales + Horas;
        }

        return HorasTotales;
    }

    // La funcion HorasTotalesDOMINGO recibe un array de docentes y nos devuelve las horas
    // totales en el dia domingo en un int.
    // ALUMNO: Miguel Ruiz
    public static int HorasTotalesDOMINGO(Docente[] Docentes){

        int HorasTotales = 0;

        //Asigna el número de horas de cada docente y luego lo suma
        for (int i = 0; i < Docentes.length; i++) {
            int Horas = switch (Docentes[i].getDisponibilidadDomingo()){
                case M -> 6;
                case T -> 6;
                case N -> 4;
                case ALL -> 16;
                default -> 0;
            };

            HorasTotales = HorasTotales + Horas;
        }

        return HorasTotales;
    }

    //La función HorasTotalesBloqueM un array de docentes y cuenta los horas totales
    // del bloque M en un int.
    // ALUMNO: Miguel Ruiz
    public static int HorasTotalesBloqueM (Docente[] Docentes){

        int HorasTotales = 0;

        for (int i = 0; i < Docentes.length ; i++) {
            // La funcion getNroDisponibilidadM() Nos indica cuantas veces el docente
            // puede solo en la mañana (No cuenta cuando puede all el dia)
            HorasTotales = HorasTotales + 6*Docentes[i].getNroDisponibilidadM();
        }

        //Para que cuente las horas de ALL a la funcion llamamos a las horas totales del
        // bloque all y realizamos un calculo simple.

        // (N)ALL = N(6Noche + 6 Tarde + 4 Noche)
        // Si lo dividimos entre 16, nos da el numero de veces del bloque all
        // 6, nos da las horas totales en las mañana, que no contamos.

        HorasTotales = HorasTotales + (HorasTotalesBloqueALL(Docentes)*6)/16;

        return HorasTotales;
    }

    //La función HorasTotalesBloqueT un array de docentes y cuenta los horas totales
    // del bloque T en un int.
    // ALUMNO: Miguel Ruiz
    public static int HorasTotalesBloqueT (Docente[] Docentes){

        int HorasTotales = 0;

        for (int i = 0; i < Docentes.length ; i++) {
            HorasTotales = HorasTotales + 6*Docentes[i].getNroDisponibilidadT();
        }

        HorasTotales = HorasTotales + (HorasTotalesBloqueALL(Docentes)*6)/16;

        return HorasTotales;
    }

    //La función HorasTotalesBloqueN un array de docentes y cuenta los horas totales
    // del bloque N en un int.
    // ALUMNO: Miguel Ruiz
    public static int HorasTotalesBloqueN (Docente[] Docentes){

        int HorasTotales = 0;

        for (int i = 0; i < Docentes.length ; i++) {
            //Recordar que en la noche son 4 horas pedadogicas de trabajo.
            HorasTotales = HorasTotales + 4*Docentes[i].getNroDisponibilidadN();
        }

        HorasTotales = HorasTotales + (HorasTotalesBloqueALL(Docentes)*4)/16;

        return HorasTotales;
    }

    //La función HorasTotalesBloqueALL un array de docentes y cuenta los horas totales
    // del bloque ALL (Lo utilizaremos en 3 bloques de las lineas 203, 190, 168).
    // ALUMNO: Miguel Ruiz
    public static int HorasTotalesBloqueALL (Docente[] Docentes) {

        int HorasTotales = 0;

        for (int i = 0; i < Docentes.length; i++) {
            HorasTotales = HorasTotales + 16 * Docentes[i].getNroDisponibilidadALL();
        }

        return HorasTotales;
    }

    // La funcion PromedioHorasDocentes recibe el array de docentes y devuelve el float
    // promedio de horas de todos los docentes.
    // ALUMNO: Miguel Ruiz
    public static float PromedioHorasDocentes(Docente[] docentes){

        float promedioHorasDocentes = (float) TotalHorasDisponibles(docentes)/docentes.length;

        return promedioHorasDocentes;
    }

    // La funcion DocenteMasHorasDisponibles recibe el array de docentes y devuelve el
    // StringBuffer del docente con más horas disponibles.
    // ALUMNO: Miguel Ruiz
    public static StringBuffer DocenteMasHorasDisponibles(Docente[] docentes){
        int HoraMaximahastaAqui = 0;
        int PosicionDocenteMAX = 0;

        for (int i = 0; i < docentes.length; i++) {
            //Cuando hallemos que hay un docente con más horas que otro, este pasara a
            //remplazar a la varible HoraMaximahastaAqui y por consiguiente guardaremos
            //su posición del docente.

            if (docentes[i].getTotalHorasDisponibleDocente() > HoraMaximahastaAqui){
                HoraMaximahastaAqui = docentes[i].getTotalHorasDisponibleDocente();
                PosicionDocenteMAX = i;
            }
        }
        //Finalmente, teniendo su posición utilizamos el geter de la clase docente.
        return docentes[PosicionDocenteMAX].getNombre();
    }

    // La funcion DocenteMenosHorasDisponibles recibe el array de docentes y devuelve el
    // StringBuffer del docente con más menos horas disponibles.
    // ALUMNO: Miguel Ruiz
    public static StringBuffer DocenteMenosHorasDisponibles(Docente[] docentes){
        int HoraMinimaHastaAqui = 113;
        int PosicionDocenteMIN = 0;

        for (int i = 0; i < docentes.length; i++) {
            if (docentes[i].getTotalHorasDisponibleDocente() < HoraMinimaHastaAqui){
                HoraMinimaHastaAqui = docentes[i].getTotalHorasDisponibleDocente();
                PosicionDocenteMIN = i;
            }
        }

        return docentes[PosicionDocenteMIN].getNombre();
    }

    // La funcion TotalHorasDisponibles recibe el array de docentes y devuelve un int
    // del total de horas disponibles.
    // ALUMNO: Miguel Ruiz
    public static int TotalHorasDisponibles(Docente[] docentes){
        int totalHorasDisponibles = 0;
        for (int i = 0; i < docentes.length; i++) {
            totalHorasDisponibles = totalHorasDisponibles + docentes[i].getTotalHorasDisponibleDocente();
        }
        return totalHorasDisponibles;
    }
}


