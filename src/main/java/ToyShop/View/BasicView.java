package ToyShop.View;

import ToyShop.Control.BasicControl;
import ToyShop.Control.Control;

public interface BasicView {
    public void start(BasicControl control, String text);

    public BasicControl getControl();
}
