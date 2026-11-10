import java.util.logging.Logger;

public class SensorTemperatura extends Thread{
  private final String MSG = "[SENSOR]";
  private Control cnt;
    SensorTemperatura(Control cn){
      this.cnt=cn;
    }



    @Override
    public void start(){

        System.out.println(MSG);


    }



}
