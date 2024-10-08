//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен 18, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека ниже 18, то он не достиг совершеннолетия, нужно немного подождать");
        }


        int temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице холодно, нужно одеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }


        int speedLimit = 60;
        if (speedLimit >= 60) {
            System.out.println("Скорость превышена, если она больше 60 км/ч");
        } else {
            System.out.println("Превышения скорости нет, если она меньше 60 км/ч");
        }


        int ageHuman = 17;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен" + ageHuman + "то ему нужно ходить в детский сад");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен" + ageHuman + "то ему нужно ходить в школу");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен" + ageHuman + "то ему нужно ходить в университет");
        }
        if (ageHuman > 25) {
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


        int train = 103;
        if (train > 102) {
            System.out.println("мест нет");
        } else {
            System.out.println("места есть");
        }
        if (train >= 0 && train <= 60) {
            System.out.println("Сидячие места есть");
        } else {
            System.out.println("Есть стоящие места");
        }


        int one = 1;
        int two = 2;
        int three =3;
        if (one > two && one > three) {
            System.out.println("Наибольше число" + one);
        }
        if (two > three) {
            System.out.println("Наибольшее число" + two);
        } else {
            System.out.println("Наибольшее число" + three);
        }
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}