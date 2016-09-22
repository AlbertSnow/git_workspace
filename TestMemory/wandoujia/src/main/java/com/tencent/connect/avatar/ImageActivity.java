package com.tencent.connect.avatar;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils.TruncateAt;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.open.utils.o;
import java.io.IOException;
import java.io.InputStream;

public class ImageActivity extends Activity
{
  RelativeLayout a;
  private com.tencent.connect.b.c b;
  private String c;
  private Handler d;
  private c e;
  private Button f;
  private Button g;
  private b h;
  private TextView i;
  private ProgressBar j;
  private int k = 0;
  private boolean l = false;
  private long m = 0L;
  private int n = 0;
  private Rect o = new Rect();
  private String p;
  private Bitmap q;
  private final View.OnClickListener r = new d(this);
  private final View.OnClickListener s = new f(this);
  private final com.tencent.tauth.b t = new h(this);
  private final com.tencent.tauth.b u = new i(this);

  private Bitmap a(String paramString)
  {
    int i1 = 1;
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = i1;
    Uri localUri = Uri.parse(paramString);
    InputStream localInputStream1 = getContentResolver().openInputStream(localUri);
    if (localInputStream1 == null)
      return null;
    try
    {
      BitmapFactory.decodeStream(localInputStream1, null, localOptions);
      localInputStream1.close();
      int i2 = localOptions.outWidth;
      int i3 = localOptions.outHeight;
      while (i2 * i3 > 4194304)
      {
        i2 /= 2;
        i3 /= 2;
        i1 *= 2;
      }
      localOptions.inJustDecodeBounds = false;
      localOptions.inSampleSize = i1;
      localInputStream2 = getContentResolver().openInputStream(localUri);
    }
    catch (OutOfMemoryError localOutOfMemoryError1)
    {
      try
      {
        InputStream localInputStream2;
        Bitmap localBitmap = BitmapFactory.decodeStream(localInputStream2, null, localOptions);
        return localBitmap;
        localOutOfMemoryError1 = localOutOfMemoryError1;
      }
      catch (OutOfMemoryError localOutOfMemoryError2)
      {
      }
    }
    return null;
  }

  private void a()
  {
    finish();
    if (this.n != 0)
      overridePendingTransition(0, this.n);
  }

  private void a(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_error_code", paramInt);
    localIntent.putExtra("key_error_msg", paramString2);
    localIntent.putExtra("key_error_detail", paramString3);
    localIntent.putExtra("key_response", paramString1);
    setResult(-1, localIntent);
  }

  private void a(String paramString, int paramInt)
  {
    this.d.post(new g(this, paramString, paramInt));
  }

  private Drawable b(String paramString)
  {
    AssetManager localAssetManager = getAssets();
    Drawable localDrawable = null;
    try
    {
      InputStream localInputStream = localAssetManager.open(paramString);
      localDrawable = Drawable.createFromStream(localInputStream, paramString);
      localInputStream.close();
      return localDrawable;
    }
    catch (IOException localIOException)
    {
    }
    return localDrawable;
  }

  private void b()
  {
    this.k = (1 + this.k);
    new com.tencent.connect.a(this.b).a(this.u);
  }

  public final void a(String paramString, long paramLong)
  {
    o.a(this, paramString, paramLong, this.b.b());
  }

  public void onBackPressed()
  {
    setResult(0);
    a();
  }

