// Java program example for aggregation. create a class Operation. create a class CircleAggregationEx1
//and in class CircleAggregationEx1 create an object of class Operation.

package src.com.mkpits.java.aggregation;

class Operation {
    int square(int r) {
        return r * r;
    }
}

//creating a class Circle
class CircleAggregationEx1 {
    Operation op;
    double pi = 3.14;

    double area(int r) {
        Operation op = new Operation();
        int sq = op.square(r);
        double ar = pi * sq;
        return ar;
    }

}

class Ex1ToDemonstrateAggregation {
    public static void main(String[] args) {
        CircleAggregationEx1 c = new CircleAggregationEx1();
        double res = c.area(6);
        System.out.println("Area of a circle is " + res);
    }
}
