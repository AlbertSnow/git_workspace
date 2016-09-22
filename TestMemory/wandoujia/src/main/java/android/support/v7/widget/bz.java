package android.support.v7.widget;

import android.database.Observable;
import com.wandoujia.jupiter.paid.a.c;
import java.util.ArrayList;

final class bz extends Observable<c>
{
  public final void a()
  {
    for (int i = -1 + this.mObservers.size(); i >= 0; i--)
      ((c)this.mObservers.get(i)).a();
  }

  public final void a(int paramInt1, int paramInt2)
  {
    for (int i = -1 + this.mObservers.size(); i >= 0; i--)
      ((c)this.mObservers.get(i)).a(paramInt1, paramInt2);
  }

  public final void b(int paramInt1, int paramInt2)
  {
    for (int i = -1 + this.mObservers.size(); i >= 0; i--)
      ((c)this.mObservers.get(i)).b(paramInt1, paramInt2);
  }

  public final void c(int paramInt1, int paramInt2)
  {
    for (int i = -1 + this.mObservers.size(); i >= 0; i--)
      ((c)this.mObservers.get(i)).c(paramInt1, paramInt2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.bz
 * JD-Core Version:    0.6.0
 */