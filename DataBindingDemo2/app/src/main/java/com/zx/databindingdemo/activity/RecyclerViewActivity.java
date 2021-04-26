package com.zx.databindingdemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.zx.databindingdemo.R;
import com.zx.databindingdemo.adapter.MultiItemAdapter;
import com.zx.databindingdemo.bean.FruitItem;
import com.zx.databindingdemo.bean.IBaseBindingAdapterItem;
import com.zx.databindingdemo.bean.TextItem;
import com.zx.databindingdemo.databinding.ActivityRecyclerViewBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private MultiItemAdapter mAdapter;
    private List<IBaseBindingAdapterItem> mList = new ArrayList<>(); // 数据源

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecyclerViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);

        initData();
        mAdapter = new MultiItemAdapter(this, mList);
        @SuppressLint("WrongConstant") LinearLayoutManager layoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL, false);
        binding.recyclerView.setLayoutManager(layoutManager);
        binding.recyclerView.setAdapter(mAdapter);
    }

    private void initData() {
        mList.add(new TextItem("标题1"));
        mList.add(new FruitItem(R.mipmap.fruit, "苹果"));
        mList.add(new FruitItem(R.mipmap.fruit, "香蕉"));
        mList.add(new TextItem("标题2"));
        mList.add(new TextItem("标题3"));
        mList.add(new FruitItem(R.mipmap.fruit, "桃子"));
        mList.add(new TextItem("标题4"));
        mList.add(new FruitItem(R.mipmap.fruit, "梨"));
        mList.add(new TextItem("标题5"));
    }
}
