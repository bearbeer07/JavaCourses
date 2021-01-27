package exercise_1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
/*
Необходимо:
C
тип авто имеющий наибольшую стоимость расходов
тип авто имеющий наименьшую стоимость расходов
реализовать функции которые в разрезе каждого типа авто выводят информацию о каждом авто (тип, номер, пробег, доп. параметр), с сортировкой по пробегу и доп параметру.
*/ //C(CODE_CAR)_гос номер-Пробег-(доп. параметр)

    public static void main(String[] args) throws IOException {
        String[] cars = {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20",
                "C100_2-50", "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20",
                "C100_3-10", "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28",
                "C100_1-300", "C200_1-100-750", "C300_1-32-15"};

        HashMap<Double, Double> cars_mileage = new HashMap<>();
        double rate_c100 = 0;
        double rate_c200 = 0;
        double rate_c300 = 0;
        double rate_c400 = 0;
        int cars_length = cars.length;
        for (int i = 0; i < cars_length; i++) {
            for (String retval : cars[i].split(("_"))) {
                switch (retval) {
                    case "C100":
                        rate_c100 += Double.parseDouble(cars[i].substring(7));
                        //System.out.println("C100: "+(cars[i].substring(7)));
                        break;
                    //System.out.println(cars[i].substring(7));
                    case "C200":
                        rate_c200 += Double.parseDouble((cars[i].substring(7)).substring(0, cars[i].substring(7).lastIndexOf("-")));
                        //System.out.println("C200: "+(cars[i].substring(7)).substring(0,cars[i].substring(7).lastIndexOf("-")));
                        break;
                    case "C300":
                        //System.out.println("C300: " +(cars[i].substring(7)).substring(0,cars[i].substring(7).lastIndexOf("-")));
                        rate_c300 += Double.parseDouble((cars[i].substring(7)).substring(0, cars[i].substring(7).lastIndexOf("-")));
                        break;
                    case "C400":
                        //System.out.println("C400: " +(cars[i].substring(7)).substring(0,cars[i].substring(7).lastIndexOf("-")));
                        rate_c400 += Double.parseDouble((cars[i].substring(7)).substring(0, cars[i].substring(7).lastIndexOf("-")));
                        break;
                }
            }
        }

        //System.out.println("Стоимость расходов для легковых авто: " + rate_c100 * 12.5 * 46.10);
        //System.out.println(rate_c100);
        //  System.out.println(rate_c200);
        ///  System.out.println(rate_c300);
        //  System.out.println(rate_c400);
        double consumption100 = (rate_c100 / 100) * 46.20 * 12.5;
        double consumption200 = (rate_c200 / 100) * 48.90 * 12.0;
        double consumption300 = (rate_c300 / 100) * 47.50 * 11.5;
        double consumption400 = (rate_c400 / 100) * 48.90 * 20.0;


        System.out.println("Общая стоимость расходов на ГСМ");
        System.out.println(consumption100 + consumption200 + consumption300 + consumption400);
        System.out.println("Расход на каждый класс авто");
        System.out.println("Введите класс авто");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String code = reader.readLine();
        if (code == "C100") {
            System.out.println(consumption100);
        } else if (code == "C200") {
            System.out.println(consumption200);
        } else if (code == "C300") {
            System.out.println(consumption300);
        } else if (code == "C400") {
            System.out.println(consumption400);
        }


    }
}