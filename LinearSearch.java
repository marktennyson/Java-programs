class LSearch{
    int[] Arr;
    LSearch(int[] arr){
        this.Arr = arr;
    }
    int search(int Kons){
        for (int i=0; i<this.Arr.length; i++){
            if (this.Arr[i]==Kons)return i;
        }return -1;
    }
}

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 9, 7};
        LSearch searcher = new LSearch(arr);
        int index = searcher.search(6);
        System.out.println("Your result is: "+index);
    }
}