package com.bptn.ind_project;

/**
 * Hello world!
 *
 */
public class App
{
	 public static int mystery(String str)
	 {
	    if (str.length() == 1) return 0;
	    else {
	       if (str.substring(0,1).equals("y")) return 1 +
	                            mystery(str.substring(1));
	       else return mystery(str.substring(1));
	  }
	}


    public static void main( String[] args )
    {
    	System.out.print(mystery("xyzxyxy"));
    }
}
