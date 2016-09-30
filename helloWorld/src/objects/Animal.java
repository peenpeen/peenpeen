package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public class Animal {

    private String animalName;
    private int livingSpan;
    private  boolean ableToSwim;

    public boolean isAbleToSwim() {
        return ableToSwim;
    }

    public void setAbleToSwim(boolean ableToSwim) {
        this.ableToSwim = ableToSwim;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getLivingSpan() {
        return livingSpan;
    }

    public void setLivingSpan(int livingSpan) {
        this.livingSpan = livingSpan;
    }


}
