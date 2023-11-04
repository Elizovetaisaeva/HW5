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
            System.out.println("Если скорость" + speed + " , то можно ездить спокойно");
        }

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
                System.out.println("Если возраст человека равен" + age + ", то ему нужно работать");
            }
    }
    public static void task5() {
                var age = 28;
                if ( age<= 5) {
                    System.out.println("Если возраст ребенка равен " +age+ ", то ему нельзя кататься на аттракционе");
                } else if (age <= 14) {
                    System.out.println("Если возраст человека равен" +age+ ", то ему можно кататься на аттракционе в сопровождении");
                } else  {
                    System.out.println("Если возраст человека равен" +age+ ", то емубез сопровождения взрослого");

                }
    }
    public static void task6() {
                var people = 73;
                var freeSeats = 60 - people;
                var freeSpace = 102 - people;
                if (freeSeats > 0) {
                    System.out.println("Свободных сидячих мест" +freeSeats);
                } else if (freeSpace > 0) {
                    System.out.println("Есть сидячие места" +freeSpace);
                } else  {
                    System.out.println("Сидячих мест нет" +freeSpace);
                }
    }
    public static void task7() {
        int one = 3;
        int two = 7;
        int three = -1;
        if (one > two && one > three) {
            System.out.println("One is the biggest. volue =" + one);
        } else if (two > three) {
            System.out.println("One is the biggest. volue =" + two);
        } else {
            System.out.println("One is the biggest. volue =" + three);
        }
    }
    }