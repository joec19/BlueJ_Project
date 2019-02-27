// Lab09a100st.java
// The Rational Class Program I
// This is the student, starting version of the Lab09a assignment.


import java.util.Scanner;


public class Lab09a100st
{
	private static int num, den;   // numerator and denominator of the rational number

	public static void main (String[] args)
	{
		enterData();
		Rational r = new Rational(num,den);
		r.displayData();
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
    
    public Rational(int n, int d) {
        reducedNum = n;
        reducedDen = d;
        firstNum = n;
        firstDen = d;
    }
    
    public int getNum() {
        return firstNum;
    }

    public int getDen() {
        return firstDen;
    }
    
    private Double getDecimal() {
        return (firstNum * 1.0) / (firstDen * 1.0);
    }
    
    private String getOriginal() {
        return getNum() + "/" + getDen();
    }
    
    private void reduce() {
        getGCF(firstNum, firstDen);
        reducedNum = firstNum / gcf;
        reducedDen = firstDen / gcf;
    }
    
    public String getReduced() {
        reduce();
        return reducedNum + "/" + reducedDen;
    }

	public void displayData()
	{
		System.out.println();
		System.out.println(getOriginal() + " equals " + getDecimal());
		System.out.println();
		System.out.println("and reduces to " + getReduced());
		System.out.println();
	}

	private void getGCF(int n1,int n2)
	{
		int rem = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
	}
}








