package javaprograms;

public class Eee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number = 1634, trmp, remainder, result = 0, n = 0;
        trmp= number;
        for (;trmp != 0; trmp =trmp/ 10)
        {
            n++;
        }
        trmp = number;
        for (;trmp != 0; trmp =trmp/ 10)
        {
            remainder = trmp% 10;
            result=result+(remainder*remainder*remainder);
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

	}

