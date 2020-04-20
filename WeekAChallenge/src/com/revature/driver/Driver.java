package com.revature.driver;

import java.util.Scanner;

import com.revature.beans.Human;
import com.revature.beans.Machine;


public class Driver {
	
	public static void main(String[] args) {
		
		Human a = new Human();
		a.setName("Brad");
		a.setAge(33);
		
		Machine c = new Machine("Add",1,2,3,4.3);
		Machine d = new Machine(a.humanIntro());
		
		introAndGreet();	
	}
	
	public static void introAndGreet() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hey there, what's your name?");
		Human b = new Human(sc.nextLine());
		System.out.println("What's your age?");
		b.setAge(sc.nextInt());
		
		System.out.println("Hello, " + b.getName()+ ", nice to meet you!");
		sc.close();
	}
}
