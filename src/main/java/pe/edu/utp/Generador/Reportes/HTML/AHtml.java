package pe.edu.utp.Generador.Reportes.HTML;

import pe.edu.utp.Disponibilidad;
import pe.edu.utp.Generador.Docente;


public class AHtml {

    // Funcion getDataHtmlONE recibe el objeto docente y devuelve un String.
    // ALUMNO: Harbiz Dia
    public static String getDataHtmlONE(Docente docente){
        String nombre = String.valueOf(docente.getNombre());
        String codigo = String.valueOf(docente.getCodigo());

        String htmlONE = """
                <body class="calendarPage">
                    <header>
                        <h1>%s %s</h1>  <!--Profesor - codigo-->
                    </header>
                    <main>
                """;
        return String.format(htmlONE,nombre,codigo);
    }

    // Funcion getDataHtmlLUNES recibe el objeto docente y devuelve un String del html
    // en el día Lunes.
    // ALUMNO: Harbiz Dia
    public static String getDataHtmlLUNES(Docente docente){

        String ColorBloqueSI = "slotamarillo";
        String ColorBloqueNO = "slotgris";
        String[] ColorBloque = {ColorBloqueNO,ColorBloqueNO,ColorBloqueNO};

        if (docente.getDisponibilidadLunes() == Disponibilidad.ALL){
            ColorBloque[0] = ColorBloqueSI;
            ColorBloque[1] = ColorBloqueSI;
            ColorBloque[2] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadLunes() == Disponibilidad.M){
            ColorBloque[0] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadLunes() == Disponibilidad.T){
            ColorBloque[1] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadLunes() == Disponibilidad.N){
            ColorBloque[2] = ColorBloqueSI;
        }

        String htmlTWO = """
                            <div class="slotsdiv">
                                <div class="slot dayname">Horario</div>
                                <div class="slot">08:00 - 09:30</div>
                                <div class="slot">09:30 - 09:45</div>
                                <div class="slot">09:45 - 11:15</div>
                                <div class="slot">11:15 - 11:30</div>
                                <div class="slot">11:30 - 01:00</div>
                                <div class="slot">Descanso</div>
                                <div class="slot">02:00 - 03:30</div>
                                <div class="slot">03:30 - 03:45</div>
                                <div class="slot">03:45 - 05:15</div>
                                <div class="slot">05:15 - 05:30</div>
                                <div class="slot">05:30 - 07:00</div>
                                <div class="slot">07:00 - 07:15</div>
                                <div class="slot">07:15 - 08:45</div>
                                <div class="slot">08:45 - 09:00</div>
                                <div class="slot">09:00 - 10:30</div>
                            </div>
                            <!---->
                            <div class="slotsdiv">
                                <div class="slot dayname">Lunes</div>
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="slotrojo">_</div>
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                            </div>                              
                        """;

        return String.format(htmlTWO,ColorBloque[0],ColorBloque[0],ColorBloque[0],
                ColorBloque[0],ColorBloque[0],ColorBloque[1],ColorBloque[1],ColorBloque[1]
                ,ColorBloque[1],ColorBloque[1],ColorBloque[2],ColorBloque[2],ColorBloque[2],
                ColorBloque[2]);
    }

    // Funcion getDataHtmlMartes recibe el objeto docente y devuelve un String del html
    // en el día Martes.
    // ALUMNO: Harbiz Dia
    public static String getDataHtmlMartes(Docente docente){

        String ColorBloqueSI = "slotamarillo";
        String ColorBloqueNO = "slotgris";
        String[] ColorBloque = {ColorBloqueNO,ColorBloqueNO,ColorBloqueNO};

        if (docente.getDisponibilidadMartes() == Disponibilidad.ALL){
            ColorBloque[0] = ColorBloqueSI;
            ColorBloque[1] = ColorBloqueSI;
            ColorBloque[2] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadMartes() == Disponibilidad.M){
            ColorBloque[0] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadMartes() == Disponibilidad.T){
            ColorBloque[1] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadMartes() == Disponibilidad.N){
            ColorBloque[2] = ColorBloqueSI;
        }

        String htmlTWO = """
                            <!---->
                            <div class="slotsdiv">
                                <div class="slot dayname">Martes</div>
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="slotrojo">_</div>
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                            </div>                              
                        """;

        return String.format(htmlTWO,ColorBloque[0],ColorBloque[0],ColorBloque[0],
                ColorBloque[0],ColorBloque[0],ColorBloque[1],ColorBloque[1],ColorBloque[1]
        ,ColorBloque[1],ColorBloque[1],ColorBloque[2],ColorBloque[2],ColorBloque[2],
                ColorBloque[2]);
    }

