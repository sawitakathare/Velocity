package Control_Statement;

public class SwitchCase {

	public static void main(String[] args) {
		//1-->Welcome to 1st year Engg
		//2-->Welcome to 2nd year Engg
		//3-->Welcome to 3rd year Engg
		//4-->Welcome to 4th year Engg
		
		int year=4;
		switch (year) 
		{
		case 1: System.out.println("Welcome to 1st year Engg");
		break;
		
		case 2: System.out.println("Welcome to 2nd year Engg");
		break;
		
		case 3: System.out.println("Welcome to 3rd year Engg");
		break;
		
		case 4: System.out.println("Welcome to 4th year Engg");
		break;

		default: System.out.println("Please enter valid year in betwween 1-4");
			break;
		}
		//Monday-->This is 1st day of week
		//Tuesday-->This is 2nd day of week
		//Wednesday-->This is 3rd day of week
		//Thursday-->This is 4th day of week
		//Friday-->This is 5th day of week
		//Saturday-->This is 6th day of week
		//Sunday-->This is 7th day of week
		
		String weekdays="Friday";
		
		switch (weekdays) 
		{
		case "Monday":System.out.println("This is first day of week");
		break;	
		
		case "Tuesday":System.out.println("This is second day of week");
		break;
		
		case "Wednesday":System.out.println("This is Third day of week");
		break;
		
		case "Thrusday":System.out.println("This is fourth day of week");
		break;
		
		case "Friday":System.out.println("This is fifth day of week");
		break;
		
		case "Saturday":System.out.println("This is sixth day of week");
		break;
		
		case "Sunday":System.out.println("This is seventh day of week");
		break;
		
		default:System.out.println("please enter correct week in between monday-sunday");
			break;
		}
		}
	}


