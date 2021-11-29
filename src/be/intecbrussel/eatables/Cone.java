package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable{
    private Flavor[] balls;

    public Cone(){
        this(new Flavor[]{Flavor.VANILLA});
    }

    public Cone(Flavor[] flavors){
        this.balls = Arrays.copyOf(flavors, flavors.length);
    }

    @Override
    public void eat() {
        StringBuilder sb = new StringBuilder("Eating cone with flavor(s): ");
        for (Flavor flavor : balls){
            sb.append(flavor).append(",");
        }
        System.out.println(sb);
    }

    public enum Flavor {
        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE;
    }
}
