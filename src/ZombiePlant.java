public class ZombiePlant {
    private int maxPotency;
    private int treatments;

    public ZombiePlant(int potency, int initTreatments){
        maxPotency = potency;
        treatments = initTreatments;
    }

    public int treatmentsNeeded(){
        return treatments;
    }

    public boolean isDangerous(){
        if(treatments > 0){
            return true;
        }
        return false;
    }

    public void treat(int potency){
        if(potency <= maxPotency && potency > 0){
            treatments--;
            if(treatments < 0){
                treatments = 0;
            }
        }
        else if(potency <= 0){
        }
        else{
            treatments++;
        }
    }

    public int getPotencyRequired() {
        return maxPotency;
    }
}
