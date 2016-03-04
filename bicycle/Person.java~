package bicycle;
/*
 * Person.java        1.1 28/11/2012 
 *
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a person. The person has age, height, sex and can be married or not.
 */
public class Person {
    /** The person's name */
    private String name;
    /** The person's age */
    private int age;
    /** The person's height */
    private double height;
    /** The person's sex. It can be 'M' (man) or 'W' (woman) */
    private char sex;
    /** Sets whether the person is married or not */
    private boolean married;
    /** Bike's person */
    private Bicycle bike;

    // Constructors

    /**
     * Constructor by default.
     */
    public Person() {
        this.married = true;
    }

    /**
     * Constructor.
     * 
     * @param name the person's name.
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Constructor.
     * 
     * @param name the person's name.
     * @param age the person's age.
     * @param height the person's height
     * @param sex the person's sex. It can be 'M' (man) or 'W' (woman).
     * @param married true if the person is married, false otherwise
     */
    public Person(String name, int age, double height, char sex, boolean married) {
        this.name = name;
        this.setAge(age);
        this.height = height;
        this.sex = sex;
        this.married = married;
    }

    // Getters and setters

    /**
     * Gets the person's name.
     * 
     * @return the person's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the person's name.
     * 
     * @param name the person's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets person's age.
     * 
     * @return the person's age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the person's age.
     * 
     * @param age the person's age.
     */
    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
    }

    /**
     * Gets the height of the person.
     * 
     * @return the person's height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the person's height.
     * 
     * @param height the person's height.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the sex of the person.
     * 
     * @return the person's sex.
     */
    public char getSex() {
        return sex;
    }

    /**
     * Sets the person's sex.
     * 
     * @param name the person's sex.
     */
    public void setSex(char sex) {
        if (sex == 'W' || sex == 'M')
            this.sex = sex;
    }

    /**
     * Gets if the person is married.
     * 
     * @return true if he/she is married, false otherwise
     */
    public boolean isMarried() {
        return married;
    }

    /**
     * Sets if person is married.
     * 
     * @param married true if the person is married, false otherwise
     */
    public void setMarried(boolean married) {
        this.married = married;
    }
    
    /**
     * Gets the person's bicycle.
     * 
     * @return the bicycle.
     */
    public Bicycle getBike() {
        return bike;
    }

    /**
     * Set a bicycle to the person.
     * 
     * @param bike a bicycle.
     */
    public void setBike(Bicycle bike) {
        this.bike = bike;
    }
    
    // More methods

    /**
     * Increments person's age by 1.
     */
    public void birthday() {
        this.age++;
    }

    /**
     * Textual representation of the object.
     * 
     * @return a string that represents the person
     */
    public String toString() {
        String s = "El meu nom és " + this.name + " i  sóc " + this.sex;
        return s;
    }
}
