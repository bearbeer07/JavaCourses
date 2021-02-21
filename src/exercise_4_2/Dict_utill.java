package exercise_4_2;

public class Dict_utill {
    public void frequency(String text) {
        //переводим входной текст в нижний регистр
        text = text.toLowerCase();
        //задаем массив, размер которого = количеству букв в алфавите
        int[] result = new int['z' - 'a' + 1];
        //перебираем входящую строку и записываем в соответствующие позиции вхождения
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
