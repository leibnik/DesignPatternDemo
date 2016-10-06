package prototype.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class LoginImpl implements Login{
    @Override
    public void login() {
        User loginUser = new User();
        loginUser.age = 22;
        loginUser.address=new Address("北京市","海淀区","花园东路");
        loginUser.name = "Mr. Simple";
        LoginSession.getsLoginSession().setLoginedUser(loginUser);
    }
}
