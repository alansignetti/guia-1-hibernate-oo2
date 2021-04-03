package test;
import datos.Cliente;
import negocio.ClienteABM;
public class TestActualizarCliente {
    public static void main(String[] args) throws Exception {
        ClienteABM abm = new ClienteABM();
        long id = 1;
        // traer el obj a modificar
        Cliente c = abm.traer(id);
        System.out.println("Cliente a Modificar -->" + c);
        // modificar por set los atributos
        int dni = 1111;
        c.setDni(dni);
        abm.modificar(c); // update del objeto
        
        // muestra el cliente actualizado
        
        Cliente cModif = abm.traer(dni);
        System.out.println("Cliente Modificado -->" + cModif);
    }
}