// Define a class Distance with fields km, m, cm. Provide methods to set distance and display distance. Also define a
// member function to add two distances.

package Distance;

public class Distance{
    private int km,m,cm;
    public void setDistance(int x,int y,int z){
        km=x;
        m=y;
        cm=z;
    }
    public void showDistance(){
        System.out.println(km+"km "+m+"m "+cm+"cm");
    }
    public Distance addDistance(Distance tempDistance){
        Distance d3 = new Distance();
        d3.cm=cm+tempDistance.cm;
        d3.m=d3.cm/100+m+tempDistance.m;
        d3.cm=d3.cm%100;
        d3.km=d3.m/1000+km+tempDistance.km;
        d3.m=d3.m%1000;
        return d3;
    }
}
