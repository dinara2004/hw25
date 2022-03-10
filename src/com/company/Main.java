package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
      /**  Эки setтин симметриялык айырмасын эсептеген symmetricDifference методун ишке ашырыныз. Метод натыйжаны жаңы set катары кайтарышы керек. Методко параметр катары берилген setтерди өзгөртүүгө жол берилбейт.
        * Мисалы: [1, 2, 3} жана {0, 1, 2]
        *    Жооп: [0, 3]
        *  public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2) методу болушу керек
        */
        Set<Integer> set = new HashSet<>();
           set.add(1);
           set.add(2);
           set.add(3);
           set.add(4);
           set.add(5);
        System.out.println(set);

        Set<Integer> set2 = new HashSet<>();
           set2.add(3);
           set2.add(4);
           set2.add(5);
           set2.add(6);
           set2.add(7);
        System.out.println(set2);
        System.out.println(symmetricDifference(set, set2));
    }
          public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2) {
          Set<Integer> newSet = new HashSet<Integer>(set1);
          newSet.removeAll(set2);
          set2.removeAll(set1);
          newSet.addAll(set2);
          return newSet;
          }


}
