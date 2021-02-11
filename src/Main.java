public class Main {

    public static void main(String[] args)
    {
        //2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte k = 127;
        short s = 32767;
        int i = 2021;
        long l = 19;
        float f = 2.3f;
        double r = 2.3;
        char q = 'q';
        boolean isTrue = true;

        //3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат
        float a = 11;
        float b = 2;
        float c = 5;
        float d = 2;

        float calculateExampleResult = calculateExample(a, b, c ,d);
        System.out.println("Результат выражения a * (b + (c / d)) = " + calculateExampleResult);
        System.out.println();
        System.out.println();

        /*
        * 4. Написать метод, принимающий на вход два целых числа и проверяющий,
        * что их сумма лежит в пределах от 10 до 20 (включительно),
        * если да – вернуть true, в противном случае – false.
        * */
        boolean isAmountBetweenResult = isAmountBetween(10, 13);
        System.out.println("Сумма указанных чисел лежит в диапозоне от 10 до 20: " + isAmountBetweenResult);
        System.out.println();
        System.out.println();

        /*
        * 5. Написать метод, которому в качестве параметра передается целое число,
        * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        * Замечание: ноль считаем положительным числом.
        * */
        outputNegativeOrPositive(17);
        outputNegativeOrPositive(-7);
        System.out.println();
        System.out.println();

        /*
        *6. Написать метод, которому в качестве параметра передается целое число.
        * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        * */
        boolean isNegativeOrPositiveResult = isNegativeOrPositive(-7);
        System.out.println("Указанное число отрицательное: " + isNegativeOrPositiveResult);
        System.out.println();
        System.out.println();

        /*
        * 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        * Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        * */
        String name = "Василий";
        helloOutput(name);
        System.out.println();
        System.out.println();

        /*
        * 8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
        * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        * */
        leapYearOrNot(1900);
        leapYearOrNot(2000);
        leapYearOrNot(2021);
    }

    //3
    static float calculateExample(float a, float b, float c, float d)
    {
        return  a * (b + (c / d));
    }

    //4
    static boolean isAmountBetween(int a, int b)
    {
        int summa = a + b;
        boolean isResult = summa > 10 && summa <= 20;
        return isResult;
    }

    //5
    static void outputNegativeOrPositive(int a)
    {
        if (a >= 0)
        {
            System.out.println("Число " + a + " положительное");
        }
        else
        {
            System.out.println("Число " + a + " отрицательное ");
        }
    }

    //6
    static  boolean isNegativeOrPositive(int a)
    {
        return a < 0;
    }

    //7
    static void helloOutput(String name)
    {
        System.out.println("Привет, " + name + "!");
    }

    //8
    static void leapYearOrNot(int year)
    {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0))
        {
            System.out.println(year + " год високосный");
        }
        else
        {
            System.out.println(year + " год невисокосный");
        }
    }


}
