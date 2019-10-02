package chapter15stringalgorithms;

import java.io.*;

public class KMPStringMatchingAlgorithm {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0) {
            String[] input = br.readLine().split(" ");
            char[] pattern = input[0].toCharArray();
            char[] text = input[1].toCharArray();
            if(pattern.length==1){
                bw.write(String.valueOf(getNoOfMatchedString(text,pattern)));
            } else {
                bw.write(String.valueOf(getNoOfMatchedStrings(text,pattern)));
            }

            bw.newLine();
        }
        bw.close();
    }

    private static int getNoOfMatchedString(char[] text, char[] pattern) {
        char p = pattern[0];
        int count = 0;
        for(int idx=0;idx<text.length;idx++){
            if(text[idx]==p){
                count++;
            }
        }
        return count;
    }

    public static int getNoOfMatchedStrings(char[] text, char[] pattern){
        int p1=0;
        int p2=0;
        int count = 0;
        int[] lps = getLPS(pattern);
        while(p1<text.length){
            if(text[p1]==pattern[p2]){
                if(p2==pattern.length-1){
                    count++;
                    p2=lps[p2-1];
                } else {
                    p1++;
                    p2++;
                }
            } else if(p2>0){
                p2 = lps[p2-1];
            } else {
                p1++;
            }
        }
        return count;
    }

    public static int[] getLPS(char[] pattern){
        int[] lps = new int[pattern.length];
        int p1 = 0;
        int p2 = 1;
        lps[0] = 0;
        while(p2<pattern.length){
            if(pattern[p2]==pattern[p1]){
                lps[p2]=p1+1;
                p1++;
                p2++;
            } else if(p1>0){
                p1 = lps[p1-1];
            } else {
                lps[p2]=0;
                p2++;
            }
        }
        return lps;
    }
}