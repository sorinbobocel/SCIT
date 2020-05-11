import calculatorInterface.Calculator;
import exceptions.InvalidNumberException;
import implementations.DoubleImpl;
import implementations.IntegerImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    public static void main(String[] args) throws InvalidNumberException {

        Logger logger = LogManager.getLogger(Main.class.getName());

        Calculator c = new IntegerImpl();
        System.out.println(c.multiply(12, 534353));
        System.out.println(c.divide(19, 3));
        System.out.println(c.getPercent(60, 6));

        Calculator d = new DoubleImpl();
        try {
            System.out.println(d.multiply(12.5, -4.0));
        }catch (InvalidNumberException e) {
            logger.info("incorrect number inserted");
            e.printStackTrace();
        } finally {
            System.out.println("You have inserted an incorrect number");
        }
    }
}
