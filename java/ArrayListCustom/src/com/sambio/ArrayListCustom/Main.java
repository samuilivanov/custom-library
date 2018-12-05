package com.sambio.ArrayListCustom;

public class Main {

	public static void main(String[] args) {
		
		// Some test
		
		/*ArrayListCustom<Integer> list = new ArrayListCustom<>();
        list.add(0);
        list.set(0, 2);
        list.display();
        ArrayListCustom<Integer> list2 = new ArrayListCustom<>();
        for (int i = 0; i < 100; i++) {
        	list2.add(i);
        }
        for (int i = 0; i < list2.size(); i++) {
        	list2.set(i, i + 1);
        }
        list2.display();

		ArrayListCustom<Integer> list3 = new ArrayListCustom<>();
        list3.add(0);
        list3.remove(0);
        list3.display();
        
        ArrayListCustom<Integer> list4 = new ArrayListCustom<>();
        list4.add(0);
        list4.add(1);
        list4.add(2);
        list4.remove(0);
        list4.display();
        
		
        ArrayListCustom<Integer> list5 = new ArrayListCustom<>();
        for (int i = 0; i < 100; i++) {
        	list5.add(i);
        }
        for (int i = 0; i < 50; i++) {
        	list5.remove(0);
        }
        	list5.display();

		/*
		 */
        ArrayListCustom<Integer> list6 = new ArrayListCustom<>();
        	
        	for (int i = 0; i < 100000; i++) {
        		list6.add(i);
        	}
        	list6.display();
	}
}