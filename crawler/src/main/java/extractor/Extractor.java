package extractor;

import model.Player;

import java.net.URI;
import java.util.List;

public interface Extractor {

    public abstract List<Player> getPlayers(URI basePath, URI playersPath);
    public abstract Player getPlayer(URI path);

}
