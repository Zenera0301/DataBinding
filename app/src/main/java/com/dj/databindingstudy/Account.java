package com.dj.databindingstudy;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Account extends BaseObservable {
    public String name;

    public String getName() {
        return name;
    }

    @Bindable
    public int getCount() {
        return count;
    }

    public int count;

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
        notifyPropertyChanged(BR.count);
    }
}
