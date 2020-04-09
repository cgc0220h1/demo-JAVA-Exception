import java.util.Random;
import java.util.Scanner;

public class ArrayException {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = rd.nextInt(100);
            System.out.print(arr[index] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayException arrayException = new ArrayException();
        Integer[] arr = arrayException.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Vui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử ở chỉ số "
            + index + " là "
            + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng!");
        }
    }
}
