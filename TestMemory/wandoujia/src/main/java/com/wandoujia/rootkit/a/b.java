package com.wandoujia.rootkit.a;

public final class b
{
  private boolean a = false;
  private StringBuilder b = new StringBuilder();

  public final void a(String paramString)
  {
    this.b.append(paramString + "\n");
  }

  public final void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public final boolean a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.b.toString();
  }

  public final void c()
  {
    this.a = false;
    this.b = new StringBuilder("Time Out Occurs");
  }

  public final void d()
  {
    this.a = false;
    this.b = new StringBuilder("Interrupt Occurs");
  }

  public final void e()
  {
    this.a = false;
    this.b = new StringBuilder("IO Exception Occurs");
  }

  public final void f()
  {
    this.a = false;
    this.b = new StringBuilder("Root Denied Occurs");
  }

  public final void g()
  {
    this.a = false;
    this.b = new StringBuilder("RootKitInternal_Exception");
  }

  public final String toString()
  {
    return this.a + "\t with the info \t" + this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rootkit.a.b
 * JD-Core Version:    0.6.0
 */