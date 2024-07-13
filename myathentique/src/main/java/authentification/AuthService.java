package authentification;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class AuthService {

    // Méthode d'authentification
    public boolean authenticate(@WebParam(name = "username") String username, 
                                @WebParam(name = "password") String password) {
        // Logique d'authentification simplifiée
        if ("admin".equals(username) && "password123".equals(password)) {
            return true;
        }
        return false;
    }

    // Ajoutez d'autres méthodes nécessaires pour la gestion des utilisateurs
}
