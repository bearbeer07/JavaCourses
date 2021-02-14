package exercise_4_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

////Частоный словарь английского алфавита
public class Frequency_dictionary {
    public static void main(String[] args) throws IOException {
        System.out.println("ВЫВОД ЧАСТОТНОГО СЛОВАРЯ БУКВ АНГИЙСКОГО АЛФАВИТА");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст");
        String text = reader.readLine();
        Dict_utill dict_utill = new Dict_utill();
        dict_utill.frequency(text);
    }
}
