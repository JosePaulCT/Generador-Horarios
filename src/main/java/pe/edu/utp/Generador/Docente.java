package pe.edu.utp.Generador;
import pe.edu.utp.Disponibilidad;

// Creamos la clase docente para establecer un objeto.
// ALUMNO: Noe Escurra Rivera
public class Docente {

    //Creamos los atributos del docente, sus constructores y getter and setter
    // ALUMNO: Noe Escurra Rivera
    private StringBuffer codigo;
    private Disponibilidad disponibilidadLunes;
    private Disponibilidad disponibilidadMartes;
    private Disponibilidad disponibilidadMiercoles;
    private Disponibilidad disponibilidadJueves;
    private Disponibilidad disponibilidadViernes;
    private Disponibilidad disponibilidadSabado;
    private Disponibilidad disponibilidadDomingo;
    private StringBuffer nombre;

    //Constructor Vacio
    public Docente() {
    }

    //Constructor completo
    public Docente(StringBuffer codigo, Disponibilidad disponibilidadLunes, Disponibilidad disponibilidadMartes, Disponibilidad disponibilidadMiercoles, Disponibilidad disponibilidadJueves, Disponibilidad disponibilidadViernes, Disponibilidad disponibilidadSabado, Disponibilidad disponibilidadDomingo, StringBuffer nombre) {
        this.codigo = codigo;
        this.disponibilidadLunes = disponibilidadLunes;
        this.disponibilidadMartes = disponibilidadMartes;
        this.disponibilidadMiercoles = disponibilidadMiercoles;
        this.disponibilidadJueves = disponibilidadJueves;
        this.disponibilidadViernes = disponibilidadViernes;
        this.disponibilidadSabado = disponibilidadSabado;
        this.disponibilidadDomingo = disponibilidadDomingo;
        this.nombre = nombre;
    }

    //geterANDsetter
    public StringBuffer getCodigo() {
        return codigo;
    }

    public void setCodigo(StringBuffer codigo) {
        this.codigo = codigo;
    }

    public Disponibilidad getDisponibilidadLunes() {
        return disponibilidadLunes;
    }

    public void setDisponibilidadLunes(Disponibilidad disponibilidadLunes) {
        this.disponibilidadLunes = disponibilidadLunes;
    }

    public Disponibilidad getDisponibilidadMartes() {
        return disponibilidadMartes;
    }

    public void setDisponibilidadMartes(Disponibilidad disponibilidadMartes) {
        this.disponibilidadMartes = disponibilidadMartes;
    }

    public Disponibilidad getDisponibilidadMiercoles() {
        return disponibilidadMiercoles;
    }

    public void setDisponibilidadMiercoles(Disponibilidad disponibilidadMiercoles) {
        this.disponibilidadMiercoles = disponibilidadMiercoles;
    }

    public Disponibilidad getDisponibilidadJueves() {
        return disponibilidadJueves;
    }

    public void setDisponibilidadJueves(Disponibilidad disponibilidadJueves) {
        this.disponibilidadJueves = disponibilidadJueves;
    }

    public Disponibilidad getDisponibilidadViernes() {
        return disponibilidadViernes;
    }

    public void setDisponibilidadViernes(Disponibilidad disponibilidadViernes) {
        this.disponibilidadViernes = disponibilidadViernes;
    }

    public Disponibilidad getDisponibilidadSabado() {
        return disponibilidadSabado;
    }

    public void setDisponibilidadSabado(Disponibilidad disponibilidadSabado) {
        this.disponibilidadSabado = disponibilidadSabado;
    }

    public Disponibilidad getDisponibilidadDomingo() {
        return disponibilidadDomingo;
    }

    public void setDisponibilidadDomingo(Disponibilidad disponibilidadDomingo) {
        this.disponibilidadDomingo = disponibilidadDomingo;
    }

    public StringBuffer getNombre() {
        return nombre;
    }

    public void setNombre(StringBuffer nombre) {
        this.nombre = nombre;
    }

    // Creamos los metodos de nuestro objeto.

    // El método getNroDisponibilidadM devuelve un int de la cantidad de veces que
    // esta disponible el docente en la mañana (M).
    // ALUMNO: Noe Escurra Rivera
    public int getNroDisponibilidadM(){

        int i = 0 ;
        if (getDisponibilidadLunes() == Disponibilidad.M){
            i++;
        }

        if (getDisponibilidadMartes() == Disponibilidad.M){
            i++;
        }

        if (getDisponibilidadMiercoles() == Disponibilidad.M){
            i++;
        }

        if (getDisponibilidadJueves() == Disponibilidad.M){
            i++;
        }

        if (getDisponibilidadViernes() == Disponibilidad.M){
            i++;
        }

        if (getDisponibilidadSabado() == Disponibilidad.M){
            i++;
        }

        if (getDisponibilidadDomingo() == Disponibilidad.M){
            i++;
        }

        return i;
    }

