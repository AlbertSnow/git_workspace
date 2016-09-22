package com.tencent.connect.avatar;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.widget.Button;
import android.widget.ProgressBar;
import com.tencent.connect.b.c;
import com.tencent.tauth.b;
import org.json.JSONException;
import org.json.JSONObject;

final class h
  implements b
{
  h(ImageActivity paramImageActivity)
  {
  }

  public final void a(com.tencent.tauth.d paramd)
  {
    ImageActivity.e(this.a).setEnabled(true);
    ImageActivity.e(this.a).setTextColor(-1);
    ImageActivity.f(this.a).setEnabled(true);
    ImageActivity.f(this.a).setTextColor(-1);
    ImageActivity.f(this.a).setText("重试");
    ImageActivity.d(this.a).setVisibility(8);
    ImageActivity.k(this.a);
    ImageActivity.b(this.a, paramd.b, 1);
    this.a.a("10660", 0L);
  }

  public final void a(Object paramObject)
  {
    int i = -1;
    ImageActivity.e(this.a).setEnabled(true);
    ImageActivity.e(this.a).setTextColor(i);
    ImageActivity.f(this.a).setEnabled(true);
    ImageActivity.f(this.a).setTextColor(i);
    ImageActivity.d(this.a).setVisibility(8);
    JSONObject localJSONObject = (JSONObject)paramObject;
    try
    {
      int j = localJSONObject.getInt("ret");
      i = j;
      label74: if (i == 0)
      {
        ImageActivity.b(this.a, "设置成功", 0);
        this.a.a("10658", 0L);
        com.tencent.open.b.d.a();
        com.tencent.open.b.d.a(ImageActivity.l(this.a).d(), ImageActivity.l(this.a).b(), "ANDROIDSDK.SETAVATAR.SUCCEED", "12", "3", "0");
        ImageActivity localImageActivity = this.a;
        if ((ImageActivity.m(this.a) != null) && (!"".equals(ImageActivity.m(this.a))))
        {
          Intent localIntent = new Intent();
          localIntent.setClassName(localImageActivity, ImageActivity.m(this.a));
          if (localImageActivity.getPackageManager().resolveActivity(localIntent, 0) != null)
            localImageActivity.startActivity(localIntent);
        }
        ImageActivity.b(this.a, localJSONObject.toString());
        ImageActivity.j(this.a);
        return;
      }
      ImageActivity.b(this.a, "设置出错了，请重新登录再尝试下呢：）", 1);
      com.tencent.open.b.d.a();
      com.tencent.open.b.d.a(ImageActivity.l(this.a).d(), ImageActivity.l(this.a).b(), "ANDROIDSDK.SETAVATAR.SUCCEED", "12", "19", "1");
      return;
    }
    catch (JSONException localJSONException)
    {
      break label74;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.avatar.h
 * JD-Core Version:    0.6.0
 */