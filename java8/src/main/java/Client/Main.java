package Client;

import Data.Car;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Logic logic = new Logic();
        //1
        Car c1 = new Car("Mercedes", true, 4);
        Car c2 = new Car("Mazda", true, 4);
        Car c3 = new Car("Maseratti", false, 4);
        Car c4 = new Car("Jaguar", true, 3);
        Car c5 = new Car("Dacia", false, 5);
        Car c6 = new Car("McLaren", false, 2);


        List<Car> carsList = logic.getObjects(c1, c2, c3, c4, c5, c6);
        //2
        HashSet<Car> set = logic.filterCarsWithTriggers(carsList);
        //3
        logic.findMinByName(set);
        //4
        HashSet<String> stringSet = new HashSet<>();
        logic.addRandomString(stringSet);
        logic.addRandomString(stringSet);
        logic.addRandomString(stringSet);
        logic.addRandomString(stringSet);
        logic.addRandomString(stringSet);

        logic.findMax(stringSet);
//5
        List<Integer> generatedList = logic.throwDice();
        System.out.println(generatedList);
        System.out.println(logic.countInts(generatedList));
        System.out.println(logic.createExponentialsMap(generatedList));
        //6
        HashMap<String, Integer> sarbatoriLegale = new HashMap<String, Integer>();
        sarbatoriLegale.put("Ianuarie", 24);
        sarbatoriLegale.put("Februarie", 14);
        sarbatoriLegale.put("Martie", 1);
        sarbatoriLegale.put("Martie", 8);
        System.out.println(logic.countElementsOver10(sarbatoriLegale));
        //7
        logic.compareReversed(stringSet);
        //8
        logic.sortObjectsByHashCode(Collections.singletonList(carsList));
        //9
        logic.printIfEligible(carsList);
        //10

    }
    public static void optionalWrappingExamples(Car car) {
      //optional
        Car c1 = new Car("Fiat", true, 3);
        Optional<Car> optionalC1 = Optional.of(c1);

        //null
        Car c3 = null;
        Optional<Car> optionalC3 = Optional.ofNullable(c3);
        if(optionalC3.isPresent()) {
            manipulateCar();
        } else {
            System.out.println(c3 + " not present");
        }

    }
    private static void manipulateCar() {
        System.out.println("Instance manipulated");
    }
}


