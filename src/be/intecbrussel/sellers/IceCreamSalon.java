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
        return String.format("Made a total profit of €%.2f.", getProfit());
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

    @Override
    public String getPriceList(){
        Magnum.MagnumType[] flavors = {Magnum.MagnumType.ALPINENUTS, Magnum.MagnumType.MILKCHOCOLATE, Magnum.MagnumType.BLACKCHOCOLATE, Magnum.MagnumType.ROMANTICSTRAWBERRIES, Magnum.MagnumType.WHITECHOCOLATE};
        StringBuilder sb = new StringBuilder("\nMagnums:");
        for (Magnum.MagnumType magnumType : flavors){
            sb.append("\n\t").append(magnumType.getMagnumType()).append(" €").append(String.format("%.2f", priceList.getMagnumPrice(magnumType)));
        }
        return String.format("Today's price list!%nCones: €%.2f per ball.%nIce rocket: €%.2f.%s%n", priceList.getBallPrice(), priceList.getRocketPrice(), sb.toString());
    }
}
