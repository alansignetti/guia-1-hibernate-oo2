package test;
import java.time.LocalDate;
import negocio.ClienteABM;
public class TestAgregarCliente {
    public static void main(String[] args) throws Exception {
        String apellido = "signetti";
        String nombre = "alan2";
        int documento = 2222;
        // tu fecha de nacimiento
        LocalDate fechaDeNacimiento = LocalDate.now();
        ClienteABM abm = new ClienteABM();
        long ultimoIdCliente = abm.agregar(apellido, nombre, documento,
            fechaDeNacimiento);
    }
}