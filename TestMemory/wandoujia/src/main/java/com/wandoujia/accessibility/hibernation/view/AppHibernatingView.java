package com.wandoujia.accessibility.hibernation.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.app.d;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.toolkit.ak;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.accessibility.R.array;
import com.wandoujia.ripple_framework.accessibility.R.id;
import com.wandoujia.ripple_framework.accessibility.R.layout;
import com.wandoujia.ripple_framework.accessibility.R.string;
import java.util.HashMap;
import java.util.Map;

public class AppHibernatingView extends RelativeLayout
{
  private View a;
  private View b;
  private AppIconsView c;
  private TextView d;
  private TextView e;
  private ProgressBar f;
  private TextView g;
  private Button h;
  private Button i;
  private TextView j;
  private TextView k;
  private View l;
  private int m;
  private int n;
  private g o;
  private String[] p;
  private String q;
  private Map<String, Boolean> r;
  private Map<String, Long> s;
  private long t;

  public AppHibernatingView(Context paramContext)
  {
    super(paramContext);
  }

  public AppHibernatingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static AppHibernatingView a(Context paramContext)
  {
    return (AppHibernatingView)d.a(paramContext, R.layout.view_app_hibernating);
  }

  private void a()
  {
    this.f.setProgress(this.n);
    TextView localTextView1 = this.g;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(this.n);
    arrayOfObject1[1] = Integer.valueOf(this.m);
    localTextView1.setText(String.format("%d/%d", arrayOfObject1));
    if (this.n == this.m)
    {
      this.a.setVisibility(8);
      this.b.setVisibility(0);
      TextView localTextView3 = this.j;
      Context localContext = getContext();
      int i2 = R.string.hibernating_result;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(this.m);
      arrayOfObject2[1] = TextUtil.formatSizeInfo(this.t);
      localTextView3.setText(localContext.getString(i2, arrayOfObject2));
      this.l.setVisibility(8);
      v.b().a(this, new ak("apps/app_launcher/superboost/result")).a(this);
    }
    TextView localTextView2;
    if (this.r.containsKey(this.q))
    {
      localTextView2 = this.e;
      if (!((Boolean)this.r.get(this.q)).booleanValue())
        break label223;
    }
    label223: for (int i1 = R.string.hibernating_success; ; i1 = R.string.hibernating_failed)
    {
      localTextView2.setText(i1);
      return;
    }
  }

  private Drawable b(String paramString)
  {
    try
    {
      Drawable localDrawable = getContext().getPackageManager().getApplicationIcon(paramString);
      return localDrawable;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return null;
  }

  private String c(String paramString)
  {
    try
    {
      ApplicationInfo localApplicationInfo2 = getContext().getPackageManager().getApplicationInfo(paramString, 0);
      localApplicationInfo1 = localApplicationInfo2;
      return String.valueOf(getContext().getPackageManager().getApplicationLabel(localApplicationInfo1));
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        ApplicationInfo localApplicationInfo1 = null;
    }
  }

  public final void a(Context paramContext, Map<String, Long> paramMap, g paramg)
  {
    if ((SystemUtil.aboveApiLevel(18)) && (!"R7007".equals(Build.MODEL)));
    for (boolean bool = true; ; bool = false)
    {
      d.a(paramContext, this, true, bool, false, true, -1, -1);
      this.s = paramMap;
      this.n = 0;
      this.o = paramg;
      this.m = paramMap.size();
      this.t = 0L;
      this.f.setMax(this.m);
      this.f.setProgress(this.n);
      TextView localTextView = this.g;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(this.n);
      arrayOfObject[1] = Integer.valueOf(this.m);
      localTextView.setText(String.format("%d/%d", arrayOfObject));
      return;
    }
  }

  public final void a(String paramString)
  {
    Drawable localDrawable = b(paramString);
    this.c.a(localDrawable, new n(this, paramString));
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    this.n = (1 + this.n);
    this.r.put(paramString, Boolean.valueOf(paramBoolean));
    if ((paramBoolean) && (this.s.containsKey(paramString)))
      this.t += ((Long)this.s.get(paramString)).longValue();
    a();
    v localv = v.b();
    TaskEvent.Builder localBuilder1 = new TaskEvent.Builder().action(TaskEvent.Action.HIBERNATION).status(TaskEvent.Status.END);
    TaskEvent.Result localResult;
    TaskEvent.Builder localBuilder2;
    ExtraPackage.Builder localBuilder;
    ContentPackage.Builder localBuilder3;
    if (paramBoolean)
    {
      localResult = TaskEvent.Result.SUCCESS;
      localBuilder2 = localBuilder1.result(localResult);
      localBuilder = new ExtraPackage.Builder();
      localBuilder3 = new ContentPackage.Builder().identity("Hibernation").title(paramString);
      if (!this.s.containsKey(paramString))
        break label202;
    }
    label202: for (String str = String.valueOf(this.s.get(paramString)); ; str = "0")
    {
      localv.a(localBuilder2, localBuilder.content_package(localBuilder3.sub_type(str).build()));
      return;
      localResult = TaskEvent.Result.FAIL;
      break;
    }
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((AppIconsView)findViewById(R.id.app_icons));
    this.d = ((TextView)findViewById(R.id.hibernate_title));
    this.e = ((TextView)findViewById(R.id.hibernate_status));
    this.f = ((ProgressBar)findViewById(R.id.hibernate_progress));
    this.g = ((TextView)findViewById(R.id.hibernate_count));
    this.h = ((Button)findViewById(R.id.hibernate_cancel));
    this.k = ((TextView)findViewById(R.id.hibernate_tips));
    this.l = findViewById(R.id.hibernate_tips_container);
    this.i = ((Button)findViewById(R.id.hibernate_finish_button));
    this.a = findViewById(R.id.hibernating_container);
    this.b = findViewById(R.id.hibernate_finish_container);
    this.j = ((TextView)findViewById(R.id.hibernate_finish_title));
    this.b.setVisibility(8);
    this.h.setOnClickListener(new e(this));
    this.i.setOnClickListener(new f(this));
    this.p = getResources().getStringArray(R.array.hibernating_app_tips);
    this.r = new HashMap();
    v.b().a(this, new ak("apps/app_launcher/superboost/inprogress")).a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.AppHibernatingView
 * JD-Core Version:    0.6.0
 */