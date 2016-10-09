package observer.example00;

/**
 * Created by leibnik on 16-10-10.
 */
public class Test {

    public static void main(String[] args) {
        Coder coder1 = new Coder("张三");
        Coder coder2 = new Coder("李四");
        Coder coder3 = new Coder("赵五");

        DevTechFrontier frontier = new DevTechFrontier();
        frontier.addObserver(coder1);
        frontier.addObserver(coder2);
        frontier.addObserver(coder3);
        frontier.postNewPublication("新的一期开发技术前线周报发布啦！");

        /*
        result:
            Hi,赵五,DevTechFrontier更新啦，内容：新的一期开发技术前线周报发布啦！
            Hi,李四,DevTechFrontier更新啦，内容：新的一期开发技术前线周报发布啦！
            Hi,张三,DevTechFrontier更新啦，内容：新的一期开发技术前线周报发布啦！
         */
    }
}
