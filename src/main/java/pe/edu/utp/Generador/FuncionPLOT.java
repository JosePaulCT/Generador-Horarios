package pe.edu.utp.Generador;

import pe.edu.utp.Generador.Reportes.ASSCIPLOT.APlot;

public class FuncionPLOT {
    //PLOTAPP es un procedimiento que asigna posiciones de nuestro gráfico y asu
    // ves se coloca esa información el el drawPLOT
    // ALUMNO: Gabriel
    public static void PLOTAPP(Docente[] docentes){

        int PorcentajeLunes = FuncionesPorcentajesDia.PorcentajeHorasDiaLunes(docentes);

        int PorcentajeMartes = FuncionesPorcentajesDia.PorcentajeHorasDiaMartes(docentes);

        int PorcentajeMiercoles = FuncionesPorcentajesDia.PorcentajeHorasDiaMiercoles(docentes);

        int PorcentajeJueves = FuncionesPorcentajesDia.PorcentajeHorasDiaJueves(docentes);

        int PorcentajeViernes = FuncionesPorcentajesDia.PorcentajeHorasDiaViernes(docentes);

        int PorcentajeSabado = FuncionesPorcentajesDia.PorcentajeHorasDiaSabado(docentes);

        int PorcentajeDomingo = FuncionesPorcentajesDia.PorcentajeHorasDiaDomingo(docentes);

        int[] info2 = {PorcentajeDomingo, PorcentajeSabado, PorcentajeViernes,
                PorcentajeJueves, PorcentajeMiercoles, PorcentajeMartes,
                PorcentajeLunes};

        APlot.CreationGraficaPROFESORES(info2);
    }
}
