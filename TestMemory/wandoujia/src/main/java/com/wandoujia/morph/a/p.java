package com.wandoujia.morph.a;

import android.animation.AnimatorInflater;
import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.support.v4.view.bg;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.wandoujia.morph.engine.MoStyleable;
import com.wandoujia.morph.engine.MoWidgetType;
import com.wandoujia.morph.engine.a;
import com.wandoujia.morph.engine.c;
import com.wandoujia.morph.engine.i;

public class p
  implements t<View>
{
  static
  {
    p.class.getSimpleName();
  }

  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > 0)
      return paramInt1;
    if (paramInt2 > 0)
      return paramInt2;
    if (paramInt3 > 0)
      return paramInt3;
    return 0;
  }

  public static int a(String paramString)
  {
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
    case -1901805651:
    case 3178655:
    }
    while (true)
      switch (i)
      {
      default:
        return 0;
        if (!paramString.equals("invisible"))
          continue;
        i = 0;
        continue;
        if (!paramString.equals("gone"))
          continue;
        i = 1;
      case 0:
      case 1:
      }
    return 4;
    return 8;
  }

  public static void a(View paramView, i parami)
  {
    a locala = parami.a(MoStyleable.View);
    if (locala == null)
      return;
    int i = 0;
    int j = 0;
    int k = -1;
    int m = -1;
    int n = -1;
    int i1 = -1;
    int i2 = -2147483648;
    int i3 = -2147483648;
    int i4 = -1;
    int i5 = Build.VERSION.SDK_INT;
    int i6 = locala.a();
    int i7 = 0;
    label360: int i19;
    int i15;
    int i16;
    int i17;
    int i18;
    int i22;
    int i23;
    int i24;
    int i21;
    if (i7 < i6)
      switch (q.a[locala.a(i7).ordinal()])
      {
      default:
        i19 = i4;
        i15 = i2;
        i16 = n;
        i17 = k;
        i18 = i;
        i22 = i3;
        i23 = i1;
        i24 = m;
        i21 = j;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
        while (true)
        {
          label395: i7++;
          j = i21;
          m = i24;
          i1 = i23;
          i3 = i22;
          i = i18;
          k = i17;
          n = i16;
          i2 = i15;
          i4 = i19;
          break;
          if (i5 >= 21)
          {
            paramView.setBackground(locala.a(paramView.getContext(), i7));
            i19 = i4;
            i15 = i2;
            i16 = n;
            i17 = k;
            i18 = i;
            i22 = i3;
            i23 = i1;
            i24 = m;
            i21 = j;
            continue;
          }
          c localc = (c)locala.b(i7);
          if (localc != null)
          {
            if (localc.a.booleanValue())
            {
              paramView.setBackgroundResource(localc.b);
              i19 = i4;
              i15 = i2;
              i16 = n;
              i17 = k;
              i18 = i;
              i22 = i3;
              i23 = i1;
              i24 = m;
              i21 = j;
              continue;
            }
            paramView.setBackgroundColor(localc.b);
          }
          i19 = i4;
          i15 = i2;
          i16 = n;
          i17 = k;
          i18 = i;
          i22 = i3;
          i23 = i1;
          i24 = m;
          i21 = j;
          continue;
          i19 = locala.d(i7);
          i15 = i2;
          i16 = n;
          i17 = k;
          i18 = i;
          i22 = i3;
          i23 = i1;
          i24 = m;
          i21 = j;
          continue;
          int i35 = locala.d(i7);
          i18 = i;
          i22 = i3;
          i23 = i1;
          i24 = m;
          i21 = j;
          int i36 = i2;
          i16 = n;
          i17 = i35;
          i19 = i4;
          i15 = i36;
          continue;
          int i33 = locala.d(i7);
          i21 = j;
          int i34 = i3;
          i23 = i1;
          i24 = i33;
          i19 = i4;
          i15 = i2;
          i16 = n;
          i17 = k;
          i18 = i;
          i22 = i34;
          continue;
          int i31 = locala.d(i7);
          i17 = k;
          i18 = i;
          i22 = i3;
          i23 = i1;
          i24 = m;
          i21 = j;
          int i32 = i4;
          i15 = i2;
          i16 = i31;
          i19 = i32;
          continue;
          int i29 = locala.d(i7);
          i24 = m;
          i21 = j;
          int i30 = i2;
          i16 = n;
          i17 = k;
          i18 = i;
          i22 = i3;
          i23 = i29;
          i19 = i4;
          i15 = i30;
          continue;
          int i27 = locala.d(i7);
          i16 = n;
          i17 = k;
          i18 = i;
          i22 = i3;
          i23 = i1;
          i24 = m;
          i21 = j;
          int i28 = i4;
          i15 = i27;
          i19 = i28;
          continue;
          int i25 = locala.d(i7);
          i23 = i1;
          i24 = m;
          i21 = j;
          int i26 = i4;
          i15 = i2;
          i16 = n;
          i17 = k;
          i18 = i;
          i22 = i25;
          i19 = i26;
        }
      case 9:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      case 42:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 59:
      case 60:
      case 61:
      case 62:
      case 63:
      case 64:
      case 65:
      case 66:
      case 67:
      case 68:
      case 10:
      }
    for (int i12 = locala.d(i7); ; i12 = i)
    {
      int i13 = locala.d(i7);
      int i14 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i12;
      i19 = i14;
      int i20 = m;
      i21 = i13;
      i22 = i3;
      i23 = i1;
      i24 = i20;
      break label395;
      bg.c(paramView, locala.e(i7).floatValue());
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.i(paramView, locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.j(paramView, locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.a(paramView, locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.b(paramView, locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.l(paramView, locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.k(paramView, locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.d(paramView, locala.e(i7).floatValue());
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.e(paramView, locala.e(i7).floatValue());
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.f(paramView, locala.e(i7).floatValue());
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.g(paramView, locala.e(i7).floatValue());
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.h(paramView, locala.e(i7).floatValue());
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setId(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setTag(locala.f(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      if (i5 < 14)
        break label360;
      paramView.setFitsSystemWindows(locala.c(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setFocusable(locala.c(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setFocusableInTouchMode(locala.c(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setClickable(locala.c(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setLongClickable(locala.c(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setSaveEnabled(locala.c(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setDuplicateParentStateEnabled(locala.c(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setVisibility(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.e(paramView, locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setDrawingCacheQuality(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setContentDescription(locala.f(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.d(paramView, locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setSoundEffectsEnabled(locala.c(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setHapticFeedbackEnabled(locala.c(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setScrollBarStyle(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setScrollContainer(locala.c(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setKeepScreenOn(locala.c(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setFilterTouchesWhenObscured(locala.c(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      if (i5 < 11)
        break label360;
      paramView.setNextFocusForwardId(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setNextFocusRightId(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setNextFocusUpId(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setNextFocusDownId(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      if (i5 < 11)
        break label360;
      paramView.setNextFocusForwardId(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setMinimumHeight(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setMinimumWidth(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      paramView.setOverScrollMode(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      if (i5 < 11)
        break label360;
      paramView.setVerticalScrollbarPosition(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      if (i5 < 11)
        break label360;
      paramView.setLayerType(locala.d(i7), null);
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      if (i5 < 17)
        break label360;
      paramView.setTextDirection(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      if (i5 < 17)
        break label360;
      paramView.setTextAlignment(locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.c(paramView, locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.f(paramView, locala.d(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      bg.a(paramView, locala.f(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      if (i5 < 21)
        break label360;
      paramView.setNestedScrollingEnabled(locala.c(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      if (i5 < 21)
        break label360;
      paramView.setStateListAnimator(AnimatorInflater.loadStateListAnimator(paramView.getContext(), locala.d(i7)));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      if (i5 < 21)
        break label360;
      paramView.setOutlineProvider((ViewOutlineProvider)locala.b(i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      if (!(paramView instanceof FrameLayout))
        break label360;
      ((FrameLayout)paramView).setForeground(locala.a(paramView.getContext(), i7));
      i19 = i4;
      i15 = i2;
      i16 = n;
      i17 = k;
      i18 = i;
      i22 = i3;
      i23 = i1;
      i24 = m;
      i21 = j;
      break label395;
      if (!(paramView instanceof FrameLayout))
        break label360;
      ((FrameLayout)paramView).setForegroundGravity(locala.d(i7));
      break label360;
      int i8 = a(i2, k, i4);
      int i9 = a(i3, n, i4);
      int i10 = a(m, i4, 0);
      int i11 = a(i1, i4, 0);
      if ((i8 > 0) || (i9 > 0) || (i10 > 0) || (i11 > 0))
        paramView.setPadding(i8, i10, i9, i11);
      if ((i == 0) && (j == 0))
        break;
      paramView.scrollTo(i, j);
      return;
    }
  }

  public static int b(String paramString)
  {
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
    case -1711915391:
    case -1960447253:
    case -1536296328:
    }
    while (true)
      switch (i)
      {
      default:
        return 0;
        if (!paramString.equals("insideInset"))
          continue;
        i = 0;
        continue;
        if (!paramString.equals("outsideOverlay"))
          continue;
        i = 1;
        continue;
        if (!paramString.equals("outsideInset"))
          continue;
        i = 2;
      case 0:
      case 1:
      case 2:
      }
    return 16777216;
    return 33554432;
    return 50331648;
  }

  @TargetApi(17)
  public static int c(String paramString)
  {
    label48: int i;
    switch (paramString.hashCode())
    {
    default:
      i = -1;
    case 107498:
    case 113258:
    case 1946980603:
    case -1097462182:
    }
    while (true)
    {
      int j = 0;
      switch (i)
      {
      default:
        j = -1;
      case 0:
        return j;
        if (!paramString.equals("ltr"))
          break label48;
        i = 0;
        continue;
        if (!paramString.equals("rtl"))
          break label48;
        i = 1;
        continue;
        if (!paramString.equals("inherit"))
          break label48;
        i = 2;
        continue;
        if (!paramString.equals("locale"))
          break label48;
        i = 3;
      case 1:
      case 2:
      case 3:
      }
    }
    return 1;
    return 2;
    return 3;
  }

  public static int d(String paramString)
  {
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
    case 107348:
    case 3202466:
    }
    while (true)
      switch (i)
      {
      default:
        return 0;
        if (!paramString.equals("low"))
          continue;
        i = 0;
        continue;
        if (!paramString.equals("high"))
          continue;
        i = 1;
      case 0:
      case 1:
      }
    return 524288;
    return 1048576;
  }

  public static int e(String paramString)
  {
    int i = 1;
    int j = -1;
    switch (paramString.hashCode())
    {
    default:
    case -1635045622:
    case 104712844:
    }
    while (true)
      switch (j)
      {
      default:
        i = 0;
      case 0:
        return i;
        if (!paramString.equals("ifContentScrolls"))
          continue;
        j = 0;
        continue;
        if (!paramString.equals("never"))
          continue;
        j = i;
      case 1:
      }
    return 2;
  }

  public static int f(String paramString)
  {
    int i = 1;
    int j = -1;
    switch (paramString.hashCode())
    {
    default:
    case 1319330215:
    case 116909544:
    }
    while (true)
      switch (j)
      {
      default:
        i = 0;
      case 0:
        return i;
        if (!paramString.equals("software"))
          continue;
        j = 0;
        continue;
        if (!paramString.equals("hardware"))
          continue;
        j = i;
      case 1:
      }
    return 2;
  }

  public static int g(String paramString)
  {
    int i = 1;
    int j = -1;
    switch (paramString.hashCode())
    {
    default:
    case -1033080473:
    case -1412665122:
    case 107498:
    case 113258:
    case -1097462182:
    }
    while (true)
      switch (j)
      {
      default:
        i = 0;
      case 0:
        return i;
        if (!paramString.equals("firstStrong"))
          continue;
        j = 0;
        continue;
        if (!paramString.equals("anyRtl"))
          continue;
        j = i;
        continue;
        if (!paramString.equals("ltr"))
          continue;
        j = 2;
        continue;
        if (!paramString.equals("rtl"))
          continue;
        j = 3;
        continue;
        if (!paramString.equals("locale"))
          continue;
        j = 4;
      case 1:
      case 2:
      case 3:
      case 4:
      }
    return 2;
    return 3;
    return 4;
    return 5;
  }

  @TargetApi(17)
  public static int h(String paramString)
  {
    int i = 1;
    int j = -1;
    switch (paramString.hashCode())
    {
    default:
    case 280523342:
    case -1048657099:
    case -1417863058:
    case -1364013995:
    case -1584105283:
    case 454203382:
    }
    while (true)
      switch (j)
      {
      default:
        i = 0;
      case 0:
        return i;
        if (!paramString.equals("gravity"))
          continue;
        j = 0;
        continue;
        if (!paramString.equals("textStart"))
          continue;
        j = i;
        continue;
        if (!paramString.equals("textEnd"))
          continue;
        j = 2;
        continue;
        if (!paramString.equals("center"))
          continue;
        j = 3;
        continue;
        if (!paramString.equals("viewStart"))
          continue;
        j = 4;
        continue;
        if (!paramString.equals("viewEnd"))
          continue;
        j = 5;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
    return 2;
    return 3;
    return 4;
    return 5;
    return 6;
  }

  @TargetApi(19)
  public static int i(String paramString)
  {
    int i = 1;
    int j = -1;
    switch (paramString.hashCode())
    {
    default:
    case 119527:
    case 3521:
    case -369905549:
    }
    while (true)
      switch (j)
      {
      default:
        i = 0;
      case 0:
        return i;
        if (!paramString.equals("yes"))
          continue;
        j = 0;
        continue;
        if (!paramString.equals("no"))
          continue;
        j = i;
        continue;
        if (!paramString.equals("noHideDescendants"))
          continue;
        j = 2;
      case 1:
      case 2:
      }
    return 2;
    return 4;
  }

  public static int j(String paramString)
  {
    int i = 1;
    int j = -1;
    switch (paramString.hashCode())
    {
    default:
    case -982669523:
    case 1314396114:
    }
    while (true)
      switch (j)
      {
      default:
        i = 0;
      case 0:
        return i;
        if (!paramString.equals("polite"))
          continue;
        j = 0;
        continue;
        if (!paramString.equals("assertive"))
          continue;
        j = i;
      case 1:
      }
    return 2;
  }

  public static int k(String paramString)
  {
    paramString.hashCode();
    return 0;
  }

  public final MoWidgetType p()
  {
    return MoWidgetType.View;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.a.p
 * JD-Core Version:    0.6.0
 */