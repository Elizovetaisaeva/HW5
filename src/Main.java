public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }
    public static void task1() {
        var age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен" + age
                    + " , то он не достиг совершеннолетия, нужно немного подождать");

        } else {
            System.out.println("Если возраст человека равен"
                    + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        var temp = 3;
        if (temp < 5) {
            System.out.println("На улице" +temp+  "градуса,  нужно надеть шапку");
        } else {
                System.out.println("На улице" +temp+ " можно идти без шапки");
        }

    }

    public static void task3() {
        var speed = 55;
        if (speed < 60) {
            System.out.println("Если скорость" +speed+ ", то  придется заплатить штраф");
        } else {
            System.out.println("Если скорость" +speed+ " , то можно ездить спокойно");

    }

    public static void task4() {
            var age = 19;
            if (2<= age && age <= 6) {
                System.out.println("Если возраст человека равен" +age+ ", то ему нужно ходить в сад");
            } else if (7<= age && age <= 17) {
                System.out.println("Если возраст человека равен" +age+ ", то ему нужно ходить в школу");
            } else if (18<= age && age <= 24) {
                System.out.println("Если возраст человека равен" +age+ ", то ему нужно ходить в университет");
            } else if (age <= 24) {
                System.out.println("Если возраст человека равен" +age+ ", то ему нужно работать");

        }

    }

    public static void task5() {

    }

    public static void task6() {

    }

    public static void task7() {

    }

}