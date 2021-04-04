package test;
import java.time.LocalDate;
import negocio.ClienteABM;
public class TestAgregarCliente {
    public static void main(String[] args) throws Exception {
        String apellido = "signetti";
        String nombre = "alan4";
        int documento = 4444;
        // tu fecha de nacimiento
        LocalDate fechaDeNacimiento = LocalDate.now();
        ClienteABM abm = new ClienteABM();
        @SuppressWarnings("unused")
		long ultimoIdCliente = abm.agregar(apellido, nombre, documento,
            fechaDeNacimiento);
    }
}