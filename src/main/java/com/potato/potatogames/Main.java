package com.potato.potatogames;

public class Main {
    
    public static void usage() {
        System.out.println("Usage; app <potato count>");
    }
    
    public static void main(String[] args)
    {
       if (args.length!=1)
       {
           usage();
           System.exit(1);
       } else if (args[1].matches("\\d+")==false)
       {
           System.out.println("Confused potato. Aborting");
           usage();
           System.exit(1);
       } else if (Integer.valueOf(args[1]) % 2 == 0)
       {
           System.out.println("Odd numbers of potatoes");
           usage();
           System.exit(1);
       }
       
       // all good
       
       System.out.println("Potato Royale");    
       
       
    }
    
}