package Java_OOP_Exams.December2022Retake.magicGame.models.magicians;

import Java_OOP_Exams.December2022Retake.magicGame.common.ExceptionMessages;
import Java_OOP_Exams.December2022Retake.magicGame.models.magics.Magic;

public abstract class MagicianImpl implements Magician{

    private String username;
    private int health;
    private int protection;
    private boolean isAlive;
    private Magic magic;

    public MagicianImpl(String username, int health, int protection, Magic magic) {
        this.username = username;
        this.health = health;
        this.protection = protection;
        this.magic = magic;
        this.isAlive = true;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        if(username == null || username.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.INVALID_MAGICIAN_NAME);
        }
        this.username = username;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        if(health < 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_MAGICIAN_HEALTH);
        }
        this.health = health;
    }

    @Override
    public int getProtection() {
        return this.protection;
    }

    public void setProtection(int protection) {
        if(protection < 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_MAGICIAN_PROTECTION);
        }
        this.protection = protection;
    }

    @Override
    public Magic getMagic() {
        return this.magic;
    }

    public void setMagic(Magic magic) {
        if(magic == null){
            throw new NullPointerException(ExceptionMessages.INVALID_MAGIC);
        }
        this.magic = magic;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    @Override
    public void takeDamage(int points) {

        int damage = points;

        if(getProtection() < damage){
            damage -= getProtection();
            setProtection(0);
            if(getHealth() - damage > 0){
                this.setHealth(this.getHealth() - damage);
            }else {
                this.setHealth(0);
                this.isAlive = false;
            }
        }else {
            this.setProtection(this.getProtection() - damage);
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n",getClass().getSimpleName(),this.username)
        + String.format("Health: %d%n",this.getHealth())
                +String.format("Protection: %s%n",getProtection())
                +String.format("Magic: %s%n", this.getMagic().getName());
    }
}
