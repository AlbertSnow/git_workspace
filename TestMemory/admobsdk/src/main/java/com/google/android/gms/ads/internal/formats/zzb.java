package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzis;
import java.util.Iterator;
import java.util.List;

@zzhb
class zzb extends RelativeLayout
{
  private static final float[] zzxR = { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F };
  private final RelativeLayout zzxS;
  private AnimationDrawable zzxT;

  public zzb(Context paramContext, zza paramzza)
  {
    super(paramContext);
    zzx.zzz(paramzza);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams1.addRule(10);
    localLayoutParams1.addRule(11);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(zzxR, null, null));
    localShapeDrawable.getPaint().setColor(paramzza.getBackgroundColor());
    this.zzxS = new RelativeLayout(paramContext);
    this.zzxS.setLayoutParams(localLayoutParams1);
    zzr.zzbE().zza(this.zzxS, localShapeDrawable);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    if (!TextUtils.isEmpty(paramzza.getText()))
    {
      localObject1 = new RelativeLayout.LayoutParams(-2, -2);
      localObject2 = new TextView(paramContext);
      ((TextView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      ((TextView)localObject2).setId(1195835393);
      ((TextView)localObject2).setTypeface(Typeface.DEFAULT);
      ((TextView)localObject2).setText(paramzza.getText());
      ((TextView)localObject2).setTextColor(paramzza.getTextColor());
      ((TextView)localObject2).setTextSize(paramzza.getTextSize());
      ((TextView)localObject2).setPadding(zzn.zzcS().zzb(paramContext, 4), 0, zzn.zzcS().zzb(paramContext, 4), 0);
      this.zzxS.addView((View)localObject2);
      localLayoutParams2.addRule(1, ((TextView)localObject2).getId());
    }
    Object localObject1 = new ImageView(paramContext);
    ((ImageView)localObject1).setLayoutParams(localLayoutParams2);
    ((ImageView)localObject1).setId(1195835394);
    Object localObject2 = paramzza.zzdG();
    if (((List)localObject2).size() > 1)
    {
      this.zzxT = new AnimationDrawable();
      Iterator localIterator = ((List)localObject2).iterator();
      while (localIterator.hasNext())
      {
        Drawable localDrawable = (Drawable)localIterator.next();
        this.zzxT.addFrame(localDrawable, paramzza.zzdH());
      }
      zzr.zzbE().zza((View)localObject1, this.zzxT);
    }
    else if (((List)localObject2).size() == 1)
    {
      ((ImageView)localObject1).setImageDrawable((Drawable)((List)localObject2).get(0));
    }
    this.zzxS.addView((View)localObject1);
    addView(this.zzxS);
  }

  public void onAttachedToWindow()
  {
    if (this.zzxT != null)
      this.zzxT.start();
    super.onAttachedToWindow();
  }

  public ViewGroup zzdI()
  {
    return this.zzxS;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzb
 * JD-Core Version:    0.6.0
 */