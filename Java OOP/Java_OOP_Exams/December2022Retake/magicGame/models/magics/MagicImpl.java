package Java_OOP_Exams.December2022Retake.magicGame.models.magics;

import Java_OOP_Exams.December2022Retake.magicGame.common.ExceptionMessages;

public abstract class MagicImpl implements Magic {


    private String name;
    private int bulletsCount;

    public MagicImpl(String name, int bulletsCount) {
        this.setName(name);
        this.setBulletsCount(bulletsCount);
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.INVALID_MAGIC_NAME);
        }
        this.name = name;
    }

    @Override
    public int getBulletsCount() {
        return this.bulletsCount;
    }

    public void setBulletsCount(int bulletsCount) {
        if(bulletsCount < 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_MAGIC_BULLETS_COUNT);
        }
        this.bulletsCount = bulletsCount;
    }

    @Override
    abstract public int fire();
}
