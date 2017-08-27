/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_matching;
import java.util.regex.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author piano-man
 */
public class Pattern_matching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException {
        File f = new File("/home/piano-man/NetBeansProjects/pattern_matching/input.txt");
        Scanner scan = new Scanner(f);
        Pattern header = Pattern.compile("\\#\\w*\\<\\w*\\.\\w\\>");
        int header_count = 0;
        int line = 1;
        while (scan.hasNextLine())
        {
            Matcher m = header.matcher(scan.nextLine());
            boolean b = m.matches();
            if(b==true)
            {
                header_count++;
            }
                
            }
        System.out.println("Header count is:"+header_count);
        Scanner scan1 = new Scanner(f);
        Pattern func = Pattern.compile("(public|private|protected){0,1}\\s*(static){0,1}\\s*(void|int|float){1}\\s+\\w*\\(.*\\)");
        int func_count1 = 0;
        while(scan1.hasNextLine())
        {
            String l = scan1.nextLine();
            Matcher m1 = func.matcher(l);
            boolean b1 = m1.matches();
            if(b1==true)
            {
                System.out.println(l);
                func_count1++;
            }
            
        }
        //lol1: \{([^{}]|(?R))*\}
        System.out.println("function count is :"+func_count1);
        
        Scanner scan2 = new Scanner(f);
        Pattern calls = Pattern.compile("\\w+\\(.*\\)\\;");
        int call_count=0;
        while(scan2.hasNextLine())
        {
            String l1 = scan2.nextLine();
            Matcher m2 = calls.matcher(l1);
            boolean b2 = m2.matches();
            if(b2==true)
            {
                //System.out.println();
                call_count++;
            }
        }
        System.out.println("Number of System calls :"+call_count);
        
        Scanner scan3 = new Scanner(f);
        
        
        // TODO code application logic here
    }
    
}
