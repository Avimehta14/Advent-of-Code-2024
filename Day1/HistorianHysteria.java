package Day1;

import java.io.*;
import  java.util.*;

import static java.lang.Math.abs;


public class HistorianHysteria {

    public static void main(String args[])
    {
        String filePath = "Day1/data1.txt";

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = br.readLine()) != null){
                String [] numbers = line.trim().split("\\s+");
                if(numbers.length == 2){
                    l1.add(Integer.parseInt(numbers[0]));
                    l2.add(Integer.parseInt(numbers[1]));
                }
            }
        } catch (IOException e){
            System.err.println("Error reading the file" + e.getMessage());
        }

        solvePart1(l1, l2);
        solvePart2(l1, l2);
    }

    public static void solvePart1(List<Integer> l1, List<Integer> l2){
        Collections.sort(l1);
        Collections.sort(l2);

        int dist = 0;

        for( int n= 0; n < l1.size() ; n++){
            dist = dist + abs( l1.get(n) - l2.get(n));
        }
        System.out.println(dist);
    }

    private static void solvePart2(List<Integer> l1, List<Integer> l2) {
        Map<Integer, Integer> counts = new HashMap<>();

        for(Integer num : l2){
            counts.put(num, counts.getOrDefault(num,0)+1);
        }

        Integer sum = 0;

        for(Integer num: l1){
            if(counts.containsKey(num)){
                sum = sum + (num * counts.get(num));
            }
        }

        System.out.println(sum);
    }
}