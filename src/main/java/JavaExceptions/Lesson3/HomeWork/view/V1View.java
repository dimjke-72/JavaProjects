package JavaExceptions.Lesson3.HomeWork.view;

import JavaExceptions.Lesson3.HomeWork.control.Control;
import JavaExceptions.Lesson3.HomeWork.control.V1Control;

import java.util.Scanner;

public class V1View implements View {
    private final Control control;

    public V1View() {
        this.control = new V1Control();
    }

    @Override
    public void start() {
        Scanner in = new Scanner(System.in).useDelimiter("\r?\n");
        while (true) {
            System.out.println("""
                    Введите данные в произвольном порядке, разделенные пробелом:
                    <ФИО дд.мм.гггг 0123456789 м|ж>
                    введите [exit] для выхода""");
            String input = in.next();
            if (input.equalsIgnoreCase("exit")) System.exit(0);
            this.control.execute(input);
        }
    }
}
