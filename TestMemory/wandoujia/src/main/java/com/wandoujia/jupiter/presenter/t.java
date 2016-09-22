package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.CommentJson;
import com.wandoujia.api.proto.CommentSummary;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.EnjoySummary;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.p4.views.CircleAsyncImageView;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;
import java.util.List;

public final class t extends c
{
  private static final e a = new e();

  private static float a(int paramInt)
  {
    return paramInt / (100.0F + paramInt);
  }

  private static int a(float paramFloat)
  {
    int i = (int)(1000.0F * paramFloat);
    if (i <= 0)
      i = 1;
    return i;
  }

  public static void a(Context paramContext, a parama, int paramInt1, int paramInt2)
  {
    int i = (int)(100.0F * paramInt1 / (paramInt1 + paramInt2));
    ((TextView)parama.a(2131492998).a()).setText(String.valueOf(i));
    TextView localTextView1 = (TextView)parama.a(2131493629).a();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    localTextView1.setText(paramContext.getString(2131624251, arrayOfObject1));
    TextView localTextView2 = (TextView)parama.a(2131493631).a();
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(paramInt2);
    localTextView2.setText(paramContext.getString(2131624249, arrayOfObject2));
    float f2;
    float f1;
    if (paramInt1 >= paramInt2)
    {
      f2 = a(paramInt1);
      f1 = 1.0F * (f2 * paramInt2) / paramInt1;
      ((ProgressBar)parama.a(2131493628).a()).setProgressDrawable(paramContext.getResources().getDrawable(2130837999));
    }
    while (true)
    {
      ((ProgressBar)parama.a(2131493628).a()).setProgress(a(f2));
      ((ProgressBar)parama.a(2131493630).a()).setProgress(a(f1));
      return;
      f1 = a(paramInt2);
      f2 = 1.0F * (f1 * paramInt1) / paramInt2;
      ((ProgressBar)parama.a(2131493628).a()).setProgressDrawable(paramContext.getResources().getDrawable(2130838000));
    }
  }

  protected final void a(Model paramModel)
  {
    CommentSummary localCommentSummary = paramModel.b().detail.app_comment;
    AppDetail localAppDetail = paramModel.b().detail.app_detail;
    EnjoySummary localEnjoySummary = localCommentSummary.enjoySummary;
    int j;
    int i;
    View localView3;
    if (localEnjoySummary == null)
    {
      j = 0;
      i = 0;
      if (i + j > 10)
        break label267;
      localView3 = h().a(2131493632).a();
      localView3.setVisibility(0);
      h().a(2131493625).a().setVisibility(8);
      if (localCommentSummary.count.intValue() > 0)
        break label249;
      ((TextView)localView3.findViewById(2131493633)).setText(2131625193);
      label111: h().a(2131493620).a().setOnClickListener(new u(localAppDetail));
      h().a(2131493621).a().setOnClickListener(new v(localAppDetail));
      h().a(2131493022).a().setOnClickListener(new w(localAppDetail));
      if (!CollectionUtils.isEmpty(localCommentSummary.comment))
        break label318;
      ((ViewGroup)h().a(2131493618).a()).removeAllViews();
      h().a(2131493619).a().setVisibility(8);
    }
    label249: 
    do
    {
      return;
      i = localEnjoySummary.likeCount.intValue();
      j = localEnjoySummary.dislikeCount.intValue();
      break;
      ((TextView)localView3.findViewById(2131493633)).setText(2131624358);
      break label111;
      h().a(2131493632).a().setVisibility(8);
      h().a(2131493625).a().setVisibility(0);
      a(f(), h(), i, j);
      break label111;
    }
    while (h().a(2131493618).g() == localCommentSummary.comment);
    label267: label318: int k = 0;
    while ((k < 3) && (k < localCommentSummary.comment.size()))
    {
      Context localContext = f();
      CommentJson localCommentJson = (CommentJson)localCommentSummary.comment.get(k);
      View localView2 = d.a(localContext, 2130903280);
      e.a((CircleAsyncImageView)localView2.findViewById(2131493622), localCommentJson.avatar);
      ((TextView)localView2.findViewById(2131492875)).setText(localCommentJson.authorName);
      ((TextView)localView2.findViewById(2131493623)).setText(localCommentJson.date);
      ((TextView)localView2.findViewById(2131492888)).setText(localCommentJson.content);
      if (localCommentJson.enjoy == null)
      {
        localView2.findViewById(2131493624).setVisibility(4);
        ((ViewGroup)h().a(2131493618).a()).addView(localView2);
        localView2.setOnClickListener(new x(localAppDetail));
        k++;
        continue;
      }
      ImageView localImageView = (ImageView)localView2.findViewById(2131493624);
      if (localCommentJson.enjoy.booleanValue());
      for (int n = 2130838262; ; n = 2130838152)
      {
        localImageView.setImageResource(n);
        break;
      }
    }
    View localView1 = h().a(2131493619).a();
    if (localCommentSummary.count.intValue() > 3);
    for (int m = 0; ; m = 8)
    {
      localView1.setVisibility(m);
      h().a(2131493618).a().setTag(2131492933, localCommentSummary.comment);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.t
 * JD-Core Version:    0.6.0
 */