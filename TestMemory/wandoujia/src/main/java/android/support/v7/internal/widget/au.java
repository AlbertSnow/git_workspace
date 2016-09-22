package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.v4.app.b;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.drawable;
import android.util.SparseArray;
import android.view.View;
import com.tencent.mm.sdk.channel.MMessage;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class au
{
  public static final boolean a;
  private static final PorterDuff.Mode b;
  private static final WeakHashMap<Context, au> c;
  private static final av d;
  private static final int[] e;
  private static final int[] f;
  private static final int[] g;
  private static final int[] h;
  private static final int[] i;
  private static final int[] j;
  private final WeakReference<Context> k;
  private SparseArray<ColorStateList> l;
  private ColorStateList m;

  static
  {
    if (Build.VERSION.SDK_INT < 21);
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      b = PorterDuff.Mode.SRC_IN;
      c = new WeakHashMap();
      d = new av();
      int[] arrayOfInt1 = new int[3];
      arrayOfInt1[0] = R.drawable.abc_textfield_search_default_mtrl_alpha;
      arrayOfInt1[1] = R.drawable.abc_textfield_default_mtrl_alpha;
      arrayOfInt1[2] = R.drawable.abc_ab_share_pack_mtrl_alpha;
      e = arrayOfInt1;
      int[] arrayOfInt2 = new int[12];
      arrayOfInt2[0] = R.drawable.abc_ic_ab_back_mtrl_am_alpha;
      arrayOfInt2[1] = R.drawable.abc_ic_go_search_api_mtrl_alpha;
      arrayOfInt2[2] = R.drawable.abc_ic_search_api_mtrl_alpha;
      arrayOfInt2[3] = R.drawable.abc_ic_commit_search_api_mtrl_alpha;
      arrayOfInt2[4] = R.drawable.abc_ic_clear_mtrl_alpha;
      arrayOfInt2[5] = R.drawable.abc_ic_menu_share_mtrl_alpha;
      arrayOfInt2[6] = R.drawable.abc_ic_menu_copy_mtrl_am_alpha;
      arrayOfInt2[7] = R.drawable.abc_ic_menu_cut_mtrl_alpha;
      arrayOfInt2[8] = R.drawable.abc_ic_menu_selectall_mtrl_alpha;
      arrayOfInt2[9] = R.drawable.abc_ic_menu_paste_mtrl_am_alpha;
      arrayOfInt2[10] = R.drawable.abc_ic_menu_moreoverflow_mtrl_alpha;
      arrayOfInt2[11] = R.drawable.abc_ic_voice_search_api_mtrl_alpha;
      f = arrayOfInt2;
      int[] arrayOfInt3 = new int[4];
      arrayOfInt3[0] = R.drawable.abc_textfield_activated_mtrl_alpha;
      arrayOfInt3[1] = R.drawable.abc_textfield_search_activated_mtrl_alpha;
      arrayOfInt3[2] = R.drawable.abc_cab_background_top_mtrl_alpha;
      arrayOfInt3[3] = R.drawable.abc_text_cursor_mtrl_alpha;
      g = arrayOfInt3;
      int[] arrayOfInt4 = new int[3];
      arrayOfInt4[0] = R.drawable.abc_popup_background_mtrl_mult;
      arrayOfInt4[1] = R.drawable.abc_cab_background_internal_bg;
      arrayOfInt4[2] = R.drawable.abc_menu_hardkey_panel_mtrl_mult;
      h = arrayOfInt4;
      int[] arrayOfInt5 = new int[10];
      arrayOfInt5[0] = R.drawable.abc_edit_text_material;
      arrayOfInt5[1] = R.drawable.abc_tab_indicator_material;
      arrayOfInt5[2] = R.drawable.abc_textfield_search_material;
      arrayOfInt5[3] = R.drawable.abc_spinner_mtrl_am_alpha;
      arrayOfInt5[4] = R.drawable.abc_spinner_textfield_background_material;
      arrayOfInt5[5] = R.drawable.abc_ratingbar_full_material;
      arrayOfInt5[6] = R.drawable.abc_switch_track_mtrl_alpha;
      arrayOfInt5[7] = R.drawable.abc_switch_thumb_material;
      arrayOfInt5[8] = R.drawable.abc_btn_default_mtrl_shape;
      arrayOfInt5[9] = R.drawable.abc_btn_borderless_material;
      i = arrayOfInt5;
      int[] arrayOfInt6 = new int[2];
      arrayOfInt6[0] = R.drawable.abc_btn_check_material;
      arrayOfInt6[1] = R.drawable.abc_btn_radio_material;
      j = arrayOfInt6;
      return;
    }
  }

  private au(Context paramContext)
  {
    this.k = new WeakReference(paramContext);
  }

  public static Drawable a(Context paramContext, int paramInt)
  {
    if ((a(f, paramInt)) || (a(e, paramInt)) || (a(g, paramInt)) || (a(i, paramInt)) || (a(h, paramInt)) || (a(j, paramInt)) || (paramInt == R.drawable.abc_cab_background_top_material));
    for (int n = 1; n != 0; n = 0)
      return a(paramContext).a(paramInt, false);
    return android.support.v4.content.a.a(paramContext, paramInt);
  }

  public static au a(Context paramContext)
  {
    au localau = (au)c.get(paramContext);
    if (localau == null)
    {
      localau = new au(paramContext);
      c.put(paramContext, localau);
    }
    return localau;
  }

  private static void a(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    if (paramMode == null)
      paramMode = b;
    PorterDuffColorFilter localPorterDuffColorFilter = d.a(paramInt, paramMode);
    if (localPorterDuffColorFilter == null)
    {
      localPorterDuffColorFilter = new PorterDuffColorFilter(paramInt, paramMode);
      d.a(paramInt, paramMode, localPorterDuffColorFilter);
    }
    paramDrawable.setColorFilter(localPorterDuffColorFilter);
  }

  public static void a(View paramView, MMessage paramMMessage)
  {
    Drawable localDrawable = paramView.getBackground();
    PorterDuff.Mode localMode;
    if (paramMMessage.d)
    {
      int n = paramMMessage.a.getColorForState(paramView.getDrawableState(), paramMMessage.a.getDefaultColor());
      if (paramMMessage.c)
      {
        localMode = paramMMessage.b;
        a(localDrawable, n, localMode);
      }
    }
    while (true)
    {
      if (Build.VERSION.SDK_INT <= 10)
        paramView.invalidate();
      return;
      localMode = null;
      break;
      localDrawable.clearColorFilter();
    }
  }

  private static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    int n = paramArrayOfInt.length;
    for (int i1 = 0; ; i1++)
    {
      int i2 = 0;
      if (i1 < n)
      {
        if (paramArrayOfInt[i1] != paramInt)
          continue;
        i2 = 1;
      }
      return i2;
    }
  }

  public final Drawable a(int paramInt)
  {
    return a(paramInt, false);
  }

  public final Drawable a(int paramInt, boolean paramBoolean)
  {
    Context localContext = (Context)this.k.get();
    if (localContext == null)
      return null;
    Drawable localDrawable = android.support.v4.content.a.a(localContext, paramInt);
    if (localDrawable != null)
    {
      if (Build.VERSION.SDK_INT >= 8)
        localDrawable = localDrawable.mutate();
      ColorStateList localColorStateList = b(paramInt);
      if (localColorStateList == null)
        break label104;
      localDrawable = android.support.v4.a.a.a.c(localDrawable);
      android.support.v4.a.a.a.a(localDrawable, localColorStateList);
      int n = R.drawable.abc_switch_thumb_material;
      PorterDuff.Mode localMode = null;
      if (paramInt == n)
        localMode = PorterDuff.Mode.MULTIPLY;
      if (localMode != null)
        android.support.v4.a.a.a.a(localDrawable, localMode);
    }
    while (true)
    {
      return localDrawable;
      label104: if (paramInt == R.drawable.abc_cab_background_top_material)
      {
        Drawable[] arrayOfDrawable = new Drawable[2];
        arrayOfDrawable[0] = a(R.drawable.abc_cab_background_internal_bg, false);
        arrayOfDrawable[1] = a(R.drawable.abc_cab_background_top_mtrl_alpha, false);
        return new LayerDrawable(arrayOfDrawable);
      }
      if ((a(paramInt, localDrawable)) || (!paramBoolean))
        continue;
      localDrawable = null;
    }
  }

  public final boolean a(int paramInt, Drawable paramDrawable)
  {
    Context localContext = (Context)this.k.get();
    if (localContext == null)
      return false;
    int i1;
    Object localObject;
    int i2;
    int n;
    if (a(e, paramInt))
    {
      i1 = R.attr.colorControlNormal;
      localObject = null;
      i2 = 1;
      n = -1;
    }
    while (true)
    {
      if (i2 != 0)
      {
        a(paramDrawable, ar.a(localContext, i1), (PorterDuff.Mode)localObject);
        if (n != -1)
          paramDrawable.setAlpha(n);
        return true;
        if (a(g, paramInt))
        {
          i1 = R.attr.colorControlActivated;
          i2 = 1;
          n = -1;
          localObject = null;
          continue;
        }
        if (a(h, paramInt))
        {
          PorterDuff.Mode localMode = PorterDuff.Mode.MULTIPLY;
          i2 = 1;
          localObject = localMode;
          i1 = 16842801;
          n = -1;
          continue;
        }
        if (paramInt == R.drawable.abc_list_divider_mtrl_alpha)
        {
          i1 = 16842800;
          n = Math.round(40.799999F);
          i2 = 1;
          localObject = null;
          continue;
        }
      }
      else
      {
        return false;
      }
      n = -1;
      i1 = 0;
      i2 = 0;
      localObject = null;
    }
  }

  public final ColorStateList b(int paramInt)
  {
    Context localContext = (Context)this.k.get();
    Object localObject;
    if (localContext == null)
      localObject = null;
    ColorStateList localColorStateList1;
    label170: label943: 
    while (true)
    {
      return localObject;
      if (this.l != null)
      {
        localColorStateList1 = (ColorStateList)this.l.get(paramInt);
        if (localColorStateList1 != null)
          break;
        if (paramInt != R.drawable.abc_edit_text_material)
          break label170;
        int[][] arrayOfInt13 = new int[3][];
        int[] arrayOfInt14 = new int[3];
        arrayOfInt13[0] = ar.a;
        arrayOfInt14[0] = ar.c(localContext, R.attr.colorControlNormal);
        arrayOfInt13[1] = ar.g;
        arrayOfInt14[1] = ar.a(localContext, R.attr.colorControlNormal);
        arrayOfInt13[2] = ar.h;
        arrayOfInt14[2] = ar.a(localContext, R.attr.colorControlActivated);
        localObject = new ColorStateList(arrayOfInt13, arrayOfInt14);
      }
      while (true)
      {
        if (localObject == null)
          break label943;
        if (this.l == null)
          this.l = new SparseArray();
        this.l.append(paramInt, localObject);
        return localObject;
        localColorStateList1 = null;
        break;
        if (paramInt == R.drawable.abc_switch_track_mtrl_alpha)
        {
          int[][] arrayOfInt11 = new int[3][];
          int[] arrayOfInt12 = new int[3];
          arrayOfInt11[0] = ar.a;
          arrayOfInt12[0] = ar.a(localContext, 16842800, 0.1F);
          arrayOfInt11[1] = ar.e;
          arrayOfInt12[1] = ar.a(localContext, R.attr.colorControlActivated, 0.3F);
          arrayOfInt11[2] = ar.h;
          arrayOfInt12[2] = ar.a(localContext, 16842800, 0.3F);
          localObject = new ColorStateList(arrayOfInt11, arrayOfInt12);
          continue;
        }
        if (paramInt == R.drawable.abc_switch_thumb_material)
        {
          int[][] arrayOfInt9 = new int[3][];
          int[] arrayOfInt10 = new int[3];
          ColorStateList localColorStateList2 = ar.b(localContext, R.attr.colorSwitchThumbNormal);
          if ((localColorStateList2 != null) && (localColorStateList2.isStateful()))
          {
            arrayOfInt9[0] = ar.a;
            arrayOfInt10[0] = localColorStateList2.getColorForState(arrayOfInt9[0], 0);
            arrayOfInt9[1] = ar.e;
            arrayOfInt10[1] = ar.a(localContext, R.attr.colorControlActivated);
            arrayOfInt9[2] = ar.h;
            arrayOfInt10[2] = localColorStateList2.getDefaultColor();
          }
          while (true)
          {
            localObject = new ColorStateList(arrayOfInt9, arrayOfInt10);
            break;
            arrayOfInt9[0] = ar.a;
            arrayOfInt10[0] = ar.c(localContext, R.attr.colorSwitchThumbNormal);
            arrayOfInt9[1] = ar.e;
            arrayOfInt10[1] = ar.a(localContext, R.attr.colorControlActivated);
            arrayOfInt9[2] = ar.h;
            arrayOfInt10[2] = ar.a(localContext, R.attr.colorSwitchThumbNormal);
          }
        }
        if ((paramInt == R.drawable.abc_btn_default_mtrl_shape) || (paramInt == R.drawable.abc_btn_borderless_material))
        {
          int[][] arrayOfInt1 = new int[4][];
          int[] arrayOfInt2 = new int[4];
          int n = ar.a(localContext, R.attr.colorButtonNormal);
          int i1 = ar.a(localContext, R.attr.colorControlHighlight);
          arrayOfInt1[0] = ar.a;
          arrayOfInt2[0] = ar.c(localContext, R.attr.colorButtonNormal);
          arrayOfInt1[1] = ar.d;
          arrayOfInt2[1] = b.a(i1, n);
          arrayOfInt1[2] = ar.b;
          arrayOfInt2[2] = b.a(i1, n);
          arrayOfInt1[3] = ar.h;
          arrayOfInt2[3] = n;
          localObject = new ColorStateList(arrayOfInt1, arrayOfInt2);
          continue;
        }
        if ((paramInt == R.drawable.abc_spinner_mtrl_am_alpha) || (paramInt == R.drawable.abc_spinner_textfield_background_material))
        {
          int[][] arrayOfInt3 = new int[3][];
          int[] arrayOfInt4 = new int[3];
          arrayOfInt3[0] = ar.a;
          arrayOfInt4[0] = ar.c(localContext, R.attr.colorControlNormal);
          arrayOfInt3[1] = ar.g;
          arrayOfInt4[1] = ar.a(localContext, R.attr.colorControlNormal);
          arrayOfInt3[2] = ar.h;
          arrayOfInt4[2] = ar.a(localContext, R.attr.colorControlActivated);
          localObject = new ColorStateList(arrayOfInt3, arrayOfInt4);
          continue;
        }
        if (a(f, paramInt))
        {
          localObject = ar.b(localContext, R.attr.colorControlNormal);
          continue;
        }
        if (a(i, paramInt))
        {
          if (this.m == null)
          {
            int i2 = ar.a(localContext, R.attr.colorControlNormal);
            int i3 = ar.a(localContext, R.attr.colorControlActivated);
            int[][] arrayOfInt7 = new int[7][];
            int[] arrayOfInt8 = new int[7];
            arrayOfInt7[0] = ar.a;
            arrayOfInt8[0] = ar.c(localContext, R.attr.colorControlNormal);
            arrayOfInt7[1] = ar.b;
            arrayOfInt8[1] = i3;
            arrayOfInt7[2] = ar.c;
            arrayOfInt8[2] = i3;
            arrayOfInt7[3] = ar.d;
            arrayOfInt8[3] = i3;
            arrayOfInt7[4] = ar.e;
            arrayOfInt8[4] = i3;
            arrayOfInt7[5] = ar.f;
            arrayOfInt8[5] = i3;
            arrayOfInt7[6] = ar.h;
            arrayOfInt8[6] = i2;
            this.m = new ColorStateList(arrayOfInt7, arrayOfInt8);
          }
          localObject = this.m;
          continue;
        }
        if (a(j, paramInt))
        {
          int[][] arrayOfInt5 = new int[3][];
          int[] arrayOfInt6 = new int[3];
          arrayOfInt5[0] = ar.a;
          arrayOfInt6[0] = ar.c(localContext, R.attr.colorControlNormal);
          arrayOfInt5[1] = ar.e;
          arrayOfInt6[1] = ar.a(localContext, R.attr.colorControlActivated);
          arrayOfInt5[2] = ar.h;
          arrayOfInt6[2] = ar.a(localContext, R.attr.colorControlNormal);
          localObject = new ColorStateList(arrayOfInt5, arrayOfInt6);
          continue;
        }
        localObject = localColorStateList1;
      }
    }
    return (ColorStateList)localColorStateList1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.au
 * JD-Core Version:    0.6.0
 */