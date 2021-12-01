package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(4.5, 4, 2);
        IceCreamSeller iceCube = new IceCreamSalon(priceList);
        Cone.Flavor[] flavors = {Cone.Flavor.BANANA, Cone.Flavor.LEMON, Cone.Flavor.CHOCOLATE};

        Cone myCone = iceCube.orderCone(flavors);
        Magnum myMagnum = iceCube.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
        IceRocket myIceRocket = iceCube.orderIceRocket();

        Eatable[] eatables = {myCone, myMagnum, myIceRocket};
        for (Eatable eatable : eatables){
            eatable.eat();
        }
        System.out.println(iceCube);
    }
}
