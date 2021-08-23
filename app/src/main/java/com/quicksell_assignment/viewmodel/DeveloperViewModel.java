package com.quicksell_assignment.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.quicksell_assignment.model.DeveloperModel;
import com.quicksell_assignment.repository.Repository;

import java.util.List;


public class DeveloperViewModel extends AndroidViewModel {
    private Repository mRepository;

    public DeveloperViewModel(@NonNull Application application) {
        super(application);
        mRepository = new Repository();
    }

    public LiveData<List<DeveloperModel>> getAllDeveloper() {
        return mRepository.getMutableLiveData();
    }
}
