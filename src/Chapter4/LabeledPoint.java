package Chapter4;

import java.util.Objects;

public class LabeledPoint extends Point{
    private String label;

    public LabeledPoint(String label, double x, double y){
        super(x, y);
        this.label=label;
    }

    public String getLabel(){
        System.out.println(label);
        return label;
    }

    @Override
    public String toString(){
        return "Chapter4.LabeledPoint{"+
                "label='"+label+'\''+
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        LabeledPoint that=(LabeledPoint) o;
        System.out.println(Objects.equals(label, that.label));
        return Objects.equals(label, that.label);
    }

    @Override
    public int hashCode(){
        System.out.println(Objects.hash(label));
        return Objects.hash(label);
    }
}
