package exercise_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {
    public static void main(String[] args) throws IOException {
        Cars_util util = new Cars_util();
        String[] cars = {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20",
                "C100_2-50", "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20",
                "C100_3-10", "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28",
                "C100_1-300", "C200_1-100-750", "C300_1-32-15"};

        double rate_c100 = 0;
        double rate_c200 = 0;
        double rate_c300 = 0;
        double rate_c400 = 0;
////////парсинг массива
        int cars_length = cars.length;
        for (int i = 0; i < cars_length; i++) {
            for (String val : cars[i].split(("_"))) {
                switch (val) {
                    case "C100":
                        rate_c100 += Double.parseDouble(cars[i].substring(7));
                        break;
                    case "C200":
                        rate_c200 += Double.parseDouble((cars[i].substring(7)).substring(0, cars[i].substring(7).lastIndexOf("-")));
                        break;
                    case "C300":
                        rate_c300 += Double.parseDouble((cars[i].substring(7)).substring(0, cars[i].substring(7).lastIndexOf("-")));
                        break;
                    case "C400":
                        rate_c400 += Double.parseDouble((cars[i].substring(7)).substring(0, cars[i].substring(7).lastIndexOf("-")));
                        break;
                }
            }
        }
/////////////////////////////Общий расход/////////////////////////////
        double consumption100 = (rate_c100 / 100) * 46.20 * 12.5;
        double consumption200 = (rate_c200 / 100) * 48.90 * 12.0;
        double consumption300 = (rate_c300 / 100) * 47.50 * 11.5;
        double consumption400 = (rate_c400 / 100) * 48.90 * 20.0;
        System.out.println("Общая стоимость расходов на ГСМ");
        System.out.println(consumption100 + consumption200 + consumption300 + consumption400);
/////////////////////////////Расходы по классу авто/////////////////////////////
        System.out.println("Расход на каждый класс авто");
        System.out.println("Введите класс авто");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String code = reader.readLine();
        if (code.equalsIgnoreCase("C100")) {
            System.out.println(consumption100);
        } else if (code.equalsIgnoreCase("C200")) {
            System.out.println(consumption200);
        } else if (code.equalsIgnoreCase("C300")) {
            System.out.println(consumption300);
        } else if (code.equalsIgnoreCase("C400")) {
            System.out.println(consumption400);
        }
/////////////////////////////Определение класса авто с наибольшими расходами/////////////////////////////
        double max_consumption = Math.max(Math.max(consumption100, consumption200), Math.max(consumption300, consumption400));
        if (max_consumption == consumption100) {
            System.out.println("Легковые авто имеют наибольшую стоимость расходов");
        } else if (max_consumption == consumption200) {
            System.out.println("Грузовые авто имеют наибольшую стоимость расходов");
        } else if (max_consumption == consumption300) {
            System.out.println("Пассажирские авто имеют наибольшую стоимость расходов");
        } else if (max_consumption == consumption400) {
            System.out.println("Тяжелая техника имеет наибольшую стоимость расходов");
        }
/////////////////////////////Вывод информации по типу авто/////////////////////////////
        /*if (code.equalsIgnoreCase("C100")) {

            for (int i = 0; i < cars_length; i++) {
                for (String val : cars[i].split(("_"))) {
                    switch (val) {
                        case "C100":
                            System.out.println("гос.номер: " + cars[i].substring(5).substring(0, cars[i].substring(5).lastIndexOf("-")) +
                                    " пробег: " + cars[i].substring(7));

                            break;
                    }
                }
            }
        } else if (code.equalsIgnoreCase("C200")) {
            for (int i = 0; i < cars_length; i++) {
                for (String val : cars[i].split(("_")))
                    switch (val) {
                        case "C200":
                            System.out.println(("гос.номер: " + cars[i].substring(5).substring(0, 1) +
                                    " пробег: " + (cars[i].substring(7)).substring(0, cars[i].substring(7).lastIndexOf("-"))) +
                                    " доп. параметр: " + (cars[i].substring(7)).substring(cars[i].substring(6).lastIndexOf("-")));
                            break;
                    }
            }
        } else if (code.equalsIgnoreCase("C300")) {
            for (int i = 0; i < cars_length; i++) {
                for (String val : cars[i].split(("_")))
                    switch (val) {
                        case "C200":
                            System.out.println(("гос.номер: " + cars[i].substring(5).substring(0, 1) +
                                    " пробег: " + (cars[i].substring(7)).substring(0, cars[i].substring(7).lastIndexOf("-"))) +
                                    " доп. параметр: " + (cars[i].substring(7)).substring(cars[i].substring(6).lastIndexOf("-")));
                            break;
                    }
            }
        } else if (code.equalsIgnoreCase("C400")) {
            for (int i = 0; i < cars_length; i++) {
                for (String val : cars[i].split(("_")))
                    switch (val) {
                        case "C200":
                            System.out.println(("гос.номер: " + cars[i].substring(5).substring(0, 1) +
                                    " пробег: " + (cars[i].substring(7)).substring(0, cars[i].substring(7).lastIndexOf("-"))) +
                                    " доп. параметр: " + (cars[i].substring(7)).substring(cars[i].substring(6).lastIndexOf("-")));
                            break;
                    }
            }
        }*/
        // этот шаг вынес в отдельный метод в классе Cars_util
        util.output_info(code,cars);
    }
}

