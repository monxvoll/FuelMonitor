package Logic;

public interface Enginable {
    int MIN_AMOUNT= 1;
    int MAX_AMOUNT= 100;
    void turnOn(String name ,int initialAmount);
    void turnOff(int initialAmount);
    void refillFuel(int initialAmount);
}
