package _01_IntroToArrayLists;

import java.awt.Button;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle{
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton surpriseMeButton = new JButton();
	private JButton stopButton = new JButton();
	private int width = 300;
	private int hieght = 100;
	
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		ArrayList<Song> music = new ArrayList<>();
		music.add(new Song("demo.mp3"));
		music.add(new Song("ArtGarfunkelsThemeSong.mp3"));
		music.add(new Song("dramaticGamingBeat.mp3"));
		music.add(new Song("happyTune.wav"));
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public void CreateUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(surpriseMeButton);
		panel.add(stopButton);
		frame.setSize(width, hieght);
		surpriseMeButton.setText("Surprise Me!");
		stopButton.setText("Stop Music");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		_06_IPodShuffle iPodShuffle = new _06_IPodShuffle();
		iPodShuffle.CreateUI();
		
	}
}