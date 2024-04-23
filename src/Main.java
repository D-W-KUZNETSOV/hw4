public class Main {
    public static void main(String[] args) {
        //задание №1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен" + age + " то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

        //задание №2
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");

        }
        //задание №3
        byte speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");

        }
        //задание № 4
        int age1 = 15;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + "то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу");
        }
        if (age >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в университет");
        }
        if (age1 >= 24) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить на работу");
        }
        // задание №5
        int age2 = 16;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему нельзя кататься на аттракционе");
        }
        if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age2 >= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        // задание №6
        int full = 102;
        int seating = 60;
        int mesto = 102;
        if (mesto <= seating) {
            System.out.println("есть свободные сидячие места");
        } else {
            if (mesto <= full) {
                System.out.println("есть свободные стоячие места");
            } else {
                System.out.println("свободных мест нет");
            }
        }
        //задание №7
        int one = 25;
        int two = 15;
        int three = 5;
        if (one > two && one > three) {
            System.out.println("one большее число из трёх");
        } else {
            if (two > one && two > three) {
                System.out.println("two большее из трёх чисел");
            } else {
                if (three > one && three > two) {
                    System.out.println("three большее из трёх чисел");
                }
            }
        }


    }

}

