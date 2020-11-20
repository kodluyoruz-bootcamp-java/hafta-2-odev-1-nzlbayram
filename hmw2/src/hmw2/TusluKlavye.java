package hmw2;


public class TusluKlavye implements Klavye{
    public final String klavyeTuru = "Tuşlu Klavye";

    @Override
    public String getKlavyeTuru() {
        return klavyeTuru;
    }
}