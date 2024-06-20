package src.Pasajes;

public class Adicionales extends NormalVIP{
    Boolean maletaExtra;

    //Constructores
    public Adicionales() {
    }

    public Adicionales(String nombre, String cedula, int edad, String rutas, Double precioRuta, String numTicket, String tipoCliente, Boolean maletaExtra) {
        super(nombre, cedula, edad, rutas, precioRuta, numTicket, tipoCliente);
        this.maletaExtra = maletaExtra;
    }
    //Getter y Setter

    public Boolean getMaletaExtra() {
        return maletaExtra;
    }

    public void setMaletaExtra(Boolean maletaExtra) {
        this.maletaExtra = maletaExtra;
    }
    //Metodos personalizados
    //costo extra por una maleta
    public void Extramaleta () {
        if (getMaletaExtra()) {
            setPrecioRuta(getPrecioRuta()+15);
        }
    }
    @Override
    public void mostrarDatos () {
        super.mostrarDatos();
        if (getMaletaExtra()) {
            System.out.println("Precio maleta extra: 15");
        }
        System.out.println("Precio total: $" + getPrecioRuta()+ '\n');
    }

}
