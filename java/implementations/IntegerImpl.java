package implementations;

import calculatorInterface.Calculator;
import exceptions.InvalidNumberException;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class IntegerImpl implements Calculator<Integer> {

    @Override
    public Integer add(Integer int1, Integer int2) {
        return int1 + int2;
    }

    @Override
    public Integer subtract(Integer int1, Integer int2) {
        return int1 - int2;
    }

    @Override
    public Integer multiply(Integer int1, Integer int2) {
        return int1 * int2;
    }

    @Override
    public Integer divide(Integer int1, Integer int2) {

        if ((int1 == 0) || (int2 == 0)) {
            log.error("Eroare bla bla");
            throw new InvalidNumberException("InvalidNumber Exception: Numbers must be not equal to 0");
        }
        int div = int1 / int2;

        return div;
    }

    @Override
    public Integer getPercent(Integer int1, Integer int2) throws InvalidNumberException {
        int main = 0;
        if (isPositive(int1) && isPositive(int2)) {
            main = int2 * 100 / int1;
        }
        return main;
    }

    @Override
    public void reset() {

    }

    private boolean isPositive(Integer integer) {
        if (integer <= 0) {
            return false;
        }
        return true;
    }
}