package proxy;

public class Realization implements BasicInterface {

    private String link;

    public Realization(String link) {
        this.link = link;
        load();
    }

    public void load() {
        System.out.println("Loading... " + link);
    }


    @Override
    public void realize() {
        System.out.println(" Realization... " + link);

    }
}
