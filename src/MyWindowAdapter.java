package SampleFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyWindowAdapter extends WindowAdapter {
    private SampleFrame frame;
    public MyWindowAdapter(SampleFrame frame) {
        this.frame = frame;
    }
    @Override
    public void windowClosing(WindowEvent e) {
            frame.dispose();
    }
}