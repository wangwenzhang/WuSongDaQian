package com.pufei.dashi.module.start.ui;


import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.pufei.dashi.MainActivity;
import com.pufei.dashi.R;
import com.pufei.dashi.base.BaseActivity;

import java.io.IOException;
import java.io.InputStream;

import butterknife.BindView;
import butterknife.OnClick;
import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.OnNeverAskAgain;
import permissions.dispatcher.OnPermissionDenied;
import permissions.dispatcher.OnShowRationale;
import permissions.dispatcher.PermissionRequest;
import permissions.dispatcher.RuntimePermissions;

/**
 * 创建者： wangwenzhang 时间： 2018/3/5.
 */
@RuntimePermissions
public class SplashActivity extends BaseActivity {


    @BindView(R.id.splash_btn)
    Button splashBtn;
    @BindView(R.id.splash_iv)
    ImageView splashIv;

    @Override
    public void initView() {

    }

    @Override
    public void getData() {

    }

    @Override
    public int getLayout() {
        return R.layout.activity_splash;
    }

    @Override
    public void initListener() {

        SplashActivityPermissionsDispatcher.onSaveImageWithCheck(this);
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        SplashActivityPermissionsDispatcher.onRequestPermissionsResult(this, requestCode, grantResults);
    }

    @NeedsPermission({Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CALL_PHONE, Manifest.permission.CAMERA})
    void onSaveImage() {
        //presenter.doSaveImage();
        Toast.makeText(SplashActivity.this, "可以啦", Toast.LENGTH_SHORT).show();
    }

    @OnShowRationale({Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CALL_PHONE, Manifest.permission.CAMERA})
    void showRationale(final PermissionRequest request) {
        new AlertDialog.Builder(this).setMessage("使用此功能需要打开存储权限").setPositiveButton("允许", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                request.proceed();
            }
        }).setNegativeButton("拒绝", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                request.cancel();
            }
        }).show();
    }

    @OnPermissionDenied({Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CALL_PHONE, Manifest.permission.CAMERA})
    void showDenied() {

    }

    @OnNeverAskAgain({Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CALL_PHONE, Manifest.permission.CAMERA})
    void showNeverAsk() {

    }

    @OnClick(R.id.splash_btn)
    public void onViewClicked() {
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
    }


}
