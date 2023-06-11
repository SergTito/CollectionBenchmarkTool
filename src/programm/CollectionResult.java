package programm;

public class CollectionResult implements Comparable<CollectionResult>{

    private String collection;
    private long time;

    public CollectionResult(String collection, long time) {
        this.collection = collection;
        this.time = time;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public int compareTo(CollectionResult other) {
        return Long.compare(this.time, other.getTime());
    }
}
