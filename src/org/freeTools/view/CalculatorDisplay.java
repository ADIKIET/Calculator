package org.freeTools.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import org.freeTools.businessLogic.Calculate;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.awt.Color;

public class CalculatorDisplay extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String inputStr = new String();
	String outputStr = new String();
	ArrayList<String> operand = new ArrayList<>();
	ArrayList<Double> operandNum = new ArrayList<>();
	ArrayList<String> operatorList = new ArrayList<>();
	int operandCounter = 0;
	Double result = 0.0;
	ImageIcon icon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorDisplay frame = new CalculatorDisplay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorDisplay() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 322, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		icon = new ImageIcon("images/calculatorIconBlue.png");
		setIconImage(icon.getImage());

		// Label
		JLabel lblDisplay = new JLabel("OUTPUT");
		lblDisplay.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDisplay.setBounds(12, 13, 102, 16);
		contentPane.add(lblDisplay);

		// TextField
		textField = new JTextField();
		textField.setBounds(12, 33, 280, 57);
		contentPane.add(textField);
		textField.setColumns(10);
		// textField.setText("0");

		// Button 1
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "1";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(12, 115, 50, 25);
		contentPane.add(button);

		// Button 2
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "2";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(74, 116, 56, 25);
		contentPane.add(button_1);

		// Button 3
		JButton button_2 = new JButton("3");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "3";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		button_2.setBounds(140, 116, 56, 25);
		contentPane.add(button_2);

		// Button 4
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "4";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setBounds(12, 153, 50, 25);
		contentPane.add(button_3);

		// Button 5
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "5";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBounds(74, 154, 56, 25);
		contentPane.add(button_4);

		// Button 6
		JButton btnNewButton = new JButton("6");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "6";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(140, 154, 56, 25);
		contentPane.add(btnNewButton);

		// Button 7
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "7";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setBounds(12, 191, 50, 25);
		contentPane.add(button_5);

		// Button 8
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "8";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setBounds(74, 191, 56, 25);
		contentPane.add(button_6);

		// Button 9
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "9";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_7.setBounds(140, 192, 56, 25);
		contentPane.add(button_7);

		// Button %
		JButton button_8 = new JButton("%");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "%";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_8.setBounds(12, 229, 50, 25);
		contentPane.add(button_8);

		// Button 0
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "0";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_9.setBounds(74, 229, 56, 25);
		contentPane.add(button_9);

		// Button .
		JButton button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + ".";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_10.setBounds(140, 230, 56, 25);
		contentPane.add(button_10);

		// Button +
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "+";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(223, 114, 69, 25);
		contentPane.add(btnNewButton_1);

		// Button -
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "-";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(223, 152, 69, 25);
		contentPane.add(btnNewButton_2);

		// Button *
		JButton btnNewButton_3 = new JButton("*");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "*";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(223, 190, 69, 25);
		contentPane.add(btnNewButton_3);

		// Button /
		JButton button_11 = new JButton("/");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = textField.getText() + "/";
				System.out.println(inputStr);
				textField.setText(inputStr);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_11.setBounds(223, 228, 69, 25);
		contentPane.add(button_11);

		// Button =
		JButton button_12 = new JButton("=");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// inputStr = textField.getText() + "=";
				inputStr = textField.getText();
				System.out.println(inputStr);
				Expression expression = new ExpressionBuilder(inputStr).build();
				double result = expression.evaluate();
				System.out.println("New Result = " + result);

				Double Result = new Double(result);
				textField.setText(Result.toString());

				/*
				 * int j = 0; for(int i=0; i<inputStr.length(); i++) {
				 * if(inputStr.charAt(i) == '+') {
				 * operand.add(inputStr.substring(j , i));
				 * 
				 * System.out.println("operand " + operandCounter + "-"+
				 * operand.get(operandCounter)); operandCounter++; j = i+1;
				 * operatorList.add("+"); } if(inputStr.charAt(i) == '-') {
				 * operand.add(inputStr.substring(j , i));
				 * 
				 * System.out.println("operand " + operandCounter + "-" +
				 * operand.get(operandCounter)); operandCounter++; j = i+1;
				 * operatorList.add("-"); } else if(inputStr.charAt(i) == '*') {
				 * operand.add(inputStr.substring(j , i));
				 * 
				 * System.out.println("operand " + operandCounter + "-" +
				 * operand.get(operandCounter)); operandCounter++; j = i+1;
				 * operatorList.add("*"); } else if(inputStr.charAt(i) == '/') {
				 * operand.add(inputStr.substring(j , i));
				 * 
				 * System.out.println("operand " + operandCounter + "-" +
				 * operand.get(operandCounter)); operandCounter++; j = i+1;
				 * operatorList.add("/"); } else if(inputStr.charAt(i) == '%') {
				 * operand.add(inputStr.substring(j , i));
				 * 
				 * System.out.println("operand " + operandCounter + "-" +
				 * operand.get(operandCounter)); operandCounter++; j = i+1;
				 * operatorList.add("%"); } else if(inputStr.charAt(i) == '=') {
				 * operand.add(inputStr.substring(j , i));
				 * 
				 * System.out.println("operand " + operandCounter + "-" +
				 * operand.get(operandCounter)); operandCounter++; j = i+1;
				 * operatorList.add("="); } }
				 * 
				 * //converting String operands to Double operands for(int k=0;
				 * k<operand.size(); k++) { String strTemp = operand.get(k);
				 * Double temp = Double.parseDouble(strTemp);
				 * System.out.println(temp); operandNum.add(k, temp); }
				 * 
				 * Double d2; result = operandNum.get(0); //performing
				 * operations for(int z=0; z<operatorList.size()-1; z++) {
				 * 
				 * d2 = operandNum.get(z+1);
				 * 
				 * if(operatorList.get(z) == "+") { result = result + d2; } else
				 * if(operatorList.get(z) == "-") { result = result - d2; } else
				 * if(operatorList.get(z) == "*") { result = result * d2; } else
				 * if(operatorList.get(z) == "/") { result = result / d2; } else
				 * if(operatorList.get(z) == "%") { result = result % d2; }
				 * 
				 * 
				 * } System.out.println("Result = " + result);
				 * textField.setText(result.toString());
				 */

			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_12.setBounds(223, 267, 69, 40);
		contentPane.add(button_12);

		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputStr = "";
				System.out.println("CLEAR " + inputStr);
				textField.setText(inputStr);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(12, 267, 102, 40);
		contentPane.add(btnClear);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// char lastChar = inputStr.charAt(inputStr.length()-1);
				inputStr = inputStr.substring(0, inputStr.length() - 1);
				System.out.println("BACK + Current Input String : " + inputStr);
				textField.setText(inputStr);

			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(120, 267, 91, 41);
		contentPane.add(btnBack);
	}
}
