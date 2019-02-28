
import java.util.Scanner;


public class Lab09b100st
{
    private static int num, den;
    public static void main (String[] args)
    {
        enterData();
        Rational rational = new Rational(num,den);
        rational.displayData();
    }

    public static void enterData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the numerator ----> ");
        num = input.nextInt();
        System.out.print("\nEnter the denominator --> ");
        den = input.nextInt();
    }
}



class Rational
{
    private int reducedNum; 
    private int reducedDen; 
    private int gcf;
    private int firstNum; 
    private int firstDen;
    
    public Rational(int numerator, int denominator){
        reducedNum=numerator;
        reducedDen=denominator;
        firstNum=numerator;
        firstDen=denominator;
    }
    
    public Rational() {
    }
    
    public int getNum(){
        return firstNum;
    }

    public int getDen(){
        return firstDen;
    }
    
    private Double getDecimal(){
        return (firstNum*1.0)/(firstDen*1.0);
    }
    
    private String getOriginal(){
        return getNum()+"/"+getDen();
    }
    
    private void reduce(){
        getGCF(firstNum,firstDen);
        reducedNum=firstNum/gcf;
        reducedDen=firstDen/gcf;
    }
    
    public String getReduced(){
        reduce();
        return reducedNum+"/"+reducedDen;
    }

    public void displayData(){
        System.out.println();
        System.out.println(getOriginal() + " equals " + getDecimal());
        System.out.println();
        System.out.println("and reduces to " + getReduced());
        System.out.println();
    }
    
    public void multiply(Rational num1,Rational num2){
        firstNum=num1.getNum()*num2.getNum();
        firstDen=num1.getDen()*num2.getDen();
    }
    
    public void divide(Rational num1,Rational num2){
        firstNum=num1.getNum()*num2.getDen();
        firstDen=num1.getDen()*num2.getNum();
    }

    public void add(Rational num1,Rational num2){
        firstNum=num1.getNum()*num2.getDen()+num2.getNum()*num1.getDen();
        firstDen=num1.getDen()*num2.getDen();
    }
	
    public void subtract(Rational num1,Rational num2){
        firstNum=num1.getNum()*num2.getDen()-num2.getNum()*num1.getDen();
        firstDen=num1.getDen()*num2.getDen();
    }

    private void getGCF(int num1,int num2){
        int remainder=0;
        while (remainder!=0){
            remainder=num1%num2;
            if (remainder==0)
                gcf=num2;
            else{
                num1=num2;
                num2=remainder;
            }
        }
    }
}








