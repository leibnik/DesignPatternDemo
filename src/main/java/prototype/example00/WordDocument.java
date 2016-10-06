package prototype.example00;

import java.util.ArrayList;

/**
 * Created by leibnik on 16-10-6.
 * 原型模式：
 * 使用场景：
 *          1. 类初始化需要消耗大量的资源
 *          2. 通过构造器创建一个对象时非常繁琐或涉及访问权限问题时
 *          3. 保护性拷贝
 * 注意：通过实现Cloneable接口的原型模式在调用clone函数构造实例时并不一定比通过new操作速度快，
 *      如android中的Intent，其clone方法实际上并没有调用super.clone()来实现拷贝，而是通过
 *      new Intent(this)实现克隆
 */
public class WordDocument implements Cloneable {
    // 文本
    private String mText;
    // 图片名列表
    private ArrayList<String> mImages = new ArrayList<String>();

    public WordDocument() {
        System.out.println("----------WordDocument构造函数-----------");
    }

    @Override
    protected WordDocument clone(){
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            // 在拷贝对象时，对于引用型的字段也要采用拷贝的形式——即深拷贝
            doc.mImages = (ArrayList<String>) this.mImages.clone();
            return doc;
        } catch (Exception e) {
        }
        return null;
    }

    public String getText(){
        return mText;
    }

    public ArrayList<String> getImages(){
        return mImages;
    }
    public void setText(String text){
        mText = text;
    }

    public void addImage(String image){
        mImages.add(image);
    }

    public void showDocument(){
        System.out.println("-------------Word Content Start---------------");
        System.out.println("Text : " + mText);
        System.out.println("Images List: ");

        for (String imgName : mImages){
            System.out.println("image name : " + imgName);
        }
        System.out.println("--------------Word Content End----------------");
    }
}
