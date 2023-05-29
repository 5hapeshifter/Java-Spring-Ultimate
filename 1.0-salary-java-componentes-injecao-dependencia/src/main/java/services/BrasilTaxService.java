package services;

/**
 * Classe criada para exemplificar a troca de componente sem mexer na classe
 */
public class BrasilTaxService extends TaxService {

    @Override
    public double tax(double amount) {
        return amount * 0.3;
    }

}
