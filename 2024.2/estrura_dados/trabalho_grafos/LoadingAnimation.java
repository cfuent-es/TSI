public class LoadingAnimation {
    public static void showLoadingAnimation(int durationInSeconds) {
        String[] animation = {"", ".", "..", "..."};
        int index = 0;
        long endTime = System.currentTimeMillis() + durationInSeconds * 1000;

        while (System.currentTimeMillis() < endTime) {
            System.out.print("\rCarregando" + animation[index] + "   ");
            index = (index + 1) % animation.length;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\r                \r");
    }

    public static void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}