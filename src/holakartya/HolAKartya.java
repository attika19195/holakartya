package holakartya;

public class HolAKartya {

    public static void main(String[] args) {
        
        String [] szinek = {"P", "T", "Z", "M"};
        String [] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        String [] pakli = new String[24];
        
        int kartya = 0;
        
        for (int szin = 0; szin < szinek.length; szin++) {
            for (int ertek = 0; ertek < ertekek.length; ertek++) {
                if (!("M".equals(szinek[szin]) && ("X".equals(ertekek[ertek]) || "IX".equals(ertekek[ertek]) || "VIII".equals(ertekek[ertek])))) {
                    pakli[kartya] = szinek[szin]+"_"+ertekek[ertek];
                    System.out.println(pakli[kartya]);
                    kartya++;
                }
                
            }
            
        }
        
    }
    
}
