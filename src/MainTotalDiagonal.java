import java.util.Scanner;

public class MainTotalDiagonal {
    public static void showArray(float[][]arr){
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    public float SumOfDiagonalMain(float[][]arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tọa độ ma trận vuông: ");
        int x=scanner.nextInt();
        float[][] arr=new float[x][x];
        for (int i=0;i<arr.length;i++){
            System.out.println("Nhập hàng thứ "+(i+1));
            for (int j =0;j<arr[i].length;j++){
                System.out.println("Nhập phần tử thứ "+(j+1));
                arr[i][j]=scanner.nextFloat();
            }
        }
        MainTotalDiagonal a=new MainTotalDiagonal();
        System.out.println("Mảng đã nhập là: ");
        showArray(arr);
        System.out.println("Tổng đường chéo chính là: "+a.SumOfDiagonalMain(arr));

    }
}
