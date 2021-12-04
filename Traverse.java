public class Traverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int elt = arr[8],j;
        for (j=8; j>0;j--) {
            arr[j] = arr[j - 1];
        }arr[j]=elt;
        for (int i=0;i<=8;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
