package mohit.com.sampleapplicationdatamodel;

import android.arch.lifecycle.ViewModel;

public class MainActivityDataModel extends ViewModel {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    public int getScoreTeamA() {
        return scoreTeamA;
    }

    public void setScoreTeamA(int scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    public int getScoreTeamB() {
        return scoreTeamB;
    }

    public void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }
}
