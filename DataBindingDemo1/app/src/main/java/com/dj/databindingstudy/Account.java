package com.dj.databindingstudy;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Account extends BaseObservable {
    public String name;
    public int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 使用Bindable注解后
    @Bindable
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        // 这里才能调用BR.count
        notifyPropertyChanged(BR.count);
    }
}
