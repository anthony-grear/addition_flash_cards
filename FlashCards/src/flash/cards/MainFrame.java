package flash.cards;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame {
	private JFrame mainFrame;
	private JPanel mainPanel, quizPanel, buttonPanel, fillPanel;
	private JButton startQuizButton, stopQuizButton, highScoreButton, submitButton;
	private JLabel mainLabel, quizLabel;
	private JTextField tf;
	private GridBagConstraints gbc;
	
	
	
	public MainFrame() {
		initialize();		
	}
	
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setLayout(new BorderLayout(10,5));
		mainFrame.setTitle("Addition Flashcards");
		mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainFrame.setSize(800,500);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setLayout(new BorderLayout());
		
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		mainPanel.setBackground(Color.YELLOW);
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBackground(Color.GREEN);
		
		quizPanel = new JPanel();
		quizPanel.setLayout(new GridBagLayout());
		quizPanel.setBackground(Color.BLUE);
		
		fillPanel = new JPanel();
		fillPanel.setBackground(Color.BLUE);
		
		tf = new JTextField(25);
		tf.setFont(new Font("MS Gothic", Font.PLAIN, 32));
		tf.setHorizontalAlignment(JTextField.RIGHT);
		
		mainLabel = new JLabel("Welcome to Addition Flashcards!");
		mainLabel.setFont(new Font("MS Gothic",Font.PLAIN,32));
		
		quizLabel = new JLabel("3 + 3");
		quizLabel.setFont(new Font("MS Gothic", Font.PLAIN, 48));

		
		
		startQuizButton = new JButton("Start Quiz");
		startQuizButton.setFont(new Font("MS Gothic",Font.PLAIN,32));
		
		startQuizButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int random1 = ThreadLocalRandom.current().nextInt(0, 10 + 1);
				int random2 = ThreadLocalRandom.current().nextInt(0, 10 + 1);
				quizLabel.setText(String.valueOf(random1+" + "+random2));
			}
		});
		
		stopQuizButton = new JButton("Stop Quiz");
		stopQuizButton.setFont(new Font("MS Gothic",Font.PLAIN,32));
		stopQuizButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				quizLabel.setText("Stop pressing the Button!");
			}
		});
		
		highScoreButton = new JButton("Get High Score");
		highScoreButton.setFont(new Font("MS Gothic",Font.PLAIN,32));
		highScoreButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				quizLabel.setText("Just kidding, it's okay!");
			}
		});
		
		submitButton = new JButton("Enter");
		submitButton.setFont(new Font("MS Gothic",Font.PLAIN,32));
		
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(25, 25, 25, 25);
		gbc.gridx=1;
		gbc.gridy=0;
		quizPanel.add(quizLabel,gbc);
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(25, 25, 25, 25);
		gbc.gridx=1;
		gbc.gridy=1;
		quizPanel.add(tf, gbc);
		gbc = new GridBagConstraints();	
		gbc.insets = new Insets(25, 25, 25, 25);
		gbc.gridx=1;
		gbc.gridy=2;
		quizPanel.add(submitButton, gbc);
		
		mainPanel.add(mainLabel);
		buttonPanel.add(startQuizButton);
		buttonPanel.add(stopQuizButton);
		buttonPanel.add(highScoreButton);
		mainFrame.add(quizPanel, BorderLayout.CENTER);
		mainFrame.add(buttonPanel, BorderLayout.SOUTH);
		mainFrame.add(mainPanel, BorderLayout.NORTH);
		
		mainFrame.setVisible(true);
	}
}
