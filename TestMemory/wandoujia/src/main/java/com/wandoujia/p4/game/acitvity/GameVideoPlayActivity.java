package com.wandoujia.p4.game.acitvity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import android.view.Window;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.game.fragment.GameVideoPlayerFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GameVideoPlayActivity extends BaseActivity
{
  private String a;
  private String b;
  private String c;
  private GameVideoPlayerFragment d;

  public static String a(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = "";
    try
    {
      String str = URLEncoder.encode(paramString1, "utf-8");
      localObject = str;
      label14: return String.format("wdj://play/game/video?url=%1$s&title=%2$s&pn=%3$s", new Object[] { localObject, paramString2, paramString3 });
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label14;
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    int i = 1;
    super.onCreate(paramBundle);
    getWindow().addFlags(128);
    setVolumeControlStream(3);
    Intent localIntent = getIntent();
    Uri localUri;
    if (localIntent != null)
    {
      localUri = localIntent.getData();
      if (localUri == null)
        break label292;
      this.a = localUri.getQueryParameter("url");
      if (TextUtils.isEmpty(this.a));
    }
    try
    {
      this.a = URLDecoder.decode(this.a, "utf-8");
      label76: this.b = localUri.getQueryParameter("title");
      this.c = localUri.getQueryParameter("pn");
      boolean bool;
      if (SystemUtil.aboveApiLevel(11))
      {
        bool = localUri.getBooleanQueryParameter("portrait", false);
        if (!bool)
          break label334;
      }
      while (true)
      {
        setRequestedOrientation(i);
        if (TextUtils.isEmpty(this.a))
          this.a = localIntent.getStringExtra("page_api_url");
        getWindow().setFlags(1024, 1024);
        if (TextUtils.isEmpty(this.a))
          break label339;
        this.d = GameVideoPlayerFragment.a(this.a, this.b, this.c);
        getSupportFragmentManager().a().a(16908290, this.d, "play").b();
        i.k().h().a(this, "wdj://games/" + this.c + "/videos/" + this.b).a(this);
        return;
        String str = localUri.getQueryParameter("portrait");
        if (str == null)
        {
          bool = false;
          break;
        }
        bool = Boolean.valueOf(str.toLowerCase()).booleanValue();
        break;
        label292: this.a = localIntent.getStringExtra("phoenix.intent.extra.URL");
        this.b = localIntent.getStringExtra("phoenix.intent.extra.TITLE");
        this.c = localIntent.getStringExtra("phoenix.intent.extra.PACKAGE_NAME");
        bool = localIntent.getBooleanExtra("phoenix.intent.extra.IS_PORTRAIT", i);
        break;
        label334: int j = 0;
      }
      label339: p.a(getApplicationContext(), 2131625265, p.b).a();
      finish();
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label76;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.game.acitvity.GameVideoPlayActivity
 * JD-Core Version:    0.6.0
 */