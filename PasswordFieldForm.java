 import javax.swing.*;

    public class PasswordFieldForm {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Password Field Form");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("Enter Password:");
            label.setBounds(50, 50, 150, 30);

            JPasswordField passwordField = new JPasswordField();
            passwordField.setBounds(200, 50, 150, 30);

            JButton submit = new JButton("Login");
            submit.setBounds(150, 100, 100, 30);

            frame.add(label);
            frame.add(passwordField);
            frame.add(submit);

            frame.setLayout(null);
            frame.setVisible(true);
        }
    }

