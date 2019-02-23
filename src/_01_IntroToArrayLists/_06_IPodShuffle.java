package _01_IntroToArrayLists;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener {
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton surpriseMeButton = new JButton();
	private JButton stopButton = new JButton();
	private int width = 300;
	private int hieght = 100;
	
	private ArrayList<Song> music;
	
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		music = new ArrayList<>();
		music.add(new Song("demo.mp3"));
		music.add(new Song("ArtGarfunkelsThemeSong.mp3"));
		music.add(new Song("dramaticGamingBeat.mp3"));
		music.add(new Song("happyTune.wav"));
		
		//new Song("happyTune.wav").play();
		//new Song("dramaticGamingBeat.mp3").play();
		 new Song("/Users/joonspoon/music/Vampire Weekend - ModernVampires of the City/03 Step.mp3").play();
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	private void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(surpriseMeButton);
		surpriseMeButton.addActionListener(this);
		panel.add(stopButton);
		stopButton.addActionListener(this);
		frame.setSize(width, hieght);
		surpriseMeButton.setText("Surprise Me!");
		stopButton.setText("Stop Music");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void randomSong(ArrayList song) {
		Random random = new Random();
		int ranNum = random.nextInt(song.size());
		if(ranNum == 0) {
			
		}
		/*while(ranNum == ) {
			//write code so that you don't get the same random song in a row
		}*/
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton)e.getSource();
		if(buttonPressed == surpriseMeButton) {
			randomSong(music);
		}
		else if(buttonPressed == stopButton) {
			
		}
		
	}
	
	public static void main(String[] args) {
		_06_IPodShuffle iPodShuffle = new _06_IPodShuffle();
		iPodShuffle.createUI();
		
	}

	
}