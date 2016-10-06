package prototype.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class Test {
    public static void main(String[] args) {
        LoginImpl login = new LoginImpl();
        login.login();

        // 错误操作：当网络未请求成功时，修改用户信息
         User newUser = LoginSession.getsLoginSession().getLoginedUser();
         newUser.address = new Address("北京市","朝阳区","大望路");

        System.out.println(LoginSession.getsLoginSession().getLoginedUser().toString());
        /**
         * result:
         * 采用原型模式进行保护性拷贝，保证getLoginedUser返回一个已登录用户的一个拷贝，当更新用户信息的网络请求完成时，
         * 再通过包级私有的LoginSession里的setLoginedUser方法来更新用户信息
         *
         * 保证在任意地方调用getLoginedUser方法获取到的用户对象都是一个拷贝对象
         * User{age=22, name='Mr. Simple', phoneNum='null', address=Address{city='北京市', district='海淀区', street='花园东路'}}
         */
    }
}
