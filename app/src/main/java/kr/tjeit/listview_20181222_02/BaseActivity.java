package kr.tjeit.listview_20181222_02;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract void bindViews();
    public abstract void setupEvents();
    public abstract void setValues();


}
