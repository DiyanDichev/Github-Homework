package ME_4_ForLoopMoreExercises;

public class P10ClockPart2 {
    public static void main(String[] args) {

        int h = 0;
        while (h <= 23){

            int m = 0;
            while (m <=59){

                int s = 0;
                while (s <= 59){
                    System.out.printf("%d : %d : %d\n", h ,m ,s);
                    s++;
                }
                m++;
            }
            h++;
        }
    }
}
