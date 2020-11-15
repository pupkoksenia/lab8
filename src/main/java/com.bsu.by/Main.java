package com.bsu.by;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
        public static void main(String[] args) throws IOException {
            Pattern p=Pattern.compile("((1[0-9])|(20))/((0[0-9])|(1[0-2]))/((0[1-9])|(1[0-9])|(2[0-9])|(30))\b((0[0-9])|(1[0-9])|(2[0-3])):([0-5][0-9])");
            List<String> arrayOfDates = readFromFile("C:\\Users\\lab8\\date.txt");

            for(String d:arrayOfDates){
                Matcher matcher = p.matcher(d);
                if(matcher.matches()){
                    System.out.println(d+"\n");
                }
            }

        }

    public static List<String> readFromFile(String fileName) throws IOException {
        List<String> arrayOfLines = new ArrayList<String>();
        FileReader readerOfDates = new FileReader(fileName);
        try (BufferedReader bufReaderOfDates = new BufferedReader(readerOfDates)) {
            String line;
            while ((line = bufReaderOfDates.readLine()) != null) {
                arrayOfLines.add(line);
            }
            bufReaderOfDates.close();
            readerOfDates.close();
            return arrayOfLines;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

}
