package SampleFrame;
import SampleFrame.MyWindowAdapter;
import java.awt.*;

class SampleFrame extends Frame {
    SampleFrame(String title) {
        super(title);
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        addWindowListener(adapter);
    }
}