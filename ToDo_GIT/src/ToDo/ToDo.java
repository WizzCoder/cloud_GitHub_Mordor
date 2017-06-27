package ToDo;

import java.util.ArrayList;

public class ToDo {
	static ArrayList<String> todoList;
	
	public ToDo(){
		
		todoList = new ArrayList<String>();
		todoList.add("0,Hans");
		todoList.add("1,Greta");
		todoList.add("2,Leta");
		todoList.add("3,Mask");
		todoList.add("4,Ask");
		todoList.add("5,Kask");

		
		
		
		
		
	}

	public static int getTodoListSize(){
		return todoList.size();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * @return the todoList
	 */
	public static ArrayList<String> getTodoList() {
		return todoList;
	}

	/**
	 * @param todoList the todoList to set
	 */
	public static void setTodoList(ArrayList<String> todoList) {
		ToDo.todoList = todoList;
	}

	
	
}
