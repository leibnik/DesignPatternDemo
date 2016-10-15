package facade.example00;

/**
 * Created by leibnik on 16-10-15.
 */
public class Test {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.takePicture();
        phone.videoChat();

        /*
        result:
         打开相机
         拍照
         --> 视频聊天接通中
         打开相机
         打电话
         */

    }
}
