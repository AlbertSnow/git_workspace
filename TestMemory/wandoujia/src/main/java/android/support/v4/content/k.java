package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

final class k
{
  final IntentFilter a;
  final BroadcastReceiver b;
  boolean c;

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("Receiver{");
    localStringBuilder.append(this.b);
    localStringBuilder.append(" filter=");
    localStringBuilder.append(this.a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.content.k
 * JD-Core Version:    0.6.0
 */