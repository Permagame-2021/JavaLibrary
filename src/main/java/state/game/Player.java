package state.game;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Player {
    private String name;
    private double score;
    private double contributionRatio;
    private double scoreIncrease;
    private double bestScoreIncrease;
    private String agency;

    @JsonCreator
    public Player(@JsonProperty("name") String name, @JsonProperty("score")double score, @JsonProperty("contributionRatio")double contributionRatio, @JsonProperty("scoreIncrease")double scoreIncrease, @JsonProperty("bestScoreIncrease")double bestScoreIncrease, @JsonProperty("agency")String agency) {
        this.name = name;
        this.score = score;
        this.contributionRatio = contributionRatio;
        this.scoreIncrease = scoreIncrease;
        this.bestScoreIncrease = bestScoreIncrease;
        this.agency = agency;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public double getContributionRatio() {
        return contributionRatio;
    }

    public double getScoreIncrease() {
        return scoreIncrease;
    }

    public double getBestScoreIncrease() {
        return bestScoreIncrease;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", contributionRatio=" + contributionRatio +
                ", scoreIncrease=" + scoreIncrease +
                ", bestScoreIncrease=" + bestScoreIncrease +
                ", agency='" + agency + '\'' +
                '}';
    }
}
