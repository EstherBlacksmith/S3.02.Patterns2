package exercise3;

public class Main {
    public static void main(String[] args) {

        DataFetcher fetcher = new DataFetcher();
        fetcher.fetchData(message -> System.out.println("Lambda callback: " + message));
    }
}