    // Funcion getDataHtmlMiercoles recibe el objeto docente y devuelve un String del html
    // en el día Miercoles.
    // ALUMNO: Harbiz Dia
    public static String getDataHtmlMiercoles(Docente docente){

        String ColorBloqueSI = "slotamarillo";
        String ColorBloqueNO = "slotgris";
        String[] ColorBloque = {ColorBloqueNO,ColorBloqueNO,ColorBloqueNO};

        if (docente.getDisponibilidadMiercoles() == Disponibilidad.ALL){
            ColorBloque[0] = ColorBloqueSI;
            ColorBloque[1] = ColorBloqueSI;
            ColorBloque[2] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadMiercoles() == Disponibilidad.M){
            ColorBloque[0] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadMiercoles() == Disponibilidad.T){
            ColorBloque[1] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadMiercoles() == Disponibilidad.N){
            ColorBloque[2] = ColorBloqueSI;
        }

        String htmlTWO = """
                            <!---->
                            <div class="slotsdiv">
                                <div class="slot dayname">Miercoles</div>
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="slotrojo">_</div>
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                            </div>                              
                        """;

        return String.format(htmlTWO,ColorBloque[0],ColorBloque[0],ColorBloque[0],
                ColorBloque[0],ColorBloque[0],ColorBloque[1],ColorBloque[1],ColorBloque[1]
                ,ColorBloque[1],ColorBloque[1],ColorBloque[2],ColorBloque[2],ColorBloque[2],
                ColorBloque[2]);
    }

    // Funcion getDataHtmlJueves recibe el objeto docente y devuelve un String del html
    // en el día jueves.
    // ALUMNO: Harbiz Dia
    public static String getDataHtmlJueves(Docente docente){

        String ColorBloqueSI = "slotamarillo";
        String ColorBloqueNO = "slotgris";
        String[] ColorBloque = {ColorBloqueNO,ColorBloqueNO,ColorBloqueNO};

        if (docente.getDisponibilidadJueves() == Disponibilidad.ALL){
            ColorBloque[0] = ColorBloqueSI;
            ColorBloque[1] = ColorBloqueSI;
            ColorBloque[2] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadJueves() == Disponibilidad.M){
            ColorBloque[0] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadJueves() == Disponibilidad.T){
            ColorBloque[1] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadJueves() == Disponibilidad.N){
            ColorBloque[2] = ColorBloqueSI;
        }

        String htmlTWO = """
                            <!---->
                            <div class="slotsdiv">
                                <div class="slot dayname">Jueves</div>
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="slotrojo">_</div>
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                            </div>                              
                        """;

        return String.format(htmlTWO,ColorBloque[0],ColorBloque[0],ColorBloque[0],
                ColorBloque[0],ColorBloque[0],ColorBloque[1],ColorBloque[1],ColorBloque[1]
                ,ColorBloque[1],ColorBloque[1],ColorBloque[2],ColorBloque[2],ColorBloque[2],
                ColorBloque[2]);
    }

