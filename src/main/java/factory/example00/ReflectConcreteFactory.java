package factory.example00;

/**
 * Created by leibnik on 16-10-6.
 */
public class ReflectConcreteFactory extends ReflectFactory{
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;
        try {
            product  = (Product) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
