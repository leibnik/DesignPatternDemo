package prototype.example00;

/**
 * Created by leibnik on 16-10-6.
 */
public class Test {

    public static void main(String[] args) {
        // 构建文档
        WordDocument originDoc = new WordDocument();
        // 添加文字和图片
        originDoc.setText("这是一篇文档");
        originDoc.addImage("图片1");
        originDoc.addImage("图片2");
        originDoc.addImage("图片3");
        originDoc.showDocument();
        // 克隆
        WordDocument doc2 = originDoc.clone();
        doc2.showDocument();

        //修改文档副本
        doc2.setText("这是修改过的Doc2文本");
        doc2.addImage("新增的图片x");
        doc2.showDocument();

        originDoc.showDocument();

        /*

        result:

         ----------WordDocument构造函数-----------


         -------------Word Content Start---------------
         Text : 这是一篇文档
         Images List:
         image name : 图片1
         image name : 图片2
         image name : 图片3
         --------------Word Content End----------------


         -------------Word Content Start---------------
         Text : 这是一篇文档
         Images List:
         image name : 图片1
         image name : 图片2
         image name : 图片3
         --------------Word Content End----------------


         -------------Word Content Start---------------
         Text : 这是修改过的Doc2文本
         Images List:
         image name : 图片1
         image name : 图片2
         image name : 图片3
         image name : 新增的图片x
         --------------Word Content End----------------


         -------------Word Content Start---------------
         Text : 这是一篇文档
         Images List:
         image name : 图片1
         image name : 图片2
         image name : 图片3
         --------------Word Content End----------------
         */


    }
}
