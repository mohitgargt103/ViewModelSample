package mohit.com.sampleapplicationdatamodel.binding_view_model;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class BindingDataModel extends ViewModel {


    public MutableLiveData<Integer> scoreTeamA;
    public MutableLiveData<Integer> scoreTeamB;


    public BindingDataModel() {

    }

    public MutableLiveData<Integer> getScoreTeamA() {
        if (scoreTeamA == null) {
            scoreTeamA = new MutableLiveData<>();
            scoreTeamA.setValue(0);
        }
        return scoreTeamA;
    }

    public MutableLiveData<Integer> getScoreTeamB() {
        if (scoreTeamB == null) {
            scoreTeamB = new MutableLiveData<>();
            scoreTeamB.setValue(0);
        }
        return scoreTeamB;
    }


    public void setScoreTeamA(int score) {
        scoreTeamA.setValue(scoreTeamA.getValue() + score);

    }

    public void setScoreTeamB(int score) {
        scoreTeamB.setValue(scoreTeamB.getValue() + score);
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA() {
        setScoreTeamA(1);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA() {
        setScoreTeamA(2);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA() {
        setScoreTeamA(3);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB() {
        setScoreTeamB(1);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB() {
        setScoreTeamB(2);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB() {
        setScoreTeamB(3);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore() {
        scoreTeamA.setValue(0);
        scoreTeamB.setValue(0);
    }

}
