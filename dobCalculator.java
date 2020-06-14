	package newpackage;
	
	import java.text.ParseException;
	import java.time.LocalDate;
        import java.time.Month;
        import java.time.Period;
	import java.util.Scanner;
	
	public class DobConvert {
	 public static void main(String[] args) throws ParseException {
		 			 
		int x = 0;
		do{
			//initialization 
		        int year = 0;
			int  month = 0;
			int date = 0;
		
			Scanner sc2 = new Scanner(System.in);
			
			//enter birthday seperately as year, Month and the Date
	                System.out.println("Enter year ");
			year = sc2.nextInt();
			System.out.println("Enter month ");		 
			month = sc2.nextInt();
			System.out.println("Enter date ");
			date = sc2.nextInt();
			
			LocalDate l = LocalDate.of(year, month, date); //specify year, month, date directly
			  
			  LocalDate now = LocalDate.now(); //gets localDate
			  
			  Period diff = Period.between(l, now); //difference between the dates is calculated
			  
			  System.out.println(diff.getYears() + " years " + diff.getMonths() + " months " + diff.getDays() + " days ");
			   
			 int years = diff.getYears() * 12;
			 int months =diff.getMonths();
			 
			 int age_in_months = years + months;
		         System.out.println("Age in months : "  + age_in_months );
		     
			 x++;
			 
		 }
		    while(x <=300 ); //number of birthdays you have to check(to do)
             }
	 
	} 
