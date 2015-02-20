/**
 * Created by Allen Kinzalow on 2/6/2015.
 */
public class XPDrop {

    static int Y_FADE_POSITION = 50;
    static int Y_START_POSITION = 200;

    private int skill;
    private int xp;
    private double yPosition;


    public XPDrop(int skill, int xp, int offset) {
        this.skill = skill;
        this.xp = xp;
        this.yPosition = Y_START_POSITION + offset;
    }

    public void processXPDrop() {

        double distance = Math.abs(Y_FADE_POSITION - yPosition);
        ObjectDefinition.p12_full_font.drawStringRight("+" + this.xp, 510, (int)(this.yPosition), 16777215, 0, distance <= 60 ? ((int)((distance / 60.0) * 256.0)) : 256);
        yPosition -= 1.6;

    }

    public boolean isFinished() {
        return yPosition <= Y_FADE_POSITION;
    }

}
