package authentification;

import jakarta.xml.ws.Service;

import java.net.MalformedURLException;
import java.net.URI;


import javax.xml.namespace.QName;

public class AuthServiceClient {

    public static void main(String[] args) {
        try {
            URI uri = URI.create("http://localhost:1234/auth?wsdl");
            QName qname = new QName("http://myauthentique/", "AuthService");
            Service service = Service.create(uri.toURL(), qname);
            AuthService auth = service.getPort(AuthService.class);

            String username = "admin";
            String password = "password123";

            boolean isAuthenticated = auth.authenticate(username, password);
            System.out.println("Authentification réussie : " + isAuthenticated);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}