package com.dj.databindingstudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dj.databindingstudy.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Account mAccount;
    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mAccount = new Account();
        mAccount.setName("Jack");
        mAccount.setCount(100);
        mBinding.setAccount(mAccount);
        mBinding.setActivity(this);
    }

    public void onClick(View view){
        Toast.makeText(this, "您点击了按钮", Toast.LENGTH_SHORT).show();
        int count = mAccount.getCount();
        mAccount.setCount(count+1);
//        mBinding.setAccount(mAccount);
    }
}