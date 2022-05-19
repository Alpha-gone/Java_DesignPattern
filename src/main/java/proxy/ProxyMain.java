package proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Browser browser = new Browser("www.naver.com");
        browser.show();

        IBrowser browser1 = new BrowserProxy("www.naver.com");
        browser1.show();
        browser1.show();
        browser1.show();
        browser1.show();
        browser1.show();
        
    }
}
