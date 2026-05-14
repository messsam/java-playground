package exceptions;

public class FailingResource implements AutoCloseable {
    @Override
    public void close() {
        throw new RuntimeException("close() failed.");
    }

    static void main() {
        try (FailingResource fr = new FailingResource()) {
            throw new IllegalStateException("Work failed.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            Throwable[] suppressed = e.getSuppressed();
            for (Throwable throwable : suppressed)
                System.out.println(throwable.getMessage());
        }
    }
}