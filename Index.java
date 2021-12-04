import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        int index=0;
        int arr[] ={1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter index whom you want to print ");
        index = scanner.nextInt();
        for (int i=0; i<=index;i++) {
            System.out.print(arr[i]);
        }

    }
}
