package test;
import java.time.LocalDate;
import negocio.ClienteABM;
public class TestAgregarCliente {
    public static void main(String[] args) {
        String apellido = "tu apellido";
        String nombre = "tu nombre";
        int documento = 35000000;
        // tu fecha de nacimiento
        LocalDate fechaDeNacimiento = LocalDate.now();
        ClienteABM abm = new ClienteABM();
        long ultimoIdCliente = abm.agregar(apellido, nombre, documento,
            fechaDeNacimiento);
    }
}