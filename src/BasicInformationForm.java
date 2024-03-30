import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicInformationForm extends JFrame {
    private JPanel panelMain;
    private JTextField txtName;
    private JTextField txtId;
    private JTextField txtAddress;
    private JButton btnClick;

    public BasicInformationForm() {
        panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS)); // Vertical layout

        JLabel lblName = new JLabel("Name:");
        txtName = new JTextField(20);

        JLabel lblId = new JLabel("ID:");
        txtId = new JTextField(10);

        JLabel lblAddress = new JLabel("Address:");
        txtAddress = new JTextField(20);

        btnClick = new JButton("Click Me");

        // Add components to the panel
        panelMain.add(lblName);
        panelMain.add(txtName);
        panelMain.add(lblId);
        panelMain.add(txtId);
        panelMain.add(lblAddress);
        panelMain.add(txtAddress);
        panelMain.add(btnClick);

        // Add ActionListener to the button
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "Name: " + txtName.getText() + "\n" +
                        "ID: " + txtId.getText() + "\n" +
                        "Address: " + txtAddress.getText();
                JOptionPane.showMessageDialog(BasicInformationForm.this, message, "User Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Set the content pane of the frame
        setContentPane(panelMain);

        setTitle("User Information Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BasicInformationForm();
            }
        });
    }
}
