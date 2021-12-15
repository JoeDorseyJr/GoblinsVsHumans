public class RandomNumbers {
    private int from = 0;
    private int to = 1;

    RandomNumbers(){}

    RandomNumbers(int to) {
        this.setFrom(to);
    }

    RandomNumbers(int from,int to){
        this.setFrom(from);
        this.setTo(to);
    }

    //Setters
    private void setFrom(int from){
        this.from = from;
    }

    private void setTo(int to){
        this.to = to;
    }

    //Getters
    private int getFrom(){
        return this.from;
    }

    private int getTo(){
        return this.to;
    }

    //Methods
    public int Int(){
        if (this.getFrom() < 0 ) {
            return (int) Math.round(Math.random() * (Math.abs(this.getFrom() - this.getTo())) + this.getFrom());
        }
        return (int) Math.round(Math.random() * this.getTo() + this.getFrom());
    }

    public int Int(int to){
        this.setTo(to);
        if (this.getFrom() < 0 ) {
            return (int) Math.round(Math.random() * (Math.abs(this.getFrom() - this.getTo())) + this.getFrom());
        }
        return (int) Math.round(Math.random() * this.getTo() + this.getFrom());
    }

    public int Int(int from, int to){
        this.setFrom(from);
        this.setTo(to);
        if (this.getFrom() < 0 ) {
            return (int) Math.round(Math.random() * (Math.abs(this.getFrom() - this.getTo())) + this.getFrom());
        }
        return (int) Math.round(Math.random() * this.getTo() + this.getFrom());
    }

    public double Double(){
        if (this.getFrom() < 0 ) {
            return  (Math.random() * (Math.abs(this.getFrom() - this.getTo())) + this.getFrom());
        }
        return (Math.random() * this.getTo() + this.getFrom());

    }

    public double Double(int to){
        this.setTo(to);
        if (this.getFrom() < 0 ) {
            return  (Math.random() * (Math.abs(this.getFrom() - this.getTo())) + this.getFrom());
        }
        return (Math.random() * this.getTo() + this.getFrom());
    }

    public double Double(int from,int to){
        this.setFrom(from);
        this.setTo(to);
        if (this.getFrom() < 0 ) {
            return  (Math.random() * (Math.abs(this.getFrom() - this.getTo())) + this.getFrom());
        }
        return (Math.random() * this.getTo() + this.getFrom());
    }
}
