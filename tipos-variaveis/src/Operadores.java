import javax.swing.plaf.synth.SynthOptionPaneUI;

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

        // conceito de negação de variavel tipo booelan
        boolean variavel = true;

        variavel = !variavel; // atribuindo negação da primiera declaração

        System.out.println(variavel);

        //Conceito de uso de operador ternario
        int a, b;
        
        a = 6;
        b = 6;

        String resultado1 = a==b ? "verdaeiro" : "falso"; // ? para verdeiro e : para falso
        System.out.println(resultado1);

        int resultado2 = a==b ? 1 : 0; // ? para verdeiro e : para falso com inteiros
        System.out.println(resultado2);

        //conceito de comparação
        int num1 = 3;
        int num2 = 2;

        boolean simNao = num1 == num2; // ja acontece uma comparação 
        System.out.println("Numero um é igual a Numero dois? " + simNao); //resultado (FALSE)

        simNao = num1 != num2; // (!= ) usando para inidicar diferença 
        System.out.println("O Numero um é diferente do Numro dois? " + simNao);//resultado verdeiro

       //comparando igualdade com strings (TEXTOS) 
        String nome1 = "GEOVANE";
        String nome2 = "GEOVANE";
        //String nome2 = new String("GEOVANE");
        /*comparando com um novo objeto criado mesmo sendo igual o ideal é usar o oeprador (.EQUALS)
        caso contrario teriamos um resuldado negativo mesmo sendo os nomes iguais */
        System.out.println(nome1.equals(nome2));

        //conceitos de operadores logicos 
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        else if (condicao1 || condicao2){
            System.out.println("Um das duas condições é verdadeira");
        }
        System.out.println("FIM");



    }
}
