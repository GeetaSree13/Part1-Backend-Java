

// Write your Checker class here
class Checker implements Comparator<Player> {
    public int compare(Player p1, Player p2) {
        int scoreComparator = Integer.compare(p2.score, p1.score);
        if (scoreComparator != 0) {
            return scoreComparator;
        } else {
            return p1.name.compareTo(p2.name);
        }
    }
}

