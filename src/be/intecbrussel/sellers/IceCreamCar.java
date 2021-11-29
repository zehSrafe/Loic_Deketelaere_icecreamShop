package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller{
    private final PriceList priceList;
    private Stock stock;
    private double totalProfit = 0;

    public IceCreamCar(){
        this(new PriceList(), new Stock());
    }

    public IceCreamCar(PriceList priceList, Stock stock){
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return String.format("Total profit: €%.2f", getProfit());
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) throws Exception {
        try {
            prepareCone(flavors);
            totalProfit += flavors.length * priceList.getBallPrice();
            return new Cone(flavors);
        } catch (NoMoreIceCremException e){
            throw new Exception(e);
        }
    }

    private Cone prepareCone(Cone.Flavor[] flavors) throws NoMoreIceCremException {
        if (stock.getBalls() <= 0) throw new NoMoreIceCremException("Sorry, no more balls");
        if (stock.getCones() <= 0) throw new NoMoreIceCremException("Sorry, no more cones");
        else {
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - flavors.length);
            return new Cone(flavors);
        }
    }

    @Override
    public IceRocket orderIceRocket() throws Exception{
        try {
            prepareIceRocket();
            totalProfit += priceList.getRocketPrice();
            return new IceRocket();
        } catch (NoMoreIceCremException e){
            throw new Exception(e);
        }
    }

    private IceRocket prepareIceRocket() throws NoMoreIceCremException{
        if (stock.getIceRockets() <= 0) throw new NoMoreIceCremException("Sorry, no more ice rockets");
        else {
            stock.setIceRockets(stock.getIceRockets() - 1);
            return new IceRocket();
        }
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) throws Exception{
        try {
            prepareMagnum(type);
            totalProfit += priceList.getMagnumPrice(type);
            return new Magnum(type);
        } catch (NoMoreIceCremException e) {
            throw new Exception(e);
        }
    }

    private Magnum prepareMagnum(Magnum.MagnumType type) throws NoMoreIceCremException {
        if (stock.getMagnum() <= 0) throw new NoMoreIceCremException("Sorry, no more Magnums");
        else {
            stock.setMagnum(stock.getMagnum() - 1);
            return new Magnum(type);
        }
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }
}
