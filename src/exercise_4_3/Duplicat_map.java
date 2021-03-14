package exercise_4_3;
import java.util.Collection;
import java.util.HashSet;

public class Duplicat_map {
    //метод где на вход подается коллекция
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        //удаляем дубликаты
        return new HashSet<>(collection);
    }
}
