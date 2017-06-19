package proxy;


public class RealizMaker {
    public static void main(String[] args) {
        BasicInterface basic = new Realization("http://www.nepridumat.com/project");
        basic.realize();
    }
}
