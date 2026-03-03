public class Encapsulation {
    private float weight;
    private float height;
    private float bmi;

    public Encapsulation(float weight, float height, float bmi) {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

    public Encapsulation() {

    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }
        public static void main(String[] args) {
            Encapsulation h1 = new Encapsulation();
            // using setters of HumanBeing
            h1.setHeight(1.65f);
            h1.setWeight(68);
            h1.setBmi(calculateBmi(h1));

            // using getters of HumanBeing
            System.out.println("Person has " + h1.getWeight() + " kgs and is " + h1.getHeight() + " meters in height, which results in BMI of " + h1.getBmi());
        }

        public static float calculateBmi(Encapsulation h1) {
            return h1.getWeight() / (h1.getHeight() * h1.getHeight());
        }

    }



