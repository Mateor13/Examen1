package Pasajes;

public class Pasajero {
    String nombre, cedula;
    int Edad;

    //Constructores
    public Pasajero() {
    }

    public Pasajero(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        Edad = edad;
    }
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
    //Métodos personalizados
    //Mostrar Datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Edad: " + getEdad());
    }
}
