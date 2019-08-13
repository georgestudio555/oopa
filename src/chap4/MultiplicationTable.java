package chap4;
public class MultiplicationTable {
    public static void main(String[] args) {
        int x = 12;
        int y = 12;
        System.out.println("----------------------------------------Multiplication Table--------------------------------------");
        System.out.println("X       1       2       3       4       5       6       7       8       9       10      11      12");
        System.out.println("--------------------------------------------------------------------------------------------------");
        for (int i = 2; i <= x ; i++){
            System.out.print(i);
            for (int j = 1; j <= y ; j++){
                System.out.print("\t"+ (i * j));
            }
            System.out.println();
        }
    }
}
