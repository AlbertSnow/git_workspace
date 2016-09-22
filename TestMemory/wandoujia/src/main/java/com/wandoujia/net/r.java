package com.wandoujia.net;

import android.net.Uri;
import com.wandoujia.net.b.b;
import com.wandoujia.net.b.c;
import com.wandoujia.net.codec.ChunkDecoder;
import com.wandoujia.net.codec.e;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

final class r extends HttpTransaction
{
  private final File h;
  private final File i;
  private c j;
  private FileChannel k;

  public r(a parama, long paramLong, AsyncHttpRequest paramAsyncHttpRequest, File paramFile)
  {
    super(parama, paramLong, paramAsyncHttpRequest);
    this.h = paramFile;
    this.i = new File(a.b(paramFile.getAbsolutePath()));
  }

  private void m()
  {
    if (this.k != null);
    try
    {
      this.k.close();
      this.k = null;
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public final void a()
  {
    this.j = this.c.a().a(this.h.getAbsolutePath(), this.b.a().toString());
    if (this.j == null)
    {
      this.j = new c();
      this.j.e = this.h.getAbsolutePath();
      this.j.d = this.b.a().toString();
      this.j.a = this.c.a().a(this.j);
    }
    if ((this.i.exists()) && (this.i.length() == this.j.c) && (this.j.c > 0L))
    {
      this.b.c().a("Accept-Ranges", "bytes");
      this.b.c().a("Range", "bytes=" + this.j.b + "-");
    }
    super.a();
  }

  protected final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (l())
      {
        this.g = (-1 + this.g);
        this.c.a(3000 * (2 - this.g), new Object[] { this });
      }
      while (true)
      {
        m();
        return;
        this.c.a(6, new Object[] { this });
      }
    }
    this.c.a(6, new Object[] { this });
    m();
    this.i.delete();
    this.c.a().a(Long.valueOf(this.j.a));
  }

  public final void b()
  {
    super.b();
    m();
  }

  protected final void c()
  {
    super.c();
    long l = this.j.b / 1048576L;
    this.j.b = this.a.i();
    if (this.j.b / 1048576L > l)
      this.c.a().b(this.j);
    this.g = 2;
  }

  protected final boolean d()
  {
    if (!super.d())
      return false;
    int m;
    if (this.a.a() == 206)
    {
      String str = this.a.f().a("Content-Range");
      if ((str == null) || (!str.toLowerCase().matches("bytes (\\d+-\\d+|\\*)/\\d+$")))
        break label113;
      long l = Long.parseLong(str.substring(1 + str.indexOf('/')));
      if (this.j.c == l)
        m = 1;
    }
    while (true)
    {
      if (m == 0)
      {
        this.i.delete();
        a(this.e, true);
        return false;
        m = 0;
        continue;
      }
      return true;
      label113: m = 0;
    }
  }

  protected final void e()
  {
    switch (this.a.a())
    {
    default:
      j();
      return;
    case 200:
    case 206:
    }
    while (true)
    {
      s locals;
      try
      {
        long l2 = this.a.e();
        this.i.getParentFile().mkdirs();
        this.i.createNewFile();
        RandomAccessFile localRandomAccessFile2 = new RandomAccessFile(this.i, "rw");
        if (l2 <= 0L)
          continue;
        localRandomAccessFile2.setLength(l2);
        this.k = localRandomAccessFile2.getChannel();
        this.j.c = this.a.e();
        this.c.a().c(this.j);
        locals = new s(this);
        if (this.a.a() != 206)
          break label304;
        this.f = new e(locals, this.j.b, this.j.c);
        a locala = this.c;
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = this;
        arrayOfObject[1] = Long.valueOf(this.j.b);
        arrayOfObject[2] = Long.valueOf(this.j.c);
        locala.a(4, arrayOfObject);
        return;
      }
      catch (IOException localIOException2)
      {
        throw new HttpException(HttpException.Type.DOWNLOAD_IO_ERROR, localIOException2);
      }
      try
      {
        long l1 = this.j.b;
        RandomAccessFile localRandomAccessFile1 = new RandomAccessFile(this.i, "rw");
        localRandomAccessFile1.seek(l1);
        this.k = localRandomAccessFile1.getChannel();
      }
      catch (IOException localIOException1)
      {
        throw new HttpException(HttpException.Type.DOWNLOAD_IO_ERROR, localIOException1);
      }
      label304: if (this.a.c())
      {
        this.f = new ChunkDecoder(locals);
        continue;
      }
      if (this.a.e() <= -1L)
        break;
      this.f = new e(locals, 0L, this.a.e());
    }
    throw new HttpException(HttpException.Type.UNSUPPORT_TRANSFER_ENCODING, "Identity NOT Support");
  }

  protected final void f()
  {
    while (true)
    {
      try
      {
        this.k.close();
        str = null;
        if (!this.h.exists())
          break label189;
        bool = this.h.delete();
        if (bool)
        {
          bool = this.i.renameTo(this.h);
          if (!bool)
            break label129;
          this.c.a(7, new Object[] { this });
          this.c.a().a(Long.valueOf(this.j.a));
          return;
        }
      }
      catch (IOException localIOException)
      {
        a(new HttpException(HttpException.Type.DOWNLOAD_IO_ERROR, localIOException));
        return;
      }
      String str = "Delete failed: " + this.h.getAbsolutePath();
      continue;
      label129: if (str == null)
        str = "Rename failed: From " + this.i.getAbsolutePath() + " to " + this.h.getAbsolutePath();
      a(new HttpException(HttpException.Type.DOWNLOAD_IO_ERROR, str));
      return;
      label189: boolean bool = true;
    }
  }

  protected final HttpTransaction g()
  {
    r localr = new r(this.c, this.d, this.b, this.h);
    localr.g = this.g;
    return localr;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.r
 * JD-Core Version:    0.6.0
 */