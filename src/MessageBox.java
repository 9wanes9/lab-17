package SampleFrame;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageBox extends Applet implements ActionListener {
    private Frame frame;
    private Panel panel;
    private Button OK;

    @Override
    public void init() {
        Label leb=new Label("За что ты так со мной?");
        frame = new SampleFrame("TOЖE OKHO");
        frame.setSize(450, 100);
        frame.setVisible(true);
        panel = new Panel();
        panel.add(leb);
        OK = new Button("Извини..");
        panel.add(OK);
        frame.add(panel);
        OK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    @Override
    public void start() {
        frame.setVisible(true);
    }
    @Override
    public void stop() {
        frame.setVisible(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Извини.."))
            frame.dispose();
    }
}