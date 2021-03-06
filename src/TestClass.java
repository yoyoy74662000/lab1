public class TestClass {
    public static void main(String[] args){
        Audition audition = new Audition();

        Performer performer1 = new Performer(audition);
        Performer performer2 = new Performer(audition);
        Performer performer3 = new Performer(audition);
        Performer dancer1 = new Dancer(audition, "rumba");
        Performer vocalist1 = new Vocalist(audition,"G", 4);
        Performer vocalist2 = new Vocalist(audition,"G", 5);

        audition.addPerformers(performer1);
        audition.addPerformers(performer2);
        audition.addPerformers(performer3);
        audition.addPerformers(dancer1);
        audition.addPerformers(vocalist1);
        audition.addPerformers(vocalist2);

        for(Performer p : audition.getPerformers()) {
            p.perform();
        }
    }
}
