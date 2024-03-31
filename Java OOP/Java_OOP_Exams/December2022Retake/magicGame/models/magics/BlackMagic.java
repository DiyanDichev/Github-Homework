package Java_OOP_Exams.December2022Retake.magicGame.models.magics;

public class BlackMagic extends MagicImpl{
    private static int INITIAL_COUNT = 10;

    public BlackMagic(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        if(getBulletsCount() -10 < 0){
            super.setBulletsCount(0);
            return 0;
        }
        super.setBulletsCount(getBulletsCount() - INITIAL_COUNT);
        return INITIAL_COUNT;
    }

}
