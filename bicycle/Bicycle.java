/*
 * ArraysUtils.java        1.0 26/02/2016
 *
 * Copyright 2016 Mey-ling Garcia <meygpons@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package bicycle;

/**
 * Modelizes a bicycle.
 * 
 * A bicycle has a model, rear and front sprockets that may be changed if the bicycle is moving and can be accelerated
 * or braked. The minimum rear and front sprockets have number 1. The second rear and front sprockets have number 2 and
 * so on.
 */
public class Bicycle {

    /** The bicycle's model. */
    private String model;
    /** The engaged front sprocket. */
    private int frontSprocket;
    /** The engaged rear sprocket. */
    private int rearSprocket;
    /** The number of front sprockets the bicyle has. */
    private final int nFrontSprockets;
    /** The number of rear sprockets the bicyle has. */
    private final int nRearSprockets;
    /** The bicycle's speed in km/h. */
    private double v;
    /** The maximum speed of the bicycle */
    private final static int VMAX = 100;
    /** Increment of the bicycle speed */
    private final static int DV = 5;

    /**
     * Constructor by default. Creates a stopped mountain bike with 3 front sprockets, 7 rear sprockets and with the
     * first front and rear sprockets engaged.
     */
    public Bicycle() {
        this.model = "Mountain bike";
        this.frontSprocket = 3;
        this.rearSprocket = 1;
        this.nFrontSprockets = 3;
        this.nRearSprockets = 7;
        this.v = 0;
    }

    /**
     * Constructor. Creates a mountain bike with the first rear sprocket engaged and the last front sprocket engaged
     * 
     * @param nFrontSprockets The number of front sprockets of the bicycle.
     * @param nRearSprockets the number of rear sprockets of the bicycle..
     * @param v The bicycle's speed in km/h.
     */
    public Bicycle(int nFrontSprockets, int nRearSprockets, double v) {
        this.model = "Mountain bike";
        // si el nFrontSprockets es inferior a 1 automaticament posarem 1
        if (nFrontSprockets < 1) {
            this.nFrontSprockets = 1;  
        } else {  // Altrament posarem el numero introduit per parametre
            this.nFrontSprockets = nFrontSprockets;
        }
        // si el nRearSprockets  es inferior a 3 automaticament possarem 3
        if (nRearSprockets < 3 ) {
            this.nRearSprockets = 3;
        } else { // altrament posarem el numero introduit per parametre
            this.nRearSprockets = nRearSprockets; 
        } 
        this.frontSprocket = nFrontSprockets;
        this.rearSprocket = 3;
        this.v = v;
    }
    
    /**
     * Constructor.
     * 
     * @param model The bicycle's model.
     * @param frontSprocket The engaged front sprocket.
     * @param rearSprocket The rear front sprocket.
     * @param nFrontSprockets The number of front sprockets the bicyle has.
     * @param nRearSprockets The number of rear sprockets the bicyle has.
     * @param v The bicycle's speed in km/h.
     */
 public Bicycle(String model, int frontSprocket, int rearSprocket, int nFrontSprockets, 
                   int nRearSprockets, double v) {
        this.model = model;
        // si el nFrontSprockets es inferior a 1 automaticament posarem 1
        if (nFrontSprockets < 1) {
            this.nFrontSprockets = 1;
        } else { // Altrament posarem el numero introduit per parametre
            this.nFrontSprockets = nFrontSprockets;
        }
        // si el nRearSprockets  es inferior a 3 automaticament possarem 3
        if (nRearSprockets < 3) {
            this.nRearSprockets = 3;
        } else { // altrament posarem el numero introduit per parametre
            this.nRearSprockets = nRearSprockets; 
        }
        // frontSprocket es el plat en el qual es troba, per tant si es menor de 0 automaticament possarem 1
        if (frontSprocket <= 0 ) {
            this.frontSprocket = 1;
        } else if (frontSprocket > nFrontSprockets) { // si és major al numero de plats totals possarem el numero maxim
            this.frontSprocket = this.nFrontSprockets;
        } else { // altrament possarem el numero introduit per parametre
            this.frontSprocket = frontSprocket;
        }
        // rearSprocket es el pinyol en el qual es troba, per tant si es menor de 0 automaticament possarem 1
        if (rearSprocket <= 0 ) {
            this.rearSprocket = 1;
        } else if (rearSprocket > nRearSprockets) { // si és major al numero de pinyons totals possarem el numero maxi
            this.rearSprocket = this.nRearSprockets;
        } else { // altrament possarem el numero introduit per parametre
            this.rearSprocket = rearSprocket; 
        }
        this.v = v;
        
    }

