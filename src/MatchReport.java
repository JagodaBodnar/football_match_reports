public class MatchReport {
    public static void main(String[] args) {
        String position = FootballMatchReports.onField(2);
        System.out.printf("Player with number 2 on the shirt plays on: %s%n", position);
        position = FootballMatchReports.onField(7);
        System.out.printf("Player with number 7 on the shirt plays on: %s%n", position);
        position = FootballMatchReports.onField(4);
        System.out.printf("Player with number 4 on the shirt plays on: %s%n", position);
    }
}
