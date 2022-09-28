import java.time.*;
import java.util.*;
import java.time.temporal.ChronoUnit;


class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    
    System.out.println("Enter todays date:");
    int year = input.nextInt();
    int month = input.nextInt();
    int day = input.nextInt();

    LocalDate today = LocalDate.of(year, month, day);

    
    System.out.println("Whats the next Date?");   
    
    int year2 = input.nextInt();
    int month2 = input.nextInt();
    int day2 = input.nextInt();

    LocalDate future=LocalDate.of(year2, month2, day2);

    long result = daysDiff(today, future);
    long daysResult = monthsDiff(today, future);
    
    System.out.println(daysResult + " months and "+ result + " days left");
  }

  public static long daysDiff(LocalDate one, LocalDate two){
    Period period = Period.between(one, two);
    return period.get(ChronoUnit.DAYS);
}

  public static long monthsDiff(LocalDate one, LocalDate two){
    Period period = Period.between(one,two);
      return period.getDays();
  }
}