public class Main {
    public static void main(String[] args) throws Exception {

        HighscoreTable.getInstance().addEntry(new HighscoreEntry("Hans", 100));
        HighscoreTable.getInstance().addEntry(new HighscoreEntry("Peter", 1));
        HighscoreTable.getInstance().addEntry(new HighscoreEntry("Klaus", 500));

        for (int i = 0; i < HighscoreTable.getInstance().getEntries().size(); i++) {
            System.out.println(HighscoreTable.getInstance().getEntries().get(i).toString());
        }

        System.out.println();

        HighscoreTable.getInstance().addEntry(new HighscoreEntry("Günther", 200));
        for (int i = 0; i < HighscoreTable.getInstance().getEntries().size(); i++) {
            System.out.println(HighscoreTable.getInstance().getEntries().get(i).toString());
        }

        System.out.println();
        System.out.println(HighscoreTable.getInstance().getScoreByNickname("Hans"));
    }
}
