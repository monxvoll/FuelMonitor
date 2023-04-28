package Logic;

import controller.MyException;

public class CombustionVehicule extends GasVehicule {
    public CombustionVehicule(String name , int initialAmount , int turnOnSpendAmount , int speedUpSpendAmount ) throws MyException {
        super(name,initialAmount,turnOnSpendAmount,speedUpSpendAmount );

    }


    @Override
    public void turnOn(String name, int initialAmount) {
        System.out.println("El vehiculo de combustible de tipo "+name+" con una cantidad de "+initialAmount+" litros encendio y gasto "+getTurnOnSpendAmount());
    }
    @Override
    public void speedUp() {
        System.out.println("El vehiculo avanzo 100 metros y gasto "+getSpeedUpSpendAmount()+ " litros");
    }


    @Override
    public void turnOff(int initialAmount) {
        System.out.println("El vehiculo no encendio , cantidad insuficiente de litros en el tanque [Cantidad suministrada = " +initialAmount+"]");
    }
    @Override
    public void refillFuel(int initialAmount) {
        System.out.println("La cantidad suministrada excede el limite del tanque [Cantidad suministrada = "+initialAmount+"]");
    }
}
