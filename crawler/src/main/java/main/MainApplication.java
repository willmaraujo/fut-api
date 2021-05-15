package main;

import com.google.gson.Gson;
import model.Player;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {

    public static final String FIFA_INDEX_BASE_PATH = "https://www.fifaindex.com/";
    public static final String FIFA_INDEX_LANG_PATH = "pt-br/";
    public static final String FIFA_INDEX_PLAYERS_PATH = "players/";
    public static final String PAGE_PARAMETER = "?page";

    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<Player> players = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            players.addAll(extractor.getPlayers(FIFA_INDEX_BASE_PATH + FIFA_INDEX_LANG_PATH + FIFA_INDEX_PLAYERS_PATH + PAGE_PARAMETER + i));
            System.out.print(i);
        }
        System.out.println(new Gson().toJson(players));
    }
}
