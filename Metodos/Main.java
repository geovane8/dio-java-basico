/**
 * Classe principal dos exercícios da Aula 1 de Métodos.
 */
public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

             // Quadrilátero
             System.out.println("Exercício quadrilátero");
             Quadrilatero.area(3);
             Quadrilatero.area(5d,5d);
             Quadrilatero.area(7,8,9);
             Quadrilatero.area(5f,5f);
     
         }
     }

/* // mesma resolução com base no conceito de RETORNO

 public class Main {

        public static void main(String[] args) {
    
            // Retornos
            System.out.println("Exercício retornos");
    
            double areaQuadrado = Quadrilatero.area(3);
            System.out.println("Área do quadrado:" + areaQuadrado);
    
            double areaRetangulo = Quadrilatero.area(5,5);
            System.out.println("Área do retângulo:" + areaRetangulo);
    
            double areaTrapezio = Quadrilatero.area(7,8,9);
            System.out.println("Área do trapézio:" + areaTrapezio);
    
        }
    
 * 
 */

    