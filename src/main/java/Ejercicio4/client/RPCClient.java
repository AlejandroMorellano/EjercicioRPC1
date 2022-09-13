package Ejercicio4.client;
//Morellano Alvarez Alejandro 4A DSM

import Ejercicio4.server.Methods;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {

    public static void main(String[] args) throws MalformedURLException, XmlRpcException {

        Scanner input = new Scanner(System.in);

        int num,num2,num3,num4,num5;

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Methods arreglo = new Methods();
        System.out.println("numero 1");
        num = input.nextInt();
        System.out.println("numero 2");
        num2 = input.nextInt();
        System.out.println("numero 3");
        num3 = input.nextInt();
        System.out.println("numero 4");
        num4 = input.nextInt();
        System.out.println("numero 5");
        num5 = input.nextInt();

        Object[] data = {num,num2,num3,num4,num5};
        String response = (String) client.execute("Methods.numero", data);
        System.out.println("Resultado: "+ response);

    }

}
