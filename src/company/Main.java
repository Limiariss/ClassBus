package company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bus A = new Bus(54,400,25);
        Bus B = new Bus(45,500,30);
        final int rent = 11000;
        if (A.Price() > rent) { System.out.println("Для автобуса А поездка рентабельна"); }
        else System.out.println("Для автобуса А поездка нерентабельна");
        if (B.Price() > rent) { System.out.println("Для автобуса B поездка рентабельна"); }
        else System.out.println("Для автобуса B поездка нерентабельна");

        //Определить сколько групп поместятся в первый автобус

        //Ввод массива численности групп с консоли
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество маленьких групп: ");
        int n = in.nextInt();
        System.out.println("Перечислите численность групп: ");
        int[] Groups = new int[n];
        for (int i=0; i<n; i++){
            Groups[i] = in.nextInt();
        }
        in.close();
        //Сортировка массива по возрастанию
        Arrays.sort(Groups);
        //Вычисление количество помещающихся групп
        int MaxPeople = 0, NumberGroups = -1;
        for (int i=0; i<n; i++){
            if (MaxPeople < A.FreePlace()){
                MaxPeople += Groups[i];
                NumberGroups++;
            }
            else { break; }
        }
        //Вывод
        System.out.println("Максимально возможное количество групп в первом автобусе: " + NumberGroups);

    }
}
