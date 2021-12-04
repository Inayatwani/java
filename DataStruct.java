import java.util.Scanner;

public class DataStruct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i ,elt,size=0;
        int arr[] = new int[10];
        while (true){
            System.out.println("enter any elt");
            elt = scanner.nextInt();
            if (size>=10){
                System.out.println("sorry there is no space");
            }else if (size== 0){
                arr[0] = elt;
                size++;
                System.out.println("element has been scuessfully aded");
            }else{
                i= size-1;
                while ((arr[i]>elt)){
                    arr[i+1] = arr[i];
                    i--;
                    if (i== -1)
                        break;
                }
                arr[i+1] = elt;
                size++;
                System.out.println("element has been added");
                System.out.println("array is  ");
                for (int j=0;j<size;j++)
                    System.out.println(arr[j]+" ");
            }
        }

    }
}
