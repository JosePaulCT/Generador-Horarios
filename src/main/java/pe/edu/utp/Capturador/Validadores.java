package pe.edu.utp.Capturador;

import pe.edu.utp.utils.TextUTP;


public class Validadores {

    // Para el código, eliminamos si tiene espacios en blanco y determinamos el tamaño del
    // codigo, si tiene más de 6 (caracter + número) significa que es un error.
    // ALUMNO: Noe
    public static boolean esCodigoValido(String codigo) throws Exception{
        //Cuando tiene 6 digitos es valido.
        if (codigo.strip().length() != 6){
            String msg = "Excepción en el codigo: El codigo %s es inválido " +
                    "(debe tener de 6 digitos)";
            throw new Exception(String.format(msg,codigo));
        }

        //Cuando el primer termino del codigo no es C
        if (codigo.strip().charAt(0) != 'C'){
            String msg = "Excepción en el codigo: El código %s de maestro, " +
                    "debe empezar con la letra C en mayuscula.";
            throw new Exception(String.format(msg,codigo));
        }

        //Cuando la parte numérica del código docente no es un número
        for (int i = 1; i < 6; i++) {
            char elCODE = codigo.strip().charAt(i);
            boolean codigoEntre1y6esNumero = elCODE == '1' || elCODE =='2' ||
                    elCODE == '3' || elCODE == '4' || elCODE == '5' || elCODE == '6' ||
                    elCODE == '7' || elCODE == '8' || elCODE == '9' || elCODE == '0';
            if (!codigoEntre1y6esNumero){
                String msg = "Excepción en el codigo: El código %s " +
                        "en la posición %d no es un número.";
                throw new Exception(String.format(msg,codigo,i));
            }
        }

        return true;
    }

    //Cuando el código registrado es igual a otro registrado previamente. (Capturador)
    //Alumno: Noe + Noe
    public static boolean ComparaciónCodigoIguales(String Newcodigo, String ruta) throws Exception {
        String[] lineas = TextUTP.readlinesAsArray(ruta);
        for (int i = 0; i < lineas.length; i++) {
            String CodigoAComparar = lineas[i].split(":")[0];
            if (CodigoAComparar.equals(Newcodigo)){
                String msg = "Excepción en el codigo: El código %s de maestro, " +
                        "es igual a un código ya registrado.";
                    throw new Exception(String.format(msg,Newcodigo));
            }
        }
        return true;
    }

    //Mismo funcionamiento que el validador anterior pero para el GENERADOR
    //Alumno: Noe + Gabriel
    public static boolean ComparaciónCodigoIgualesPARAGENERADOR (String Newcodigo, String ruta, int k) throws Exception {
        String[] lineas = TextUTP.readlinesAsArray(ruta);

        int j=0;

        for (int i = 0; i <= k; i++) {
            String CodigoAComparar = lineas[i].split(":")[0];
            if (Newcodigo.equals(CodigoAComparar)) {
                j++;

                if(1 < j) {
                    String msg = "Excepción en el codigo: El código %s de maestro, " +
                            "es igual a un código ya registrado.";
                    throw new Exception(String.format(msg, Newcodigo));
                }
            }
        }
        return true;
    }

    //Valida si se ingresa un bloque diferente del propuesto en la consigna.(ALL,M,N,T,X)
    //Alumno: Noe
    public static boolean esDisponibilidadValidad(String disponibilidad, String Dia) throws Exception{

        boolean disponibilidadEquivoca = !(disponibilidad.equals("ALL")||disponibilidad.equals("M")||
                disponibilidad.equals("N")||disponibilidad.equals("T")||disponibilidad.equals("X"));

        if (disponibilidadEquivoca){
            String msg = "Excepción en la disponibilidad del %s: La disponibilidad %s " +
                    "debe ser ALL, M, N, T o X. ";
            throw new Exception(String.format(msg,Dia,disponibilidad));
        }

        return true;
    }

    //El código esNombreValido recibe un String nombre y valida si no le ingresamos
    // data al String nombre.
    // Alumno: Noe.
    public  static  boolean esNombreValido (String nombre) throws Exception{
        if (nombre.strip().equals("")){
            String msg = "Excepcion en nombre: El nombre es invalido";
            throw new Exception(String.format(msg,nombre));
        }
        return true;
    }

    // El validador esLineaRegistroValida recibe un array de las líneas y valida si
    // estas cuentan con caracteres especiales "{" "," mediante su división con el
    // split.
    // ALUMNO: Noe + Gabriel.
    public static boolean esLineaRegistroValida (String[] registroUnaLinea) throws Exception {
        //Ve que no se divida más de 10 veces cuando hacemos el split de :
        if (registroUnaLinea.length != 10){
            String msg = "Excepcion en data: La data ingresada tiene caracteres incongruentes ( { )";
            throw new Exception(String.format(msg));
        }

        String[]registrosLunes = registroUnaLinea[3].split(",");
        String[]registrosMartes = registroUnaLinea[4].split(",");
        String[]registrosMiercoles = registroUnaLinea[5].split(",");
        String[]registrosJueves = registroUnaLinea[6].split(",");
        String[]registrosViernes = registroUnaLinea[7].split(",");
        String[]registrosSabado = registroUnaLinea[8].split(",");

        //Ve que no se divida más de 2 veces cuando hacemos el split de ,
        if (!(registrosLunes.length == 2 ||registrosMartes.length == 2 ||
                registrosMiercoles.length == 2 || registrosJueves.length == 2 ||
                registrosViernes.length == 2 || registrosSabado.length == 2)){
            String msg = "Excepcion en data: La data ingresada tiene caracteres incongruentes ( , )";
            throw new Exception(String.format(msg));
        }

        return true;
    }

    // El validador esRutaInvalida recibe un String de la ruta y valida si se encuentra
    // vacia o no.
    //Añadido por Alejandro
    public static boolean esRutaInvalida(String Ruta) throws Exception {
        if (Ruta.equals("")){
            String msg = "Excepcion en ruta: Ruta inexistente";
            throw new Exception(String.format(msg,Ruta));
        }

        if (Ruta.equals(null)){
            String msg = "Excepcion en ruta: Ruta inexistente";
            throw new Exception(String.format(msg,Ruta));
        }
        return true;
    }

    // El validador esReporteVacío recibe un String de la ruta y valida si se encuentra
    // vacio o no.
    // ALUMNO: Alejandro
    public static boolean esReporteVacío(String Ruta) throws Exception{
        if (Ruta.equals("")){
            String msg = "Excepcion en botón: No puede generar reportes sin antes ingresar una ruta";
            throw new Exception(String.format(msg,Ruta));
        }

        return true;
    }
}
