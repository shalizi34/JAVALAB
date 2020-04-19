package com.syntax.class07;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// create a boolean variable workDay and assign true create int variable day and assign it to 1
		//as long as it is workDay print"I need a day off" and increase day
		//once day is 6 print "I do not need a day off anymore"
		
		boolean workDay = true;
		int variableDay=1;
		while(workDay) {
			if (variableDay < 6) {
				System.out.println("I need a day off");
			}else {
				System.out.println("I don't need a day off anymore");
			}
			
		}
	}

}
