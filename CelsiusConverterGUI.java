import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI extends JFrame {
    private JPanel panelMain;
    private JTextField celsiusTextField;
    private JButton ConvertButton;
    private JLabel FahrenheitLabel;
    private JLabel CelsiusLabel;

    public CelsiusConverterGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelMain);
        this.pack();
        ConvertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr = (int)((Double.parseDouble(celsiusTextField.getText())) * 1.8 + 32);
                FahrenheitLabel.setText(tempFahr + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CelsiusConverterGUI("My celsius converter");
        frame.setVisible(true);
    }


}
