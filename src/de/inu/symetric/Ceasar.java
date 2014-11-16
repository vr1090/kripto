package de.inu.symetric;

import java.util.*;

public class Ceasar {
	public static String encrypt(String s, int k)
	{
		String data = s.toLowerCase();
		StringBuffer buf = new StringBuffer();
		
		for(char c: data.toCharArray())
		{
			if( c >= 'a' && c <='z')
			{
				
				char apalah = (char) (( c+ (byte)k )%256);
				buf.append(apalah);
			}//end if
			else
				buf.append(c);
		}//end of for
		
		return buf.toString();
	}//end of method
	
	public static String decrypt(String s, int k)
	{
		StringBuffer bu = new StringBuffer();
		
		String data = s.toLowerCase();
		
		
		for(char c: data.toCharArray())
		{
			if( c>='a' && c <='z'+256)
			{
				char result = (char)( (c-k) %256);
				if( result < 'a')
					result = (char)(256-result);
				bu.append( result );
			}//end if
			else
				bu.append(c);
			
		}//end for
		
		return bu.toString();
	}//end of method
	
	
	public static void main(String[] args)
	{
		String busuk = encrypt("ibu pergi ke pasar beli zaza", 1);
		System.out.println("encrypt:"+busuk);
		System.out.println("decrypt:"+decrypt(busuk, 1));
		System.out.println((byte)'{');
		
	}//end of main
	
}//end of class
