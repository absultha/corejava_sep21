package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list= new  ArrayList <String>();
		list.add("aman");
		list.add("munnu");
		list.add("buddi");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	
	Iterator <String> itr=list.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
		for(String data:list) {
            System.out.println(data);
        }

	Collections.sort(list,Collections.reverseOrder());
	//collections.reverse(list);
	
		System.out.println(list);
		
		LinkedList<String> list1= new  LinkedList <String>();
		list1.add("potti");
		list1.add("good");
		list1.add("bad");
		list1.addFirst("oye");
		list1.addLast("bunny");
		System.out.println(list1);
		Stack<String>stack=new Stack<String>();
		stack.push("name1");
		stack.push("name2");
		stack.pop();
		stack.push("name3");
		stack.push("name4");
		stack.pop();
		System.out.println(stack.peek());
		Vector<String> vector=new Vector<String>();
		vector.add("name1");
		vector.add("name2");
		vector.add("name9");
		System.out.println(vector);
		}
}

