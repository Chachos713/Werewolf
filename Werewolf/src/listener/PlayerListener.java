package listener;

public interface PlayerListener {
    public void giveResponse(ModeratorListener ml, String resp);
    
    public void addModeratorListener(ModeratorListener ml);
}
