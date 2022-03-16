package subject_marks;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=80;
		if(m>=50)
		{
			System.out.println("Pass Mark");
		}
		else
		{
			System.out.println("Fail Mark");
		}

		int mark=60;
		if(mark>=90)
		{
			System.out.println("outstanding Mark");
		}
		else if(mark>=80)
		{
			System.out.println("Distinction Mark");
		}
		else if(mark>=60)
		{
			System.out.println("First Class Mark");
		}
		else
		{
			System.out.println("not elegible to join");
		}
		
		
		int age=27;
		int weight=58;
		
		if(age>18) {
			if(weight>50) {
				System.out.println("You are eligible to donate blood");
			} else{
				System.out.println("You are not eligible to donate blood");
			} 
			} else{
				System.out.println("Age must be greater than 18");
			}
		
		 int days =4;
	     switch (days) {
	     case 1:
	    	 System.out.println("Monday");
	     break;
	     case 2:
	    	 System.out.println("Tuesday");
	     break;
	     case 3:
	    	 System.out.println("Wednesday");
	     break;
	     case 4:
	    	 System.out.println("Thursday");
	     break;
	     case 5:
	    	 System.out.println("Friday");
	     break;
	     case 6:
	    	 System.out.println("Saturday");
	     break;
	     case 7:
	    	 System.out.println("Sunday");
	     break;
	     default:
	    	 System.out.println("Enter the value between 1 to 7");
	    	 break;
	     
	     }
	     
	     String c = "in";
         switch (c) {
         case"in":
        	 System.out.println("India");
        	 break;
         case"us":
        	 System.out.println("United states");
        	 break;
         case"aus":
             System.out.println("Australia");
             break;
         
         }
	
	}
	
	
 }
			
     
            
  
