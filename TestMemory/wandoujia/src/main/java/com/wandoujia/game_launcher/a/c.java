package com.wandoujia.game_launcher.a;

import android.support.v7.widget.co;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.game_launcher.lib.R.drawable;
import com.wandoujia.game_launcher.lib.R.id;
import com.wandoujia.game_launcher.lib.R.layout;
import com.wandoujia.game_launcher.models.ParagraphContent;
import com.wandoujia.game_launcher.models.ParagraphContent.TextStyle;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.launcher.e.h;
import com.wandoujia.launcher.launcher.models.ImageModel;
import java.util.List;

public final class c extends co
{
  private TextView i;
  private RelativeLayout j;
  private TextView k;
  private TextView l;
  private AsyncImageView m;
  private View n;
  private AsyncImageView o;
  private AsyncImageView p;

  public c(a parama, View paramView)
  {
    super(paramView);
    this.i = ((TextView)paramView.findViewById(R.id.story_text));
    this.n = paramView.findViewById(R.id.image_container);
    this.o = ((AsyncImageView)paramView.findViewById(R.id.image_first));
    this.p = ((AsyncImageView)paramView.findViewById(R.id.image_second));
    this.j = ((RelativeLayout)paramView.findViewById(R.id.quote_content));
    this.k = ((TextView)paramView.findViewById(R.id.quote_text));
    this.l = ((TextView)paramView.findViewById(R.id.quote_author_name));
    this.m = ((AsyncImageView)paramView.findViewById(R.id.quote_author_avatar));
  }

  private static void a(TextView paramTextView, ParagraphContent.TextStyle paramTextStyle)
  {
    if ((paramTextView != null) && (paramTextStyle != null))
    {
      if ((paramTextStyle != ParagraphContent.TextStyle.SUBTITLE) && (paramTextStyle != ParagraphContent.TextStyle.TITLE))
        break label66;
      paramTextView.getPaint().setFakeBoldText(true);
    }
    while (true)
    {
      paramTextView.setTextSize(0, paramTextStyle.size);
      paramTextView.setTextColor(paramTextStyle.color);
      paramTextView.setGravity(paramTextStyle.gravity);
      paramTextView.setLineSpacing(0.0F, paramTextStyle.lineHeight);
      return;
      label66: paramTextView.getPaint().setFakeBoldText(false);
    }
  }

  public final void a(ParagraphContent paramParagraphContent)
  {
    if ((paramParagraphContent != null) && (!TextUtils.isEmpty(paramParagraphContent.getText())))
    {
      this.i.setVisibility(0);
      this.i.setText(paramParagraphContent.getText());
      a(this.i, paramParagraphContent.getTextStyle());
    }
  }

  public final void b(ParagraphContent paramParagraphContent)
  {
    if ((paramParagraphContent != null) && (!TextUtils.isEmpty(paramParagraphContent.getText())))
    {
      this.j.setVisibility(0);
      this.j.setId(R.id.quote_area);
      this.k.setId(R.id.quote_text_title);
      this.k.setText(paramParagraphContent.getText());
      a(this.k, ParagraphContent.TextStyle.QUOTE);
      if (!TextUtils.isEmpty(paramParagraphContent.getAuthor()))
      {
        this.l.setVisibility(0);
        this.m.setVisibility(0);
        this.l.setText(paramParagraphContent.getAuthor());
        this.m.a(paramParagraphContent.getIcon(), R.drawable.bg_avatar_default);
        a(this.l, ParagraphContent.TextStyle.AUTHOR);
      }
      if (this.j.getChildCount() == 3)
      {
        LinearLayout localLinearLayout = (LinearLayout)h.a(this.j, R.layout.game_launcher_divider);
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localLinearLayout.getLayoutParams();
        localLayoutParams.addRule(3, R.id.quote_text_title);
        localLinearLayout.setLayoutParams(localLayoutParams);
        this.j.addView(localLinearLayout);
      }
    }
  }

  public final void c(ParagraphContent paramParagraphContent)
  {
    List localList;
    FrameLayout.LayoutParams localLayoutParams1;
    FrameLayout.LayoutParams localLayoutParams2;
    ImageModel localImageModel2;
    if ((paramParagraphContent != null) && (a.a(this.q) != null))
    {
      localList = paramParagraphContent.getImages();
      if (CollectionUtils.isEmpty(localList))
        break label296;
      localLayoutParams1 = (FrameLayout.LayoutParams)this.o.getLayoutParams();
      localLayoutParams2 = (FrameLayout.LayoutParams)this.p.getLayoutParams();
      if (localList != null)
      {
        localImageModel2 = (ImageModel)localList.get(0);
        if ((localImageModel2 == null) || (localImageModel2.getWidth() == 0) || (localImageModel2.getHeight() == 0))
          break label306;
      }
    }
    label272: label296: label306: for (int i1 = a.e() * localImageModel2.getHeight() / localImageModel2.getWidth(); ; i1 = 0)
    {
      if ((i1 != 0) && (localLayoutParams1 != null) && (localLayoutParams2 != null))
      {
        if (localList.size() <= 1)
          break label272;
        int i2 = -2 + a.e() / 2;
        localLayoutParams2.width = i2;
        localLayoutParams1.width = i2;
        int i3 = i1 / 2;
        localLayoutParams2.height = i3;
        localLayoutParams1.height = i3;
        this.o.setLayoutParams(localLayoutParams1);
        this.p.setLayoutParams(localLayoutParams2);
      }
      while (true)
      {
        ImageModel localImageModel1 = (ImageModel)localList.get(0);
        this.n.setVisibility(0);
        this.o.a(localImageModel1.getUrl(), R.drawable.bg_image_loading);
        this.p.setVisibility(8);
        if (localList.size() > 1)
        {
          this.p.setVisibility(0);
          this.p.a(((ImageModel)localList.get(1)).getUrl(), R.drawable.bg_image_loading);
        }
        return;
        localLayoutParams1.width = a.e();
        localLayoutParams1.height = i1;
        this.o.setLayoutParams(localLayoutParams1);
      }
      this.n.setVisibility(8);
      return;
    }
  }

  public final void t()
  {
    this.i.setVisibility(8);
    this.j.setVisibility(8);
    this.n.setVisibility(8);
    this.m.setVisibility(8);
    this.l.setVisibility(8);
  }

  public final void u()
  {
    this.i.setVisibility(8);
    this.i.setText("");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.a.c
 * JD-Core Version:    0.6.0
 */