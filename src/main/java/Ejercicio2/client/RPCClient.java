package Ejercicio2.client;
//Morellano Alvarez Alejandro 4A DSM

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {

    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        Scanner input = new Scanner(System.in);

        String product;
        double num1, num2;

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        System.out.println("Escribe un producto");
        product = input.nextLine();
        System.out.println("Escribe un numero");
        num1 = input.nextDouble();
        System.out.println("Escribe otro numero");
        num2 = input.nextDouble();

        Object[] data = {product};
        Object[] data2 = {num1, num2};
        Object[] data3 = {num1, num2};
        String response = (String) client.execute("Methods.sacarProducto",data);
        Double response2 = (Double) client.execute("Methods.sacarSuma",data2);
        Double response3 = (Double) client.execute("Methods.sacarProm",data3);
        System.out.println("Hola el producto es " + response + " la suma es: " + response2 + " el primedio es: " + response3);
    }

}
