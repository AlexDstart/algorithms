package search;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class countLetters {

        public static void main(String[] args) {
//колличество букв в строке
            String text = "wfhdsfhsdf sdf2 sdf sdf sdf s2df gerg gg hrbn fgnbfg2 n";
            Map<String, Integer> letters = new HashMap<>();
            char[] array = text.toCharArray();
            for (char c : array) {
                String letter = String.valueOf(c);
                if (letters.containsKey(letter)) {
                    letters.put(letter, letters.get(letter) + 1);
                } else {
                    letters.put(letter, 1);
                }
            }
            System.out.println(letters);

            int[] newArr = {13, 13, 1, 13, 4, 5, 66, 45, 23, 456, 677, 88, 9, 4, 2, 1, 2, 3, 56, 7, 8, 9};
            String[] arr2 = {"слово", "слово", "банан", "яблоко", "яблоко", "стул", "стул", "стол", "стол", "стол"};
            Map<String, Integer> map2 =foundWord(arr2);
            for(Map.Entry<String,Integer>entry2:map2.entrySet()){
                System.out.println(entry2+" задания слова");
            }
            Map<Integer, Integer> map = fountCount(newArr);
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(entry+" задания цифры");

            }

            System.out.println(map2);

            Iterator<Map.Entry<String,Integer>> mapIterator=map2.entrySet().iterator();
            while(mapIterator.hasNext()) {
                Map.Entry<String, Integer> entry = mapIterator.next();
                if (String.valueOf(entry.getKey().charAt(0)).equalsIgnoreCase("с")) {
                    mapIterator.remove();
                }
            }
            System.out.println(map2);//удаление слов на букву "с"

        }


        public static Map<Integer, Integer> fountCount(int[] newArr) {
            Map<Integer, Integer> count = new HashMap<>();
            for (int i : newArr) {
                if (count.containsKey(i)) {
                    count.put(i, count.get(i) + 1);
                } else {
                    count.put(i, 1);
                }
            }
            return count;
        }

        public static Map<String, Integer> foundWord(String[] arr2) {
            Map<String, Integer> count2 = new HashMap<>();

            for (String i : arr2){
                if(count2.containsKey(i)){
                    count2.put(i, count2.get(i)+1);
                }else{
                    count2.put(i,1);
                }
            }
            return count2;
        }




    }


