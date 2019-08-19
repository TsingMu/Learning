package com.tsing.menu;

public class Menu {
	public Menu(){
		while(true){
			this.show();
		}
	}

	private void show() {
		// TODO Auto-generated method stub
		System.out.println("=====Welcome to the system=====");
		System.out.println("[1]:add");
		System.out.println("[2]:delete");
		System.out.println("[3]:update");
		System.out.println("[4]:find");
		System.out.println("[0]:exit\n");
		InputData input = new InputData();
		int i = input.getInt("plz choose: ", "plz input right operation");
		switch(i){
		case 1:{
			Operate.add();
			break;
		}
		case 2:{
			Operate.delete();
			break;
		}
		case 3:{
			Operate.update();
			break;
		}
		case 4:{
			Operate.find();
			break;
		}
		case 0:{
			System.out.println("exit the system");
			System.exit(1);
			break;
		}
		default:{
			System.out.println("plz input right operation");
		}
		}
	}

}
