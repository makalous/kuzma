package pl.makalous.mvc.strategy;

import org.springframework.beans.factory.annotation.Autowired;


public class PocztaPolskaShipping implements Shipping {
    private int postalCodePP;

    @Autowired
    PocztaPolskaShipping(int postalCodePP) {
        this.postalCodePP = postalCodePP;
    }

    @Override
    public String ship(String address) {
        //some logic here with postalcode
        return "blabla" + postalCodePP;
    }
}
