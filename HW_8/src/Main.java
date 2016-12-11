public class Main {

    public static void main(String[] args) {
        middleCount(new int[]{10, 14, 13, 1, 12, 31, 11, 1, 22, 2, 4, 5, 6, 8});
        midFor(new int[]{10, 14, 13, 1, 12, 31, 11, 1, 22, 2, 4, 5, 6, 8});
        middleCount1(new int[]{10, 14, 13, 1, 12, 31, 11, 1, 22, 2, 4, 5, 6, 8}, 20);
        midFor1(new int[]{10, 14, 13, 1, 12, 31, 11, 1, 22, 2, 4, 5, 6, 8}, 20);
        twins(new int[]{1, 1, 2, 3, 3, 4, 5, 6, 6, 7, 7});
        speed(new int[]{220,110,180,150,250,190});
        posl(new int[]{1, 2, 1, 1, 1, 1, 0});
        forDo(new double[]{-1, -2, -3, -5, -1, 0});
        maxCh(11225555);
        revers(15);
        strok(22);
        mark(55);
    }

    /*Найти среднее арифметическое элементов массива, больших числа 10. *
        Решить задачу при помощи циклов while и for-each*/

    static void middleCount(int[] arr) {
        int sum = 0;
        int i = 0;
        int j = 0;
        int res = 0;
        while (i < arr.length) {
            if (arr[i] > 10) {
                sum = sum + arr[i];
                j++;
            }
            i++;
        }
        System.out.println(res = sum / j);
    }

    static void midFor(int[] arr) {
        int res = 0;
        int j = 0;
        int sum = 0;
        for (int i : arr) {
            if (i > 10) {
                sum = sum + i;
                j++;
            }
        }
        System.out.println(res = sum / j);
    }

    /*Найти среднее арифметическое элементов массива, меньших некоторого числа m.
     * Решить задачу при помощи циклов while и for-each*/
    static void middleCount1(int[] arr, int m) {
        int sum = 0;
        int i = 0;
        int j = 0;
        int res = 0;
        while (i < arr.length) {
            if (arr[i] > m) {
                sum = sum + arr[i];
                j++;
            }
            i++;
        }
        System.out.println(res = sum / j);
    }

    static void midFor1(int[] arr, int m) {
        int res = 0;
        int j = 0;
        int sum = 0;
        for (int i : arr) {
            if (i > m) {
                sum = sum + i;
                j++;
            }
        }
        System.out.println(res = sum / j);
    }

    /* В массиве из 20 элементов числа образуют неубывающую последовательность. Несколько элементов, идущих подряд, равны между собой.
       Найти количество таких элементов. Сколько различных чисел имеется в массиве? */
    static void twins(int[] arr) {
        int j = 1;
        int i = 0;
        int a = 0;
        while (i < arr.length) {
            if (i > 0 && arr[i] != arr[i - 1]) j++;

            else if (i > 0 && arr[i] == arr[i - 1]) a++;
            i++;
        }
        System.out.println(j + "-all, " + a + "-twins");
    }


    /*  В массиве хранится информация о максимальной скорости каждой из 40 марок легковых автомобилей.
        Определить скорости двух самых быстрых автомобилей.
        Задачу решить, не используя два прохода по массиву.     */
    static void speed(int[] arr) {
        int j = 0;
        int i = 0;
        int b = 0;
        while (i < arr.length -1) {
            if (i > 0 && arr[i] > arr[i -1]) j = arr[i];
            if (i> 0 && arr[i-1]>arr[i]&& arr[i-1]< j) b = arr[i+1];

            i++;
        }
        System.out.println(j +" -" + b);
    }

    /*    Дана непустая последовательность целых чисел, оканчивающаяся нулем. Найти:
          а) сумму всех чисел последовательности;
          б) количество всех чисел последовательности.
     */
    static void posl(int[] arr) {
        int sum = 0;
        int j = 0;
        int res = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println(sum);
        while (j < arr.length) {
            res++;
            j++;
        }
        System.out.println(res);
    }

    /*
    Дана последовательность из n вещественных чисел, начинающаяся с отрицательного числа.
     Определить, какое количество отрицательных чисел записано в начале последовательности.
      Условный оператор не использовать.     */
    static void forDo(double[] arr) {
        int sum = 0;
        int j = 0;
        for (double i : arr) {
            while (i < 0) {
                j++;
                break;
            }

        }
        System.out.println(j);
    }

    /*Дано натуральное число. Определить, сколько раз в нем встречается максимальная цифра
    (например, для числа 132233 ответ равен 3, для числа 46 336 — 2, для числа 12 345 — 1). *
    Задачу решить, не используя два прохода по массиву.     */

    static void maxCh(int ch) {
        int max = 1;
        int j = 0;
        int res;
        while (ch != 0) {
            res = ch % 10;
            if (res == max) {
                j++;
            } else if (res > max) {
                max = res;
                j = 1;
            }
            ch /= 10;
        }
        System.out.println(j);
    }
    /*Дано число. Написать программу, которая возвращает его зеркальное отражение в виде числа. */

    static void revers(int ch) {
        int res;
        while (ch != 0) {
            res = ch % 10;
            System.out.print(res);
            ch /= 10;
        }
        System.out.println("\n");
    }

    /*Дано двузначное число. Необходимо написать программу, которая вернет строковое представление данного числа.
        Например, дано число 34, его строковое представление - thirty four.*/
    static void strok(int ch) {
        int res = ch/10;
        int ed = ch%10;
        if (ch >= 10 && ch < 20) {
            switch (ch) {

                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
            }
        } else if (ch >= 20 && ch < 100) {
            switch (res) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }

                switch (ed){
                    case 1:
                        System.out.println(" one");
                        break;
                    case 2:
                        System.out.println(" two");
                        break;
                    case 3:
                        System.out.println(" three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println(" five");
                        break;
                    case 6:
                        System.out.println(" six");
                        break;
                    case 7:
                        System.out.println(" seven");
                        break;
                    case 8:
                        System.out.println(" eight");
                        break;
                    case 9:
                        System.out.println(" nine");
                        break;
                }
        }
    }

    static void mark(int ch){
        while (ch<20){
            System.out.println("F");
            break;
        }
        while (ch>=20 && ch<40){
            System.out.println("E");
            break;
        }
        while (ch>=40 && ch<60){
            System.out.println("D");
            break;
        }
        while (ch>=60 && ch<75){
            System.out.println("C");
            break;
        }
        while (ch>=75 && ch<90){
            System.out.println("B");
            break;
        }
        while (ch>=90 && ch<=100){
            System.out.println("A");
            break;
        }
    }

}




