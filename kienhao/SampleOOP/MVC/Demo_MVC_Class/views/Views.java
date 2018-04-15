package Demo_MVC_Class.views;

import java.util.Scanner;

import Demo_MVC_Class.controllers.Controllers;
import Demo_MVC_Class.entity.NumberEntity;

public class Views {

	public static void main(String[] args) {
		// Khai bao doi tuong goi toi controller.
		Controllers controller;
		NumberEntity numberentity = new NumberEntity();
		InputValue(numberentity);
		
		//Goi controller de tra ra KQ;
		controller = new Controllers();
		System.out.println(controller.excuteCalculator(numberentity));
	}

	private static void InputValue(NumberEntity numberentity) {
		// dinh nghia data cho EntityNumber
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so A: ");
		Double nA = in.nextDouble();
		System.out.println("Nhap so B: ");
		Double nB = in.nextDouble();
		byte oP;
		do {

			System.out.println("Chon phep tinh: ");
			oP = in.nextByte();
		}
		while(oP>3);
		in.close();
		
		//Gan gia tri vao doi tuong
		numberentity.setdNumberA(nA);
		numberentity.setdNumberB(nB);
		numberentity.setbOption(oP);
	}

}
