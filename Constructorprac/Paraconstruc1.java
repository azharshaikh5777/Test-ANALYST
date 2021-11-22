package com.practice.Constructorprac;

public class Paraconstruc1 
{
    int a=30 , b=40,  sum ;
    
    public Paraconstruc1 (int x,int y)
    {
       a=a+x;      //initialization of global variables
       b=b+y;         
    	
      }	
    	public void addition ()
    	{ 
    		sum= a+b;
    		System.out.println("sum="+sum);
    	}
    	     
    	public static void main (String[] args )
    	{  
           
    	   Paraconstruc1 obj = new Paraconstruc1 (60,70);
    	 	
    			   obj.addition ();
       
    	  Paraconstruc1 obj1 = new Paraconstruc1 (20,50);
    	           obj1.addition ();
    	           
    	           
    	  
    			  
    	 }
    	    	 
	
	
    	}
	
    	    	 
