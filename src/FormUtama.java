import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {

    public FormUtama() {
        super("Form Utama");
        Inisialisasi_Komponen();
    }

    public void Inisialisasi_Komponen() {
        setPreferredSize(new Dimension(400, 200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

}
