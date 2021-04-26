package com.zx.databindingdemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.zx.databindingdemo.R;
import com.zx.databindingdemo.bean.UserBean;
import com.zx.databindingdemo.databinding.ActivityBasicBinding;
import com.zx.databindingdemo.handler.OnClickHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BasicActivity extends AppCompatActivity implements View.OnClickListener{

    //用户头像
    private static final String URL_USER_PIC = "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fdiy.qqjay.com%2Fu%2Ffiles%2F2012%2F0830%2Ff371c9f21d87bcad0f687f932133a508.jpg&refer=http%3A%2F%2Fdiy.qqjay.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621995393&t=69c66d0c982e950179ed7d99ab7d3529";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBasicBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_basic);


        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        binding.setList(list);

        HashMap<String, Object> map = new HashMap<>();
        map.put("key0", "map_value0");
        map.put("key1", "map_value1");
        binding.setMap(map);

        String[] arrays = {"字符串1", "字符串2"};
        binding.setArray(arrays);

        binding.titleTv.setText("我是标题");

        UserBean userBean = new UserBean(URL_USER_PIC, "张三", 24);
        binding.setUser(userBean);

        com.zx.databindingdemo.bean.user.UserBean userBean2 = new com.zx.databindingdemo.bean.user.UserBean("我是user2");
        binding.setUser2(userBean2);

        binding.setOnClickListener(this);
        binding.setHandler(new OnClickHandler());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.click_btn) {
            Toast.makeText(this, "点击了1", Toast.LENGTH_SHORT).show();
        }
//        else if (v.getId() == R.id.click2_btn) {
//            Toast.makeText(this, "点击了2", Toast.LENGTH_SHORT).show();
//        }
    }
}
