package com.chudnikau.iteration;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        Iterator<Integer> iterator = intArray.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Pets

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Kuza", 4));
        pets.add(new Pet("Rex", 5));
        pets.add(new Pet("Bobik", 1));

        Iterator<Pet> petIterator = pets.iterator();
        while (petIterator.hasNext()) {
            Pet p = petIterator.next();
            if (p.getName().equals("Rex")) {
                System.out.println("Rex is in array");
            }
        }

        System.out.println("Search is completed");

        List<Pet> emptyPets = new ArrayList<>();
        emptyPets.add(new Pet("Felix", 10));
        Iterator<Pet> emptryIterator = emptyPets.iterator();
//        System.out.println(emptryIterator.next().getName());
        if (!emptryIterator.hasNext()) {
            System.out.println("There're no pets");
        }

        List<Pet> cats = new ArrayList<>();
        cats.add(new Pet("Kuza", 4));
        cats.add(new Pet("Barsik", 2));
        cats.add(new Pet("Richi", 1));

        ListIterator<Pet> listIterator = cats.listIterator();
        System.out.println("Next iteration");
        while (listIterator.hasNext()) {
            Pet p = listIterator.next();
            System.out.println(p.getName());
        }
        System.out.println("Previous iteration");
        while (listIterator.hasPrevious()) {
            Pet p = listIterator.previous();
            System.out.println(p.getName());
        }
        System.out.println("Iteration is completed");

        //TreeMap<String, String> treeMap = new TreeMap<>();

        System.out.println("===HashSet");

        Set<Integer> ints = new LinkedHashSet<>();
        ints.add(10);
        ints.add(1);
        ints.add(2);
        ints.add(500);
        ints.add(0);
        ints.add(3);
        ints.add(null);
        ints.forEach(System.out::println);

        System.out.println("===Map");
        Map<Integer, String> maps = new LinkedHashMap<>();
        maps.put(10, "10");
        maps.put(1, "1");
        maps.put(2, "2");
        maps.put(500, "500");
        maps.put(0, "0");
        maps.put(3, "3");
        maps.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println("===");

        // Create unmodified list
//        List<Integer> array = Collections.unmodifiableList(
//                new ArrayList<>());
//      ArrayList keeps dublication as well
        List<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(1);
        array.add(1);
        array.add(500);
        array.add(8);
        array.add(0);
        array.add(1000);
        array.add(-1);

        array.forEach(System.out::println);

        System.out.println("===");

        List<Pet> nArray = Collections.nCopies(10, new Pet());

        //nArray.forEach(v -> System.out.println(v.getName()));
        nArray.forEach(System.out::println);

        System.out.println("===");

        List<String> strArray = new ArrayList<>();
        strArray.add("");
        strArray.add("");
        strArray.add("");

        Collections.fill(strArray, "1");

        strArray.forEach(System.out::println);

        System.out.println("===");

        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(1, 1);
//        map.put(2, 2);
        map.put(3, 3);
        map.put(3, 4);
        map.forEach((k, v) -> System.out.println("k=" + k + "; v=" + v));

    }
}
