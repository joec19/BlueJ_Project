// Lab03v80.java
// Student 80-point version of the Lab03 assignment.

public class Lab03v80
{
    public static void main(String[] args)
    { 
      System.out.println("Lab03, 80 Point Version\n");
      
      int startSecond = 10000;
      int hour = startSecond / 3600;
      int remSecond = startSecond % 3600;
      int minute = remSecond / 60;
      int second = remSecond % 60;
      
      
      System.out.println("Starting seconds: " + startSecond);
      System.out.println("Hours:            " + hour);
      System.out.println("Minutes:          " + minute);
      System.out.println("Seconds:          " + second);
    }
}

