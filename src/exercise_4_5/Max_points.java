package exercise_4_5;

import java.util.HashMap;

public class Max_points {
    public static String[] partners = {"Ivan 5", "Petr 3", "Alex 10", "Petr 8", "Ivan 6", "Alex 5", "Ivan 1", "Petr 5", "Alex 1"};
    //public static HashMap<String, Integer> partners_point = new HashMap<String, Integer>();
    public static void main(String[] args) {
        // HashMap<String, Integer> partners_point = new HashMap<String, Integer>();
        int ivan_score = 0;
        int petr_score = 0;
        int alex_score = 0;
        int count_partners = partners.length;

        for (int i = 0; i < count_partners; i++) {
            for (String val : partners[i].split(" ")) {
                switch (val) {
                    //case partners[i].substring(0, partners[i].indexOf(" ")):
                    case "Ivan":
                        ivan_score += Integer.parseInt(partners[i].substring(partners[i].lastIndexOf(" ")).replace(" ", ""));
                        break;
                    case "Petr":
                        petr_score += Integer.parseInt(partners[i].substring(partners[i].lastIndexOf(" ")).replace(" ", ""));
                        break;
                    case "Alex":
                        alex_score += Integer.parseInt(partners[i].substring(partners[i].lastIndexOf(" ")).replace(" ", ""));
                        break;
                }
            }
        }
    }
}



/*for(
    String key:partners_point.keySet())

    {
        System.out.println(key + " :: " + partners_point.get(key));
    }


for(
    int i = 0;
    i<partners.length;i++)
            for(
    String srt :partners[i].

    split(" "))

    {

        System.out.println(srt);//partners[i].lastIndexOf(" ")
    }*/


//    for (int i = 0; i < count_partners; i++) {

//System.out.println(partners[i].substring(0, partners[i].indexOf(" ")));
// partners_point.put(partners[i].substring(0, partners[i].indexOf(" ")), 0);
//Integer.parseInt(partners[i].substring(partners[i].lastIndexOf(" ")).replace(" ", ""))
// }



    /*    for (int i = 0; i < count_partners; i++) {
            System.out.println(partners[i].substring(0,partners[i].indexOf(" ")));
            System.out.println(partners[i].substring(partners[i].lastIndexOf(" ")).replace(" ",""));
             partners_point.put("ggg",6);


             System.out.println(partners_point.values());

        }*/


