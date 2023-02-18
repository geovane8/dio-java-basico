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
    }
}
