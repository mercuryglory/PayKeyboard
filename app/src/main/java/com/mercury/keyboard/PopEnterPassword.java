package com.mercury.keyboard;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.PopupWindow;


/**
 * 创建者:    Mercury
 * 创建时间:  2016/11/13
 * 描述:      输入支付密码
 */
public class PopEnterPassword extends PopupWindow {

    private PasswordView pwdView;

    private View mContentView;


    public PopEnterPassword(final Context context) {

        super(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        mContentView = inflater.inflate(R.layout.pop_enter_password, null);

        pwdView = (PasswordView) mContentView.findViewById(R.id.pwd_view);

        // 设置PopEnterPassword的布局文件
        this.setContentView(mContentView);
        // 设置PopEnterPassword弹出窗体的宽
        this.setWidth(LayoutParams.MATCH_PARENT);
        // 设置PopEnterPassword弹出窗体的高
        this.setHeight(LayoutParams.WRAP_CONTENT);
        // 设置PopEnterPassword弹出窗体可点击
        this.setFocusable(true);
        // 设置PopEnterPassword弹出窗体动画效果
        this.setAnimationStyle(R.style.pop_add_ainm);
        // 实例化一个ColorDrawable颜色为半透明
        ColorDrawable dw = new ColorDrawable(0x66000000);
        // 设置PopEnterPassword弹出窗体的背景
        this.setBackgroundDrawable(dw);

    }

    public PasswordView getPwdView() {
        return pwdView;
    }


}
