public class Invernadero {
    private Integer Temperatura;
    private SensorTemperatura st;
    private ControladorAmbiental ca;
    Invernadero(SensorTemperatura st , ControladorAmbiental ca){
        this.ca=ca;
        this.st=st;
        this.Temperatura=25;
    }


    public Integer getTemperatura(){
        return Temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        Temperatura = temperatura;
    }

}
