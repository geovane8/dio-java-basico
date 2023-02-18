public class Operadores {
    
    public static void main (String[] args){
        String concatenacao ="?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao); //soma e concatena

        concatenacao = 1+1+"1"+1;
        System.out.println(concatenacao); //soma e depois apartir do primiero caracter encontrado não tem soma apnenas concatena 


        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao); //apartir do primiero caracter encontrado não tem soma apnenas concatena 

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao); //apartir do primiero caracter encontrado não tem soma apnenas concatena 

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao); //com evidencia concatena depois soma 

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        String nomeCompleto = "GEOVANE" + "NASCIMENTO";
        System.out.println(nomeCompleto);



        //--------------------//---------------------------

        //conceito de icrementação e decrementação.
        int numero1 = 5;
        int numero2 = 10;
        System.out.println(++ numero1); //incremetou + 1
        System.out.println(-- numero2); // decrementou - 1
    }
}
