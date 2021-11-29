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
        PriceList priceList = new PriceList();
        IceCreamSeller iceCube = new IceCreamSalon(priceList);
        Cone.Flavor[] flavors = {Cone.Flavor.BANANA, Cone.Flavor.LEMON, Cone.Flavor.CHOCOLATE};

        iceCube.orderCone(flavors);
        iceCube.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
        iceCube.orderIceRocket();

        Eatable[] eatables = {iceCube.orderCone(flavors), iceCube.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES), iceCube.orderIceRocket()};
        for (Eatable eatable : eatables){
            eatable.eat();
        }
        System.out.println(iceCube.toString());
    }
}
