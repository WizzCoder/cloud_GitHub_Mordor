package ToDo;

import java.util.ArrayList;

public class ToDo {
	static ArrayList<String> todoList;
	
	public ToDo(){
		
		todoList = new ArrayList<String>();
		todoList.add("Hans");
		todoList.add("Greta");
//		todoList.add("Leta");
//		todoList.add("Mask");
//		todoList.add("Ask");
//		todoList.add("Kask");	
	}
	
	
	
	
	public static int getTodoListSize(){
		return todoList.size();
	}
	
	public static void addTodoItems(String toDoItems)
	{
//		int nextIndex=0;
//		nextIndex = getTodoListSize();
		todoList.add(toDoItems);
		// todoList.add(nextIndex, toDoItems);
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

	public static void printToDoListAllItems(){
		System.out.println("Starting ToDo-Class point");
		int i=0;
		for (String s: ToDo.todoList){
			System.out.print(i);
			System.out.print(","+"  ");
			System.out.print(s);
			System.out.print("\n");			
			i++;
		}
		
		System.out.println("Ending point\n");
		
	}
	
	
}
