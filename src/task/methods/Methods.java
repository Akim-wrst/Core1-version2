package task.methods;

public class Methods {

    // TODO: Создайте метод который вернет сумму двух чисел
    public static double getSum(double value1, double value2) {
        return value1 + value2;
    }


    // TODO: Создайте метод который вернет сумму двух переданных строк
    public static String getSumString(String string, String string2) {
        return string + string2;
    }

    // TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
// TODO: обернуть их в строку и вернуть результат строкой
    public static String getValueString(String string, int value) {
        return String.valueOf(Integer.parseInt(string) + value);
    }

    // TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
// TODO: число которое передается как int , то пусть метод вернет false , а если меньше , то true
    public static boolean getValueStringBoolean(String string, int value) {
        return Integer.parseInt(string) <= value;
    }

    // TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
// TODO: если обе false верни false
    public static boolean comparison(boolean compare, boolean compare2) {
        return compare || compare2;
    }

    // TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное
    public static boolean comparisonInt(int value) {
        return value % 2 == 0;
    }

    // TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
// TODO: четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"
    public static String evenAndOddNumbers(int[] array) {
        int even = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                even++;
            }
        }
        return (even == array.length) ? "Массив четных чисел" : (even == 0) ? "Массив нечетных чисел" : "Массив четных и не четных чисел";
    }

    // TODO: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
    //TODO:массива который подается в аргументы  и сложите все элементы в новый массив и верните его
    public static int[] newArray(int[] array) {
        int[] arrey1 = new int[array.length];
        for (int i = 0; i < array.length; i++)
            arrey1[i] = array[i];
        return arrey1;
    }
    /*public static int[] newArray(int[] array) {
        int[] array1 = new int[array.length];
        System.arraycopy(array, 0, array1, 0, array.length);
        return array1;
    }*/

    // TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
    // TODO:аргументы сложите все числа который переданы в массиве и верните сумму всех чисел
    public static int sumIntArray(int[] array) {
        int result = 0;
        for (int j : array) {
            result += j;
        }
        return result;
    }

    // TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
    // TODO:тоесть если человек прожил 10 лет , это 120 месяцевтак же сделайте перевод возраста в минуты и метод который расчетает возраст в часах
    public static void getAge(int age) {
        int mount = age * 12;
        int hour = (mount * 30) * 24;
        int minute = hour * 60;
        System.out.println("Человек прожил" + " месяцев:" + mount + " часов:" + hour + " минут:" + minute);
    }

    // TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра
    public static boolean comparisonName(String name, String name2) {
        return name.equalsIgnoreCase(name2);
    }

    // TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент
    public static int lastIntArray(int[] array) {
        return array.length - 1;
    }

    // TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке
    public static int counterCharA(String string) {
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'A') {
                result++;
            }
        }
        return result;
    }

    // TODO: Создайте метод кошелек , у него есть началная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика
    private static int wallet = 550;

    public static void wallet(char character, int money) {
        if (character == '-') {
            wallet -= money;
        } else if (character == '+')
            wallet += money;
        if (wallet < 0 || wallet > 1000) {
            System.out.println("Eror");
        } else {
            System.out.println(wallet);
        }
    }

    public static void main(String[] args) {
        Methods.wallet('+', 500);
        Methods.wallet('-', 200);
        Methods.wallet('-', 500);
        Methods.wallet('-', 350);
        Methods.wallet('-', 1);
    }
}