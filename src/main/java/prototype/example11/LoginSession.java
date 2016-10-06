package prototype.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class LoginSession {
    static LoginSession sLoginSession = null;
    private User loginedUser;

    private LoginSession() {

    }

    public static LoginSession getsLoginSession() {
        if (sLoginSession == null) {
            sLoginSession = new LoginSession();
        }
        return sLoginSession;
    }

    //设置已登录的用户信息，不对外开放
    void setLoginedUser(User user) {
        loginedUser = user;
    }

    // 保护性拷贝
    public User getLoginedUser() {
        return loginedUser.clone();
    }
}
