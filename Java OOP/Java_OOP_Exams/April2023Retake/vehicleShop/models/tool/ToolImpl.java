package Java_OOP_Exams.April2023Retake.vehicleShop.models.tool;

import Java_OOP_Exams.April2023Retake.vehicleShop.common.ExceptionMessages;

public class ToolImpl implements Tool {

    private int power;

    public ToolImpl(int power) {
        this.setPower(power);
    }

    @Override
    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        if(power < 0){
            throw new IllegalArgumentException(ExceptionMessages.TOOL_POWER_LESS_THAN_ZERO);
        }
        this.power = power;
    }

    @Override
    public void decreasesPower() {
        if(this.power - 5 < 0){
            this.power = 0;
        }else {
            this.power -= 5;
        }
    }
    @Override
    public boolean isUnfit() {
        return this.power == 0;
    }
}
