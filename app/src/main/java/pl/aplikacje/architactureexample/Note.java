package pl.aplikacje.architactureexample;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {

   @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;

    private String description;

    private int priotrity;

    public Note(String title, String description, int priotrity) {
        this.title = title;
        this.description = description;
        this.priotrity = priotrity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriotrity() {
        return priotrity;
    }
}
