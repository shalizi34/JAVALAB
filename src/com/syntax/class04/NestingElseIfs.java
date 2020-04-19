package com.syntax.class04;

public class NestingElseIfs {

	public static void main (String[] args) {
		
		//if student completed a quiz we will check for a score 
		// if score>90 --> great job
		//if score >80 --> well done
		//if score>70 --> you could have done better
		// if student did not complete the quiz --> not good
		//please do homework on time 
		
		boolean quizCompleted=true;
		int score=86;  // we have a single variable. same variable for multiple conditions 
		
		if (quizCompleted) {
			System.out.println("Lets check your score");
			
			if (score>90) {
				System.out.println("great job");
				
			}else if(score>80) {
				System.out.println("well done");
			}else if(score>70) {
				System.out.println("you could have done better");
			}
		}else {
			System.out.println("please do HW ontime");
		}
	}
}
