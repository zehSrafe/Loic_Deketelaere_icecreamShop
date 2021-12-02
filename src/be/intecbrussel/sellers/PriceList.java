package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList(){
        this(1.20, 1.35, 2.10);
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice){
        setBallPrice(ballPrice);
        setRocketPrice(rocketPrice);
        setMagnumStandardPrice(magnumStandardPrice);
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType type) {
        switch (type) {
            case ROMANTICSTRAWBERRIES: return  magnumStandardPrice * 2;
            case ALPINENUTS: return magnumStandardPrice * 1.5;
            case MILKCHOCOLATE: return  magnumStandardPrice * 1.3;
            case WHITECHOCOLATE: return  magnumStandardPrice * 1.05;
            default: return magnumStandardPrice;
        }
    }
}
