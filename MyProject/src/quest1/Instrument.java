package quest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Instrument {
	// Properties
	private String type;
	private String range;
	private String color;
	private String tone;
	private int age;
	
	// Getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTone() {
		return tone;
	}

	public void setTone(String tone) {
		this.tone = tone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		/*Instrument piano = new Instrument();
		piano.setType("piano");
		piano.setColor("black");
		piano.setAge(10);
		piano.setRange("A0-C8");
		piano.setTone("full");
		
		System.out.println("Instrument Type: " + piano.getType());
		System.out.println("Instrument Color: " + piano.getColor());
		System.out.println("Instrument Age: " + piano.getAge());
		System.out.println("Instrument Range: " + piano.getRange());
		System.out.println("Instrument Tone: " + piano.getTone());*/
		
		// Initialize variables to be used while creating a custom instrument
		Instrument customInstrument = new Instrument();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputAge = 0;
		String inputType = "";
		String inputColor = "";
		String inputRange = "";
		String inputTone = "";
		
		// Try to get instrument specifications from the user
		try {
			System.out.println("What is the instrument's type? ");
			inputType = br.readLine();
			
			System.out.println("What is the instrument's color? ");
			inputColor = br.readLine();
			
			System.out.println("What is the instrument's age? ");
			inputAge = Integer.parseInt(br.readLine());
			
			System.out.println("What is the instrument's range? ");
			inputRange = br.readLine();
			
			System.out.println("What is the instrument's tone? ");
			inputTone = br.readLine();
			
			System.out.println();
			
		} catch (IOException e) {
			System.out.println("ERROR: Invalid input.");
		} catch (NumberFormatException e) {
			System.out.println("ERROR: Age has to be a number.");
		}
		
		// Set the instrument's properties to the user's choices
		customInstrument.setType(inputType);
		customInstrument.setColor(inputColor);
		customInstrument.setAge(inputAge);
		customInstrument.setRange(inputRange);
		customInstrument.setTone(inputTone);
		
		// Print out the instrument's properties
		System.out.println("Instrument Type: " + customInstrument.getType());
		System.out.println("Instrument Color: " + customInstrument.getColor());
		System.out.println("Instrument Age: " + customInstrument.getAge());
		System.out.println("Instrument Range: " + customInstrument.getRange());
		System.out.println("Instrument Tone: " + customInstrument.getTone());
	}

}
