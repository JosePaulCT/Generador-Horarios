package pe.edu.utp.Generador;

import pe.edu.utp.Disponibilidad;

public class FuncionesPorcentajesDia {

    //La funcion PorcentajeHorasDiaLunes recibe el array de la clase Docente y devuelve
    // un int referido al porcentaje de horas del día lunes (Como número entero múltiplo
    // de 10).
    //Gabriel
    public static int PorcentajeHorasDiaLunes (Docente[] docentes){

        int TotalDocentes = docentes.length;
        int j = 0;

        for (int i = 0; i < docentes.length; i++) {
            if (docentes[i].getDisponibilidadLunes() == Disponibilidad.X){
                j++;
            }
        }

        int porcentajeNoEntero = (int) (((TotalDocentes-j)*10)/TotalDocentes);

        return porcentajeNoEntero*10;
    }

    //La funcion PorcentajeHorasDiaMartes recibe el array de la clase Docente y devuelve
    // un int referido al porcentaje de horas del día martes (Como número entero múltiplo
    // de 10).
    //Gabriel
    public static int PorcentajeHorasDiaMartes (Docente[] docentes){

        int TotalDocentes = docentes.length;
        int j = 0;

        for (int i = 0; i < docentes.length; i++) {
            if (docentes[i].getDisponibilidadMartes() == Disponibilidad.X){
                j++;
            }
        }

        int porcentajeNoEntero = (int) (((TotalDocentes-j)*10)/TotalDocentes);

        return porcentajeNoEntero*10;
    }

    //La funcion PorcentajeHorasDiaMiercoles recibe el array de la clase Docente y devuelve
    // un int referido al porcentaje de horas del día miercoles (Como número entero múltiplo
    // de 10).
    //Gabriel
    public static int PorcentajeHorasDiaMiercoles (Docente[] docentes){

        int TotalDocentes = docentes.length;
        int j = 0;

        for (int i = 0; i < docentes.length; i++) {
            if (docentes[i].getDisponibilidadMiercoles() == Disponibilidad.X){
                j++;
            }
        }

        int porcentajeNoEntero = (int) (((TotalDocentes-j)*10)/TotalDocentes);

        return porcentajeNoEntero*10;
    }

    //La funcion PorcentajeHorasDiaJueves recibe el array de la clase Docente y devuelve
    // un int referido al porcentaje de horas del día jueves (Como número entero múltiplo
    // de 10).
    //Gabriel
    public static int PorcentajeHorasDiaJueves (Docente[] docentes){

        int TotalDocentes = docentes.length;
        int j = 0;

        for (int i = 0; i < docentes.length; i++) {
            if (docentes[i].getDisponibilidadJueves() == Disponibilidad.X){
                j++;
            }
        }

        int porcentajeNoEntero = (int) (((TotalDocentes-j)*10)/TotalDocentes);

        return porcentajeNoEntero*10;
    }

    //La funcion PorcentajeHorasDiaViernes recibe el array de la clase Docente y devuelve
    // un int referido al porcentaje de horas del día viernes (Como número entero múltiplo
    // de 10).
    //Gabriel
    public static int PorcentajeHorasDiaViernes (Docente[] docentes){

        int TotalDocentes = docentes.length;
        int j = 0;

        for (int i = 0; i < docentes.length; i++) {
            if (docentes[i].getDisponibilidadViernes() == Disponibilidad.X){
                j++;
            }
        }

        int porcentajeNoEntero = (int) (((TotalDocentes-j)*10)/TotalDocentes);

        return porcentajeNoEntero*10;
    }

    //La funcion PorcentajeHorasDiaSábado recibe el array de la clase Docente y devuelve
    // un int referido al porcentaje de horas del día Sábado (Como número entero múltiplo
    // de 10).
    //Gabriel
    public static int PorcentajeHorasDiaSabado (Docente[] docentes){

        int TotalDocentes = docentes.length;
        int j = 0;

        for (int i = 0; i < docentes.length; i++) {
            if (docentes[i].getDisponibilidadSabado() == Disponibilidad.X){
                j++;
            }
        }

        int porcentajeNoEntero = (int) (((TotalDocentes-j)*10)/TotalDocentes);

        return porcentajeNoEntero*10;
    }

    //La funcion PorcentajeHorasDiaDomingo recibe el array de la clase Docente y devuelve
    // un int referido al porcentaje de horas del día Domingo (Como número entero múltiplo
    // de 10).
    //Gabriel
    public static int PorcentajeHorasDiaDomingo (Docente[] docentes){

        int TotalDocentes = docentes.length;
        int j = 0;

        for (int i = 0; i < docentes.length; i++) {
            if (docentes[i].getDisponibilidadDomingo() == Disponibilidad.X){
                j++;
            }
        }

        int porcentajeNoEntero = (int) (((TotalDocentes-j)*10)/TotalDocentes);

        return porcentajeNoEntero*10;
    }
}
