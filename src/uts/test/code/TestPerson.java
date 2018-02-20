/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.test.code;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class TestPerson {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("budi", 20, 'm'));
        people.add(new Person("andi", 25, 'm'));
        people.add(new Person("susi", 27, 'f'));
        people.add(new Person("santi", 25, 'f'));
        people.add(new Person("rudi", 30, 'm'));

        // tuliskan code untuk menghitung banyak data people
        System.out.println("Jumlah data people adalah sebanyak " + people.size());

        // tuliskan code untuk menghitung banyak male
        int maleAmount = 0;
        for (int i = 0; i < people.size(); i++) {

            Person findMale = people.get(i);
            if (findMale.getGender() == ('m')) {
                maleAmount += 1;
            }
        }
        System.out.println("Jumlah data people \"male\" adalah sebanyak " + maleAmount);

        // tuliskan code untuk menghitung umur rata-rata female
        int femaleAge = 0;
        int femaleAmount = 0;
        double femaleAverage;
        for (int i = 0; i < people.size(); i++) {

            Person findFemale = people.get(i);
            if (findFemale.getGender() == ('f')) {

                femaleAge += findFemale.getAge();
                femaleAmount += 1;
            }
        }
        femaleAverage = femaleAge / femaleAmount;
        System.out.println("Jumlah rata-rata umur perempuan adalah sebanyak " + femaleAverage);

        // tuliskan code untuk mencari umur male tertua
        int maleOldest = 0;
        for (int i = 0; i < people.size(); i++) {

            Person findMale = people.get(i);
            if ((findMale.getGender() == ('m')) && (maleOldest < findMale.getAge())) {
                maleOldest = findMale.getAge();
            }
        }
        System.out.println("Umur male tertua adalah " + maleOldest);

    }
}
