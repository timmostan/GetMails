/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getmails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author stachu
 */
public class GetMails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<String> names = new ArrayList<String>();
        String myRegExString = ".+@gmail\\.com$";
        Pattern p = Pattern.compile(myRegExString);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i<n; i++)
        {
            String line = scan.nextLine();
            String[] array = line.split(" ");
            Matcher m = p.matcher(array[1]);
            if( m.find() ){
                names.add(array[0]);
            }
        }
        
        Collections.sort(names);

	for(String name: names){
            System.out.println(name);
	}
    }

    
}
