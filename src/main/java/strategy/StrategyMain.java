package strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        EncodingStrategy base64 = new Base64Strategy();
        EncodingStrategy normal = new NormalStrategy();
        String message = "hello world";

        encoder.setEncodingStrategy(base64);

        String base64Reuslt = encoder.getMessage(message);
        System.out.println(base64Reuslt);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);
    }
}
