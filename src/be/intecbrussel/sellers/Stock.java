package be.intecbrussel.sellers;

public class Stock{
    private int iceRockets;
    private int cones;
    private int balls;
    private int magnum;

    public Stock(){
        this(2, 2, 6, 2);
    }

    public Stock(int iceRockets, int cones, int balls, int magnum){
        setIceRockets(iceRockets);
        setCones(cones);
        setBalls(balls);
        setMagnum(magnum);
    }

    public int getIceRockets() {
        return iceRockets;
    }

    public void setIceRockets(int iceRockets){
        this.iceRockets = iceRockets;
    }

    public int getCones() {
        return cones;
    }

    public void setCones(int cones){
        this.cones = cones;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls){
        this.balls = balls;
    }

    public int getMagnum() {
        return magnum;
    }

    public void setMagnum(int magnum){
        this.magnum = magnum;
    }
}
