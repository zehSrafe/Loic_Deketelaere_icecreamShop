package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(4, 5, 6);
        Stock stock = new Stock(1, 2, 6, 1);
        IceCreamCar whiteMiniVan = new IceCreamCar(priceList, stock);
        Cone.Flavor[] flavors = {Cone.Flavor.STRACIATELLA, Cone.Flavor.LEMON, Cone.Flavor.CHOCOLATE};
        Cone.Flavor[] flavor = {Cone.Flavor.PISTACHE};

        // doesn't have to be in a try-catch but gives a prettier output in case of NoMoreIceCreamException
        try {
            Cone myCone = whiteMiniVan.orderCone(flavors);
            Cone mySecondCone = whiteMiniVan.orderCone(flavor);
            Magnum myMagnum = whiteMiniVan.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
            IceRocket myIceRocket = whiteMiniVan.orderIceRocket();
//            IceRocket myUnavaibleIceRocket = whiteMiniVan.orderIceRocket();
//            Magnum myUnavaibleMagnum = whiteMiniVan.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
//            Cone myUnavaibleCone = whiteMiniVan.orderCone(flavors);
            Eatable[] eatables = {myCone, mySecondCone, myMagnum, myIceRocket};
            for (Eatable eatable : eatables){
                eatable.eat();
            }
        } catch (NoMoreIceCremException e){
            System.out.println(e);
        } finally {
            System.out.println(whiteMiniVan);
        }
    }
}
