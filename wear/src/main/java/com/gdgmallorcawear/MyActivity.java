package com.gdgmallorcawear;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.TimeZone;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        TextClock clockNewYork = (TextClock) findViewById(R.id.textClockNewYork);
        TextClock clockShanghai = (TextClock) findViewById(R.id.textClockShanghai);
        clockNewYork.setTimeZone("America/New_York");
        clockShanghai.setTimeZone("Asia/Shanghai");
    }
}
