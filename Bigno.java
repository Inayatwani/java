package inayat;

import java.math.BigInteger;
import java.lang.String;

public class Bigno {
	public static void main(String[] args) {
	BigInteger x = new BigInteger("1234567890987654321234567890098765432221");
	x = x.add(BigInteger.ONE);
	 System.out.println(x);
	}
}
