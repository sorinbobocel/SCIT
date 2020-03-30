package Client;

import Data.Car;

import java.util.*;
import java.util.stream.Collectors;

public class LogicalOperations {

    static List<Car> getObjects(Car t1, Car t2, Car t3, Car t4, Car t5, Car t6) {

        List<Car> list = List.of(t1, t2, t3, t4, t5, t6);
        return list;
    }

    static HashSet<Car> filterCarsWithTriggers(List<Car> carslist) {
        HashSet<Car> targetSet = new HashSet<>();
        List<Car> intermediaryList = carslist.stream()
                .filter(car -> car.getModel().startsWith("M"))
                .collect(Collectors.toList());

        for (Car car : intermediaryList) {
            String model = car.getModel();
            char[] modelToChar = model.toCharArray();
            int count = 0;

            for (char ch : modelToChar)
                if (ch == 'a') {
                    count++;
                    if (count > 1) {

                        System.out.println(modelToChar);
                        targetSet.add(car);
                    }
                }
        }
        return targetSet;
    }

    static void addRandomString(HashSet<String> set) {

        int firstLetter = 97;
        int lastLetter = 122;
        int boundary = generateRandomInt();
        Random random = new Random();

        String generated = random.ints(firstLetter, lastLetter)
                .limit(boundary)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generated);
        set.add(generated);
    }

    /**
     * When calling .max with .valueOf(char c), the  first chars from the char[] composing the given strings
     * are compared using "natural order",
     *
     * @return the string with the biggest first element.
     * << public static String valueOf(char[] data) {
     * return new String(data); >> }
     */
    static void findMax(HashSet<String> set) {
        String max = String.valueOf(
                set.stream()
                        .max(Comparator.comparing(s -> s.valueOf(s))));
        System.out.println(max);
    }

    static int countElementsOver10(Map<String, Integer> map) {

        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer v = entry.getValue();
            if (v > 10) count++;
        }
        return count;
    }

    static void printIfEligible(List<Car> carsList) {
        carsList.stream().filter(LogicalOperations::isEligible).map(car -> car.getModel().toUpperCase() + " has 4 doors.").forEach(System.out::println);
    }

    private static boolean isEligible(Car car) {
        if (car.getDoors() != 4) {
            System.out.println(car.getModel().toUpperCase() + " is NOT eligible because it has  " + car.getDoors() + " doors, but let's print it anyways.");
            return false;
        }
        return true;
    }

    static void sortObjectsByHashCode(List<Object> objectList) {
        List<Object> sortedList = objectList.stream()
                .sorted(Comparator.comparing(Object::hashCode))
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }

    static void compareReversed(HashSet<String> set) {

        TreeSet<String> collection = set.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        TreeSet<String> reversed = (TreeSet<String>) collection.descendingSet();
        System.out.println(reversed);
    }

    static void findMinByName(HashSet<Car> set) {
        Optional<Car> min = set.stream()
                .min(Comparator.comparing(car -> car.getModel().length()));

        System.out.println(min);
    }

    private static int generateRandomInt() {
        int min = 1;
        int max = 15;
        Random random = new Random();
        return random.nextInt((max - min) + 1 + min);
    }

    static List<Integer> throwDice() {
        List<Integer> genList = new ArrayList<>();
        int min = 1;
        int max = 5;
        Random r = new Random();
        int factor = r.nextInt((max - min) + 1 + min) + 1;
        for (int i = 0; i < factor; i++) {
            int generated = generateRandomInt();
            genList.add(generated);
        }
        return genList;
    }

    static Map<Integer, Integer> createExponentialsMap(List<Integer> integerList) {
        Map<Integer, Integer> intMap = new LinkedHashMap<>();
        for (Integer integer : integerList) {
            int exponential = integer * integer;
            intMap.put(integer, exponential);
        }
        return intMap;
    }

    public static int countInts(List<Integer> intList) {
        long count = intList.stream()
                .count();
        return (int) count;
    }

    static void optionalWrappingExample() {
        //optional
        List<Car> carList = new ArrayList<>();
        Car c1 = new Car("Fiat", true, 3);
        Optional<Car> optionalC1 = Optional.of(c1);
        optionalC1.ifPresent(carList::add);
        System.out.println(carList);
    }

    static void nullWrappingExample() {
        Car c2 = null;
        Optional<Car> optionalC3 = Optional.ofNullable(c2);
        if (optionalC3.isPresent()) {
            manipulateCar();
        } else {
            System.out.print(" c2 = " + c2);
            System.out.println(", therefore is not present");
        }
    }

    private static void manipulateCar() {
        System.out.println("Instance manipulated");
    }

    static void findShortestString(List<String> stringList) {

        Optional<String> shortest = stringList.stream()
                .reduce((s, s2) -> s.length() < s2.length() ? s : s2);
        shortest.ifPresent(word -> System.out.println("Shortest string: " + word));
    }
}




