package HW;

//AVRAGE//
public class Array2 {

    public static void main(String[] args) {
        double[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100,};
        double total = 0;

        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }    
        double average = total / arr.length;
      
        System.out.format("The average is: %.3f", average);
    }
}