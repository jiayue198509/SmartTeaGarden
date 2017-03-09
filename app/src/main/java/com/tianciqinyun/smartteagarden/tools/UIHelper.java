package com.tianciqinyun.smartteagarden.tools;

import android.content.Context;
import android.content.Intent;

import com.tianciqinyun.smartteagarden.activity.AboutActivity;

/**
 * Created by jiaerdong on 2017/3/8.
 */
public class UIHelper {
    public static void showAboutUs(Context context){
        context.startActivity(new Intent(context, AboutActivity.class));
    }
}
