package com.bsu.by;

import java.util.regex.Pattern;

public class Main {
        public static void main(String[] args) {
            Pattern p=Pattern.compile("((1[0-9])|(20))/((0[0-9])|(1[0-2]))/((0[1-9])|(1[0-9])|(2[0-9])|(30))\b((0[0-9])|(1[0-9])|(2[0-3])):([0-5][0-9])");

        }

}
