package fourthTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;


public class fourthTask {
    public static void main(String[] args) throws IOException {
        getAmountOfElements("https://uk.wikipedia.org/wiki/");

    }

    public static void getAmountOfElements (String url){
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ArrayList<Tag> tags = new ArrayList<>();
        tags.add(new Tag("img",doc.getElementsByTag("img").size()));
        tags.add(new Tag("div",doc.getElementsByTag("div").size()));
        tags.add(new Tag("p",doc.getElementsByTag("p").size()));
        tags.add(new Tag("h1",doc.getElementsByTag("h1").size()));
        tags.add(new Tag("ul",doc.getElementsByTag("ul").size()));
        tags.add(new Tag("a",doc.getElementsByTag("a").size()));
        tags.add(new Tag("body",doc.getElementsByTag("body").size()));
        Tag.compareByTag(tags);
        System.out.println("tags = " + tags.toString());
        Tag.compareByTagAmount(tags);
        System.out.println("tags = " + tags);

    }
}
