package main;

import model.Club;
import model.Nationality;
import model.Player;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Extractor {

    public List<Player> getPlayers(String URL) {
        try {
            Document document = Jsoup.connect(URL).get();
            Element table = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.responsive-table.table-rounded > table").get(0);
            Elements rows = table.select("tr");

            List<Player> players = new ArrayList<>();

            for (int i = 0; i < rows.size(); i++) {
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if (cols.size() >= 3) {
                    String playerId = row.attr("data-playerid");
                    String playerHref = cols.get(3).select("a").first().attr("href");
                    players.add(getPlayer("https://www.fifaindex.com" + playerHref, playerId));
                }
            }

            return players;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private Player getPlayer(String URL, String playerId) {
        try {
            Player player = new Player();
            player.setPlayerId(playerId);

            Document document = Jsoup.connect(URLDecoder.decode(URL, StandardCharsets.UTF_8.toString())).get();

            String name = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(2) > div > h5")
                    .get(0).ownText();

            String pictureSrc = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(1) > div.d-flex.mb-3.align-items-center > div:nth-child(1) > img")
                    .get(0).attr("src");

            String pictureDataSrc = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(1) > div.d-flex.mb-3.align-items-center > div:nth-child(1) > img")
                    .get(0).attr("data-src");

            String pictureDataSrcset = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(1) > div.d-flex.mb-3.align-items-center > div:nth-child(1) > img")
                    .get(0).attr("data-srcset");

            String pictureSrcSet = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(1) > div.d-flex.mb-3.align-items-center > div:nth-child(1) > img")
                    .get(0).attr("srcset");

            String ovr = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(2) > div > h5 > span > span:nth-child(1)")
                    .get(0).ownText();

            String pot = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(2) > div > h5 > span > span:nth-child(2)")
                    .get(0).ownText();

            String age = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(2) > div > div > p:nth-child(5) > span")
                    .get(0).ownText();

            String height = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(2) > div > div > p:nth-child(1) > span > span.data-units.data-units-metric")
                    .get(0).ownText();

            String weight = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(2) > div > div > p:nth-child(2) > span > span.data-units.data-units-metric")
                    .get(0).ownText();

            String preferredFoot = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(2) > div > div > p:nth-child(3) > span")
                    .get(0).ownText();

            String birth = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(2) > div > div > p:nth-child(4) > span")
                    .get(0).ownText();

            String workRate = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(2) > div > div > p:nth-child(7) > span")
                    .get(0).ownText();

            String value = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(2) > div > div > p:nth-child(10) > span")
                    .get(0).ownText();

            String wage = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(2) > div > div > p:nth-child(13) > span")
                    .get(0).ownText();

            String nationalityCountry = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div:nth-child(4) > div:nth-child(1) > div > h5 > a:nth-child(2)")
                    .get(0).ownText();

            String nationalityPictureSrc = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div:nth-child(4) > div:nth-child(1) > div > h5 > a:nth-child(1) > img")
                    .get(0).attr("src");

            String nationalityPictureDataSrc = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div:nth-child(4) > div:nth-child(1) > div > h5 > a:nth-child(1) > img")
                    .get(0).attr("data-src");

            String nationalityPictureDataSrcset = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div:nth-child(4) > div:nth-child(1) > div > h5 > a:nth-child(1) > img")
                    .get(0).attr("data-srcset");

            String nationalityPictureSrcSet = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div:nth-child(4) > div:nth-child(1) > div > h5 > a:nth-child(1) > img")
                    .get(0).attr("srcset");

            String nationalKitNumber = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div:nth-child(4) > div:nth-child(1) > div > div > p:nth-child(2) > span")
                    .get(0).ownText();

            String clubKitNumber = getOwnText(document, "body > main > div > div:nth-child(3) > div.col-lg-8 > div:nth-child(4) > div:nth-child(2) > div > div > p:nth-child(2) > span");

            String clubName = getOwnText(document, "body > main > div > div:nth-child(3) > div.col-lg-8 > div:nth-child(4) > div:nth-child(2) > div > h5 > a:nth-child(2)");

            String clubPictureDataSrc = getAttr(document, "body > main > div > div:nth-child(3) > div.col-lg-8 > div:nth-child(4) > div:nth-child(2) > div > h5 > a:nth-child(1) > img", "data-src");

            String clubPictureDataSrcset = getAttr(document,
                    "body > main > div > div:nth-child(3) > div.col-lg-8 > div:nth-child(4) > div:nth-child(2) > div > h5 > a:nth-child(1) > img",
                    "data-srcset");

            String joinedClub = getOwnText(document, "body > main > div > div:nth-child(3) > div.col-lg-8 > div:nth-child(4) > div:nth-child(2) > div > div > p:nth-child(3) > span");

            String contractLength = getOwnText(document, "body > main > div > div:nth-child(3) > div.col-lg-8 > div:nth-child(4) > div:nth-child(2) > div > div > p:nth-child(4) > span");

            Nationality nationality = new Nationality();
            nationality.setCountry(nationalityCountry);
            nationality.setPictureDataSrc(nationalityPictureDataSrc);
            nationality.setPictureSrc(nationalityPictureSrc);
            nationality.setPictureDataSrcset(nationalityPictureDataSrcset);
            nationality.setPictureSrcSet(nationalityPictureSrcSet);

            Club club = new Club();
            club.setName(clubName);
            club.setPictureDataSrc(clubPictureDataSrc);
            club.setPictureDataSrcset(clubPictureDataSrcset);

            Elements positionElements = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div.row.pt-3 > div:nth-child(2) > div > div > p:nth-child(6) > span").get(0).getElementsByTag("a");
            List<String> positions = new ArrayList<>();
            for (Element element : positionElements) {
                positions.add(element.attr("title"));
            }

            Elements nationalPositionElements = document.select("body > main > div > div:nth-child(3) > div.col-lg-8 > div:nth-child(4) > div:nth-child(1) > div > div > p:nth-child(1) > span").get(0).getElementsByTag("a");
            List<String> nationalPositions = new ArrayList<>();
            for (Element element : nationalPositionElements) {
                nationalPositions.add(element.attr("title"));
            }

            Elements clubPositionElements = getElementsByTag(document, "body > main > div > div:nth-child(3) > div.col-lg-8 > div:nth-child(4) > div:nth-child(2) > div > div > p:nth-child(1) > span", "a");
            List<String> clubPositions = new ArrayList<>();
            for (Element element : clubPositionElements) {
                nationalPositions.add(element.attr("title"));
            }

            player.setName(name);
            player.setPictureSrc(pictureSrc);
            player.setPictureDataSrc(pictureDataSrc);
            player.setPictureDataSrcset(pictureDataSrcset);
            player.setPictureSrcSet(pictureSrcSet);
            player.setOvr(ovr);
            player.setPot(pot);
            player.setPositions(positions);
            player.setAge(Integer.valueOf(age));
            player.setWeight(Integer.valueOf(weight.split(" ")[0]));
            player.setHeight(Integer.valueOf(height.split(" ")[0]));
            player.setNationality(nationality);
            player.setNationalPositions(nationalPositions);
            player.setNationalKitNumber(Integer.valueOf(nationalKitNumber));
            player.setClubPositions(clubPositions);
            player.setClubKitNumber(clubKitNumber != null ? Integer.valueOf(clubKitNumber) : null);
            player.setClub(club);
            player.setJoinedClub(joinedClub);
            player.setContractLength(clubKitNumber != null ? Integer.valueOf(contractLength) : null);

            return player;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String getOwnText(Document document, String selector) {
        String clubKitNumber = null;
        if (document.select(selector).size() > 0) {
            clubKitNumber = document.select(selector)
                    .get(0).ownText();
        }
        return clubKitNumber;
    }

    private String getAttr(Document document, String selector, String attr) {
        String clubKitNumber = null;
        if (document.select(selector).size() > 0) {
            clubKitNumber = document.select(selector)
                    .get(0).attr(attr);
        }
        return clubKitNumber;
    }

    private Elements getElementsByTag(Document document, String selector, String tag) {
        Elements elements = new Elements();
        if (document.select(selector).size() > 0) {
            elements = document.select(selector).get(0).getElementsByTag(tag);
        }

        return elements;
    }
}
