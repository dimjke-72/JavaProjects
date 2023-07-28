package JavaOOP.lesson7.HomeWork.model;

import JavaOOP.lesson7.HomeWork.data.Calculator;
import JavaOOP.lesson7.HomeWork.data.Complex;
import JavaOOP.lesson7.HomeWork.data.ComplexDiff;
import JavaOOP.lesson7.HomeWork.data.ComplexDiv;
import JavaOOP.lesson7.HomeWork.data.ComplexMulti;
import JavaOOP.lesson7.HomeWork.data.ComplexSum;

public class ModelComplex implements Model {

    @Override
    public Complex calculate(Calculator calc) {
        switch (calc.getOperation()) {
            case '+' -> {
                return new ComplexSum().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
            case '-' -> {
                return new ComplexDiff().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
            case '/' -> {
                return new ComplexDiv().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
            case '*' -> {
                return new ComplexMulti().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
        }
        return null;
    }
}
