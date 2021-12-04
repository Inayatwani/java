import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt {
    public Awt(){
        Frame f = new Frame( "gui");
        f.setSize(500,500);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

    }

    public static void main(String[] args) {
        Awt a = new Awt();
    }

}
