package project;
import java.io.FileWriter;
import java.io.IOException;
public class Test {

	LinkedList list = new LinkedList();
	public void addContact(String name, String Phone, String Relation, String filename)
	{
			list.add(name, Phone, Relation);
	}
	public void display()
 	{
		list.display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test a = new Test();
		a.addContact("Abdul", "Salam", "brother", "file.txt");
		a.addContact("Shoaib", "Ahmed", "Real name", "file.txt");
		a.display();
 
	}

}
