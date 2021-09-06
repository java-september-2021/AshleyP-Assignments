import java.util.ArrayList;
import java.util.Arrays;
public class BasicJava {
    public static void main(String[] args) {
        Oneto255();
        OddNumbers();
        GetSum();
        int[] myArray = {1,3,5,7,9,13};
        IteratingThroughArray(myArray);
        FindMax(myArray);
        FindMin(myArray);
        FindingOddArray();
        int[] myArray4 = {2,10,3};
        FindingAverage(myArray4);
        GreaterThanY(myArray, 4);
        int[] myArray2 = {1,5,10,-2};
        SquareValues(myArray2);
        int[] myArray3 = {1,5,10,-2};
        NoNegatives(myArray3);
        int[] maxminavg = MaxMinAvg(myArray2);
        System.out.println(Arrays.toString(maxminavg));
        int[] myArray5 = {1,5,10,7,-2};
        ShiftingValues(myArray5);

    }
    public static void Oneto255() {
            for(int i = 1; i < 256; i++)
                System.out.println(i);
    }
    public static void OddNumbers() {
        for(int i = 1; i < 256; i++) {
                if(i % 2 != 0)
                    System.out.println(i);
        }
    }
    public static void GetSum() {
        int sum = 0;
        for(int i = 1; i < 256; i++) {
            sum += i;
        }
        System.out.println(String.format("Sum: %d", sum));
    }
    public static void IteratingThroughArray(int[] x) {
        for(int val: x)
            System.out.println(val);
    }
    public static void FindMax(int[] myArray) {
        int Max = myArray[0];
        for(int i = 1; i < myArray.length; i++) {
            if (myArray[i] > Max) {
                Max = myArray[i];
            }
        }
        System.out.println(Max);
    }
    public static void FindMin(int[] myArray) {
        int Min = myArray[0];
        for(int i = 1; i < myArray.length; i++) {
            if (myArray[i] < Min) {
                Min = myArray[i];
            }
        }
        System.out.println(Min);
        
    }
    public static void FindingOddArray() {
        ArrayList<Object> y = new ArrayList<Object>();
        for (int i = 1; i < 256; i += 2) {
            y.add(i);
        }
        System.out.println(y);
    }
    // Ninja Bonuses
    public static void FindingAverage(int[] myArray) {
        int average = 0;
        int sum = 0;
        for(int i = 0; i < myArray.length; i++) {
            sum = myArray[i] + sum;
        }
        average = sum/myArray.length;
        System.out.println(average);
    }
    public static void GreaterThanY(int[] myArray, int y) {
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > y) {
                counter++;
            }
        }
        System.out.println(counter);
    }
    public static void SquareValues(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * x[i];
        }
        System.out.println(Arrays.toString(x));
    }
    public static void NoNegatives(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0) {
                x[i] = 0;
            }
        }
        System.out.println(Arrays.toString(x));
    }
    public static int[] MaxMinAvg(int[] myArray) {
        int[] newArray = new int[3];
        int Max = myArray[0];
        for(int i = 1; i < myArray.length; i++) {
            if (myArray[i] > Max) {
                Max = myArray[i];
            }
        }
        newArray[0] = Max;
        int Min = myArray[0];
        for(int i = 1; i < myArray.length; i++) {
            if (myArray[i] < Min) {
                Min = myArray[i];
            }
        }
        newArray[1] = Min;
        int average = 0;
        int sum = 0;
        for(int i = 0; i < myArray.length; i++) {
            sum = myArray[i] + sum;
        }
        average = sum/myArray.length;
        newArray[2] = average;
        return newArray;
    }
    public static void ShiftingValues(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if(i == x.length-1) { 
                x[i] = 0;
                break;
            }
            x[i] = x[i+1];
        }
        System.out.println(Arrays.toString(x));
    }
}