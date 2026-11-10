import java.util.Random;
import java.util.logging.Logger;

public class SensorTemperatura extends Thread{
  private final String MSG = "[SENSOR]";
  private Control cnt;
  private Invernadero inv;
    SensorTemperatura(Control cn,Invernadero inv){
      this.cnt=cn;
      this.inv=inv;
    }



    @Override
    public void run(){
      Random k = new Random();
        System.out.println(MSG + " Inializado...");
        while (true){

            try {
              cnt.MedirTemperatura();

              System.out.println("[SENSOR] temperatura medida de: " +inv.medirTemperatura() + "ºC.");
              cnt.recibido();
              Thread.sleep(1000 + k.nextInt(1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }


    }



}