    // Funcion getDataHtmlViernes recibe el objeto docente y devuelve un String del html
    // en el día viernes.
    // ALUMNO: Harbiz Dia
    public static String getDataHtmlViernes(Docente docente){

        String ColorBloqueSI = "slotamarillo";
        String ColorBloqueNO = "slotgris";
        String[] ColorBloque = {ColorBloqueNO,ColorBloqueNO,ColorBloqueNO};

        if (docente.getDisponibilidadViernes() == Disponibilidad.ALL){
            ColorBloque[0] = ColorBloqueSI;
            ColorBloque[1] = ColorBloqueSI;
            ColorBloque[2] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadViernes() == Disponibilidad.M){
            ColorBloque[0] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadViernes() == Disponibilidad.T){
            ColorBloque[1] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadViernes() == Disponibilidad.N){
            ColorBloque[2] = ColorBloqueSI;
        }

        String htmlTWO = """
                            <!---->
                            <div class="slotsdiv">
                                <div class="slot dayname">Viernes</div>
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="slotrojo">_</div>
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                            </div>                              
                        """;

        return String.format(htmlTWO,ColorBloque[0],ColorBloque[0],ColorBloque[0],
                ColorBloque[0],ColorBloque[0],ColorBloque[1],ColorBloque[1],ColorBloque[1]
                ,ColorBloque[1],ColorBloque[1],ColorBloque[2],ColorBloque[2],ColorBloque[2],
                ColorBloque[2]);
    }

    // Funcion getDataHtmlSabado recibe el objeto docente y devuelve un String del html
    // en el día sabado.
    // ALUMNO: Harbiz Dia
    public static String getDataHtmlSabado(Docente docente){

        String ColorBloqueSI = "slotamarillo";
        String ColorBloqueNO = "slotgris";
        String[] ColorBloque = {ColorBloqueNO,ColorBloqueNO,ColorBloqueNO};

        if (docente.getDisponibilidadSabado() == Disponibilidad.ALL){
            ColorBloque[0] = ColorBloqueSI;
            ColorBloque[1] = ColorBloqueSI;
            ColorBloque[2] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadSabado() == Disponibilidad.M){
            ColorBloque[0] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadSabado() == Disponibilidad.T){
            ColorBloque[1] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadSabado() == Disponibilidad.N){
            ColorBloque[2] = ColorBloqueSI;
        }

        String htmlTWO = """
                            <!---->
                            <div class="slotsdiv">
                                <div class="slot dayname">Sabado</div>
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="slotrojo">_</div>
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                            </div>                              
                        """;

        return String.format(htmlTWO,ColorBloque[0],ColorBloque[0],ColorBloque[0],
                ColorBloque[0],ColorBloque[0],ColorBloque[1],ColorBloque[1],ColorBloque[1]
                ,ColorBloque[1],ColorBloque[1],ColorBloque[2],ColorBloque[2],ColorBloque[2],
                ColorBloque[2]);
    }

    // Funcion getDataHtmlDomingo recibe el objeto docente y devuelve un String del html
    // en el día Domingo.
    // ALUMNO: Harbiz Dia
    public static String getDataHtmlDomingo(Docente docente){

        String ColorBloqueSI = "slotamarillo";
        String ColorBloqueNO = "slotgris";
        String[] ColorBloque = {ColorBloqueNO,ColorBloqueNO,ColorBloqueNO};

        if (docente.getDisponibilidadDomingo() == Disponibilidad.ALL){
            ColorBloque[0] = ColorBloqueSI;
            ColorBloque[1] = ColorBloqueSI;
            ColorBloque[2] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadDomingo() == Disponibilidad.M){
            ColorBloque[0] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadDomingo() == Disponibilidad.T){
            ColorBloque[1] = ColorBloqueSI;
        }

        if (docente.getDisponibilidadDomingo() == Disponibilidad.N){
            ColorBloque[2] = ColorBloqueSI;
        }

        String htmlTWO = """
                            <!---->
                            <div class="slotsdiv">
                                <div class="slot dayname">Domingo</div>
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="%s">_</div> <!--Primer bloque-->
                                <div class="slotrojo">_</div>
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Segundo bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                                <div class="%s">_</div> <!--Tercer bloque-->
                            </div>                              
                        """;

        return String.format(htmlTWO,ColorBloque[0],ColorBloque[0],ColorBloque[0],
                ColorBloque[0],ColorBloque[0],ColorBloque[1],ColorBloque[1],ColorBloque[1]
                ,ColorBloque[1],ColorBloque[1],ColorBloque[2],ColorBloque[2],ColorBloque[2],
                ColorBloque[2]);
    }

