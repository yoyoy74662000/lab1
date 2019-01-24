public class TestClass {
    public static void main(String[] args){
        Audition audition = new Audition();

        Performer performer1 = new Performer(audition);
        Performer performer2 = new Performer(audition);
        Performer performer3 = new Performer(audition);
        Performer dancer1 = new Dancer(audition, "rumba");

        audition.addPerformers(performer1);
        audition.addPerformers(performer2);
        audition.addPerformers(performer3);
        audition.addPerformers(dancer1);

        for(Performer p : audition.getPerformers()) {
            p.perform();
        }
    }
}
