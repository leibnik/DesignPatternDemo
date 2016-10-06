package factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class AudiCarFactory extends AudiFactory{
    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> clz) {
        AudiCar car  = null;
        try {
            car  = (AudiCar) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
