package authentification;


import jakarta.xml.ws.Endpoint;

public class SoapServer {

    public static void main(String[] args) {
        String url = "http://localhost:1233/auth?wsdl";
        Endpoint.publish(url, new AuthService());
        System.out.println("Serveur à l'écoute à l'adresse :" + url);
    }
}

