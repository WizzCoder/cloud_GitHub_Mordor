package JAXB;

import java.util.List;

public class TestRead {
	
	final static String  xmlPathJAXB = "C:\\Java\\GITHub_Local_Wksp\\ToDo_GIT\\src\\JAXB";
	//final String 
	
	
    public static void main(String args[]) {
        StaXParser read = new StaXParser();
        List<Item> readConfig = read.readConfig(xmlPathJAXB + "//config2.xml");
        for (Item item : readConfig) {
            System.out.println(item);
        }
    }
}
