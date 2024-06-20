package src.Pasajes;

public class Ruta extends Pasajero {
    String rutas;
    Double precioRuta, precio;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    //Metodos personalizados
    //Mostrar Datos
    public void rutas() {
        switch (getRutas()) {
            case "quito - guayaquil", "guayaquil - quito" -> {
                setPrecioRuta(20.00);
                setPrecio(20.00);
            }
            case "quito - tulcan", "tulcan - quito", "quito - riobamba", "riobamba - quito" -> {setPrecioRuta(17.5);setPrecio(17.5);}
            case "quito - puyo", "puyo - quito" -> {setPrecioRuta(15.0);setPrecio(15.0);}
        }
    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Ruta seleccionada: " + getRutas());
        System.out.println("Precio Ruta: $" + getPrecio());
    }
}