    // Funcion showHTML recibe el objeto docente, el array de docentes y el int posición i y
    // devuelve un String del html de un profesor.
    // ALUMNO: Harbiz Dia
    public static String showHTML(Docente docente, Docente[] docentes, int i) {
        String header = """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Calendario</title>
                    <link rel="stylesheet" href="css/combined.css">                  
                </head>
                """;

        String footer = """
                    </main>
                    <div id="menu">
                		<ul>
                            <li><a href="%s">Atras</a></li>
                            <li><a href="%s">Adelante</a></li>
                        </ul>
                    </div>
                </body>
                </html>
                """;


        //Agregar otro setget para poder sacarlo. y agragar otro parametro de la lista.

        String codigoAnteriorDocente = "";
        String codigoPosteriorDocente = "";

        if (i == 0){
            codigoAnteriorDocente = "index";
        }else {
            codigoAnteriorDocente = String.valueOf(docentes[i-1].getCodigo());
        }

        if (i == (docentes.length-1) ){
            codigoPosteriorDocente = String.valueOf(docentes[0].getCodigo());
        }else {
            codigoPosteriorDocente = String.valueOf(docentes[i+1].getCodigo());
        }

        String linkAnterior = String.format("D:\\PF-Random\\src\\main\\resources\\Html\\%s.html",codigoAnteriorDocente);
        String linkPosterior = String.format("D:\\PF-Random\\src\\main\\resources\\Html\\%s.html",codigoPosteriorDocente);

        String Footer = String.format(footer,linkAnterior,linkPosterior);

        return String.format("%s%s%s%s%s%s%s%s%s%s",header,getDataHtmlONE(docente),getDataHtmlLUNES(docente),
                getDataHtmlMartes(docente),getDataHtmlMiercoles(docente),getDataHtmlJueves(docente),
                getDataHtmlViernes(docente),getDataHtmlSabado(docente),getDataHtmlDomingo(docente),Footer);
    }

    // Funcion showIndexHTML recibe el objeto docente, el array de String "links" y el
    // array String de codigos y devuelve un String del html del indice.
    // ALUMNO: Harbiz Dia
    public static String showIndexHTML(String[] links, String[] codigo){

        String header = """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                	<meta charset="UTF-8">
                	<title>Barra de navegación</title>
                                
                	<style>
                		body{background-color: #4642B8;padding: 150px;font-family: Arial;}
                		
                		#menu{
                			background-color: #000;
                                
                		}
                                
                		#main-container{
                 		 padding-top: 20px;
                		  text-align: left;
                		}
                                
                		.btn{
                 		 border-radius: 3px;
                  		display: inline-block;
                  		padding: 20px 15px;
                  		text-decoration: none;
                  		text-shadow: 0 1px 0 rgba(255,255,255,0.3);
                  		box-shadow: 0 1px 1px rgba(0,0,0,0.3);\s
                		}
                                
                		.btn-naranja{
                  			color: white;
                 		 	background-color: #000000;
                		}
                		.btn-naranja:hover{
                 		 	background-color: #ff9933;	
                		}
                		.btn-naranja:active{
                  			background-color: #ff9933;
                		}
                	</style>
                </head>
                <body>
                    <div id="main-container">              
                """;

        String datafalse = """               
                		<a href="%s" class="btn btn-naranja">%s</a>                               
                """;

        //data tiene la función de juntar todas las nuevas lineas creadas en el fori.
        String[] datafinal = new String[links.length];

        String data = "";
        for (int i = 0; i < links.length; i++) {
            datafinal[i] = String.format(datafalse,links[i],codigo[i]);
            data = data + datafinal[i];
        }

        String footer = """
                	</div>
                </body>
                </html>
                """;

        return String.format("%s%s%s",header,data,footer);
    }
}
