package Logic;

import controller.MyException;

public abstract class GasVehicule   extends Vehicule implements Moveable , Enginable {

    public GasVehicule(String name, int initialAmount, int turnOnSpendAmount, int speedUpSpendAmount) throws MyException {
        super(name, initialAmount, turnOnSpendAmount, speedUpSpendAmount);


    }


}