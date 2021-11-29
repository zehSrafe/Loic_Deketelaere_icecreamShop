package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller{
    private final PriceList priceList;
    private double totalProfit = 0;

    public IceCreamSalon(){
        this(new PriceList());
    }

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public String toString() {
        return "Total profit: €" + getProfit();
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        totalProfit += flavors.length * priceList.getBallPrice();
        return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit += priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        totalProfit += priceList.getMagnumPrice(type);
        return new Magnum(type);
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }
}
