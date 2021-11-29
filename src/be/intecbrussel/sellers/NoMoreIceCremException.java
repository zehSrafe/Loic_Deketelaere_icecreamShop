package be.intecbrussel.sellers;

public class NoMoreIceCremException extends Exception{
    public NoMoreIceCremException() {
        this("The item you are trying to order is out of stock.");
    }

    public NoMoreIceCremException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
}
