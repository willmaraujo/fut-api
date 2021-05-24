package extractor;

import model.Club;
import model.Nationality;
import model.Player;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FutbinExtractor implements Extractor{

    @Override
    public List<Player> getPlayers(URI basePath, URI playersPath) {
        try {
            Document document = Jsoup.connect(basePath.toString() + playersPath.toString() ).get();
            Element table = document.select("#repTb").get(0);
            Elements rows = table.select("tr");

            List<Player> players = new ArrayList<>();

            for (int i = 0; i < rows.size(); i++) {
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if (cols.size() >= 1) {
                    String playerHref = row.attr("data-url");
                    players.add(getPlayer(URI.create(basePath.toString() + playerHref)));
                }
            }

            return players;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Player getPlayer(URI path) {
        try {
            Player player = new Player();

            Document document = Jsoup.connect(path.toString()).get();

            String commonName = document.select("body > div.site-player-page > div.container.p-xs-0 > div.row.col-md-12.padding_5.page-header-top.mt-2 > div.col-md-4.padding_5 > ol > li.breadcrumb-item.active > span")
                    .get(0).ownText();

            player.setCommonName(commonName);

            return player;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }
}
