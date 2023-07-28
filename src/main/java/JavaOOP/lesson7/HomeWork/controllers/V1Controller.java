package JavaOOP.lesson7.HomeWork.controllers;

import JavaOOP.lesson7.HomeWork.data.CalculatorComplex;
import JavaOOP.lesson7.HomeWork.data.Complex;
import JavaOOP.lesson7.HomeWork.model.ModelComplex;

public class V1Controller implements Controller {

    public V1Controller() {}

    public Complex sendComplex(CalculatorComplex calculator) {
        ModelComplex model = new ModelComplex();
        return model.calculate(calculator);
    }
}
