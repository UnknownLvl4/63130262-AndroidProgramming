package ntu.duyhn_63130262;

import java.awt.EventQueue;
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
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
	}
}
