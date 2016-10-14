package composite.example22;

/**
 * Created by leibnik on 16-10-14.
 */
public class Test {
    public static void main(String[] args) {
        //构造一个目录对象表示C盘根目录
        Dir diskC = new Folder("C");

        // C盘根目录有3个子目录
        Dir dirWin = new Folder("Windows");
        Dir dirUser = new Folder("User");
        Dir dirProgramFiles = new Folder("ProgramFiles");

        diskC.addDir(dirWin);
        diskC.addDir(dirUser);
        diskC.addDir(dirProgramFiles);

        // dirProgramFiles文件夹又有一个子文件夹
        Dir dirQQ = new Folder("QQ");
        // QQ文件夹中又有文件
        Dir fileQQ = new File("qq.exe");
        dirQQ.addDir(fileQQ);
        dirProgramFiles.addDir(dirQQ);

        // Windows文件夹有两个文件
        Dir fileExplorer = new File("explorer.exe");
        Dir fileInit = new File("init.init");
        dirWin.addDir(fileExplorer);
        dirWin.addDir(fileInit);

        // User文件夹有一个文件
        Dir fileHello = new File("hello.c");
        dirUser.addDir(fileHello);

        diskC.print();

        /**
         * result:
         *
         * C(Windows(explorer.exe, init.init), User(hello.c), ProgramFiles(QQ(qq.exe)))
         */
    }
}
