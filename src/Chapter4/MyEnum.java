package Chapter4;

public class MyEnum{
    public enum Ch0407Enum{

        BLACK,
        RED,
        BLUE,
        GREEN,
        CYAN,
        MAGENTA,
        YELLOW,
        WHITE;

        public static Ch0407Enum getRed(){
            return RED;
        }

        public static Ch0407Enum getGreen(){
            return GREEN;
        }

        public static Ch0407Enum getBlue(){
            return BLUE;
        }

        public static void main(String[] args){

            System.out.println(WHITE.ordinal());
            System.out.println(Ch0407Enum.getRed());
            System.out.println(Ch0407Enum.getGreen());
            System.out.println(Ch0407Enum.getBlue());

        }
    }
}
