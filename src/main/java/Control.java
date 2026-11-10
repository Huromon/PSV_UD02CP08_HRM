public class Control  {
    private Boolean nueva=false;
  public void MedirTemperatura() throws InterruptedException {
      if(getNueva()){
          System.out.println("[SENSOR] Esperando al CONTROL");
      }
      while (getNueva()){

       }


    }
 public void LeerTemperatura(Thread e) throws InterruptedException {
     if(!getNueva()){
         System.out.println("[CONTROL] Esperando al SENSOR");
     }
       while (!getNueva()){

       }




    }
   synchronized public Boolean getNueva(){
      return nueva;
    }

 public void recibido(){

        if (getNueva()){
            nueva=false;
        }else{
            nueva=true;
        }

    }
}
