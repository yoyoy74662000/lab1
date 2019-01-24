public class Vocalist extends Performer{
    private String tone;
    private Integer volume;

    public Vocalist(){
        System.out.println("constructor");
    }

    public Vocalist(Audition audition, String tone){
        super(audition);
        this.tone = tone;
        this.volume = null;
    }

    public Vocalist(Audition audition, String tone, int vol){
        super(audition);
        this.tone = tone;
        this.volume = vol;
    }

    @Override
    public void perform() {
        if(volume == null){
            System.out.println("I sing in the key of - " + tone + " - " + super.id);
        }else{
            System.out.println("I sing in the key of - " + tone + " - " + volume + " - " + super.id);
        }
    }

}
