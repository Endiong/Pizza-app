
package website;
import java.awt.*;
import javax.swing.*;
public class reset{
    public static void reset(){
        Order ord = new Order();
        JSpinner jS = ord.jSpinner8;
        jS.setValue(0);
    }

    
}
