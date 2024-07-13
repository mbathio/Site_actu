package myathentique;

import jakarta.xml.ws.Endpoint;


public class SoapServer {

	public static void main(String[] args) {
		String url = "http://localhost:12345/";
        Endpoint.publish(url, new Conversion());
        System.out.println("Serveur à l'écoute à l'adresseeeee :"+url);
        
	}
}