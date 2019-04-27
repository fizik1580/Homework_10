import java.util.Scanner;

public class IO_double_array {

    public static void main (String [] arg){

                //Program info

        System.out.println("Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.");

                //Var

        int counter_vertical, counter_horizantal;
        int array_bound_vertical = 0, array_bound_horizontal = 0;
        int to_print_vertical, to_print_horizontal;
        boolean success_flag = true;

                //Input parameters of array
                //Horizontal

        while (success_flag) {

            try {

                Scanner in = new Scanner(System.in);
                System.out.print("Введите желаемую размерность массива по вертикали: ");
                array_bound_vertical = in.nextInt();
                success_flag = !success_flag;

            }
            catch (java.util.InputMismatchException e) {

                System.out.println("Ошибочный ввод: введите натуральное число");

            }

        }

                //Vertical

        success_flag = true;

        while (success_flag) {

            try {

                Scanner in = new Scanner(System.in);
                System.out.print("Введите желаемую размерность массива по горизонтали: ");
                array_bound_horizontal = in.nextInt();
                success_flag = !success_flag;

            }
            catch (java.util.InputMismatchException e) {

                System.out.println("Ошибочный ввод: введите натуральное число");

            }

        }

                //Input data in array

        double array [][] = new double[array_bound_vertical] [array_bound_horizontal];

        for (counter_vertical = 0; counter_vertical < array_bound_vertical; counter_vertical++) {

            for (counter_horizantal = 0; counter_horizantal < array_bound_horizontal; counter_horizantal++) {

                success_flag = true;

                while (success_flag) {

                    try {

                        Scanner in = new Scanner(System.in);
                        to_print_vertical = counter_vertical + 1;
                        to_print_horizontal = counter_horizantal + 1;
                        System.out.print("Введите ( " + to_print_vertical + ", " + to_print_horizontal + ") элемент массива: ");
                        array[counter_vertical] [counter_horizantal] = in.nextDouble();
                        success_flag = !success_flag;

                    } catch (java.util.InputMismatchException e) {

                        System.out.println("Ошибочный ввод: введите действительное число формата n,m");

                    }

                }

            }
        }

                //Output first string of double array

        System.out.println("Первая строка вашего массива умноженного на 3:");

        for (counter_horizantal = 0; counter_horizantal < array_bound_horizontal; counter_horizantal++){

            System.out.print("|" + array [0] [counter_horizantal] * 3 + "|");

        }

    }
}
