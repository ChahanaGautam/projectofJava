import javax.swing.*;

    public class ComboBoxAndRadio {
        public static void main(String[] args) {
            JFrame frame = new JFrame("ComboBox and Radio");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel genderLabel = new JLabel("Gender:");
            genderLabel.setBounds(50, 50, 100, 30);

            JRadioButton male = new JRadioButton("Male");
            male.setBounds(150, 50, 80, 30);

            JRadioButton female = new JRadioButton("Female");
            female.setBounds(250, 50, 80, 30);

            ButtonGroup group = new ButtonGroup();
            group.add(male);
            group.add(female);

            JLabel countryLabel = new JLabel("Country:");
            countryLabel.setBounds(50, 100, 100, 30);

            String[] countries = {"Nepal", "India", "USA", "Germany"};
            JComboBox<String> comboBox = new JComboBox<>(countries);
            comboBox.setBounds(150, 100, 150, 30);

            JButton submit = new JButton("Submit");
            submit.setBounds(150, 150, 100, 30);

            frame.add(genderLabel);
            frame.add(male);
            frame.add(female);
            frame.add(countryLabel);
            frame.add(comboBox);
            frame.add(submit);

            frame.setLayout(null);
            frame.setVisible(true);
        }
    }

