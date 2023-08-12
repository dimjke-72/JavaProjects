package JavaExceptions.Lesson3.HomeWork.control;

import JavaExceptions.Lesson3.HomeWork.model.Model;

public class V1Control implements Control {
    @Override
    public void execute(String input) {
        new Model(input);
    }
}
