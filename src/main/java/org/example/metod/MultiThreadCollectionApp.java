package org.example.metod;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class MultiThreadCollectionApp {
    public static void main(String[] args) {
        //в коллекциях нет syncronized
        //Как сделать, чтоб несколько потоков могли работать с одной
        //и той же коллекцией? Вместо ArrayList лучше применять Vector. Он
        //синхронизируется. Вместо HashMap применять Hashtable неэффективно, поскольку
        //он в синхронизации ставит на замок всю таблицу, и обработка получается
        //только последовательной. Поэтому применяется ConcurrentHashMap. Он не делает
        //блокировку на чтение. При записи блокируется не вся таблица, а только та
        //ячейка, куда попала Ваша запись. Если всё-таки необходимо стандартный List
        //завернуть в какую-то синхронизацию, в классе Collections есть методы syncronized.
        //Можно воспользоваться ими, но по производительности они проигрывают ConcurrentHashMap.
        //ArrayBlockingQueue - полезные функции
        //CopyOnWriteArrayList - полезные функции
    }
}
