import cars.ConceptCar;
import cars.ElectricCar;
import cars.ICECar;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<ConceptCar> cars = new ArrayList<>();
        List<ConceptCar> copyCars = new ArrayList<>();

        ElectricCar eCar = new ElectricCar(5, 250, "Tesla", 480.0);
        cars.add(eCar);

        ElectricCar eAnotherCar = (ElectricCar) eCar.clone();
        cars.add(eAnotherCar);

        ICECar iceCar = new ICECar(2, 300, "Corvette", 15.6);
        cars.add(iceCar);

        for (ConceptCar car : cars){
            copyCars.add(car.clone());
        }


        System.out.println(cars);
        System.out.println(copyCars);


    }

}
