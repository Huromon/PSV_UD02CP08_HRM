public class ControladorAmbiental extends Thread{
    private final String MSG = "[CONTROL]";
    private Control cnt;
    ControladorAmbiental(Control cn){
    this.cnt=cn;
    }
@Override
    public void start(){


    System.out.println(MSG);



}

}
