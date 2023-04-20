package Circle;
public class Circle{
    private float radious;

    public void setRadious(float radious) {
        this.radious = radious;
    }
    public float getArea(float radious){
        return 3.14f*radious*radious;
    }
    public float getCircumference(float radious){
        return 2*3.14f*radious;
    }

}