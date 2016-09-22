package com.squareup.leakcanary;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

public final class g
{
  public static final g a = new g(new h(), new i(), c.a, new f(), new e());

  private g(Executor paramExecutor, a parama, c paramc, f paramf, e parame)
  {
    e.a(paramExecutor, "watchExecutor");
    e.a(parama, "debuggerControl");
    e.a(paramc, "gcTrigger");
    e.a(paramf, "heapDumper");
    e.a(parame, "heapdumpListener");
    new CopyOnWriteArraySet();
    new ReferenceQueue();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.leakcanary.g
 * JD-Core Version:    0.6.0
 */