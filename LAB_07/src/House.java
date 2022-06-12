public class House {
    private String color;
    private  Integer Door;

    public House() {
    }

    public House(String color, Integer door) {
        this.color = color;
        Door = door;
    }

    public House(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDoor() {
        return Door;
    }

    public void setDoor(Integer door) {
        Door = door;
    }
}
