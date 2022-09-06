package holakartya;

public class HolAKartya {

    public static void main(String[] args) {
        
        String [] szinek = {"P", "T", "Z", "M"};
        String [] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};
        String [] pakli = new String[21];
        
        
        
        /*pakli letrehozasa*/
        int kartya = 0;
        for (int szin = 0; szin < szinek.length; szin++) {
            for (int ertek = 0; ertek < ertekek.length; ertek++) {
                if (!("M".equals(szinek[szin]) && ("X".equals(ertekek[ertek]) || "IX".equals(ertekek[ertek]) || "VIII".equals(ertekek[ertek])))) {
                    pakli[kartya] = szinek[szin]+"_"+ertekek[ertek];
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
    }   
    
}
