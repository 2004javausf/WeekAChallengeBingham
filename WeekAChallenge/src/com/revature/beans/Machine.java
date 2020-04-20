package com.revature.beans;

import java.util.Scanner;

public class Machine {
	private double total;
	private String type = "Blank";
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//Constructors
	public Machine() {
		whichMachine();
	}
	public Machine(String whichType,double ... n) {
		this.type = whichType;
		
		if(this.type == "Add") {
			this.setType("Add");
			numberAdder(n);
		} else if(this.type == "Multiply") {
			this.setType("Multiply");
			numberMultiplier(n);
		} else {
			System.out.println("That's not something I can do.");
		}
		System.out.println();
	}
	public Machine(String userInput) {
		this.setType("Echo");
		machineIntro();
		echoMachine(userInput);
		System.out.println();
	}
	
	
	//Methods
	public void machineIntro() {
		System.out.println("This is a(n) " + this.getType() + " machine.");
	}
	public void whichMachine() {
		Scanner sc = new Scanner(System.in);
		String machineType;
		boolean tryAgain = true;
		System.out.print("This is a blank machine,");
		do{
			System.out.println("Select a mode:");
			System.out.println("Add or Multiply or Echo or Exit?");
			machineType = sc.nextLine();
			
			switch(machineType) {
			case "Add":
				this.setType("Add");
				System.out.println("Changed to 'Add Mode'.");
				tryAgain=false;
				break;
			case "Multiply":
				this.setType("Multiply");
				System.out.println("Changed 'Multiply Mode'.");
				tryAgain=false;
				break;
			case "Echo":
				System.out.println("What should I Echo?");
				echoMachine(sc.nextLine());
			case "Exit":
				System.out.println("Thank you, Goodbye.");
				tryAgain=false;
				break;
			default:
				System.out.println("Sorry, that's not an option. \n");
			}
		}while(
			tryAgain
		);
		sc.close();
	}
	
	private void echoMachine(String userInput) {
		System.out.println("You said: '" + userInput +"'");
	}
	
	private void numberAdder(double ...v) {
		double t =0.0;
		for(double i:v) {
			t += i;
		}
		machineIntro();
		System.out.println("Your total is: "  + t);
	}
	
	private void numberMultiplier(double ...v) {
		double t =1;
		for(int i=0;i<v.length;i++) {
			t *= v[i];
		}
		machineIntro();
		System.out.println("Your total is: " + t);
	}
	
}
