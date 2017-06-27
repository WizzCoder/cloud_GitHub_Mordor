package ToDo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;



public class xmlMaster {

	static String action="";
	//static ArrayList<String> todoList;
	static Map<Integer, String> mapList;

	static String myParserXML = "";

	
	public static void main(String[] args){

//		myTestOfMapList();	
//		action = "save";
//		xmlAction(action);
		
//		myTestOfArrayList();
//		action = "save";
//		xmlAction(action);
	
		ToDo to = new ToDo();
		//todoList.;
		//ToDo.todoList;
		
		myParserXML = "<head>" + 
					  "<body>" +
					  "<item>" + ToDo.todoList.get(0) + "<item>" +
					  "</body>" + 
					  "</head>";
		
		
		System.out.println(myParserXML);

		
		action = "save";
		xmlAction(action);
		
//		int a = to.getTodoListSize();
//		System.out.println(a);
	}

//	public static void myTestOfMapList(){
//		mapList = new HashMap<>();
//		mapList.put(1, "Hans");
//		mapList.put(2, "Greta");
//	}
//	
//	public static void myTestOfArrayList(){
//		todoList = new ArrayList<String>();
//		todoList.add("Hans");
//		todoList.add("Greta");
//	}
	public static void xmlAction (String action){
	switch (action)
	{
	
		case "save": {
		    // Using XmlIO to save an object to file, errors are unexpected (write protected files)
		    try {
		    	XmlIO.saveObject("todolist.xml", xmlMaster.myParserXML);
		        // XmlIO.saveObject("todolist.xml", todoList);
		    		        System.out.println("Yihaaaaa: xmlfile written");
		        break;
		    } catch (IOException ex) {
		        Logger.getLogger(ToDo.class.getName()).log(Level.SEVERE, null, ex);
		    }
		} // case: save
	
//		case "load": {
//		    // Loading with XmlIO, in this case the file might be missing.
//		    try {
//		        todoList = XmlIO.loadObject("todolist.xml", TodoList.class);
//		    } catch (IOException ex) {
//		        System.out.println("Could not load todolist.xml");
//		    }
//		    break;
//			
//			//Where TodoList.class is a seperate class containing the collection to be saved to xml
//		    //Add default constructor and use public fields in TodoList.class     
//		    //data is the object to be saved to xml
//			//The xml file should be placed in the root of the project
//		
//		} // case: load 
		
	} // switch

	
	} // xmlAction


} // end of class
