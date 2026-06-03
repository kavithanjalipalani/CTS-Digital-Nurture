public class VirtualThreadsExample {

    public static void main(String[] args)
            throws Exception {

        for(int i = 1; i <= 1000; i++) {

            Thread.startVirtualThread(() -> {

                System.out.println(
                        "Virtual Thread");
            });
        }

        Thread.sleep(1000);
    }
}