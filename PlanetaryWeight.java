package multiPlanetary;
import java.awt.EventQueue;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlanetaryWeight extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Please your weight on Earth.");
	    final double weight = input.nextDouble();
	    
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlanetaryWeight frame = new PlanetaryWeight(weight);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PlanetaryWeight(double weight) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] choices = { "Mercury","Venus", "Mars","Jupiter","Saturn","Uranus","Neptune"};
		JComboBox comboBox = new JComboBox(choices);
		comboBox.setFont(new Font("Cambria", Font.BOLD, 14));
		comboBox.setBounds(42, 52, 112, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Please choose a planet from the menu.");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(42, 27, 243, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_OutputWeight = new JLabel("");
		lblNewLabel_OutputWeight.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_OutputWeight.setBounds(42, 85, 238, 22);
		contentPane.add(lblNewLabel_OutputWeight);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String planet = (String)comboBox.getSelectedItem();
				double conF = 0;
				switch (planet) {
				  case "Mercury":
					conF = 0.38;
				    break;
				  case "Venus":
				    conF = 0.91;
				    break;
				  case "Mars":
					conF = 0.38;
				    break;
				  case "Jupiter":
					conF = 2.36;
				    break;
				  case "Saturn":
					conF = 0.92;
				    break;
				  case "Uranus":
					conF = 0.89;
				    break;
				  case "Neptune":
					conF = 1.13;
				    break;
				}
				lblNewLabel_OutputWeight.setText("Your weight on " + planet + " is " + (int)(weight * conF * 100) / 100.0 + " kg.");
			}
		});
	}
}
