public class Usuario {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        
       System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Desligada ? " + smartTv.ligada);

        smartTv.mudarCanal(15);
        System.out.println("Canal Atual ? " + smartTv.canal);

        smartTv.diminuirVolume(); // diminui o volume atual de 25 em - 1
        smartTv.diminuirVolume(); // diminui o volume atual de 24 em - 1
        smartTv.diminuirVolume(); // diminui o volume atual de 23 em - 1
        smartTv.aumentarVolume(); // aumneta o volume atual de 23 em + 1  passando a ser 23    
        System.out.println("Volume Atual ? " + smartTv.volume);
    }
        
}
