class SSorter{
    int[] Arr;
    int arrLen;
    SSorter(int[] Arr){
        this.Arr = Arr;
        this.arrLen = this.Arr.length;
    }
    void sort(){
        for (int i=0; i<this.arrLen; i++){
            int _idx = i;
            for (int j=i+1; j<this.arrLen; j++){
                if (this.Arr[_idx] > this.Arr[j]){
                    _idx = j;
                }
            }
            int temp1 = this.Arr[_idx];
            int temp2 = this.Arr[i];
            this.Arr[i] = temp1;
            this.Arr[_idx] = temp2;
        }
    }
    void display(){
        for (int k = 0; k < this.arrLen; k++) {
            System.out.println(this.Arr[k]);
        }
    }
}

public class SelectionSorter {
    public static void main(String[] args) {
        int[] arr = {12,3,54,15,76};
        SSorter sorter = new SSorter(arr);
        sorter.sort();
        sorter.display();
    }
}
