package myathentique;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class Conversion {

    private static final double TAUX_CONVERSION = 655.957;

    public double cfaToEuro(@WebParam(name = "montant") double montant) {
        return montant / TAUX_CONVERSION;
    }

    public double euroToCfa(@WebParam(name = "montant") double montant) {
        return montant * TAUX_CONVERSION;
    }
}