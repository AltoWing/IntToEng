package intoEnglish;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	public void test() {
		IntToEng ite = new IntToEng();
		System.out.println(ite.translateEng(4));
		System.out.println(ite.translateEng(11));
		System.out.println(ite.translateEng(20));
		System.out.println(ite.translateEng(29));
		
		System.out.println(ite.translateEng(100));
		System.out.println(ite.translateEng(110));
		System.out.println(ite.translateEng(135));
		System.out.println(ite.translateEng(500));
		
		
		System.out.println(ite.translateEng(1000));
	}

}