    // El método getNroDisponibilidadT devuelve un int de la cantidad de veces que
    // esta disponible el docente en la tarde (T).
    // ALUMNO: Noe Escurra Rivera
    public int getNroDisponibilidadT(){

        int i = 0 ;
        if (getDisponibilidadLunes() == Disponibilidad.T){
            i++;
        }

        if (getDisponibilidadMartes() == Disponibilidad.T){
            i++;
        }

        if (getDisponibilidadMiercoles() == Disponibilidad.T){
            i++;
        }

        if (getDisponibilidadJueves() == Disponibilidad.T){
            i++;
        }

        if (getDisponibilidadViernes() == Disponibilidad.T){
            i++;
        }

        if (getDisponibilidadSabado() == Disponibilidad.T){
            i++;
        }

        if (getDisponibilidadDomingo() == Disponibilidad.T){
            i++;
        }

        return i;
    }

    // El método getNroDisponibilidadN devuelve un int de la cantidad de veces que
    // esta disponible el docente en la noche (N).
    // ALUMNO: Noe Escurra Rivera
    public int getNroDisponibilidadN(){

        int i = 0 ;
        if (getDisponibilidadLunes() == Disponibilidad.N){
            i++;
        }

        if (getDisponibilidadMartes() == Disponibilidad.N){
            i++;
        }

        if (getDisponibilidadMiercoles() == Disponibilidad.N){
            i++;
        }

        if (getDisponibilidadJueves() == Disponibilidad.N){
            i++;
        }

        if (getDisponibilidadViernes() == Disponibilidad.N){
            i++;
        }

        if (getDisponibilidadSabado() == Disponibilidad.N){
            i++;
        }

        if (getDisponibilidadDomingo() == Disponibilidad.N){
            i++;
        }

        return i;
    }

    // El método getNroDisponibilidadALL devuelve un int de la cantidad de veces que
    // esta disponible el docente ALL (tod el día).
    // ALUMNO: Noe Escurra Rivera
    public int getNroDisponibilidadALL(){

        int i = 0 ;
        if (getDisponibilidadLunes() == Disponibilidad.ALL){
            i++;
        }

        if (getDisponibilidadMartes() == Disponibilidad.ALL){
            i++;
        }

        if (getDisponibilidadMiercoles() == Disponibilidad.ALL){
            i++;
        }

        if (getDisponibilidadJueves() == Disponibilidad.ALL){
            i++;
        }

        if (getDisponibilidadViernes() == Disponibilidad.ALL){
            i++;
        }

        if (getDisponibilidadSabado() == Disponibilidad.ALL){
            i++;
        }

        if (getDisponibilidadDomingo() == Disponibilidad.ALL){
            i++;
        }

        return i;
    }

    // El método getNroDisponibilidadX devuelve un int de la cantidad de veces que
    // NO esta disponible el docente (X).
    // ALUMNO: Noe Escurra Rivera
    public int getNroDisponibilidadX(){

        int i = 0 ;
        if (getDisponibilidadLunes() == Disponibilidad.X){
            i++;
        }

        if (getDisponibilidadMartes() == Disponibilidad.X){
            i++;
        }

        if (getDisponibilidadMiercoles() == Disponibilidad.X){
            i++;
        }

        if (getDisponibilidadJueves() == Disponibilidad.X){
            i++;
        }

        if (getDisponibilidadViernes() == Disponibilidad.X){
            i++;
        }

        if (getDisponibilidadSabado() == Disponibilidad.X){
            i++;
        }

        if (getDisponibilidadDomingo() == Disponibilidad.X){
            i++;
        }

        return i;
    }

    // El método getTotalHorasDisponibleDocente devuelve un int de la cantidad de horas
    // totales del docente.
    // ALUMNO: Noe Escurra Rivera
    public int getTotalHorasDisponibleDocente(){
        int totalHorasDisponiblesDocente = getNroDisponibilidadALL()*16 + getNroDisponibilidadN()*4 + getNroDisponibilidadT()*6 + getNroDisponibilidadM()*6;
        return totalHorasDisponiblesDocente;
    }
}
