package pl.makalous.sierpien.mvc.strategy;

import org.springframework.beans.factory.annotation.Autowired;

public class InpostShipping implements Shipping {
    private int telNumber;

    @Autowired
    InpostShipping(int telNumber) {
        this.telNumber = telNumber;
    }

    @Override
    public String ship(String address) {
        return "blabsadas" + telNumber;
    }
}
