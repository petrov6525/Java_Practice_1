import java.util.Scanner;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
        task12();
    }


    public static int getSum(int begin, int end){
        int sum = 0;

        for(int i = begin; i <= end; i++){
            sum +=i;
        }

        return sum;
    }

    public static int[] getArray(){
        int[] arr = new int[]{};
        do{
            try{
                String line = "";
                System.out.println("\n\nВведіть числа массиву через пробіл: ");
                if(scanner.hasNextLine()){
                    line = scanner.nextLine();
                }

                String[] arr_string = line.split(" ");
                arr = new int[arr_string.length];
                for(int i = 0; i < arr_string.length; i++) {
                    arr[i] = Integer.parseInt(arr_string[i]);

                }
            }
            catch (Exception ex){
                System.out.println("Error!");
                continue;
            }
            return arr;
        }while (true);
    }

    public static long getFact(int n){
        long fact = 1;
        if(n == 0){
            fact = 0;
        }

        for(int i = 1; i <= n; i++){
            fact *= i;
        }

        return fact;
    }

    public static long[] pushToArray(long n, long[] arr){
        long[] new_arr = new long[arr.length + 1];

        for(int i = 0; i < arr.length; i++){
            new_arr[i] = arr[i];
        }
        new_arr[arr.length] = n;

        return new_arr;
    }

    public static void task1() {
        System.out.println("Завдання 1:");
        System.out.println("Вивести на екран надпис Fall seven times and stand up eight у різних рядках");

        System.out.println("Fall seven times");
        System.out.println("and");
        System.out.println("stand up eight");
    }

    public static void task2() {
        System.out.println("\n\nЗавдання 2:");
        System.out.println("Користувач вводить з клавіатури два числа. Необхідно порахувати суму чисел, різницю чисел,\n" +
                "добуток чисел. Результат підрахунків вивести на екран.");

        int a, b;

        do {
            System.out.print("Введіть перше число: ");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                break;


            } else {
                System.out.println("Помилка вводу!");
                scanner.nextLine();
            }
        } while (true);

        do {
            System.out.print("Введіть друге число: ");
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                break;
            } else {
                System.out.println("Помилка вводу!");
                scanner.nextLine();
            }
        } while (true);


        int sum = a + b;
        int div = a - b;
        int prod = a * b;

        System.out.println("Сумма: " + sum);
        System.out.println("Різниця: " + div);
        System.out.println("Добуток: " + prod);

    }

    public static void task3() {
        System.out.println("\n\nЗавдання 3:\n");
        System.out.println("Користувач з клавіатури вводить чотиризначне число. Необхідно повернути число і відобразити\n" +
                "результат. Наприклад, якщо вводимо 4512, результат 2154.");

        int num;
        do {
            System.out.println("Введіть число: ");

            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                break;
            }
        } while (true);

        String str = "" + num;

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        num = Integer.parseInt(reverse);

        System.out.println(num);
    }

    public static void task4() {
        System.out.println("\n\nЗавдання 4:\n");
        System.out.println("Користувач з клавіатури вводить кількість годин. Якщо отримане значення знаходиться в\n" +
                "діапазоні від 0 до 6 потрібно вивести надпис Good Night, якщо в діапазоні від 6 до 13 Good\n" +
                "Morning, якщо в діапазоні від 13 до 17 Good Day, якщо в відапазоні від 17 до 0 Good Evening.\n" +
                "Верхня межа діапазону не включається. Наприклад, число 6 відноситься від 6 до 13.");

        int h;
        do {
            System.out.println("Введіть години");
            if (scanner.hasNextInt()) {
                h = scanner.nextInt();
                if (h >= 0 && h <= 23) {
                    break;
                }
            }
        } while (true);

        if (h >= 0 && h < 6) {
            System.out.println("Good Night");
        } else if (h >= 6 && h < 13) {
            System.out.println("Good Morning");
        } else if (h >= 13 && h < 17) {
            System.out.println("Good Day");
        } else if (h >= 17 && h < 23) {
            System.out.println("Good Evening");
        }
    }

    public static void task5() {
        System.out.println("\n\nЗавдання 5:");
        System.out.println("Користувач вводить з клавіатури ціле шестизначне число. Написати програму, яка визначає, чи є\n" +
                "введене число — щасливим (щасливим вважається шестизначне число, у якого сума перших 3\n" +
                "чисел рівна сумі других трьох чисел).");

        int n;
        do {
            System.out.println("Enter 6-digit number:");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n >= 10000 && n <= 999999) {
                    break;
                }
            }
        } while (true);

        String str = "" + n;

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 3; i++) {
            sum1 += Integer.parseInt(String.valueOf(str.charAt(i)));
            sum2 += Integer.parseInt(String.valueOf(str.charAt(i + 3)));
        }

        if (sum1 == sum2) {
            System.out.println("Lucky :)");
        } else {
            System.out.println("Not lucky :(");
        }
    }

    public static void task6() {
        System.out.println("\n\nЗавдання 6:");
        System.out.println("Користувач вводить з клавіатури число в діапазоні від 1 до 100. Якщо число кратне 3(ділиться на\n" +
                "3 без залишку) потрібно вивести слово Fizz. Якщо число кратне 5 потрібно вивести слово Buzz.\n" +
                "Якщо число кратне і 3 і 5 потрібно вивести Fizz Buzz. Якщо число не кратне 3 і 5 потрібно вивести\n" +
                "саме число.\n" +
                "Якщо користувач ввів значення не в діапазоні від 1 до 100 потрібно вивести повідомлення про\n" +
                "помилку.\n");

        int num;

        do {
            System.out.println("Enter num 1 - 100:");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();

                if (num >= 1 && num <= 100) {
                    break;
                } else {
                    System.out.println("1 - 100 !!!");
                }
            }
        } while (true);

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }

    public static void task7() {
        System.out.println("/n/nЗавдання 7:");
        System.out.println("Користувач вводить з клавіатури число. Потрібно порахувати факторіал числа. Наприклад, якщо\n" +
                "введене число 3, факторіал числа 1*2*3=6.\n" +
                "Формула для розрахунку факторіала: n! = 1*2*3…*n, де n - число для підрахунку факторіалу.");

        int n;
        do {
            System.out.println("Enter num for factorial:");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                break;
            }
        } while (true);

        long fact = 1;
        if (n == 0) {
            fact = 0;
        } else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
        }
        System.out.println(fact);
    }

    public static void task8() {
        System.out.println("\n\nЗавдання 8:");
        System.out.println("Показати на екрані всі прості числа в діапазоні, вказаному користувачем. Число називається\n" +
                "простим, якщо воно ділиться без залишку тільки на себе і на одиницю. Наприклад, три — це\n" +
                "просте число, а чотири — ні.");

        int n;
        do{
            if(scanner.hasNextInt()){
                n = scanner.nextInt();
                break;
            }
        }while(true);


        for(int i = 1; i <= n; i++){
            boolean flag = false;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(i);
            }
        }
    }

    public static void task9(){
        System.out.println("\n\nЗавдання 9:");
        System.out.println("Користувач з клавіатури вводить елементи одновимірного масиву. Необхідно знайти суму\n" +
                "елементів масиву, середнє арифметичне, відобразити на екран всі елементи масиву.");

        String line = "";
        do{
            try{
                System.out.println("\n\nВведіть числа массиву через пробіл: ");
                if(scanner.hasNextLine()){
                    line = scanner.nextLine();
                }

                String[] arr_string = line.split(" ");
                int[] arr = new int[arr_string.length];
                int sum = 0;
                for(int i = 0; i < arr_string.length; i++){
                    arr[i] = Integer.parseInt(arr_string[i]);
                    sum += arr[i];
                    System.out.println(arr[i]);
                }
                int avg = sum/ arr.length;
                System.out.println("Sum: " + sum);
                System.out.println("Avg: " + avg);
            }
            catch (Exception ex){
                System.out.println("Error!");
                continue;
            }
            break;
        }while (true);
    }

    public static void task10(){
        System.out.println("\n\nЗавдання 10:");
        System.out.println("Користувач з клавіатури вводить елементи одновимірного місиву в деяке число. Необхідно\n" +
                "підрахувати скільки разів число зустрічається у масиві.");

        do{
            try{
                String line = "";
                System.out.println("\n\nВведіть числа массиву через пробіл: ");
                if(scanner.hasNextLine()){
                    line = scanner.nextLine();
                }

                String[] arr_string = line.split(" ");
                int[] arr = new int[arr_string.length];
                for(int i = 0; i < arr_string.length; i++){
                    arr[i] = Integer.parseInt(arr_string[i]);

                }

                int n;
                System.out.println("Enter a num:");
                int count = 0;
                if(scanner.hasNextInt()){
                    n = scanner.nextInt();

                    for(int i = 0; i < arr.length; i++){
                        if(arr[i] == n){
                            count++;
                        }
                    }
                }

                System.out.println(count);
            }
            catch (Exception ex){
                System.out.println("Error!");
                continue;
            }
            break;
        }while (true);
    }

    public static void task11(){
        System.out.println("\n\nЗавдання 11:");
        System.out.println("Написати метод, що повертає суму чисел у вказаному діапазоні. Границі діапазону передаються\n" +
                "в якості параметрів.");


        do{
            int begin = 0;
            int end = 0;

            System.out.println("\nEnter begin of diapason:");
            if (scanner.hasNextInt()){
                begin = scanner.nextInt();
            }

            System.out.println("\nEnter end of diapason:");
            if (scanner.hasNextInt()){
                end = scanner.nextInt();
            }

            int sum = getSum(begin,end);
            System.out.println(sum);
            break;

        }while(true);
    }


    public static void task12(){
        System.out.println("\n\nЗавдання 12:");
        System.out.println("Написати метод, що підраховує факторіал кожного елемента масиву. Метод повертає новий\n" +
                "масив, що містить отримані факторіали.");

        int[] arr = getArray();
        long[] fact_arr = new long[]{};

        for(int i = 0; i < arr.length; i++){
            long fact = getFact(arr[i]);
            fact_arr = pushToArray(fact,fact_arr);
        }

        for (int i = 0; i < fact_arr.length; i++){
            System.out.println(fact_arr[i]);
        }
    }


}