/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otb;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Shubhashis
 */
public class progress extends JFrame{

    public progress(String to,String code) {
        JFrame jf = new JFrame();
        JLabel lb = new JLabel();
        ImageIcon ic = new ImageIcon(getClass().getResource("/otb/seat/progress_bar_2.gif"));
        lb.setIcon(ic);
        jf.add(lb);
        jf.setVisible(true);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(progress.class.getName()).log(Level.SEVERE, null, ex);
        }
        Mail.sendFromGMail(to, code);
    }
    
}
