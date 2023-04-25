// Define a class Cuboid with member variables to store length of its sides. Also define setters, getters and member
// functions to calculate volume and surface area of cuboid.
package Cuboid;

public class Cuboid{
    private int length, breadth,height;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void showVolume(){
        System.out.println("volume is= "+(length* breadth *height));
    }
    public  void showSurface(){
        System.out.println("Surface is= "+2*(length* breadth + breadth *height+height*length));
    }
}
