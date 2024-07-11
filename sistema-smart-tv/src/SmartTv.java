public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal (){
        //outra forma de aumentar o canal = canal + 1
        canal ++;
        System.out.println("Aumentando o canal para: " + canal);
    }

    public void diminuirCanal (){
        //outra forma de diminuir o canal = canal - 1
        canal --;
        System.out.println("Diminuindo o canal para: " + canal);
    }

    public void aumentarVolume (){
        //outra forma de aumentar o volume = volume + 1
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume (){
        //outra forma de reduzir o volume = volume - 1
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar (){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }

}
