class BSorter{
    int[] Arr;
    int arrLen, temp2, temp1;
    BSorter(int[] Arr){
        this.Arr = Arr;
        this.arrLen = Arr.length;
    }
    void sort(){
        for (int i = 0; i < arrLen-1; i++){
            for (int j = 0; j < arrLen-i-1; j++){
                if(this.Arr[j] > this.Arr[j+1]){
                    this.temp1 = Arr[j];
                    this.temp2 = Arr[j+1];
                    this.Arr[j] = this.temp2;
                    this.Arr[j+1] = this.temp1;
                }
            }
        }
    }
    void display(){
        for (int i = 0; i < this.arrLen; i++) {
            System.out.println(this.Arr[i]);
        }
    }
}

public class BubbleSorter{
    public static void main(String[] args){
        int[] arr = {12,23,34,22,87,45};
        BSorter sorter = new BSorter(arr);
        sorter.sort();
        sorter.display();
    }
}