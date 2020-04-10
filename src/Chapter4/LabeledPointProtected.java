package Chapter4;

public class LabeledPointProtected extends PointProtected{
    protected String label;

    public LabeledPointProtected(String label, double x, double y){
        super(x, y);
        this.label =label;
    }
    public String getLabel(){
        System.out.println(label);
        return label;
    }
}
