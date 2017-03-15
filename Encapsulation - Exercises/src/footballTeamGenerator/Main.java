package footballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Magdalena on 14.3.2017 г..
 */
public class Main {
    private static final Map<String, Team> TEAMS = new HashMap<>(3);

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";

        while (!"END".equals(line = reader.readLine())) {
            String[] commandTokens = line.split(";");
            String command = commandTokens[0];
            String teamName = commandTokens[1];
            Team team = null;
            Player player = null;

            switch (command) {
                case "Team":
                    if (!TEAMS.containsKey(teamName)) {
                        try {
                            team = new Team(teamName);
                            TEAMS.put(teamName, team);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;

                case "Add":
                    if (!TEAMS.containsKey(teamName)) {
                        System.out.println(String.format("Team %s does not exist.", teamName));
                        break;
                    }

                    String playerName = commandTokens[2];
                    int endurance = Integer.parseInt(commandTokens[3]);
                    int sprint = Integer.parseInt(commandTokens[4]);
                    int dribble = Integer.parseInt(commandTokens[5]);
                    int passing = Integer.parseInt(commandTokens[6]);
                    int shooting = Integer.parseInt(commandTokens[7]);

                    team = TEAMS.get(teamName);

                    try {
                        player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                        team.addPlayer(player);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "Remove":
                    if (!TEAMS.containsKey(teamName)) {
                        System.out.println(String.format("Team %s does not exist.", teamName));
                        break;
                    }

                    team = TEAMS.get(teamName);
                    playerName = commandTokens[2];
                    try {
                        team.removePlayer(playerName);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "Rating":
                    if (!TEAMS.containsKey(teamName)) {
                        System.out.println(String.format("Team %s does not exist.", teamName));
                        break;
                    }
                    team = TEAMS.get(teamName);
                    System.out.println(team);
                    break;
            }
        }
    }
}
