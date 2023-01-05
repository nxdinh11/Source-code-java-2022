package demo.listener;
import demo.vieww.viewww;
import demo.cuaSoNew.viewll;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionlisteners implements ActionListener {
    private viewww viewww;

    public actionlisteners(viewww viewww) {
        this.viewww = viewww;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nguonSuKien = e.getActionCommand();
        switch (nguonSuKien){
            case "Exit" -> System.exit(0);
            case "New" -> new viewll();
            default -> this.viewww.setjLabel("You pressed bottom " + nguonSuKien);
        }
    }
}
