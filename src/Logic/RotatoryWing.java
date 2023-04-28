package Logic;

import controller.MyException;

public class RotatoryWing extends  AirVehicule{
    public RotatoryWing(String name, int initialAmount, int turnOnSpendAmount, int speedUpSpendAmount) throws MyException {
        super(name, initialAmount, turnOnSpendAmount, speedUpSpendAmount);
    }

    @Override
    public void takeOff(String name , int initialAmount ) {
        System.out.println("El vehiculo aereo de tipo "+name+" con una cantidad de "+initialAmount+" litros encendio y gasto "+getTurnOnSpendAmount()+ " despego 500 metros de manera vertical y gasto " +getSpeedUpSpendAmount());;
    }

    @Override
    public void turnOn(String name, int initialAmount) {

    }

    @Override
    public void turnOff(int initialAmount) {
        System.out.println("El vehiculo no encendio , cantidad insuficiente de litros en el tanque [Cantidad suministrada = " +initialAmount+"]");
    }

    @Override
    public void refillFuel(int initialAmount) {
        System.out.println("La cantidad suministrada excede el limite del tanque [Cantidad suministrada = "+initialAmount+"]");
    }

    @Override
    public void speedUp() {

    }
}
