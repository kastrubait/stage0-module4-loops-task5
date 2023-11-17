package school.mjc.stage0.loops.task5;

public class Hourglass {
//    public static void main(String[] args) {
//        int height = 6;
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i <= Math.ceil(height/2); i++){
            for (int j = 1; j <= height; j++){
                if(i <= height/2 && (j < i + 1 || j > height - i)) {
                    System.out.print(' ');
                } else {
                    System.out.print('8');
                }

            }
            System.out.println();
        }
        for (int i = height; i > Math.ceil(height/2) + 1; i--){
            for (int j = 1; j <= height; j++){
                if(j >= i + 1 && j <= height - i) {
                    System.out.print(' ');
                } else {
                    System.out.print('8');
                }

            }
            System.out.println();
        }
    }
}
