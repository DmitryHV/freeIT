package lesson07;

public abstract class Transport071 {
    int powerHP;
    int maxspeed;
    int weight;
    String brand;

    double convertHPtoKW (int HP) {
         return HP*0.74;
    }
}

abstract class LandTransport extends Transport071 {
    int countWheels;
    double fuelRate;
}

class PassengerCar extends LandTransport {
    String bodyType;
    int numberPassenger;


    public void printCarState() {
        System.out.println("Brand " + brand + "\nPower = " +powerHP + "hp (" + convertHPtoKW(powerHP) + " kW);\nMax speed = " +maxspeed +" km/h;\nWeight = " + weight + " kg;\nNumber of wheel = " + countWheels + ";\nFuel consumption = " + fuelRate + " l/100km;\nBody type " + bodyType + "\nNumber of passengers = " + numberPassenger);
    }

    public void droveInTime(double hour) {
        System.out.println("За время " + hour + " час(а), автомобиль " + brand + " двигаясь с максимальной скоростью " + maxspeed + " км/ч израсходует " + maxspeed*hour*fuelRate/100 + " литров топлива.");
    }
}

class CargoCar extends LandTransport {
    double capacity;

    public void printCargoState() {
        System.out.println("Brand " + brand + "\nPower = " +powerHP + " hp (" + convertHPtoKW(powerHP) + " kW);\nMax speed = " +maxspeed +" km/h;\nWeight = " + weight + " kg;\nNumber of wheel = " + countWheels + ";\nFuel consumption = " + fuelRate + " l/100km;\nCapacity = " + capacity + " tons");
    }


    public void loadCargo(double weight) {
        if (capacity >= weight)
            System.out.println("Грузовик загружен");
        else
            System.out.println("Вам нужен грузовик побольше");
    }

}

abstract class AirTransport extends Transport071 {
    int wingspan;   //размах крыльев
    int minLengthRunway; // минимальная длина взлетно-посадочной полосы для взлета
}

class CivilAirplane extends AirTransport {
    int numberPassengers;
    boolean isBusiness;

    public void printAirplaneState() {
        System.out.println("Brand " + brand + "\nPower = " +powerHP + " hp (" + convertHPtoKW(powerHP) + " kW);\nMax speed = " +maxspeed +" km/h;\nWeight = " + weight + " kg;\nNumber of passengers = " + numberPassengers + ";\nAvailability of business class - " + isBusiness + ";\nWingspan = " + wingspan + " metres;\nMin length runway = " + minLengthRunway + " metres.");
    }


    public void boardingPassengers(int count) {
        if (numberPassengers >= count)
            System.out.println("Пассажиры на борту");
        else
            System.out.println("Вам нужен самолет побольше");
    }

}

class MilitaryAirplane extends AirTransport {
    boolean isCatapult;      // наличие системы катапультирования
    int numberRocket;       // количество ракет на борту

    public void printMilitaryAirplaneState() {
        System.out.println("Brand " + brand + "\nPower = " +powerHP + " hp (" + convertHPtoKW(powerHP) + " kW);\nMax speed = " +maxspeed +" km/h;\nWeight = " + weight + " kg;\nWingspan = " + wingspan + " metres;\nMin length runway = " + minLengthRunway + " metres;\nAvailability of catapult - " + isCatapult + ";\nNumber of rockets = " + numberRocket + ".");
    }

    public void shot() {
        if (numberRocket > 0)
            System.out.println("Ракета пошла...");
        else
            System.out.println("Боеприпасы отсутствуют");
    }

    public void catapult() {
        if (isCatapult)
            System.out.println("Катапультирование прошло успешно");
        else
            System.out.println("У вас нет такой системы // FATALITY ha-ha-ha");
    }
}

