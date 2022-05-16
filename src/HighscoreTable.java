import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HighscoreTable {
    
    private final List<HighscoreEntry> entries = new ArrayList<>();
    private static HighscoreTable instance;

    public static HighscoreTable getInstance() {
        if (HighscoreTable.instance == null)
            HighscoreTable.instance = new HighscoreTable();
        return HighscoreTable.instance;
    }

    public String getScoreByNickname(String nickname) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getNickname().equals(nickname))
                return entries.get(i).toString();
        }
        return "Player not found";
    }

    private void sortTable() {
        entries.sort(Comparator.comparing(HighscoreEntry::getScore).reversed());
    }

    public void addEntry(HighscoreEntry entry) {
        entries.add(entry);
        sortTable();
    }

    public List<HighscoreEntry> getEntries() {
        return entries;
    }

}