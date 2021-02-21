package exercise_1;

public class Cars_util {

//так как было дублирование кода, вывод инфо по классу авто вынес в отдельный метод
    public static void output_info(String code, String arr[]) {
        if (code.equalsIgnoreCase("C100"))
        for (int i = 0; i < arr.length; i++) {
            for (String val : arr[i].split(("_"))) {
                switch (val) {
                    case "C100":
                        System.out.println("гос.номер: " + arr[i].substring(5).substring(0, arr[i].substring(5).lastIndexOf("-")) +
                                " пробег: " + arr[i].substring(7));
                        break;
                }
            }
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                for (String val : arr[i].split(("_")))
                    switch (val) {
                        case "C200":
                            System.out.println(("гос.номер: " + arr[i].substring(5).substring(0, 1) +
                                    " пробег: " + (arr[i].substring(7)).substring(0, arr[i].substring(7).lastIndexOf("-"))) +
                                    " доп. параметр: " + (arr[i].substring(7)).substring(arr[i].substring(6).lastIndexOf("-")));
                            break;
                    }
            }
        }
    }
}
