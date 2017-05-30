package com.example.selectimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private SelectPicPopupWindow menuWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_select_image).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_select_image:
                //TODO implement
                selectImgs();
        }
    }
    private void selectImgs(){

        menuWindow = new SelectPicPopupWindow(MainActivity.this, itemsOnClick);
        //设置弹窗位置
        menuWindow.showAtLocation(MainActivity.this.findViewById(R.id.ll_image), Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
    }

    private View.OnClickListener itemsOnClick = new View.OnClickListener() {
        public void onClick(View v) {
            menuWindow.dismiss();
            switch (v.getId()) {
                case R.id.item_popupwindows_camera:        //点击拍照按钮

                    break;
                case R.id.item_popupwindows_Photo:       //点击从相册中选择按钮


                    break;
                default:
                    break;
            }
        }

    };
}
