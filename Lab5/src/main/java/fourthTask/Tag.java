package fourthTask;

import java.util.ArrayList;
import java.util.Comparator;

public class Tag {
    private String tag;
    private int amount;

    public Tag(String tag, int amount) {
        this.tag = tag;
        this.amount = amount;
    }

    public String getTag() {
        return tag;
    }

    public int getAmount() {
        return amount;
    }

    public static void compareByTag(ArrayList<Tag> tags){
        Comparator<Tag> byTag = Comparator.comparing(Tag::getTag);
        tags.sort(byTag);

    }

    public static void compareByTagAmount(ArrayList<Tag> tags){
        Comparator<Tag> byAmount = Comparator.comparing(Tag::getAmount);
        tags.sort(byAmount);

    }

    @Override
    public String toString() {
        return "Tag{" +
                "tag='" + tag + '\'' +
                ", amount=" + amount +
                '}';
    }
}