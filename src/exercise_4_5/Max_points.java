package exercise_4_5;


public class Max_points {
    public static String[] partners = {"Ivan 5", "Petr 3", "Alex 10", "Petr 8", "Ivan 6", "Alex 5", "Ivan 1", "Petr 5", "Alex 1"};

    public static void main(String[] args) {
        //инициализируем начальное количество очков у игроков
        int ivan_score = 0;
        int petr_score = 0;
        int alex_score = 0;
        //количество итераций с игроками
        int count_partners = partners.length;
        //основной цикл для подсчета набранных очков
        outerloop:
        for (int i = 0; i < count_partners; i++) {
            for (String val : partners[i].split(" ")) {
                switch (val) {
                    case "Ivan":
                        ivan_score += Integer.parseInt(partners[i].substring(partners[i].lastIndexOf(" ")).replace(" ", ""));
                        //выход из цикла если первый набрал Ivan
                        if (ivan_score >= 11) {
                            System.out.println("победил Ivan набрав " + ivan_score);
                            break outerloop;
                        }
                        break;
                    case "Petr":
                        petr_score += Integer.parseInt(partners[i].substring(partners[i].lastIndexOf(" ")).replace(" ", ""));
                        //выход из цикла если первый набрал
                        if (petr_score >= 11) {
                            System.out.println("победил Petr набрав " + petr_score);
                            break outerloop;
                        }
                        break;
                    case "Alex":
                        alex_score += Integer.parseInt(partners[i].substring(partners[i].lastIndexOf(" ")).replace(" ", ""));
                        //выход из цикла если первый набрал
                        if (alex_score >= 11) {
                            System.out.println("победил Alex набрав " + petr_score);
                            break outerloop;
                        }
                }
            }
        }
    }
}