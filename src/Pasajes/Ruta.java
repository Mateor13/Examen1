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
        if (getRutas().equals("quito - guayaquil")||getRutas().equals("guayaquil - quito")) {
            setPrecioRuta(20.00);
        }else if(getRutas().equals("quito - tulcan")||getRutas().equals("tulcan - quito")){
            setPrecioRuta(17.5);
        }else if(getRutas().equals("quito - puyo")||getRutas().equals("puyo - quito")){
            setPrecioRuta(15.0);
        }else if(getRutas().equals("quito - riobamba")||getRutas().equals("riobamba - quito")){
            setPrecioRuta(17.5);
        }
        System.out.println("Precio Ruta: $" + getPrecioRuta());
    }
}
