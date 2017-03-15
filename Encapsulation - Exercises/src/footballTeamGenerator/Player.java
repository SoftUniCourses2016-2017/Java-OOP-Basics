package footballTeamGenerator;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

/**
 * Created by Magdalena on 14.3.2017 г..
 */
public class Player {

    private final static String EXCEPTION_MESSAGE = "%s should be between 0 and 100.";

    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new CustomException("A name should not be empty.");
        }
        this.name = name;
    }


    private void setEndurance(int endurance) {
        this.validateData(endurance, "Endurance");
        this.endurance = endurance;

    }

    private void setSprint(int sprint) {
        this.validateData(sprint, "Endurance");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        this.validateData(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        this.validateData(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        this.validateData(shooting, "Shooting");
        this.shooting = shooting;
    }

    private void validateData(int data, String type) {
        if (data < 0 || data > 100) {
            throw new CustomException(String.format(EXCEPTION_MESSAGE, type));
        }
    }

    public double getSkill() {
        return (this.dribble + this.endurance + this.passing + this.shooting + this.sprint) / 5.0;
    }
}

