package ntu.duyhn_63130262;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class BMICal {
	JFrame f;
	JTextField Height;
	JTextField Weight;
	JLabel BMINum;
	JLabel Status;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					BMICal bmical = new BMICal();
					bmical.f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	public BMICal() {
		initialize();
	}

	private void initialize() {
		f = new JFrame();
		f.setTitle("BMI Calculator");
		f.setBounds(550, 250, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);

		JLabel hLabel = new JLabel("Chiều cao (m):");
		hLabel.setBounds(10, 10, 120, 25);
		f.getContentPane().add(hLabel);

		Height = new JTextField();
		Height.setBounds(130, 10, 150, 25);
		f.getContentPane().add(Height);
		Height.setColumns(10);

		JLabel wLabel = new JLabel("Cân nặng (Kg):");
		wLabel.setBounds(10, 50, 120, 25);
		f.getContentPane().add(wLabel);

		Weight = new JTextField();
		Weight.setBounds(130, 50, 150, 25);
		f.getContentPane().add(Weight);
		Weight.setColumns(10);

		JButton btnCal = new JButton("Tính BMI");
		btnCal.setBounds(80, 90, 120, 25);
		f.getContentPane().add(btnCal);

		btnCal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double h = Double.parseDouble(Height.getText());
				double w = Double.parseDouble(Weight.getText());
				double bmi = w / (h * h);
				BMINum.setText(String.format("Chỉ số BMI của bạn là: %.2f", bmi));
				if (bmi < 18.5) {
					Status.setText("Bạn đang bị gầy!");
				} 
				else if (bmi < 24.9) {
					Status.setText("Bạn đang ở trong tình trạng cân đối!");
				} 
				else if (bmi < 29.9) {
					Status.setText("Bạn đang bị thừa cân!");
				} 
				else {
					Status.setText("Bạn đang bị béo phì!");
				}
			}
		});
		BMINum = new JLabel("");
		BMINum.setBounds(10, 120, 300, 25);
		f.getContentPane().add(BMINum);
		
		Status = new JLabel("");
		Status.setBounds(10, 137, 300, 25);
		f.getContentPane().add(Status);
	}
}