  public void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    setRequestedOrientation(1);
    ViewGroup.LayoutParams localLayoutParams1 = new ViewGroup.LayoutParams(-1, -1);
    ViewGroup.LayoutParams localLayoutParams2 = new ViewGroup.LayoutParams(-1, -1);
    ViewGroup.LayoutParams localLayoutParams3 = new ViewGroup.LayoutParams(-2, -2);
    this.a = new RelativeLayout(this);
    this.a.setLayoutParams(localLayoutParams1);
    this.a.setBackgroundColor(-16777216);
    RelativeLayout localRelativeLayout1 = new RelativeLayout(this);
    localRelativeLayout1.setLayoutParams(localLayoutParams3);
    this.a.addView(localRelativeLayout1);
    this.e = new c(this);
    this.e.setLayoutParams(localLayoutParams2);
    this.e.setScaleType(ImageView.ScaleType.MATRIX);
    localRelativeLayout1.addView(this.e);
    this.h = new b(this);
    RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(localLayoutParams2);
    localLayoutParams4.addRule(14, -1);
    localLayoutParams4.addRule(15, -1);
    this.h.setLayoutParams(localLayoutParams4);
    localRelativeLayout1.addView(this.h);
    LinearLayout localLinearLayout = new LinearLayout(this);
    RelativeLayout.LayoutParams localLayoutParams5 = new RelativeLayout.LayoutParams(-2, android.support.v4.app.b.a(this, 80.0F));
    localLayoutParams5.addRule(14, -1);
    localLinearLayout.setLayoutParams(localLayoutParams5);
    localLinearLayout.setOrientation(0);
    localLinearLayout.setGravity(17);
    this.a.addView(localLinearLayout);
    ImageView localImageView = new ImageView(this);
    localImageView.setLayoutParams(new LinearLayout.LayoutParams(android.support.v4.app.b.a(this, 24.0F), android.support.v4.app.b.a(this, 24.0F)));
    localImageView.setImageDrawable(b("com.tencent.plus.logo.png"));
    localLinearLayout.addView(localImageView);
    this.i = new TextView(this);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(localLayoutParams3);
    localLayoutParams.leftMargin = android.support.v4.app.b.a(this, 7.0F);
    this.i.setLayoutParams(localLayoutParams);
    this.i.setEllipsize(TextUtils.TruncateAt.END);
    this.i.setSingleLine();
    this.i.setTextColor(-1);
    this.i.setTextSize(24.0F);
    this.i.setVisibility(8);
    localLinearLayout.addView(this.i);
    RelativeLayout localRelativeLayout2 = new RelativeLayout(this);
    RelativeLayout.LayoutParams localLayoutParams6 = new RelativeLayout.LayoutParams(-1, android.support.v4.app.b.a(this, 60.0F));
    localLayoutParams6.addRule(12, -1);
    localLayoutParams6.addRule(9, -1);
    localRelativeLayout2.setLayoutParams(localLayoutParams6);
    localRelativeLayout2.setBackgroundDrawable(b("com.tencent.plus.bar.png"));
    int i1 = android.support.v4.app.b.a(this, 10.0F);
    localRelativeLayout2.setPadding(i1, i1, i1, 0);
    this.a.addView(localRelativeLayout2);
    l locall = new l(this, this);
    int i2 = android.support.v4.app.b.a(this, 14.0F);
    int i3 = android.support.v4.app.b.a(this, 7.0F);
    this.g = new Button(this);
    RelativeLayout.LayoutParams localLayoutParams7 = new RelativeLayout.LayoutParams(android.support.v4.app.b.a(this, 78.0F), android.support.v4.app.b.a(this, 45.0F));
    this.g.setLayoutParams(localLayoutParams7);
    this.g.setText("取消");
    this.g.setTextColor(-1);
    this.g.setTextSize(18.0F);
    this.g.setPadding(i2, i3, i2, i3);
    locall.b(this.g);
    localRelativeLayout2.addView(this.g);
    this.f = new Button(this);
    RelativeLayout.LayoutParams localLayoutParams8 = new RelativeLayout.LayoutParams(android.support.v4.app.b.a(this, 78.0F), android.support.v4.app.b.a(this, 45.0F));
    localLayoutParams8.addRule(11, -1);
    this.f.setLayoutParams(localLayoutParams8);
    this.f.setTextColor(-1);
    this.f.setTextSize(18.0F);
    this.f.setPadding(i2, i3, i2, i3);
    this.f.setText("选取");
    locall.a(this.f);
    localRelativeLayout2.addView(this.f);
    TextView localTextView = new TextView(this);
    RelativeLayout.LayoutParams localLayoutParams9 = new RelativeLayout.LayoutParams(localLayoutParams3);
    localLayoutParams9.addRule(13, -1);
    localTextView.setLayoutParams(localLayoutParams9);
    localTextView.setText("移动和缩放");
    localTextView.setPadding(0, android.support.v4.app.b.a(this, 3.0F), 0, 0);
    localTextView.setTextSize(18.0F);
    localTextView.setTextColor(-1);
    localRelativeLayout2.addView(localTextView);
    this.j = new ProgressBar(this);
    RelativeLayout.LayoutParams localLayoutParams10 = new RelativeLayout.LayoutParams(localLayoutParams3);
    localLayoutParams10.addRule(14, -1);
    localLayoutParams10.addRule(15, -1);
    this.j.setLayoutParams(localLayoutParams10);
    this.j.setVisibility(8);
    this.a.addView(this.j);
    setContentView(this.a);
    this.d = new Handler();
    Bundle localBundle = getIntent().getBundleExtra("key_params");
    this.p = localBundle.getString("picture");
    this.c = localBundle.getString("return_activity");
    String str1 = localBundle.getString("appid");
    String str2 = localBundle.getString("access_token");
    long l1 = localBundle.getLong("expires_in");
    String str3 = localBundle.getString("openid");
    this.n = localBundle.getInt("exitAnim");
    this.b = new com.tencent.connect.b.c(str1);
    this.b.a(str2, (l1 - System.currentTimeMillis()) / 1000L);
    this.b.a(str3);
    try
    {
      this.q = a(this.p);
      if (this.q == null)
        throw new IOException("cannot read picture: '" + this.p + "'!");
    }
    catch (IOException localIOException)
    {
      a("图片读取失败，请检查该图片是否有效", 1);
      a(-5, null, "图片读取失败，请检查该图片是否有效", localIOException.getMessage());
      a();
    }
    while (true)
    {
      this.f.setOnClickListener(this.r);
      this.g.setOnClickListener(this.s);
      this.a.getViewTreeObserver().addOnGlobalLayoutListener(new a(this));
      b();
      this.m = System.currentTimeMillis();
      a("10653", 0L);
      return;
      this.e.setImageBitmap(this.q);
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    this.e.setImageBitmap(null);
    if ((this.q != null) && (!this.q.isRecycled()))
      this.q.recycle();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.avatar.ImageActivity
 * JD-Core Version:    0.6.0
 */