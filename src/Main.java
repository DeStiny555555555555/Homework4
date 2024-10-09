//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен" + age + "то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека ниже" + age + "то он не достиг совершеннолетия, нужно немного подождать");
        }


        int temperature = 6;
        if (temperature <= 5) {
            System.out.println("На улице" + temperature + "градусов. На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице" + temperature + "градусов. Сегодня тепло, можно идти без шапки");
        }


        int speedLimit = 60;
        if (speedLimit >= 60) {
            System.out.println("Скорость превышена, если она больше" + speedLimit + "км/ч");
        } else {
            System.out.println("Превышения скорости нет, если она меньше" + speedLimit + "км/ч");
        }


        int ageHuman = 24;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен" + ageHuman + "то ему нужно ходить в детский сад");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен" + ageHuman + "то ему нужно ходить в школу");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен" + ageHuman + "то ему нужно ходить в университет");
        }
        if (ageHuman > 24) {
            System.out.println("Если возраст человека равен" + ageHuman + "то ему нужно ходить на работу");
        }


        int ageLimit = 15;
        if (ageLimit < 5) {
            System.out.println("Если возраст ребенка равен" + ageLimit + "то ему нельзя кататься на аттракционе");
        }
        if (ageLimit >= 5 && ageLimit <= 14) {
            System.out.println("Если возраст ребенка равен" + ageLimit + "то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нелья");
        }
        if (ageLimit > 14) {
            System.out.println("Если ребенок старше" + ageLimit + "то он может кататься без сопровождения взрослого");
        }


        int train = 60;
        if (train >= 0 && train <= 60) {
            System.out.println("Сидячие места есть");
        }
        if (train >= 61 && train <= 102) {
            System.out.println("Есть стоящие места");
        }
        if (train > 102) {
            System.out.println("Мест нет");
        } else {
            System.out.println("Места есть");
        }


        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Наибольше число" + one);
        } else {
            if (two > three) {
                System.out.println("Наибольшее число" + two);
            } else {
                System.out.println("Наибольшее число" + three);
            }
        }
    }
}