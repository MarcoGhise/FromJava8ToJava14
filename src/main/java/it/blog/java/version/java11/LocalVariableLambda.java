package it.blog.java.version.java11;

import java.util.Arrays;

public class LocalVariableLambda {

	public static void main(String[] args) {
        var arrInteger = new Integer[]{5, 9, 3, 6, 2, 4, 8, 7, 1};

        long cnt = Arrays.stream(arrInteger).filter(

                (var a) -> (a != null && a > 5)).count();

        System.out.println(cnt);
	}

}
