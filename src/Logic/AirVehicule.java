package Logic;

import controller.MyException;

public abstract class AirVehicule extends  GasVehicule{
    public AirVehicule(String name, int initialAmount, int turnOnSpendAmount, int speedUpSpendAmount) throws MyException {
        super(name, initialAmount, turnOnSpendAmount, speedUpSpendAmount);
        if(initialAmount >MIN_AMOUNT && initialAmount < MAX_AMOUNT) {
            takeOff(name, initialAmount);
        }
    }

    public abstract  void takeOff(String name ,int initialAmount );

}
