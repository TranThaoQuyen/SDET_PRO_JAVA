package Bai2;

import java.security.SecureRandom;

public class Tiger extends Animal{
    public Tiger(){
        super.setAnimalType(Tiger.class.getSimpleName());
        super.setSpeed(new SecureRandom().nextInt(60));
    }
}
