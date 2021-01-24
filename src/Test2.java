import java.util.ArrayList;
import java.util.Collections;

public class Test2{
    /*
    +добавление элемента в массив (в конец и в определенную позицию)
    +функцию вывод количества элементов в массиве
    +удаление элемента массива по индексу
    +изменения значения по его индексу
    +функция вывода на экран всего массива
    +функцию сортировки массива (по возрастанию и убыванию без изменения исходного массива)
    +функцию вывода максимального/минимального элемента
    +функцию заполнения массива одинаковыми элементами
    */

    ArrayList<Integer> list = new ArrayList<Integer>();

    public Test2(ArrayList<Integer> list)
    {
        this.list=list;
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
     public void add_r(int elem){
        /// gen_arr(size);
         list.add(list.size(), elem);
         //System.out.println(list.get(list.size()-1));
     }

    //Добавление в начало массива
    public void add_st(/*int size,*/int elem){
       // gen_arr(size);
        list.add(0, elem);
      //  System.out.println(list.get(0));
    }

    //Удаление элемента
    public void remove_i(/*int size,*/ int index){
      //   gen_arr(size);
         list.remove(index);
    }

    //Изменение случайного элемента
    public void set_i(/*int size,*/ int index,int elem){
       // gen_arr(size);
        list.set(index,elem);
    }

    //Выыод всего массива
    public void show_arr(){
       //  gen_arr(size);
         for (int i= 0; i<list.size(); i++){
             System.out.println(list.get(i));
         }
    }

    //Сортировка массива asc(по возрастанию)
    public void sort_asc(/*int size*/){
         //gen_arr(size);
        Collections.sort(list);
        for (int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    //Сортировка массива desc(по убыванию)
    public void sort_desc(/*int size*/){
       // gen_arr(size);
        Collections.sort(list,Collections.reverseOrder());
        for (int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    //Заполне массива одинаковыми элементами
    public void add_all(/*int size,*/ int elem){
        for (int i = 0; i <list.size(); i++){
            list.add(i,elem);
        }
    }
    //Вывод максимального-минимального значения
    public void show_max_min(/*int size*/){
       //  gen_arr(size);
        Collections.sort(list);
        System.out.println("Минимальный элемент "+ list.get(0)+" .");
        System.out.println("Максимальный элемент "+ list.get(list.size()-1)+" .");
    }


}