/*
 * ArraysUtils.java        1.0 08/03/2016
 *
 * Copyright 2016 Mey-ling Garcia <meygpons@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package triangle;

/**
 * Motlle del triangle.
 * 
 * El triangle té un nombre real que es la longitud del primer costat,
 * un segon nombre real que es la longitud del segon costat i un tercer
 * nombre real que és la longitud del tercer costat.
 */
public class Triangle {
    
    /** The first side length */
    private int side1;
    /** The second side length */
    private int side2;
    /** The third side length */
    private int side3;
    
    /* CONSTRUCTORS */
    
    /** 
     * Constructor by default
     * Side1 3, side2 4 and side3 5
     */
    public Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }
    
    /**
     * Constructor. 
     * 
     * @param side1 the first side length
     * @param side2 the second side length
     * @param side3 the third side length 
     */
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    /* METODES */
    
    /**
     * Method 
     * Calculate the perimeter
     * 
     * @return perimeterTriangle
     */
    public int perimeter() {
        int perimeterTriangle = side1 + side2 + side3;
        return perimeterTriangle;
    }
    
    /**
     * Method
     * Calculate the area
     * 
     * @return areaTriangle
     */
    public double area() {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        return area;
    }
}