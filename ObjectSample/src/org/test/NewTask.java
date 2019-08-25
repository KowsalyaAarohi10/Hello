package org.test;

import org.kow.Child;
public class NewTask {
	
	public void methodOne() {
		
		System.out.println("Print a new line");
		
	}
	
	public static void main(String[] args) {
		NewTask n = new NewTask();
		
		n.methodOne();
		Child c = new Child();

}
}