package flash.cards;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame {
	private JFrame mainFrame, quizFrame, highScoreFrame;
	private JPanel mainPanel, quizPanel, highScorePanel, buttonPanel;
	private JButton startQuizButton, stopQuizButton, highScoreButton;
	private JLabel mainLabel, quizLabel;
	
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
		quizPanel.setLayout(new BorderLayout());
		quizPanel.setBackground(Color.BLUE);
		
		
		mainLabel = new JLabel("Welcome to Addition Flashcards!");
		mainLabel.setFont(new Font("MS Gothic",Font.PLAIN,32));
		
		quizLabel = new JLabel("3 + 3");
		quizLabel.setFont(new Font("MS Gothic", Font.PLAIN, 32));
		quizLabel.setHorizontalAlignment(JLabel.CENTER);
		
		
		startQuizButton = new JButton("Start Quiz");
		stopQuizButton = new JButton("Stop Quiz");
		highScoreButton = new JButton("Get High Score");
		
		quizPanel.add(quizLabel, BorderLayout.CENTER);
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
