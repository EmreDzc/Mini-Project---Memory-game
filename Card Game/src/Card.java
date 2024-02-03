public class Card {

    private char value;
    private boolean estimate = false;

    public Card(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean isEstimate() {
        return estimate;
    }

    public void setEstimate(boolean estimate) {
        this.estimate = estimate;
    }
}
