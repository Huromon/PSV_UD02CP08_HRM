public class Test {

    static void main() throws InterruptedException {
        Control cnt = new Control();
        Invernadero inv = new Invernadero();
        SensorTemperatura ta =new SensorTemperatura(cnt,inv);
        ControladorAmbiental ca =new ControladorAmbiental(cnt,inv);

        ca.start();
        ta.start();
        ta.join();
        ca.join();
    }
}
