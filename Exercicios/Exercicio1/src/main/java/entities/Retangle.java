package entities;

public class Retangle {

    public double height;

    public double width;

    //public double diagonal;

    public double Area(){
        return height * width;
    }

    public double Perimeter(){
        return (width + height) * 2;
    }

//    public double Diagonal(double diagonal){
//        this.diagonal =
//    }

    public String toString() {
        return "AREA = "
                + String.format("%.2f" , Area())
                + String.format("%n")
                + "PERIMETER = "
                + String.format("%.2f" , Perimeter());

    }



}
