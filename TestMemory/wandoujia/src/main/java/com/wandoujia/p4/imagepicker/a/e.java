package com.wandoujia.p4.imagepicker.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.wandoujia.p4.b.i;
import com.wandoujia.p4.b.j;
import com.wandoujia.p4.imagepicker.activity.FolderImageActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e extends a<i>
{
  public e(Context paramContext, int paramInt, c paramc)
  {
    super(paramContext, paramInt, paramc);
  }

  protected final void a(long paramLong)
  {
  }

  protected final void b(long paramLong)
  {
    Iterator localIterator = b().iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (((j)locali.a.get(0)).a != paramLong)
        continue;
      Intent localIntent = new Intent(this.a, FolderImageActivity.class);
      localIntent.putExtra("folder_path", locali.b);
      localIntent.putExtra("max_count", this.c);
      this.b.startActivityForResult(localIntent, 1);
    }
  }

  public final long getItemId(int paramInt)
  {
    return ((j)((i)a(paramInt)).a.get(0)).a;
  }

  protected final boolean h()
  {
    return false;
  }

  protected final int i()
  {
    return 0;
  }

  protected final int j()
  {
    return 0;
  }

  protected final void k()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.imagepicker.a.e
 * JD-Core Version:    0.6.0
 */