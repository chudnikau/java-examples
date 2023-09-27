package com.chudnikau.maps;

import com.chudnikau.arrays.MultipleArray;

import java.util.*;

/*
   TreeMap — автоматически сортирует помещённые в неё пары.
   Её стоит использовать там, где важен порядок хранения объектов.
   В HashMap сортировка ключей выполняется на основе их хэшкодов.

   HashMap не является синхронизированным и потокобезопасным
   Также HashMap допускает хранение null ключей и значений, но недопускает дублей ключей
   Следует помнить, что для null-ключа hashCode() всегда равен нулю.

   Hashtable реализует интерфейс Map, которая хранит пары ключ-значения.
   Hashtable является синхронизированной и потокобезопасной коллекцией.
   Hashtable не допускается null-ключей и дублирующих ключей, а также null-значений.
 */
public class Main {
    public static void main(String[] args) {
        // Сортирует по хъшу
        Map<String, String> map = new HashMap<>();
        map.put("1", "V1");
        map.put("2", "V2");
        map.put("3", "V3");
        map.put("0", "V3");
        map.put(null, "V3");
        map.forEach((k, v) -> System.out.println(k + "," + v));

        try {
            Map<String, String> table = new Hashtable<>();
            table.put("1", "V1");
            table.put("2", "V2");
            table.put("3", "V3");
            table.put(null, "V3");
            table.forEach((k, v) -> System.out.println(k + "," + v));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Сортирует по ключу
        Map<String, String> tree = new TreeMap<>();
        tree.put("3", "V3");
        tree.put("1", "V1");
        tree.put("2", "V2");
        tree.put("0", "V2");
//        tree.put(null, "V3");
        tree.forEach((k, v) -> System.out.println(k + "," + v));

        new MultipleArray().print();

    }
}
