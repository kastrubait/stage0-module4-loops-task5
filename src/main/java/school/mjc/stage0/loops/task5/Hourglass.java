package school.mjc.stage0.loops.task5;

public class Hourglass {
//    public static void main(String[] args) {
//        int height = 5;
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height/2; i++){
            for (int j = 1; j <= height; j++){
                if (j >= i && j <= height + 1 - i) {
                    System.out.print('8');
                } else {
                    System.out.print(' ');
                }

            }
            System.out.println();
        }
        for (int i = height/2 + 1; i <= height; i++){
            for (int j = 1; j <= height; j++){
                if(j <= i && j >= height + 1 - i) {
                    System.out.print('8');
                } else {
                    System.out.print(' ');
                }

            }
            System.out.println();
        }
    }
}
