public class Test {

    static void main() throws InterruptedException {
        Control cnt = new Control();
        SensorTemperatura ta =new SensorTemperatura();
        ControladorAmbiental ca =new ControladorAmbiental();
        Invernadero inv = new Invernadero(ta,ca);
        ta.start();
        ca.start();
        ta.join();
        ca.join();
    }
}
