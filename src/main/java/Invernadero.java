import java.util.Random;

public class Invernadero {
    private Integer Temperatura;
    Invernadero(){
        this.Temperatura=25;
    }


  synchronized   public Integer medirTemperatura(){
        Random ran = new Random();
        Integer nT = ran.nextInt(10)+20;
        setTemperatura(nT);
        return Temperatura;
    }

    synchronized public Integer getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        Temperatura = temperatura;
    }

}
