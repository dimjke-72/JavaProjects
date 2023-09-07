package ToyShop.Model;

import ToyShop.Data.ToysDistributor;
import ToyShop.View.BasicView;

import java.util.Scanner;

public class Return extends Settings {

    public Return(BasicView view) {
        super("back", "назад", view);
    }

    @Override
    public void execute(ToysDistributor toys, Scanner scanner) {
        view.start(view.getControl(), "\nОсновное меню");
    }
}
