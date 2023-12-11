import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Nhập kích thước của ma trận vuông: ");
                int size = scanner.nextInt();

                int[][] matrix = new int[size][size];

                System.out.println("Nhập giá trị cho từng phần tử của ma trận:");
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print("Nhập giá trị cho phần tử ở hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                        matrix[i][j] = scanner.nextInt();
                    }
                }

                displayMatrix(matrix);

                int diagonalSum = getDiagonalSum(matrix);

                System.out.println("Tổng của đường chéo chính là: " + diagonalSum);
            }

            // Phương thức để hiển thị ma trận
            private static void displayMatrix(int[][] matrix) {
                for (int[] row : matrix) {
                    for (int value : row) {
                        System.out.print(value + "\t");
                    }
                    System.out.println();
                }
            }

            private static int getDiagonalSum(int[][] matrix) {
                int diagonalSum = 0;
                for (int i = 0; i < matrix.length; i++) {
                    diagonalSum += matrix[i][i];
                }
                return diagonalSum;
            }
        }