	    // Metode per poder veure els atributs de la bike, així poder controlar que va bé tot
    public void tot() {   
        System.out.println("Model  " + model);
        System.out.println("frontSprockets  " + frontSprocket);
        System.out.println("rearSprockets  " + rearSprocket);
        System.out.println("nFrontSprockets  " + nFrontSprockets);
        System.out.println("nRearSprockets  " + nRearSprockets);
        System.out.println("velocitat  " + v);
    }
	
	//SETTER ANG GETTERS
    // Set sirve para cambiar el atributos deseado del objeto
    // Get sirve para mostrar el atributo deseado del objeto
	public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model.trim();
    }
    
    public int getRearSprocket() {
        return rearSprocket;
    }
    
    public void setRearSprocket(int rearSprocket) {
        // si el numero de pinyol es troba entre 0 i el numero maxim de pinyols
        // podrà cambiar de pinyol
        if (rearSprocket <= nRearSprockets && rearSprocket > 0) {
            this.rearSprocket = rearSprocket;
        } else { // altrament no podrà fer aquest cambi
            System.out.println("no pots cambiar");
        }
    }
    
    public int getFrontSprocket() {
        return frontSprocket;
    }
    
    public void setFrontSprocket(int frontSprocket) {
        // si el número de plats es troba entre 0 i el número máxim de plats 
        // podrà cambiar de plat
        if (frontSprocket > 0 && frontSprocket <= nFrontSprockets) {
            this.frontSprocket = frontSprocket;
        } else { // altrament no podrà fer aquest cambi.
            System.out.println("no pots cambiar");
        }
    }
    
    public double getV() {
        return v;
    }
    
    public void setV(double v) {
        this.v = v;
    }

    /**
     * Changes the engaged front sprocket. Increases or decreases the front sprocket by 1. The bicycle can't be stopped.
     * 
     * @param n A number that indicates if the front sprocket must be increased or decreased. If n is positive the front
     *        sprocket will be increased. If n is negative the front sprocket will be decreased. If n is 0, the front
     *        sprocket won't be changed.
     * @return true if the front sprocket is changed, false otherwise.
     */
    public boolean changeFrontSprocket(int n) {
        boolean isChanged = true;
        if (this.frontSprocket < this.nFrontSprockets && n > 0 && this.v > 0) {
            this.frontSprocket++;
        } else if (this.frontSprocket > 1 && n < 0 && this.v > 0) {
            this.frontSprocket--;
        } else {
            isChanged = false;
        }
        return isChanged;
    }

    /**
     * Changes the engaged rear sprocket. Increases or decreases the rear sprocket by 1. The bicycle can't be stopped.
     * 
     * @param n A number that indicates if the rear sprocket must be increased or decreased. If n is positive the rear
     *        sprocket will be increased. If n is negative the rear sprocket will be decreased. If n is 0, the rear
     *        sprocket won't be changed.
     * @return true if the rear sprocket is changed, false otherwise.
     */
    public boolean changeRearSprocket(int num) {
        boolean isChanged = true;
        if (rearSprocket < nRearSprockets && num > 0 && v > 0) {
            rearSprocket++;
        } else if (rearSprocket > 1 && num < 0 && v > 0) {
            rearSprocket--;
        } else {
            isChanged = false;
        }
        return isChanged;
    }

    /**
     * Accelerates the bicycle.
     */
    public void accelerate() {
        double newV = this.v + Bicycle.DV;
        if (newV > Bicycle.VMAX)
            newV = Bicycle.VMAX;
        this.v = newV;
    }

    /**
     * Decreases the velocity of the bicycle.
     */
    public void brake() {
        double newV = this.v - Bicycle.DV;
        if (newV < 0)
            newV = 0;
        this.v = newV;
    }
	
	/**
     * Para la bicicleta de cop
     * la velocitat baixa a 0
     * 
     */
    public void stop() {
        this.v = 0;
    }
    
    
}
