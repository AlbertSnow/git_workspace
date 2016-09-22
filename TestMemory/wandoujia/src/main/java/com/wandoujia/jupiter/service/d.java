package com.wandoujia.jupiter.service;

import android.content.Context;
import android.text.TextUtils;
import com.wandoujia.gson.c;
import com.wandoujia.jupiter.service.model.AppActiveDir;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
{
  private List<AppActiveDir> a = new ArrayList();
  private Context b;

  public d(Context paramContext)
  {
    this.b = paramContext;
    try
    {
      File localFile = new File(this.b.getFilesDir(), "app_active_dirs");
      List localList = (List)new c().a(new FileReader(localFile), new e().getType());
      if (localList != null)
      {
        this.a.clear();
        this.a.addAll(localList);
      }
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  private void b()
  {
    try
    {
      FileWriter localFileWriter = new FileWriter(new File(this.b.getFilesDir(), "app_active_dirs"));
      localFileWriter.write(new c().a(this.a));
      localFileWriter.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public final List<AppActiveDir> a()
  {
    return new ArrayList(this.a);
  }

  public final void a(AppActiveDir paramAppActiveDir)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      if (TextUtils.equals(((AppActiveDir)localIterator.next()).getPn(), paramAppActiveDir.getPn()))
        return;
    this.a.add(paramAppActiveDir);
    b();
  }

  public final void a(String paramString)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      if (!TextUtils.equals(paramString, ((AppActiveDir)localIterator.next()).getPn()))
        continue;
      localIterator.remove();
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.service.d
 * JD-Core Version:    0.6.0
 */