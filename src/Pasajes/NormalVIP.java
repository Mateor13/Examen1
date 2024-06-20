package src.Pasajes;

public class NormalVIP extends Ticket{
    String tipoCliente;
//Constructores
    public NormalVIP() {
    }

    public NormalVIP(String nombre, String cedula, int edad, String rutas, Double precioRuta, String numTicket, String tipoCliente) {
        super(nombre, cedula, edad, rutas, precioRuta, numTicket);
        this.tipoCliente = tipoCliente;
    }
    //Getter y Setter

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    //Metodos personalizados
    public void costoExtra () {
        if (getTipoCliente().equals("VIP")||getTipoCliente().equals("vip")) {
        super.setPrecioRuta(getPrecioRuta()+(getPrecioRuta()*0.3));
    }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo Cliente: " + getTipoCliente());
        System.out.println("Precio por tipo de cliente: " + (getPrecio()*0.3));
    }
}
