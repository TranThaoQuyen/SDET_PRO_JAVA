package Bai01;

public class Animal {
    private String animalName;
    private int animalSpeed;
    private boolean flyable;

    public Animal() {
    }

    protected Animal(Builder builder){
        animalName = builder.animalName;
        animalSpeed = builder.animalSpeed;
        flyable = builder.flyable;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalSpeed() {
        return animalSpeed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public static class Builder{
        private String animalName = "dog";
        private int animalSpeed = 1;
        private boolean flyable = true;

        public Builder withAnimalType(String animalName){
            this.animalName = animalName;
            return this;
        }

        public Builder withSpeed(int animalSpeed){
            this.animalSpeed = animalSpeed;
            return this;
        }

        public Builder withFlyAble(boolean flyable){
            this.flyable = flyable;
            return this;
        }
        public Animal build(){
            return new Animal(this);
        }
    }
}
