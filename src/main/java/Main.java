import reactor.core.publisher.Mono;

/**
 * @author enikeevar
 * @since 11/1/2019
 */
public class Main {
    public static void main(String[] args) {
        Mono.just("Hello")
                .map(hello -> hello + " world!")
                .subscribe(System.out::println);
    }
}
