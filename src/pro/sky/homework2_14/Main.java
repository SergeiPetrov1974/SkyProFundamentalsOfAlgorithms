package pro.sky.homework2_14;

import pro.sky.homework2_14.stringlist.StringList;
import pro.sky.homework2_14.stringlist.StringListImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringList stringList = new StringListImpl();
        System.out.println(stringList.add("Sergei"));
        System.out.println(stringList.getSize());
        System.out.println(stringList.add("Olga"));
        System.out.println(stringList.getSize());
        System.out.println(stringList.contains("Sergei"));
        System.out.println(stringList.remove("Sergei"));
        System.out.println(stringList.contains("Sergei"));
        System.out.println(stringList.getSize());
        System.out.println(stringList.add("Bob"));
        System.out.println(stringList.indexOf("Bob"));
        System.out.println(stringList.lastIndexOf("Bob"));
        System.out.println(stringList.indexOf("Olga"));
        System.out.println(stringList.set(1, "Tom"));
        System.out.println(stringList.contains("Bob"));
        System.out.println(Arrays.toString(stringList.toArray()));
        System.out.println(stringList.remove(1));
        System.out.println(stringList.contains("Tom"));
        System.out.println(stringList.getSize());
        System.out.println(stringList.add(0, "Anna"));
        System.out.println(Arrays.toString(stringList.toArray()));
        StringList stringList2 = new StringListImpl();
        stringList2.add(("Olga"));
        stringList2.add(("Bob"));
        System.out.println(stringList.equals(stringList2));
        stringList.clear();
        System.out.println(stringList.getSize());
    }
}
/*
  Привет!
На связи домашнее задание урока 2.14 Основы алгоритмов ч1
Ваша задача: написать свою реализацию ArrayList. В данной задаче он должен работать только со строками.
Дан интерфейс:

```java
public interface StringList {

    // Добавление элемента.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.
    String add(String item);

    // Добавление элемента
    // на определенную позицию списка.
    // Если выходит за пределы фактического
    // количества элементов или массива,
    // выбросить исключение.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.
    String add(int index, String item);

    // Установить элемент
    // на определенную позицию,
    // затерев существующий.
    // Выбросить исключение,
    // если индекс меньше
    // фактического количества элементов
    // или выходит за пределы массива.
    String set(int index, String item);

    // Удаление элемента.
    // Вернуть удаленный элемент
    // или исключение, если подобный
    // элемент отсутствует в списке.
    String remove(String item);

    // Удаление элемента по индексу.
    // Вернуть удаленный элемент
    // или исключение, если подобный
    // элемент отсутствует в списке.
    String remove(int index);

    // Проверка на существование элемента.
    // Вернуть true/false;
    boolean contains(String item);

    // Поиск элемента.
    // Вернуть индекс элемента
    // или -1 в случае отсутствия.
    int indexOf(String item);

    // Поиск элемента с конца.
    // Вернуть индекс элемента
    // или -1 в случае отсутствия.
    int lastIndexOf(String item);

    // Получить элемент по индексу.
    // Вернуть элемент или исключение,
    // если выходит за рамки фактического
    // количества элементов.
    String get(int index);

    // Сравнить текущий список с другим.
    // Вернуть true/false или исключение,
		// если передан null.
    boolean equals(StringList otherList);

    // Вернуть фактическое количество элементов.
    int size();

    // Вернуть true,
    // если элементов в списке нет,
    // иначе false.
    boolean isEmpty();

    // Удалить все элементы из списка.
    void clear();

    // Создать новый массив
    // из строк в списке
    // и вернуть его.
    String[] toArray();
}
```

Напишите реализацию этого интерфейса, реализовав все его методы. В качестве хранилища используйте массив.
В конструкторе должен задаваться размер массива внутри.
Список не должен добавлять или хранить в себе null. Т.е. в случае удаления элемента,
нужно смещать все элементы на ячейку влево, а при добавлении в середину или начало, на ячейку вправо.
По желанию можно реализовать расширение массива.
Рекомендуется написать свои исключения и выбрасывать их в тех ситуациях, которые описаны в интерфейсе.
Если в какой-то из методов в качестве параметра приходит null, выбросить исключение.
 */
