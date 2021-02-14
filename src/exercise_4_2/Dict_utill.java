package exercise_4_2;

public class Dict_utill {
    public void frequency(String text) {
        //переводим входной текст в нижний регистр
        text = text.toLowerCase();
        //задаем массив где будем хранить количество вхождений
        int[] result = new int['z' - 'a' + 1];
        //перебираем входящую строку по буквам и записываем количество вхождений
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result[ch - 'a']++;
            }
        }
        //Выводим полученный результат
        for (int i = 0; i < result.length; i++) {
            System.out.println((char) (i + 'a') + " = " + result[i]);
        }
    }
}
