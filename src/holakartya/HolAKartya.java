package holakartya;
import java.util.Scanner;

public class HolAKartya {

    public static void main(String[] args) {
        
        
        String [] szinek = {"P", "T", "Z", "M"};
        String [] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};
        String [] pakli = new String[21];
            
        /*pakli letrehozasa*/
        int kartya = 0;
        for (String szinek1 : szinek) {
            for (String ertekek1 : ertekek) {
                if (!("M".equals(szinek1) && ("X".equals(ertekek1) || "IX".equals(ertekek1) || "VIII".equals(ertekek1)))) {
                    pakli[kartya] = szinek1 + "_" + ertekek1;
                    kartya++;
                }
            }
        }
        
        
        /*pakli kiiratasa*/
        for (int i = 1; i < pakli.length+1; i++) {
            System.out.print(pakli[i-1]+"\t");
            if (i>2 && i%3==0) {
                System.out.println();
                
            }
            
        }
        System.out.println("");
        System.out.println();
        
        
        
        int oszlop1[] = {0, 3, 6, 9, 12, 15, 18};
        int oszlop2[] = {1, 4, 7, 10, 13, 16, 19};
        int oszlop3[] = {2, 5, 8, 11, 14, 19, 21};
        
        Scanner input = new Scanner(System.in);
        System.out.println("Melyik oszlopban van(1/2/3)?");
        int tipp = input.nextInt();
        System.out.println(tipp);
        
        
        
        
        
    }   
        
    
    
    
}
