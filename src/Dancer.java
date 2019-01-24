public class Dancer extends Performer{
    private String style;

    public Dancer(){
        System.out.println("constructor");
    }

    public Dancer(Audition audition, String style){
        super(audition);
        this.style = style;
    }

    @Override
    public void perform() {
        System.out.println(style + " - " + super.id + " dancer");
    }

    public String getStyle() {
        return style;
    }
}
