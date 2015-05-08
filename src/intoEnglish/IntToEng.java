package intoEnglish;

import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String[] a={"","one","two","three","four","five","six","seven","eight","nine",
    			"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    	String[] b={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    	
    	int tenrank=n/10;
    	int unit=n%10;
    	int hrank=tenrank/10;
    	if(n==0){
    	return "zero";
    	}else if(0<n&&n<20){    	
    		return a[n];
    	}else if(n<100){
    		return b[tenrank]+" "+a[unit];
    	}else if(n<120){
    		return a[hrank]+" hundred "+a[n%100]; 
    	}else if(n<1000){
    		return a[hrank]+" hundred "+b[n%100/10]+" "+a[n%100%10];
    	}else if(n==1000){
    		return "thousand";
    	}
    	//a[hrank]で100のくらい。n%100で下２桁。
    	
    	return "つる";
    }
}