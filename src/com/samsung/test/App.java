package com.samsung.test;

import com.samsung.test.domain.Person;
import com.samsung.test.set.Set100Int;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Person[] array = new Person[5];
        array[0] = new Person(1L, "Valera1", 16);
        array[1] = new Person(2L, "Valera2", 0);
        array[2] = new Person(3L, "Valera3", 11);
        array[3] = new Person(4L, "Valera4", 9);
        array[4] = new Person(5L, "Valera5", 13);
//        Arrays.sort(array, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                System.out.println("compare");
//                return o2.getAge() - o1.getAge();
//            }
//        });
//
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1L, "Valera1", 16));
        personList.add(new Person(2L, "Valera2", 0));
        personList.add(new Person(3L, "Valera3", 11));
        personList.add(new Person(4L, "Valera4", 9));
        personList.add(new Person(5L, "Valera5", 13));
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                System.out.println("compare");
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println(personList);

        Set100Int set100Int = new Set100Int();
        set100Int.add(77);
        set100Int.add(5);
        set100Int.add(10);
        set100Int.add(1111);

        System.out.println(set100Int.contains(1));
        System.out.println(set100Int.contains(5));

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person(1L, "Valera1", 16));
        personSet.add(new Person(5L, "Valera5", 13));
        personSet.add(new Person(3L, "Valera3", 11));
        personSet.add(new Person(4L, "Valera4", 9));
        personSet.add(new Person(5L, "Valera5", 13));

        System.out.println(personSet);

    }
}
