import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyLinkedList{
	
	int num;
	MyLinkedList my;
	
}

public class Class2 {

	public static void main(String[] args) {
		
		MyLinkedList list1 = new MyLinkedList();
		MyLinkedList list2 = new MyLinkedList();
		MyLinkedList list3 = new MyLinkedList();
		
		list1.num = 10;
		list1.my = new MyLinkedList();
		
		list2.my = list3;
		
	}

}
