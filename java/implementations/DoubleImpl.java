package implementations;

import calculatorInterface.Calculator;
import exceptions.InvalidNumberException;

public class DoubleImpl implements Calculator<Double> {

    @Override
    public Double add(Double d1, Double d2) {
        return d1 + d2;
    }

    @Override
    public Double subtract(Double d1, Double d2) {
        return d1 - d2;
    }

    @Override
    public Double multiply(Double d1, Double d2) throws  InvalidNumberException{
        return d1 * d2;
    }

    @Override
    public Double divide(Double d1, Double d2) throws InvalidNumberException {

        if(!isPositive(d1) || !isPositive(d2)) {
                throw new InvalidNumberException("Invalid number error: numbers must be positive");
        }
        double div = d1 / d2;
        double remainder = d1 % d2;
        if (remainder != 0) {
            double digitAfterComma = remainder * 10 / d2;
            return div + digitAfterComma / 10;
        }
        return div;
    }

    @Override
    public Double getPercent(Double d1, Double d2) {
        double main = 0;
        if(isPositive(d1) && isPositive(d2)) {
            main = d2 * 100 / d1;
            double remainder = d2 % d1;
            if (remainder != 0) {
                double digitAfterComma = remainder * 10 / d1;
                return main + digitAfterComma / 10;
            }
        }
        return main;
    }

    @Override
    public void reset() {

    }
    private boolean isPositive(Double operand) {
        if (operand<= 0) {
            return false;
        }
        return true;
    }

}
