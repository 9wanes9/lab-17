package SampleFrame;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletFrame extends Applet implements ActionListener {
    private Frame frame;
    private Panel panel;
    private Button button;
    public void init(){
        Label leb=new Label("Не нажимай на кнопку!");
        frame=new SampleFrame("OKHO");
        frame.setSize(450,100);
        panel=new Panel();
        button=new Button("Нажми меня!!!");
        panel.add(leb);
        panel.add(button);
        button.addActionListener(this);
        frame.add(panel);
        frame.setVisible(true);
    }       
    public void start(){
        frame.setVisible(true);
    }
    public void stop(){
        frame.setVisible(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Нажми меня!!!"))
            new MessageBox().init();
    }
}
