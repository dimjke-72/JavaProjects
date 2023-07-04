package JavaOOP.lesson1.HomeWork;

import java.util.LinkedList;
import java.util.List;
public class Categories extends Shop{
    public Categories(String name) {
        super(name);
        super.setCatalog(new LinkedList<>());
    }

    @Override
    public String toString() {
        return "\n" + getName() + ": " + super.getCatalog();
    }
}
