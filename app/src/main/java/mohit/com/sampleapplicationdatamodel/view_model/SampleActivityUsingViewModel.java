package mohit.com.sampleapplicationdatamodel.view_model;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import mohit.com.sampleapplicationdatamodel.R;

public class SampleActivityUsingViewModel extends AppCompatActivity {

    //View
    private TextView scoreViewOne, scoreViewTwo;

    // ViewModel Object
    ViewModelDataModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_with_view_model);
        mViewModel = ViewModelProviders.of(this).get(ViewModelDataModel.class);
        scoreViewOne = findViewById(R.id.team_a_score);
        scoreViewTwo = findViewById(R.id.team_b_score);
        displayForTeamA();
        displayForTeamB();
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        mViewModel.setScoreTeamA(mViewModel.getScoreTeamA() + 1);
        displayForTeamA();
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        mViewModel.setScoreTeamA(mViewModel.getScoreTeamA() + 2);
        displayForTeamA();
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        mViewModel.setScoreTeamA(mViewModel.getScoreTeamA() + 3);
        displayForTeamA();
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        mViewModel.setScoreTeamB(mViewModel.getScoreTeamB() + 1);
        displayForTeamB();
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        mViewModel.setScoreTeamB(mViewModel.getScoreTeamB() + 2);
        displayForTeamB();
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        mViewModel.setScoreTeamB(mViewModel.getScoreTeamB() + 3);
        displayForTeamB();
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        mViewModel.setScoreTeamA(0);
        mViewModel.setScoreTeamB(0);
        displayForTeamA();
        displayForTeamB();
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        scoreViewOne.setText(String.valueOf(mViewModel.getScoreTeamA()));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB() {
        scoreViewTwo.setText(String.valueOf(mViewModel.getScoreTeamB()));
    }
}

