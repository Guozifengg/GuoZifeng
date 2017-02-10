package lianwang2.baiw.com.lianwang2.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Administrator on 2017/1/6.
 */
public class NetWorkUtils {
    public static boolean isNetAvailable(Context context){
        //获取ConnectivityManager对象
        ConnectivityManager connectivityManager= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        //获取NetworkInfo对象
        NetworkInfo info=connectivityManager.getActiveNetworkInfo();
        if(info==null){
            return false;
        }else{
            return true;
        }


    }

    public static boolean isWifi(Context context){
        ConnectivityManager connectivityManager= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info=connectivityManager.getActiveNetworkInfo();
        if(info!=null&&info.getType()==ConnectivityManager.TYPE_WIFI){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isMobile(Context context){
        ConnectivityManager connectivityManager= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info=connectivityManager.getActiveNetworkInfo();
        if(info!=null&&info.getType()==ConnectivityManager.TYPE_MOBILE){
            return true;
        }else{
            return  false;
        }
    }
}
