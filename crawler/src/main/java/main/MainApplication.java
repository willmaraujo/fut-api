package main;

import com.google.gson.Gson;
import extractor.FutbinExtractor;
import model.Player;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class MainApplication {

    public static final String FUTBIN_BASE_PATH = "https://www.futbin.com";
    public static final String FUTBIN_PLAYERS_PATH = "/players";
    public static final String PAGE_PARAMETER = "?page=";

    public static void main(String[] args) {
        FutbinExtractor extractor = new FutbinExtractor();
        List<Player> players = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            players.addAll(extractor.getPlayers(URI.create(FUTBIN_BASE_PATH), URI.create(FUTBIN_PLAYERS_PATH + PAGE_PARAMETER + i)));
            System.out.print(i);
        }
        System.out.println(new Gson().toJson(players));
    }
}
