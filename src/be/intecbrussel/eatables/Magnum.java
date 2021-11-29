package be.intecbrussel.eatables;

public class Magnum implements Eatable{
    private MagnumType type;

    public Magnum(){
        this(MagnumType.ALPINENUTS);
    }

    public Magnum(MagnumType type){
        setType(type);
    }

    public void setType(MagnumType type) {
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("Eating a " + type + " magnum");
    }

    public enum MagnumType{
        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS,
        ROMANTICSTRAWBERRIES;
    }
}
