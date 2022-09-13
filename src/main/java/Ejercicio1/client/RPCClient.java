package Ejercicio1.client;

//Morellano Alvarez Alejandro 4A DSM

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {

    public static void main(String[] args) throws XmlRpcException, MalformedURLException {

        Scanner leer = new Scanner(System.in);

        String nombre;
        double peso;
        double estatura;

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        System.out.println("Escribe tu nombre");
        nombre = leer.nextLine();
        System.out.println("Escribe tu peso");
        peso = leer.nextDouble();
        System.out.println("Escribe tu estatura");
        estatura = leer.nextDouble();

        Object[] data = {peso, estatura};
        Double response = (Double) client.execute("Methods.calcularIMC", data);
        System.out.println("Result -> Hola " + nombre + " tu IMC es de: " + response);
    }
}
