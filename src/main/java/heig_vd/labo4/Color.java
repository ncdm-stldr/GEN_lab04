package heig_vd.labo4;

public class Color {

    int color;

    public Color(int color) {
        this.color = color;
    }

    public int colorToInt() {
        return color;
    }

    @Override
    public String toString() {
            switch (color) {
                case 1:
                    return "blue";
                case 2:
                    return "red";
                case 3:
                    return "yellow";
                default:
                    return "no color";
            }
        }

    }
