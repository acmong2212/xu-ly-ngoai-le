import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh 1: ");
        int x = scanner.nextInt();
        System.out.println("Nhap canh 2: ");
        int y = scanner.nextInt();
        System.out.println("Nhap canh 3: ");
        int z = scanner.nextInt();

        IllegalTriangleException triangle = new IllegalTriangleException();
        triangle.test(x, y, z);
    }

    public void test(int x, int y, int z) {
        try {
            if (x < 0 || y < 0 || z < 0) {
                throw new Exception("Xay ra ngoai le: gia tri nhap vao la` so am");
            }
            if (x + y <= z || y + z <= x || x + z <= y) {
                throw new Exception("Xay ra ngoai le: tong 2 canh khong lon hon canh con` lai");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
