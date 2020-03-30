package Client;

import Data.Car;

import java.util.*;

import static Client.LogicalOperations.*;

public class Main {

    public static void main(String[] args) {

        //1
        Car c1 = new Car("Mercedes", true, 4);
        Car c2 = new Car("Mazda", true, 4);
        Car c3 = new Car("Maseratti", false, 4);
        Car c4 = new Car("Jaguar", true, 3);
        Car c5 = new Car("Dacia", false, 5);
        Car c6 = new Car("McLaren", false, 2);

        List<Car> carsList = getObjects(c1, c2, c3, c4, c5, c6);
        //2
        HashSet<Car> set = filterCarsWithTriggers(carsList);
        //3
        findMinByName(set);
        //4
        HashSet<String> stringSet = new HashSet<>();
        addRandomString(stringSet);
        addRandomString(stringSet);
        addRandomString(stringSet);
        addRandomString(stringSet);
        addRandomString(stringSet);

        findMax(stringSet);
//5
        List<Integer> generatedList = throwDice();
        System.out.println(generatedList);
        System.out.println(countInts(generatedList));
        System.out.println(createExponentialsMap(generatedList));
        //6
        HashMap<String, Integer> sarbatoriLegale = new HashMap<String, Integer>();
        sarbatoriLegale.put("Ianuarie", 24);
        sarbatoriLegale.put("Februarie", 14);
        sarbatoriLegale.put("Martie", 1);
        sarbatoriLegale.put("Martie", 8);
        System.out.println(countElementsOver10(sarbatoriLegale));
        //7
        compareReversed(stringSet);
        //8
        sortObjectsByHashCode(Collections.singletonList(carsList));
        //9
        printIfEligible(carsList);
        //10
        optionalWrappingExample();
        nullWrappingExample();
        //11
        List<String> convertedList = new ArrayList<>(stringSet);
        findShortestString(convertedList);
    }
}


