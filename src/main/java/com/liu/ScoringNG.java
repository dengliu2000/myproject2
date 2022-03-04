package com.liu;

public class ScoringNG {
    public static void main(String[] args) {
        String[] names={"John", "Josh", "Hank","Eric","Frank"};
        int[] english={90,85,80,60,74};
        int[]math={70,60,50,65,72};
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]+"\t"+english[i]+"\t"+math[i]+"\t"+((math[i]+english[i])/2)+"\t");
        }
    }
}
