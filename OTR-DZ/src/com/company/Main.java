package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        /*HashMap<String, ArrayList<String>> hm = new HashMap<>();
        hm.put("Иванов И.И.", new ArrayList<>());
        hm.put("Петров П.П.", new ArrayList<>());
        hm.put("Сидоров С.С.", new ArrayList<>());

        hm.get("Иванов И.И.").add(0, "+8 800 2000 500 \n +8 800 200 600 ");
        hm.get("Петров П.П.").add(0, "+8 800 2000 700  ");
        hm.get("Сидоров С.С.").add(0, "+8 800 2000 800 \n +8 800 2000 900 \n +8 800 2000 000");


        System.out.println("Иванов И.И.\n" +  hm.get("Иванов И.И."));
        System.out.println("Петров П.П.\n" + hm.get("Петров П.П."));
        System.out.println("Сидоров С.С.\n" + hm.get("Сидоров С.С."));*/

        Scanner in = new Scanner(System.in);

        int arrayLowerRange[] = new int[4];

        System.out.println("Введите нижнее значение диапозона перебора IP адресов ");
        for (int i = 0; i < arrayLowerRange.length; i++) {
            arrayLowerRange[i] = in.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры

        }


        System.out.println("Вы ввели: " + arrayLowerRange[0] + "." + arrayLowerRange[1] + "." + arrayLowerRange[2] + "." + arrayLowerRange[3]);

        int arrayUpperRange[] = new int[4];
        System.out.println("Введите верхнее значение диапозона перебора IP адресов ");
        for (int i = 0; i < arrayUpperRange.length; i++) {
            arrayUpperRange[i] = in.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }


        System.out.println("Вы ввели: " + arrayUpperRange[0] + "." + arrayUpperRange[1] + "." + arrayUpperRange[2] + "." + arrayUpperRange[3]);

        int[] x = arrayLowerRange;
        int[] y = arrayUpperRange;

        while (true) {
            x[3]++;
            if (x[3] > 255) {
                x[3] = 0;
                x[2]++;
            }
            if (x[2] > 255) {
                x[2] = 0;
                x[1]++;
            }
            if (x[1] > 255) {
                x[1] = 0;
                x[0]++;
            }

            if (x[0] == y[0] && x[1] == y[1] && x[2] == y[2] && x[3] == y[3])
                break;

            System.out.println(x[0] + "." + x[1] + "." + x[2] + "." + x[3]);
            if (x[0] == y[0] && x[1] == y[1] && x[2] == y[2] && x[3] == y[3])

                break;


        }

    }
}




