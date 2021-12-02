package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

import java.util.ArrayList;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(4, 5, 6);
        Stock stock = new Stock(1, 2, 6, 0);
        IceCreamSeller whiteMiniVan = new IceCreamCar(priceList, stock);
        Cone.Flavor[] flavors = {Cone.Flavor.STRACIATELLA, Cone.Flavor.LEMON, Cone.Flavor.CHOCOLATE};
        Cone.Flavor[] flavor = {Cone.Flavor.PISTACHE};
        Cone.Flavor[] unavailable = {Cone.Flavor.CHOCOLATE};

        Cone.Flavor[][] cones = {flavor, flavors, unavailable};
        String[] icerockets = {"I want an ice rocket!", "me too!"}; // 2 String values in array => ordering 2 ice rockets
        Magnum.MagnumType[] magnums = {Magnum.MagnumType.ROMANTICSTRAWBERRIES};
        int arrayPosition;
        ArrayList<Eatable> eatables = new ArrayList<>();

        System.out.println(whiteMiniVan.getPriceList());

        for (int i = 0; i < 3; i++) {
            arrayPosition = 0;
            if (i == 0) {
                while (arrayPosition < cones.length) {
                    try {
                        eatables.add(whiteMiniVan.orderCone(cones[arrayPosition]));
                    } catch (NoMoreIceCremException e) {
                        System.out.println(e.toString());
                    } finally {
                        arrayPosition++;
                    }
                }
            } else if (i == 1) {
                while (arrayPosition < icerockets.length) {
                    try {
                        eatables.add(whiteMiniVan.orderIceRocket());
                    } catch (NoMoreIceCremException e) {
                        System.out.println(e.toString());
                    } finally {
                        arrayPosition++;
                    }
                }
            } else {
                while (arrayPosition < magnums.length) {
                    try {
                        eatables.add(whiteMiniVan.orderMagnum(magnums[arrayPosition]));
                    } catch (NoMoreIceCremException e) {
                        System.out.println(e.toString());
                    } finally {
                        arrayPosition++;
                    }
                }
            }
        }

        System.out.println("");     //for printing a blank separation line between Exceptions and actual order
        for (Eatable eatable : eatables){
            eatable.eat();
        }
        System.out.println(whiteMiniVan);
    }
}
