package lesson07;

public class Homework071_Transport {
    public static void main(String[] args) {

        PassengerCar mercedes = new PassengerCar();

        mercedes.printCarState();

        mercedes.brand = "Mercedes";
        mercedes.powerHP = 204;
        mercedes.maxspeed = 260;
        mercedes.weight = 1520;
        mercedes.countWheels = 4;
        mercedes.fuelRate = 6.5;
        mercedes.bodyType = "Sedan";
        mercedes.numberPassenger = 4;
        mercedes.printCarState();

        mercedes.droveInTime(2);

        CargoCar man = new CargoCar();
        man.printCargoState();
        man.brand = "MAN";
        man.powerHP = 224;
        man.maxspeed = 160;
        man.weight = 5700;
        man.countWheels = 4;
        man.fuelRate = 17;
        man.capacity = 6;
        man.printCargoState();
        man.loadCargo(5.9);
        man.loadCargo(6.1);

        CivilAirplane boeing = new CivilAirplane();
        boeing.printAirplaneState();
        boeing.numberPassengers = 200;
        boeing.boardingPassengers(150);
        boeing.boardingPassengers(201);

        MilitaryAirplane mig = new MilitaryAirplane();
        mig.printMilitaryAirplaneState();
        mig.numberRocket = 1;
        mig.shot();
        mig.numberRocket = 0;
        mig.shot();
        mig.catapult();
        mig.isCatapult = true;
        mig.catapult();
    }

}
