package src.Pasajes;

public class Ruta extends Pasajero {
    String rutas;
    Double precioRuta;
    //Contructores
    public Ruta() {
    }

    public Ruta(String nombre, String cedula, int edad, String rutas, Double precioRuta) {
        super(nombre, cedula, edad);
        this.rutas = rutas;
        this.precioRuta = precioRuta;
    }
    //Setters y Getters

    public String getRutas() {
        return rutas;
    }

    public void setRutas(String rutas) {
        this.rutas = rutas;
    }

    public Double getPrecioRuta() {
        return precioRuta;
    }

    public void setPrecioRuta(Double precioRuta) {
        this.precioRuta = precioRuta;
    }
    //Metodos personalizados
    //Mostrar Datos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Ruta seleccionada: " + getRutas());
        System.out.println("Precio Ruta: $" + getPrecioRuta());
    }
}
