import entidade.Cliente;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Main {
    public static void main(String[] args) throws Exception{

        Cliente cliente = new Cliente("Marques", 1);

        FileOutputStream output = new FileOutputStream("objeto.txt");

        ObjectOutputStream out = new ObjectOutputStream(output);

        out.writeObject(cliente);

        out.close();
    }
}