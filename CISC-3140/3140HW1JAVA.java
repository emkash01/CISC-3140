import java.time.*;
import java.util.*;
import java.time.temporal.ChronoUnit;


class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    
   while(input.next()){ 
    System.out.println("Enter todays date:");
    int month = input.nextInt();
    int day = input.nextInt();
    int year = input.nextInt();
    //sets up the date

    if(month > 12 || month < 0){
      System.out.println("Something is wrong with your month");
      break;
    }
    if(day > 31 || day < 0){
      System.out.println("Something is wrong with your day");
      break;
    } //makes sure the month and day is not something that makes no sense

  
    LocalDate today = LocalDate.of(month, day, year);

    
    System.out.println("Whats the next Date?");   
    
    int month2 = input.nextInt();
    int day2 = input.nextInt();
    int year2 = input.nextInt();

    LocalDate future=LocalDate.of(month2, day2, year2);
    //setting up date 2

    long result = daysDiff(today, future); //calls daysDiff method
    long daysResult = monthsDiff(today, future); //calls monthsDiff method
    
    System.out.println(daysResult + " months and "+ result + " days left");
  
  System.out.println("Would you like to do this again? (Y/N)");
  char answer = input.nextChar();
  if(answer == 'y'){
    continue; //if you want to restart everything, entering Y will restart
  } 
  else if(answer == 'n'){
    break; // if you want to stop, n will end everything
  }
  }//ends while loop
  }

  public static long daysDiff(LocalDate one, LocalDate two){
    Period period = Period.between(one, two);
    return period.get(ChronoUnit.DAYS);
} //gets the amount of days that are between the two dates

  public static long monthsDiff(LocalDate one, LocalDate two){
    Period period = Period.between(one,two);
      return period.getDays();
  } //gets the amount of months in between the dates
}