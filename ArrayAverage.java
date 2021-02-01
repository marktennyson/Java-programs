class Average{
    int arr[];
    Average(int arr[]){
        this.arr = arr;
    }
    double calculate(){
        double sum = 0;
        for (int i = 0; i < this.arr.length; i++) sum += this.arr[i];
        double average = sum/this.arr.length;
        return average;
    }
}



public class ArrayAverage{
    public static void main(String[] args) {
        int arr[] = {3,5,7,8,14,98,67,45};
        Average averager = new Average(arr);
        double average = averager.calculate();
        System.out.println("average of the array is: " + average);
        
    }
}