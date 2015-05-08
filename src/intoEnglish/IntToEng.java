package intoEnglish;

import java.util.Scanner;

public class IntToEng {

    // ���C�����\�b�h
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // ���l���p�󂷂�ϊ����郁�\�b�h
    static String translateEng(int n) {
    	String[] a={"zero","one","two","three","four","five","six","seven","eight","nine",
    			"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    	String[] b={"","","twenty"};
    	
    	int tenrank=n/10;
    	int unit=n%10;
    	if(0<n&&n<20){
    		return a[n];
    	}else if(n<100){
    		return b[tenrank]+" "+a[unit];
    	}
    	return "��";
    }
}