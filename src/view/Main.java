package view;

import Logic.*;
import controller.MyException;

public class Main {
    public static void main(String[] args)  throws MyException {
        try {
            System.out.println("VEHICULO DIESEL");
            DieselVehicule dieselVehicule = new DieselVehicule("diesel", 50, 5, 20);
            System.out.println();
            System.out.println("VEHICULO ELECTRICO");
            ElectricVehicule electricVehicule = new ElectricVehicule("electrico", 60, 0, 10);
            System.out.println();
            System.out.println("VEHICULO COMBUSTION");
            CombustionVehicule combustionVehicule = new CombustionVehicule("combustion", 55, 6, 30);
            System.out.println();
            System.out.println("VEHICULO AEREO");
            RotatoryWing rotatoryWing = new RotatoryWing("helicoptero",0,20,10);
            FixedWing fixedWing = new FixedWing("avioeneta",60,30,20);
        }catch (ArithmeticException exception){
            System.out.println("Por favor ingrese un valor valido"+ exception.getMessage());
        }catch (MyException exception){
            System.out.println(exception.getMessage());
        }
    }
}