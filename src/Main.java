package src;
import src.Pasajes.*;

public class Main {
    public static void main(String[] args) {

        //Instanciar 5 objetos vacios
    Adicionales cliente1 = new Adicionales();
    Adicionales cliente2 = new Adicionales();
    Adicionales cliente3 = new Adicionales();
    Adicionales cliente4 = new Adicionales();
    Adicionales cliente5 = new Adicionales();
    //Instanciar 5 objetos con valores quemados
        Adicionales cliente6 = new Adicionales("Ricardo", "1234567890", 18, "tulcan - quito", 0.0,  "409", "Normal",false);
        Adicionales cliente7 = new Adicionales("Juan", "1234567891", 19, "puyo - quito", 0.0,  "410", "Normal",true);
        Adicionales cliente8 = new Adicionales("Manuel", "1234567892", 20, "riobamba - quito", 0.0,  "411", "VIP",true);
        Adicionales cliente9 = new Adicionales("Josue", "1234567893", 30, "guayaquil - quito", 0.0,  "412", "vip",false);
        Adicionales cliente10 = new Adicionales("Diego", "1234567894", 30, "tulcan - quito", 0.0,  "413", "vip",false);
    //Settear las instancias
    String nombre1 = "Carlos", nombre2 = "Rodrigo", nombre3 = "Juan", nombre4 = "Miguel", nombre5 = "Miguel";
    String cedula1 = "1751870997", cedula2 = "1751870998", cedula3 = "1751870999", cedula4 = "1751870100", cedula5 = "1751870101";
    int edad1 = 19, edad2= 20, edad3= 21, edad4= 22, edad5= 23;
    String ruta1 = "quito - guayaquil", ruta2 = "quito - puyo", ruta3 = "quito - tulcan", ruta4 = "quito - riobamba", ruta5 = "guayaquil - quito";
    String num1 = "456790", num2 = "456789", num3 = "456788", num4 = "456787", num5 = "456786";
    String tipo1= "vip", tipo2= "Normal", tipo3= "VIP", tipo4= "Normal", tipo5= "normal";
    Boolean extra1= true, extra2= true, extra3= false, extra4= true, extra5= false;
    cliente1.setNombre(nombre1);
    cliente2.setNombre(nombre2);
    cliente3.setNombre(nombre3);
    cliente4.setNombre(nombre4);
    cliente5.setNombre(nombre5);
    cliente1.setCedula(cedula1);
    cliente2.setCedula(cedula2);
    cliente3.setCedula(cedula3);
    cliente4.setCedula(cedula4);
    cliente5.setCedula(cedula5);
    cliente1.setEdad(edad1);
    cliente2.setEdad(edad2);
    cliente3.setEdad(edad3);
    cliente4.setEdad(edad4);
    cliente5.setEdad(edad5);
    cliente1.setRutas(ruta1);
    cliente2.setRutas(ruta2);
    cliente3.setRutas(ruta3);
    cliente4.setRutas(ruta4);
    cliente5.setRutas(ruta5);
    cliente1.setNumTicket(num1);
    cliente2.setNumTicket(num2);
    cliente3.setNumTicket(num3);
    cliente4.setNumTicket(num4);
    cliente5.setNumTicket(num5);
    cliente1.setTipoCliente(tipo1);
    cliente2.setTipoCliente(tipo2);
    cliente3.setTipoCliente(tipo3);
    cliente4.setTipoCliente(tipo4);
    cliente5.setTipoCliente(tipo5);
    cliente1.setMaletaExtra(extra1);
    cliente2.setMaletaExtra(extra2);
    cliente3.setMaletaExtra(extra3);
    cliente4.setMaletaExtra(extra4);
    cliente5.setMaletaExtra(extra5);
    cliente1.mostrarDatos();
    cliente2.mostrarDatos();
    cliente3.mostrarDatos();
    cliente4.mostrarDatos();
    cliente5.mostrarDatos();
    cliente6.mostrarDatos();
    cliente7.mostrarDatos();
    cliente8.mostrarDatos();
    cliente9.mostrarDatos();
    cliente10.mostrarDatos();

    }
}
