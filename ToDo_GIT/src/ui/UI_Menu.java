package ui;

import java.util.Scanner;

public class UI_Menu {

	private String[] myCRUDCommand = {"ADD","LIST","EDIT","REMOVE"};
	
	private String[] myAvailableCommands = {"MARK","REMOVE ALL DONE ToDo Items","SEARCH","EDIT","EXIT"};	

	private static int keybInput;
	private static boolean errEvent;		

	
	public static void mainMenu(){
	
		errEvent = false;
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			while(errEvent != true)
			{
				try{  keybInput = sc.nextInt(); break; } catch (Exception e) { e.printStackTrace();}
			}
				
				switch(keybInput)
				{
					case 1: 	uiLogic.execAction("ADD");	break; // CREATE
//					case 2: 	execLIST(); 		break; // RETRIVE
//					case 3: 	execUPDATE(); 		break; // UPDATE
//					case 4: 	execREMOVE(); 		break; // DELETE
//					
//					case 5: 	execREMOVE_ALL(); 	break; // DELETE ALL
//					case 6: 	execMARK();			break; // MARK
//					case 7: 	execSEARCH();		break; // SEARCH
//					case 8: 	execMARK();			break; // 
//					case 9: 	execMARK();			break;
//					case 10: 	execREMOVE_ALL();	break;
//				
//					case 0: 	execEXIT(); 		break;
//				
					default:	System.out.println("QWERTY"); break;
					
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}


}
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void drawMenu(){
		// Draw menu
	}
	
	
}
