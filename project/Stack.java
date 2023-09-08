package project;

public class Stack {

	LinkedList list;
	public Stack()
	{
		list = new LinkedList();
	}
	public void push(String name, String phone, String relation)
	{
		list.addFromFirst(name, phone, relation);
	}
	public LinkedList.Node pop()
	{
		LinkedList.Node node = list.removeFromFirst();
		return node;
	}
	public void display()
	{
		list.display();
	}
	
	public static void main(String []args)
	{
		Stack a = new Stack();
		a.push("Sadam", "03204568908", "firend");
		a.push("Muhammad ali", "03003456235", "firend");
		a.display();
	}
}
