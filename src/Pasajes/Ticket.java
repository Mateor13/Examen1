package src.Pasajes;

public class Ticket extends Ruta {
    String numTicket;
    //Constructores
    public Ticket() {
    }

    public Ticket(String nombre, String cedula, int edad, String rutas, Double precioRuta, String numTicket) {
        super(nombre, cedula, edad, rutas, precioRuta);
        this.numTicket = numTicket;
    }

    //Getter y Setter
    public String getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(String numTicket) {
        this.numTicket = numTicket;
    }
    //Metodos Personalizados
    //mostrar Datos
    @Override
    public void mostrarDatos() {
        System.out.println("número de ticket: " + getNumTicket());
        super.mostrarDatos();
    }

}
