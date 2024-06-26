import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        int counter = 0;
        for (Point p : s.getPoints()) {
            counter = counter + 1;
        }
        return counter;
    }

    public double getAverageLength(Shape s) {
        // Put code here
        double length = getPerimeter(s);
        int pointsNumber = getNumPoints(s);
        double result = length / pointsNumber;
        return result;
    }

    public double getLargestSide(Shape s) {
        // Put code here
        double max = 0;
        Point prevPoint = s.getLastPoint();
        for (Point p : s.getPoints()) {
            double dist = prevPoint.distance(p);
            if (max < dist) {
                max = dist;
            }
        }
        return max;
    }

    public double getLargestX(Shape s) {
        // Put code here
        double x = s.getLastPoint().getX();
        for (Point p : s.getPoints()) {
            double value = p.getX();
            if (x < value) {
                x = value;
            }
        }
        return x;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        
        double lgtPer = Double.MIN_VALUE;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);    
            System.out.println(fr);
            Shape s = new Shape(fr);
            double shapePar = getPerimeter(s);
            if (lgtPer < shapePar) {
                lgtPer = shapePar;
            }

            
        }
        return lgtPer;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        int pointsNumber = getNumPoints(s);
        double avg = getAverageLength(s);
        double lrgst = getLargestSide(s);
        double lrgX = getLargestX(s);
        System.out.println("perimeter = " + length);
        System.out.println("Number of points = " + pointsNumber);
        System.out.println("The average length is :" + avg);
        System.out.println("The largest length is :" + lrgst);
        System.out.println("The largest x is :" + lrgX);
    }
    
    public void testPerimeterMultipleFiles() {
        double result = getLargestPerimeterMultipleFiles();
        System.out.println("the largest per with multible files is :" + result);
        // Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
        // pr.testPerimeterMultipleFiles();
    }
}
