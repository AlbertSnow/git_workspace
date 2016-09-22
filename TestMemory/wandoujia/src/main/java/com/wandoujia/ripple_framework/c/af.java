package com.wandoujia.ripple_framework.c;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Author;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.Tag;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.ripple_framework.util.BadgeUtil.BadgeType;
import com.wandoujia.ripple_framework.view.StatefulButton;
import com.wandoujia.ripple_framework.view.e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class af extends c
{
  private static final SimpleDateFormat a = new SimpleDateFormat("MM/dd");
  private int g;

  public af()
  {
    this(R.color.bg_image_loading);
  }

  private af(int paramInt)
  {
    this.g = paramInt;
  }

  private static String a(String paramString)
  {
    if (paramString == null)
      paramString = "";
    return paramString;
  }

  protected Object a(int paramInt, Model paramModel)
  {
    String str1;
    if ((paramInt == R.id.icon) || (paramInt == R.id.fake_icon))
    {
      str1 = a(paramModel.i());
      if (e.b)
        str1 = e.a(str1);
    }
    int i;
    do
    {
      while (true)
      {
        return str1;
        if (paramInt == R.id.title)
          return a(paramModel.n());
        if (paramInt == R.id.sub_title)
          return a(paramModel.o());
        if (paramInt == R.id.summary)
          return a(paramModel.p());
        if (paramInt == R.id.snippet)
          return a(paramModel.r());
        if (paramInt == R.id.description)
          return a(paramModel.q());
        if (paramInt == R.id.publish_date)
          return a.format(new Date(paramModel.u().longValue()));
        if (paramInt != R.id.provider_icon)
          break;
        Model localModel2 = paramModel.m();
        String str4 = null;
        if (localModel2 != null)
          str4 = localModel2.i();
        str1 = a(str4);
        if (e.b)
          return e.a(str1);
      }
      if (paramInt == R.id.provider_title)
      {
        Model localModel1 = paramModel.m();
        String str3 = null;
        if (localModel1 != null)
          str3 = localModel1.n();
        return a(str3);
      }
      if (paramInt == R.id.symbol)
        return paramModel.b().symbol;
      if (paramInt == R.id.tag)
      {
        if (CollectionUtils.isEmpty(paramModel.b().tag))
          return "";
        return ((Tag)paramModel.b().tag.get(0)).tag_name;
      }
      if (paramInt == R.id.badge)
        return BadgeUtil.a(paramModel);
      if (paramInt == R.id.action_button)
        return paramModel.b().action_positive;
      i = R.id.author_name;
      str1 = null;
    }
    while (paramInt != i);
    Author localAuthor = paramModel.s();
    String str2 = null;
    if (localAuthor != null)
      str2 = paramModel.s().name;
    return a(str2);
  }

  protected void a(ImageView paramImageView, BadgeUtil.BadgeType paramBadgeType)
  {
    if (paramBadgeType != null)
      paramImageView.setImageResource(paramBadgeType.getImageResId());
  }

  protected final void a(ImageView paramImageView, String paramString)
  {
    i.k().f();
    new e(0);
    e.a(paramImageView, paramString, this.g);
  }

  protected void a(TextView paramTextView, CharSequence paramCharSequence)
  {
    paramTextView.setText(paramCharSequence);
  }

  protected void a(Model paramModel)
  {
    Object localObject = a(e().getId(), paramModel);
    View localView2;
    if (localObject == null)
    {
      localView2 = e();
      if ((localView2 instanceof ImageView))
        ((ImageView)localView2).setImageResource(0);
    }
    do
      while (true)
      {
        return;
        if (((e() instanceof TextView)) && (!(e() instanceof StatefulButton)));
        for (int i = 1; i != 0; i = 0)
        {
          a((TextView)localView2, "");
          return;
        }
        continue;
        if (((localObject instanceof CharSequence)) && ((e() instanceof TextView)))
        {
          a((TextView)e(), (CharSequence)localObject);
          return;
        }
        if (((localObject instanceof String)) && ((e() instanceof ImageView)))
        {
          a((ImageView)e(), (String)localObject);
          return;
        }
        if (!(localObject instanceof Action))
          break;
        View localView1 = e();
        Action localAction = (Action)localObject;
        if (localView1 == null)
          continue;
        if (localAction == null)
        {
          localView1.setOnClickListener(null);
          return;
        }
        if (((localView1 instanceof TextView)) && (!TextUtils.isEmpty(localAction.text)))
          ((TextView)localView1).setText(localAction.text);
        localView1.setOnClickListener(new ag(localAction));
        return;
      }
    while (!(localObject instanceof BadgeUtil.BadgeType));
    a((ImageView)e(), (BadgeUtil.BadgeType)localObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.af
 * JD-Core Version:    0.6.0
 */