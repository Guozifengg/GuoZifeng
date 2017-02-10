package lianwang2.baiw.com.lianwang2;

import android.content.DialogInterface;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import lianwang2.baiw.com.lianwang2.utils.NetWorkUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean netAvailable = NetWorkUtils.isNetAvailable(this);
        if(netAvailable){
            Toast.makeText(MainActivity.this, "联网成功", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "联网失败", Toast.LENGTH_SHORT).show();
        }

        boolean wifi = NetWorkUtils.isWifi(this);
        if(wifi){
            Toast.makeText(MainActivity.this, "wifi连接成功", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "wifi连接失败", Toast.LENGTH_SHORT).show();
            /*AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("联网提示!");
            builder.setMessage("wifi未能连接成功，请尝试重连...");
            builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            builder.show();*/
        }

        boolean mobile = NetWorkUtils.isMobile(this);
        //前者是true，后者是false;
        if(mobile){
            Toast.makeText(MainActivity.this, "移动数据连接成功", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "移动数据连接失败", Toast.LENGTH_SHORT).show();
        }
    }
}
