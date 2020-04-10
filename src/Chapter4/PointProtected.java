package Chapter4;

public class PointProtected{
    protected double x;
    protected double y;

    public PointProtected(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getY(){
        System.out.println(y);
        return y;
    }

    public double getX(){
        System.out.println(x);
        return x;
    }
}