package exercise_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise_2 {
    //////////////////////////////////////////Выполнение c ArrayList////////////////////////////
    public int array[] = null;

    public Exercise_2(int[] array) {
        this.array = array;
    }

    //сравнение индекса на входе и длинны массива
    public void valid_index(int index) {
        if (index >= array.length) {
            System.out.println("Индекс больше длинны массива");
            return;
        }
    }

    //добавление элемента в конец массива
    public void add_end(int elem) {
        int newArr[] = Arrays.copyOf(array, array.length + 1);
        newArr[array.length - 1] = elem;
        this.array = newArr;
    }

    //добавление элемента в определенную позицию
    public void add_random(int index, int elem) {
        valid_index(index);
        int newArr[] = Arrays.copyOf(array, array.length + 1);
        newArr[index] = elem;
        this.array = newArr;
    }

    //////вывод количества элементов
    public void length_arr() {
        System.out.println("Количество элементов: " + array.length);
    }

    /////удаление значения по индексу
    public void remove_elem(int index) {
        valid_index(index);
        int newArr[] = Arrays.copyOf(array, array.length - 1);
        newArr[index] = array[index + 1];
        this.array = newArr;
    }

    ////изменение элемента по индексу
    public void edit_elem(int index, int elem) {
        valid_index(index);
        int newArr[] = Arrays.copyOf(array, array.length);
        newArr[index] = elem;
        this.array = newArr;
    }

    /////сортировка массива
    public void sort() {
        Arrays.sort(array);
    }

    //////вывод максимально значения
    public int maxItem() {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    ////вывод минимального значения
    public int minItem() {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    ////функция вывода на экран всего массива
    public void show2_arr() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    ////заполнение массива одинаковыми элементами
    public void fillArr(int elem) {
        for (int i = 0; i < array.length; i++) {
            array[i] = elem;
        }
    }

    ////////////////////////////Выполнение c ArrayList////////////////////////////
    ArrayList<Integer> list = new ArrayList<Integer>();

    public Exercise_2(ArrayList<Integer> list) {
        this.list = list;
    }


    //
   /* Убрал генерацию случайного массива
   //Генерация случайного массива
   public ArrayList<Integer> gen_arr(int size){
        for (int i = 0; i<size;i++){
            list.add((int)(Math.random()*10));
        }
        return list;
    }*/


    //Добавление элемента в любую позицию
    public void add_r(int elem) {
        /// gen_arr(size);
        list.add(list.size(), elem);
        //System.out.println(list.get(list.size()-1));
    }

    //Добавление в начало массива
    public void add_st(/*int size,*/int elem) {
        // gen_arr(size);
        list.add(0, elem);
        //  System.out.println(list.get(0));
    }

    //Удаление элемента
    public void remove_i(/*int size,*/ int index) {
        //   gen_arr(size);
        list.remove(index);
    }

    //Изменение случайного элемента
    public void set_i(/*int size,*/ int index, int elem) {
        // gen_arr(size);
        list.set(index, elem);
    }

    //Вывод всего массива
    public void show_arr() {
        //  gen_arr(size);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //Сортировка массива asc(по возрастанию)
    public void sort_asc(/*int size*/) {
        //gen_arr(size);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //Сортировка массива desc(по убыванию)
    public void sort_desc(/*int size*/) {
        // gen_arr(size);
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //Заполне массива одинаковыми элементами
    public void add_all(/*int size,*/ int elem) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, elem);
        }
    }

    //Вывод максимального-минимального значения
    public void show_max_min(/*int size*/) {
        //  gen_arr(size);
        Collections.sort(list);
        System.out.println("Минимальный элемент " + list.get(0) + " .");
        System.out.println("Максимальный элемент " + list.get(list.size() - 1) + " .");
    }


}