//Random points on a circle
package aysegulyılmaz.hw3;

/**
 *
 * @author ayşegül
 */
public class Chapter4Question01 {
    public static void main(String[] args) {
        final double radius = 40;
        
        double angle1 = Math.random() * 2 * Math.PI; // RANDOM ANGLES
        double angle2 = Math.random() * 2 * Math.PI;
        double angle3 = Math.random() * 2 * Math.PI;
        
        // Get x and y
        double x1 = radius * Math.cos(angle1);
        double x2 = radius * Math.sin(angle1);
        double x3 = radius * Math.cos(angle2);
        double y1 = radius * Math.sin(angle2);
        double y2= radius * Math.cos(angle3);
        double y3 = radius * Math.sin(angle3);
        
        // Compute three sides
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
	double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        
        // Compute three angles
	double anglea = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
	double angleb = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
	double anglec = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        // Display results
		System.out.println("The three angles are " + Math.round(anglea * 100) / 100.0 + " " + Math.round(angleb * 100) / 100.0 + " " + Math.round(anglec * 100) / 100.0);	
    }
            
}
