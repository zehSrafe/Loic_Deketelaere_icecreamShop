package be.intecbrussel.sellers;

public class NoMoreIceCremException extends RuntimeException{
    //default message should never be used but you never know
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
