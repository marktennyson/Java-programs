class BSearch{
    int search(int[] Arr, int l, int arrLength, int Kons){
        if (arrLength > 0){
            int mid = l + (arrLength - l) / 2;
            if (Arr[mid] == Kons) return mid;
            if (Arr[mid] > Kons) return search(Arr, l, mid-1, Kons);
            if (Arr[mid] < Kons) return search(Arr, mid+1, arrLength, Kons);
        }return -1;
    }
}

public class BinarySearch{
    public static void main(String[] args) {
        BSearch searcher = new BSearch();
        int[] arr = {2,4,6,8,56, 67};
        int res = searcher.search(arr, 0, arr.length-1, 56);
        System.out.println("Your result is: "+res);
    }
}