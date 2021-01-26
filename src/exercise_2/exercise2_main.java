package exercise_2;

import java.util.ArrayList;

public class exercise2_main {
    public static void main(String[] args) {
        //Задание 2
        //создание,генерация и передача массива

            ArrayList<Integer> list_ex=new ArrayList<>();
            list_ex.add((int)(Math.random()*10));
            list_ex.add((int)(Math.random()*10));
            list_ex.add((int)(Math.random()*10));
            list_ex.add((int)(Math.random()*10));
            list_ex.add((int)(Math.random()*10));
            Exercise_2 ex2 = new Exercise_2(list_ex);
            //Заполне массива одинаковыми элементами
            ex2.add_all(5);
            //Добавление элемента в любую позицию
            ex2.add_r(3);
            //Добавление в начало массива
            ex2.add_st(2);
            //Удаление элемента
            ex2.remove_i(3);
            //Изменение случайного элемента
            ex2.set_i(2,4);
            //Выыод всего массива
            ex2.show_arr();
            //Вывод максимального-минимального значения
            ex2.show_max_min();
            //Сортировка массива asc(по возрастанию)
            ex2.sort_asc();
            //Сортировка массива desc(по убыванию)
            ex2.sort_desc();
    }
}
