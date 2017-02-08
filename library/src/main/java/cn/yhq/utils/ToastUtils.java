package cn.yhq.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Yanghuiqiang on 2017/1/22.
 */

public class ToastUtils {

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void showToast(Context context, int message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
