package Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;


public class RedNosedReports {
    public static void main(String args []){

        String filePath = "Day2/data2.txt";

        List<List<Integer>> l1 = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = br.readLine()) != null){
                String [] numbers = line.trim().split("\\s+");

                List<Integer> row = new ArrayList<>();
                for( String num : numbers){
                    row.add(Integer.parseInt(num));
                }
                l1.add(row);
            }
        } catch (IOException e){
            System.err.println("Error reading the file" + e.getMessage());
        }

        solveQPart1(l1);
    }

    private static void solveQPart1(List<List<Integer>> l1) {
        Integer safe =0 ;
        System.out.println(l1);
        for(List<Integer> rows: l1){

             for(int i= 0; i< rows.size()-1; i++){
                 if( ){

                 }
             }
        }
        System.out.println(safe);
    }
}
