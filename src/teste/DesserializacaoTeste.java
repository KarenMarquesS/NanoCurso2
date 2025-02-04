package teste;

import entidade.Cliente;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DesserializacaoTeste {

    public static void main(String[] args) throws Exception {

        FileInputStream input = new FileInputStream("objeto.txt");
        ObjectInputStream stream = new ObjectInputStream(input);

        Cliente cliente = (Cliente) stream.readObject();

        System.out.println(cliente.getNome());
        System.out.println(cliente.getId());
    }
}
