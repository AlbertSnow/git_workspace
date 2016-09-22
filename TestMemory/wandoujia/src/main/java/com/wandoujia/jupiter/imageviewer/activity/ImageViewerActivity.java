package com.wandoujia.jupiter.imageviewer.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.download.b;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImageViewerActivity extends BaseActivity
{
  private static final String a = b.a(ContentTypeEnum.ContentType.IMAGE);
  private ArrayList<String> b;
  private int c;
  private String d;

  public static String a(List<String> paramList, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      try
      {
        localArrayList.add(URLEncoder.encode(str, "utf-8"));
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
      }
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = TextUtils.join(",", localArrayList);
    arrayOfObject[1] = Integer.valueOf(paramInt);
    return String.format("wdj://explore/image/viewer?images=%1$s&pos=%2$d", arrayOfObject);
  }

  public static void a(Context paramContext, ArrayList<String> paramArrayList, int paramInt, String paramString)
  {
    Intent localIntent = new Intent(paramContext, ImageViewerActivity.class);
    localIntent.putStringArrayListExtra("image_paths", paramArrayList);
    localIntent.putExtra("default_position", paramInt);
    localIntent.putExtra("save_directory", paramString);
    paramContext.startActivity(localIntent);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    Uri localUri;
    String[] arrayOfString;
    int i;
    int j;
    if (localIntent != null)
    {
      localUri = localIntent.getData();
      if (localUri != null)
      {
        String str1 = localUri.getQueryParameter("images");
        if (!TextUtils.isEmpty(str1))
        {
          arrayOfString = str1.split(",");
          if (arrayOfString.length > 0)
          {
            this.b = new ArrayList();
            i = arrayOfString.length;
            j = 0;
          }
        }
      }
    }
    while (true)
    {
      String str3;
      if (j < i)
        str3 = arrayOfString[j];
      try
      {
        this.b.add(URLDecoder.decode(str3, "utf-8"));
        label105: j++;
        continue;
        String str2 = localUri.getQueryParameter("pos");
        if (!TextUtils.isEmpty(str2));
        try
        {
          this.c = Integer.valueOf(str2).intValue();
          label140: if (CollectionUtils.isEmpty(this.b))
          {
            this.b = localIntent.getStringArrayListExtra("image_paths");
            if ((this.b != null) && (!this.b.isEmpty()));
          }
          while (true)
          {
            Bundle localBundle = new Bundle();
            localBundle.putStringArrayList("image_paths", this.b);
            localBundle.putInt("default_position", this.c);
            localBundle.putString("save_directory", this.d);
            ImageViewerFragment localImageViewerFragment = new ImageViewerFragment();
            localImageViewerFragment.setArguments(localBundle);
            getSupportFragmentManager().a().b(16908290, localImageViewerFragment).a();
            i.k().h().a(this, "wdj://gallery").a(this);
            return;
            if (this.c <= 0)
              this.c = localIntent.getIntExtra("default_position", 0);
            this.d = localIntent.getStringExtra("save_directory");
            if (!TextUtils.isEmpty(this.d))
              continue;
            this.d = a;
          }
        }
        catch (NumberFormatException localNumberFormatException)
        {
          break label140;
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label105;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.imageviewer.activity.ImageViewerActivity
 * JD-Core Version:    0.6.0
 */