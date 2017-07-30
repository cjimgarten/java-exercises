package exercises.shape;

/**
 * Created by chris on 7/30/17.
 */
public abstract class AbstractEntity {

    private int id;
    private static int currentId = 1;

    public AbstractEntity() {
        this.id = currentId;
        currentId++;

    }

    public int getId() {
        return this.id;
    }

}
