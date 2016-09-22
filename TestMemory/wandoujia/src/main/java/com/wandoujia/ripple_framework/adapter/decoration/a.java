package com.wandoujia.ripple_framework.adapter.decoration;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.app.b;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ax;
import android.support.v7.widget.ce;
import android.support.v7.widget.cm;
import android.view.View;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.i;

public class a extends BaseItemDecoration
{
  private static final int a = i.k().g().getResources().getDimensionPixelOffset(R.dimen.box_provider_margin);
  private static final int b = (int)b.c(i.k().g(), 4.0F);
  private static final int c = (int)b.c(i.k().g(), 16.0F);
  private static final int d = (int)b.c(i.k().g(), 10.0F);
  private static final int e = (2 * d - c) / 3;
  private static final int f = (d + c) / 3;

  public a()
  {
    this(0);
  }

  private a(byte paramByte)
  {
  }

  private static boolean a(int paramInt)
  {
    return (paramInt == TemplateTypeEnum.TemplateType.TEXT_GRANDE.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.TEXT_VENTI.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.SHORT_TEXT_GRANDE.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.SHORT_TEXT_VENTI.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.APP_WITH_FEEDS.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.APP_ATTACH.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.VIDEO_ATTACH.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.FEED_TYPE_TEXT.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.SINGLE_TEXT.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.FEED_IMAGE_PROVIDER.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.FEED_VIDEO_PROVIDER.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.BOX_VIDEO.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.SECTION_PORTRAIT_HEADER_BOTTOM.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.PIC_BOX.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.TEXT_BOX.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.VIDEO_ATTACH_BOX.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.APP_ATTACH_BOX.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.LIST_LANDSCAPE.ordinal());
  }

  private static boolean b(int paramInt)
  {
    return (paramInt == TemplateTypeEnum.TemplateType.FEED_PROVIDER.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.FEED_CHANNEL.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.FEED_TYPE_IMAGE.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.FEED_TYPE_VIDEO.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.SECTION_TITLE.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.DIVIDER.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.FAVORITE_CATEGORY.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.CATEGORY.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.IMMUTABLE_CATEGORY.ordinal()) || (paramInt == TemplateTypeEnum.TemplateType.CREATE_CATEGORY.ordinal());
  }

  protected final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, cm paramcm, int paramInt1, int paramInt2)
  {
    if (paramInt1 == TemplateTypeEnum.TemplateType.TAB.ordinal())
    {
      ce localce = paramRecyclerView.getLayoutManager();
      int i;
      int j;
      int m;
      int k;
      if ((localce instanceof GridLayoutManager))
      {
        GridLayoutManager localGridLayoutManager = (GridLayoutManager)localce;
        i = localGridLayoutManager.c();
        j = localGridLayoutManager.b().a(paramInt2, i);
        if (j != 0)
          break label81;
        m = c;
        k = e;
      }
      while (true)
      {
        paramRect.set(m, 0, k, d);
        return;
        label81: if (j == i - 1)
        {
          m = e;
          k = c;
          continue;
        }
        k = f;
        m = k;
      }
    }
    super.a(paramRect, paramView, paramRecyclerView, paramcm, paramInt1, paramInt2);
  }

  protected boolean a(int paramInt1, int paramInt2)
  {
    if ((a(paramInt1)) || (b(paramInt1)))
      return true;
    return super.a(paramInt1, paramInt2);
  }

  protected BaseItemDecoration.Direction b(int paramInt1, int paramInt2)
  {
    if (b(paramInt1))
      return BaseItemDecoration.Direction.TOP;
    return super.b(paramInt1, paramInt2);
  }

  protected Drawable c(int paramInt1, int paramInt2)
  {
    if (a(paramInt1))
      return b.o(R.color.grey_80);
    if (b(paramInt1))
      return b.o(R.color.list_background);
    return super.c(paramInt1, paramInt2);
  }

  protected int d(int paramInt1, int paramInt2)
  {
    if (a(paramInt1))
      return 1;
    if (paramInt1 == TemplateTypeEnum.TemplateType.FEED_TYPE_IMAGE.ordinal())
      return 0 + b;
    if (b(paramInt1))
      return 0 + a;
    return 0 + super.d(paramInt1, paramInt2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.adapter.decoration.a
 * JD-Core Version:    0.6.0
 */