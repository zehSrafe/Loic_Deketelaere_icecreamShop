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
        StringBuilder sb = new StringBuilder("Eating a cone with flavor(s):");
        for (int i = 0; i < balls.length - 1; i++){
            sb.append(" ").append(balls[i].getFlavor()).append(",");
        }
        sb.append(" ").append(balls[balls.length - 1].getFlavor()).append(".");
        System.out.println(sb);
    }

    public enum Flavor {
        STRAWBERRY("strawberry"),
        BANANA("banana"),
        CHOCOLATE("chocolate"),
        VANILLA("vanilla"),
        LEMON("lemon"),
        STRACIATELLA("straciatella"),
        MOKKA("mokka"),
        PISTACHE("pistache");

        private final String flavor;

        Flavor(String flavor){
            this.flavor = flavor;
        }

        public String getFlavor(){
            return flavor;
        }
    }
}
