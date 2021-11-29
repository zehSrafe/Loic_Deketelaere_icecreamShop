package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList = new PriceList();
        IceRocket iceRocket = new IceRocket();

        Cone.Flavor[] flavors = {Cone.Flavor.BANANA, Cone.Flavor.LEMON, Cone.Flavor.CHOCOLATE};
        Cone cone = new Cone(flavors);

        Magnum magnum = new Magnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);

        iceRocket.eat();
        cone.eat();
        magnum.eat();
        System.out.println(priceList.getRocketPrice());
        System.out.println(priceList.getBallPrice() * flavors.length);
        System.out.println(priceList.getMagnumPrice(Magnum.MagnumType.WHITECHOCOLATE));
    }
}
