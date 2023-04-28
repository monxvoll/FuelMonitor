package Logic;

import controller.MyException;

public abstract class Vehicule implements Enginable, Moveable {

    private String name;


    private int initialAmount;

    private  int turnOnSpendAmount;

    private int  speedUpSpendAmount;




    public Vehicule(String name , int initialAmount , int turnOnSpendAmount , int speedUpSpendAmount ) throws MyException {
        this.name = name;
        this.initialAmount = initialAmount;
        this.turnOnSpendAmount = turnOnSpendAmount;
        this.speedUpSpendAmount = speedUpSpendAmount;
        if (turnOnSpendAmount < 0 || speedUpSpendAmount < 0){
            throw  new MyException("Ingrese una cantidad valida");
        }


        if(initialAmount > MAX_AMOUNT) {
            refillFuel(initialAmount);

        }else if (initialAmount > MIN_AMOUNT) {
            turnOn(name, initialAmount);
            speedUp();

        } else
            turnOff(initialAmount);


    }

    public int getTurnOnSpendAmount(){
        return  turnOnSpendAmount;
    }

    public int getSpeedUpSpendAmount(){
        return  speedUpSpendAmount;
    }


}
