package com.wandoujia.net.codec;

import android.text.TextUtils;
import com.wandoujia.net.h;
import com.wandoujia.net.t;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class f
{
  private boolean a;
  private StringBuilder b = new StringBuilder();

  public final void a(ByteBuffer paramByteBuffer, h paramh)
  {
    while (true)
    {
      int i;
      if (paramByteBuffer.position() < paramByteBuffer.limit())
      {
        i = paramByteBuffer.get();
        if (i == 10)
        {
          String str = this.b.toString().trim();
          String[] arrayOfString;
          if (paramh.b() == null)
          {
            arrayOfString = str.split(" ", 3);
            if (arrayOfString.length < 2)
              throw new IOException("Not HTTP");
            paramh.a(arrayOfString[0]);
          }
          while (true)
          {
            try
            {
              paramh.a(Integer.parseInt(arrayOfString[1]));
              this.b = new StringBuilder();
            }
            catch (NumberFormatException localNumberFormatException)
            {
              throw new IOException(localNumberFormatException.getMessage());
            }
            if (TextUtils.isEmpty(str))
              break label137;
            paramh.f().b(str);
          }
          label137: this.a = true;
        }
      }
      else
      {
        return;
      }
      this.b.append((char)i);
    }
  }

  public final boolean a()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.codec.f
 * JD-Core Version:    0.6.0
 */