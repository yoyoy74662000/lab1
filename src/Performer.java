import java.util.Random;

public class Performer {
    protected String id;
    private Audition audition;

    public Performer(){
        System.out.println("constructor");
    }

    public Performer(Audition audi){
        this.audition = audi;
        if(this.audition.getPerformers().size() >= 1000) {
            System.out.print("Full. Open another session");
            return;
        }

        int[] ids = audition.getids();
        Random random = new Random();
        int PerformerId = random.nextInt(1000);

        while(ids[PerformerId] == 1){
            PerformerId = random.nextInt(1000);
        }

        this.id = "" + PerformerId;
    }

    public void perform(){
        System.out.println(id + " - performer" );
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
