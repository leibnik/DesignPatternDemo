package template.example00;

/**
 * Created by leibnik on 16-10-12.
 */
public class CoderComputer extends AbstractComputer{

    @Override
    protected void login() {
        System.out.println("程序猿只需要进行用户和密码验证就可以了");
    }
}
