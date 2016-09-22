package com.wandoujia.p4.imagepicker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.jupiter.j;
import com.wandoujia.p4.b.b;
import com.wandoujia.p4.b.i;
import com.wandoujia.p4.imagepicker.fragment.FolderImageFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import java.util.HashMap;

public class FolderImageActivity extends BaseActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      finish();
      return;
    }
    String str = localIntent.getStringExtra("folder_path");
    if (TextUtils.isEmpty(str))
    {
      finish();
      return;
    }
    HashMap localHashMap = j.a().j().d();
    if (localHashMap == null)
    {
      finish();
      return;
    }
    i locali = (i)localHashMap.get(str);
    if (locali == null)
    {
      finish();
      return;
    }
    FolderImageFragment localFolderImageFragment = new FolderImageFragment();
    localFolderImageFragment.a(locali);
    getSupportFragmentManager().a().b(16908290, localFolderImageFragment).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.imagepicker.activity.FolderImageActivity
 * JD-Core Version:    0.6.0
 */