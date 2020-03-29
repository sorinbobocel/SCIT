package Client;

import Data.Car;

import java.util.*;
import java.util.stream.Collectors;

public class Logic<T> {

    public  List<T> getObjects(T t1, T t2, T t3, T t4, T t5, T t6) {

        List<T> list = List.of(t1, t2, t3, t4, t5, t6);
        return list;
    }

    public static HashSet<Car> filterCarsWithTriggers(List<Car> carslist) {
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

    public static void addRandomString(HashSet<String> set) {

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
    public static void findMax(HashSet<String> set) {
        String max = String.valueOf(
                set.stream()
                        .max(Comparator.comparing(s -> s.valueOf(s))));
        System.out.println(max);
    }

    public static int countElementsOver10(Map<String, Integer> map) {

        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer v = entry.getValue();
            if (v > 10) {
                count++;
            }
        }
        return count;
    }

    protected static void printIfEligible(List<Car> carsList) {
        carsList.stream().filter(Logic::isEligible).map(car -> car.getModel().toUpperCase() + " has 4 doors.").forEach(System.out::println);
    }

    private static boolean isEligible(Car car) {
        if (car.getDoors() != 4) {
            System.out.println(car.getModel().toUpperCase() + " is NOT eligible, but I'll print it anyways.");
            return false;
        }
        return true;
    }


    public static void sortObjectsByHashCode(List<Object> objectList) {
        List<Object> sortedList = objectList.stream()
                .sorted(Comparator.comparing(Object::hashCode))
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }

    public static void compareReversed(HashSet<String> set) {

        TreeSet<String> collection = set.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        TreeSet<String> reversed = (TreeSet<String>) collection.descendingSet();
        System.out.println(reversed);
    }

    public static void findMinByName(HashSet<Car> set) {
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

    public static Map<Integer, Integer> createExponentialsMap(List<Integer> integerList) {
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

}




