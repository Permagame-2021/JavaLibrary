package state.game;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Player {
    private String name;
    private String group;
    private boolean priority;
    private double score;
    private double contributionRatio;
    private double scoreIncrease;
    private double bestScoreIncrease;

    @JsonCreator
    public Player(@JsonProperty("name")String name, @JsonProperty("score")double score, @JsonProperty("contributionRatio")double contributionRatio, @JsonProperty("scoreIncrease")double scoreIncrease, @JsonProperty("bestScoreIncrease")double bestScoreIncrease, @JsonProperty("group")String group, @JsonProperty("priority")boolean priority) {
        this.name = name;
        this.score = score;
        this.contributionRatio = contributionRatio;
        this.scoreIncrease = scoreIncrease;
        this.bestScoreIncrease = bestScoreIncrease;
        this.group = group;
        this.priority =priority;
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

    public String getGroup() {
        return group;
    }

    public boolean isPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", priority=" + priority +
                ", score=" + score +
                ", contributionRatio=" + contributionRatio +
                ", scoreIncrease=" + scoreIncrease +
                ", bestScoreIncrease=" + bestScoreIncrease +
                '}';
    }
}
