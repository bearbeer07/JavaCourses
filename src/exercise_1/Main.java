package exercise_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    //Формат данных - C(CODE_CAR)_гос номер-Пробег-(доп. параметр)
/*
Необходимо:
общую стоимость расходов на ГСМ, так и расходы на каждый класс авто
тип авто имеющий наибольшую стоимость расходов
тип авто имеющий наименьшую стоимость расходов
реализовать функции которые в разрезе каждого типа авто выводят информацию о каждом авто (тип, номер, пробег, доп. параметр), с сортировкой по пробегу и доп параметру.
*/ //C(CODE_CAR)_гос номер-Пробег-(доп. параметр)

    public static void main(String[] args) {
        String[] cars = {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20",
                "C100_2-50", "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20",
                "C100_3-10", "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28",
                "C100_1-300", "C200_1-100-750", "C300_1-32-15"};


        int cars_length = cars.length;
        for (int i = 0; i < cars_length; i++) {
            for (String retval : cars[i].split(("_"))) {
                switch (retval) {
                    case "C100":
                        System.out.println(cars[i].substring(7));

                }
            }
        }


        //стоимость топлива
        HashMap<String, Double> cost_fuel = new HashMap<>();
        cost_fuel.put("C100", 46.10);
        cost_fuel.put("C200", 48.90);
        cost_fuel.put("C300", 47.50);
        cost_fuel.put("C400", 48.50);
        //пробег
        HashMap<String, Double> car_rate = new HashMap<>();
        car_rate.put("C100", 12.5);
        car_rate.put("C200", 12.0);
        car_rate.put("C300", 11.5);
        car_rate.put("C400", 20.0);

        /*for (int i = 0; i < cars.length; i++) {
            cars[i].split("C").toString().split("-").toString().split("_");
            cars_i += cars[i] + " ";
        }
        System.out.println(cars_i);


        for (int i = 0, n = cars[i].length(); i < n; i++) {
            char c = cars[i].charAt(i);

            System.out.println(c);
        }*/

    }
}