package Ejercicio3.client;
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

        int num1, num2;

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        System.out.println("Coloca un numero");
        num1 = input.nextInt();
        System.out.println("Coloca otro numero");
        num2 = input.nextInt();

        Object[] data = {num1, num2};
        int response = (int) client.execute("Methods.numeros",data);
        System.out.println("Hola la suma de los numeros del: "+ num1 + " al: " + num2 + " es: "+response);
    }
}
