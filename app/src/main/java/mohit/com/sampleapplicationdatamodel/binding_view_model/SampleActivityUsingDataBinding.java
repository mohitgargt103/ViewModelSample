package mohit.com.sampleapplicationdatamodel.binding_view_model;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import mohit.com.sampleapplicationdatamodel.R;
import mohit.com.sampleapplicationdatamodel.databinding.ActivityLayoutWithDataBinding;

public class SampleActivityUsingDataBinding extends AppCompatActivity {
    // ViewModel Object
    BindingDataModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate view and obtain an instance of the binding class.
        final ActivityLayoutWithDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_layout_with_data);
        mViewModel = ViewModelProviders.of(this).get(BindingDataModel.class);
        binding.setBindingViewModel(mViewModel);
        binding.setLifecycleOwner(this);
        mViewModel.getScoreTeamA().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {
                binding.teamAScore.setText(String.valueOf(integer));
            }
        });
        mViewModel.getScoreTeamB().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {
                binding.teamBScore.setText(String.valueOf(integer));
            }
        });


    }

}

