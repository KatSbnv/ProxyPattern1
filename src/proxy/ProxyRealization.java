package proxy;


public class ProxyRealization implements BasicInterface {

    private String link;
    private Realization realization;


    public ProxyRealization(String link) {
        this.link = link;
    }

    @Override
    public void realize() {
        if (realization == null) {
            realization = new Realization(link);
        }
        realization.realize();
    }
}
