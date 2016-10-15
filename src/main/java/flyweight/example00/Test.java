package flyweight.example00;

/**
 * Created by leibnik on 16-10-15.
 */
public class Test {
    public static void main(String[] args) {
        Ticket ticket01 = TicketFactory.getTicket("北京", "青岛");
        ticket01.showTicketInfo("上铺");
        Ticket ticket02 = TicketFactory.getTicket("北京", "青岛");
        ticket02.showTicketInfo("下铺");
        Ticket ticket03 = TicketFactory.getTicket("北京", "青岛");
        ticket03.showTicketInfo("坐票");
        /*
        result:

        创建对象 ==>北京-青岛
        购买从 北京 到 青岛的上铺 火车票,价格：59
        使用缓存 ==>北京-青岛
        购买从 北京 到 青岛的下铺 火车票,价格：90
        使用缓存 ==>北京-青岛
        购买从 北京 到 青岛的坐票 火车票,价格：27
         */

    }
}
