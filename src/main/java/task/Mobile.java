package task;

public class Mobile {

    private int screenSize ;
    private int ram;
    private int rom;
    private String brand;
    private String type;


    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public Mobile(int screenSize, int ram, int rom, String brand, String type) {
        this.screenSize = screenSize;
        this.ram = ram;
        this.rom = rom;
        this.brand = brand;
        this.type = type;
    }

}
