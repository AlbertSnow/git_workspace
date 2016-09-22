package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import anw;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.util.ad;
import java.util.Iterator;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
final class b extends RelativeLayout
{
  private static final float[] b = { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F };
  final RelativeLayout a;
  private AnimationDrawable c;

  public b(Context paramContext, a parama)
  {
    super(paramContext);
    anw.a(parama);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
    switch (parama.g)
    {
    case 1:
    default:
      localLayoutParams1.addRule(10);
      localLayoutParams1.addRule(11);
    case 0:
    case 3:
    case 2:
    }
    ImageView localImageView;
    List localList;
    while (true)
    {
      ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(b, null, null));
      localShapeDrawable.getPaint().setColor(parama.c);
      this.a = new RelativeLayout(paramContext);
      this.a.setLayoutParams(localLayoutParams1);
      bc.a().g.a(this.a, localShapeDrawable);
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
      if (!TextUtils.isEmpty(parama.a))
      {
        RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        TextView localTextView = new TextView(paramContext);
        localTextView.setLayoutParams(localLayoutParams3);
        localTextView.setId(1195835393);
        localTextView.setTypeface(Typeface.DEFAULT);
        localTextView.setText(parama.a);
        localTextView.setTextColor(parama.d);
        localTextView.setTextSize(parama.e);
        localTextView.setPadding(q.a().a.a(paramContext, 4), 0, q.a().a.a(paramContext, 4), 0);
        this.a.addView(localTextView);
        localLayoutParams2.addRule(1, localTextView.getId());
      }
      localImageView = new ImageView(paramContext);
      localImageView.setLayoutParams(localLayoutParams2);
      localImageView.setId(1195835394);
      localList = parama.b;
      if (localList.size() <= 1)
        break;
      this.c = new AnimationDrawable();
      Iterator localIterator = localList.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          Drawable localDrawable = (Drawable)localIterator.next();
          this.c.addFrame(localDrawable, parama.f);
          continue;
          localLayoutParams1.addRule(10);
          localLayoutParams1.addRule(9);
          break;
          localLayoutParams1.addRule(12);
          localLayoutParams1.addRule(9);
          break;
          localLayoutParams1.addRule(12);
          localLayoutParams1.addRule(11);
          break;
        }
      bc.a().g.a(localImageView, this.c);
    }
    while (true)
    {
      this.a.addView(localImageView);
      addView(this.a);
      return;
      if (localList.size() != 1)
        continue;
      localImageView.setImageDrawable((Drawable)localList.get(0));
    }
  }

  public final void onAttachedToWindow()
  {
    if (this.c != null)
      this.c.start();
    super.onAttachedToWindow();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.b
 * JD-Core Version:    0.6.0
 */