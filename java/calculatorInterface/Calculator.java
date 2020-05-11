package calculatorInterface;

import exceptions.InvalidNumberException;

public interface Calculator<T extends Number> {

    public T add(T t1, T t2);

    T subtract(T t1, T t2);

    T multiply(T t1, T t2) throws InvalidNumberException;

    T divide(T t1, T t2) throws InvalidNumberException;

    T getPercent(T t1, T t2) throws InvalidNumberException;

    void reset();

}
