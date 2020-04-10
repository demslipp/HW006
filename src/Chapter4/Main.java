package Chapter4;

public class Main{

    public static void main(String[] args){
        LabeledPoint labeledPoint=new LabeledPoint("asda", 13, 12);
        LabeledPoint labeledPoint1=new LabeledPoint("asda", 13, 12);
        Point point = new Point(13,12);
        point.getX();
        point.getY();
        point.toString();
        labeledPoint.getLabel();
        labeledPoint.equals(labeledPoint1);
        labeledPoint.hashCode();
        PointProtected pointProtected =new LabeledPointProtected("asda",12,13);
        pointProtected.getX();
        pointProtected.getY();
    }
}
