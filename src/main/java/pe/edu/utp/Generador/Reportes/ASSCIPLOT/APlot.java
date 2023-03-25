package pe.edu.utp.Generador.Reportes.ASSCIPLOT;
//Gabriel
public class APlot {
    // La funcion makePlopData recibe dos int "m" y "n" y devuelve una matriz
    // char que dibuja la Creación del plot vacio.
    // Gabriel
    public static char[][] makePlopData(int n, int m) {
        char[][] plop = new char[n][m];
        //Iteramos
        for (int f = 0; f < plop.length; f++) {
            for (int c = 0; c < plop[0].length; c++) {
                plop[f][c] = ' ';
            }
        }
        return plop;
    }

    // El procedimiento copyData recibe dos array int "info" y "info2" y realiza una
    // asignación de la ubicación donde está nuestra info en el plot.
    // Gabriel
    public static void copyData (int[] info, int[] info2){
        int k = 0;
        int j = 2;
        for (int i = 0; i < info.length; i++) {
            if (i == j){
                info[i] = info2[k];
                k++;
                j = j + 3;
            }else{
                info[i] = 0;
            }
        }
    }

    // El procedimiento setPlotData recibe una matriz char "data" y un array "info" y
    // realiza una asignación de los valores de la barra para el plot (Contruyendo las
    // barras).
    // Gabriel
    public static void setPlotData(char[][] data, int[] info) {
        int ejeX = 22 - 1;
        for (int i = 0; i < info.length; i++) {
            int ejeY = switch (info[i]) {
                case 0 -> -1;
                case 10 -> 9;
                case 20 -> 8;
                case 30 -> 7;
                case 40 -> 6;
                case 50 -> 5;
                case 60 -> 4;
                case 70 -> 3;
                case 80 -> 2;
                case 90 -> 1;
                case 100 -> 0;
                default -> -1;
            };

            if (ejeY == -1){
                int k = 0;
                data[k][ejeX--] = ' ';
            }else {
                if (ejeY >= 0){
                    int ContructorVertical = ejeY;
                    int ConstructorHorizontal = ejeX;
                    for (int j = 10; j > ejeY; j--) {
                        data[ContructorVertical][ConstructorHorizontal] = '█';
                        ContructorVertical++;}
                    ejeX--;
                }
            }
        }
    }

    // El procedimiento CreationGraficaPROFESORES recibe un array "info2" y realiza la
    // Asignación de data a los procedimientos ya creados.
    // Gabriel
    public static void CreationGraficaPROFESORES (int[] info2){
        char[][] plot = makePlopData(10, 22);
        int[] info = new int[22];
        int[] eje = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        copyData(info, info2);
        setPlotData(plot, info);
        drawPlot(plot,eje);
    }

    // El procedimiento drawPlot recibe una matriz char "plot" y un array int "eje"
    // realiza el dibujo de nuestra gráfica PLOT con los arreglos respectivos.
    // Gabriel
    public static void drawPlot ( char[][] plot, int[] eje){
        // Dibujamos el plot.
        System.out.printf("═════════════════════════════════════════════════\n");
        System.out.printf("                 - GRÁFICA N°01: -               \n");
        System.out.printf("           │ DISPONIBILIDAD HORARIA │            \n");
        System.out.printf("                   - RESUMEN -                   \n");
        System.out.printf("═════════════════════════════════════════════════\n");

        for (int f = 0; f < plot.length; f++) {
            System.out.printf("%3d%% │", eje[f]);
            int CuadrarBarras = 1;
            int CuadrarEspacios = 2;
            for (int c = 0; c < plot[0].length; c++) {
                System.out.printf("%c",plot[f][c]);
                if (c == CuadrarBarras){
                    System.out.printf("%c%c",plot[f][c],plot[f][c]);
                    CuadrarBarras = CuadrarBarras + 3;
                }

                if (c == CuadrarEspacios){
                    System.out.printf(" ");
                    CuadrarEspacios = CuadrarEspacios+3;
                }
            }
            System.out.printf("\n");
        }
        System.out.printf("═════════════════════════════════════════════════\n");
        System.out.printf("     │  L  │  M  │  M  │  J  │  V  │  S  │  D  │ \n");
        System.out.printf("     │  U  │  A  │  I  │  U  │  I  │  A  │  O  │ \n");
        System.out.printf("     │  N  │  R  │  E  │  E  │  E  │  B  │  M  │ \n");
        System.out.printf("═════════════════════════════════════════════════\n");
    }
}
