package proxy.example11;

/**
 * Created by leibnik on 16-10-14.
 * 静态代理
 */
public class Test {
    public static void main(String[] args) {
        ILawsuit xiaoMin = new XiaoMin();

        ILawsuit lawyer = new Lawyer(xiaoMin);

        // 律师提交诉讼申请
        lawyer.submit();
        // 律师提交诉讼申请
        lawyer.burden();
        // 律师进行举证
        lawyer.defend();
        // 完成诉讼
        lawyer.finish();

        /*
            老板拖欠工资，特此申请仲裁
            这是合同书和过去一年的银行工资流水
            证据确凿，不需要再说什么
            诉讼成功，判决老板即日起七天内结算工资
         */
    }
}
