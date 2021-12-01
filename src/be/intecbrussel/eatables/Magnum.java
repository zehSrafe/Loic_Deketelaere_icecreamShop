package be.intecbrussel.eatables;

public class Magnum implements Eatable{
    private MagnumType type;

    public Magnum(){
        this(MagnumType.ALPINENUTS);
    }

    public Magnum(MagnumType type){
        this.type = type;
    }

    public MagnumType getType() {
        return type;
    }

    @Override
    public void eat() {
        System.out.println("Eating a " + type.getMagnumType() + " magnum.");
    }

    public enum MagnumType{
        MILKCHOCOLATE("milk chocolate"),
        WHITECHOCOLATE("white chocolate"),
        BLACKCHOCOLATE("black chocolate"),
        ALPINENUTS("alpine nuts"),
        ROMANTICSTRAWBERRIES("romantic strawberries");

        private final String type;

        MagnumType(String type){
            this.type = type;
        }

        public String getMagnumType(){
            return type;
        }
    }
}
