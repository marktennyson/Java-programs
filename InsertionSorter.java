class ISorter{
    int[] Arr;
    int arrLen;
    int i,j;
    ISorter(int[] Arr){
        this.Arr = Arr;
        this.arrLen = this.Arr.length;
    }
    void sort(){
        for (int i=1; i < this.arrLen; i++){
            int key = this.Arr[i];
            j = i-1;
            while (j >= 0 && key < this.Arr[j]){
                this.Arr[j+1] = this.Arr[j];
                j = j-1;
            }
            this.Arr[j+1] = key;
        }
    }
    void display(){
        for (int k = 0; k < this.arrLen; k++) {
            System.out.println(this.Arr[k]);
        }
    }
}

public class InsertionSorter {
    public static void main(String[] args) {
        int[] arr = {5,7,6,12,3};
        ISorter sorter = new ISorter(arr);
        sorter.sort();
        sorter.display();

    }
}
