package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 1; i <= length; i++){
            for (int j = 1; j <= height; j++){
                if (i == 1 || i == length || j == 1 || j == height) {
                    System.out.print('8');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }
}
