package com.nineoldandroids.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ValueAnimator extends Animator
{
  static final int ANIMATION_FRAME = 1;
  static final int ANIMATION_START = 0;
  private static final long DEFAULT_FRAME_DELAY = 10L;
  public static final int INFINITE = -1;
  public static final int RESTART = 1;
  public static final int REVERSE = 2;
  static final int RUNNING = 1;
  static final int SEEKED = 2;
  static final int STOPPED;
  private static ThreadLocal<ValueAnimator.AnimationHandler> sAnimationHandler = new ThreadLocal();
  private static final ThreadLocal<ArrayList<ValueAnimator>> sAnimations = new ValueAnimator.1();
  private static final Interpolator sDefaultInterpolator;
  private static final ThreadLocal<ArrayList<ValueAnimator>> sDelayedAnims;
  private static final ThreadLocal<ArrayList<ValueAnimator>> sEndingAnims;
  private static final TypeEvaluator sFloatEvaluator;
  private static long sFrameDelay;
  private static final TypeEvaluator sIntEvaluator;
  private static final ThreadLocal<ArrayList<ValueAnimator>> sPendingAnimations = new ValueAnimator.2();
  private static final ThreadLocal<ArrayList<ValueAnimator>> sReadyAnims;
  private float mCurrentFraction = 0.0F;
  private int mCurrentIteration = 0;
  private long mDelayStartTime;
  private long mDuration = 300L;
  boolean mInitialized = false;
  private Interpolator mInterpolator = sDefaultInterpolator;
  private boolean mPlayingBackwards = false;
  int mPlayingState = 0;
  private int mRepeatCount = 0;
  private int mRepeatMode = 1;
  private boolean mRunning = false;
  long mSeekTime = -1L;
  private long mStartDelay = 0L;
  long mStartTime;
  private boolean mStarted = false;
  private boolean mStartedDelay = false;
  private ArrayList<ValueAnimator.AnimatorUpdateListener> mUpdateListeners = null;
  PropertyValuesHolder[] mValues;
  HashMap<String, PropertyValuesHolder> mValuesMap;

  static
  {
    sDelayedAnims = new ValueAnimator.3();
    sEndingAnims = new ValueAnimator.4();
    sReadyAnims = new ValueAnimator.5();
    sDefaultInterpolator = new AccelerateDecelerateInterpolator();
    sIntEvaluator = new IntEvaluator();
    sFloatEvaluator = new FloatEvaluator();
    sFrameDelay = 10L;
  }

  public static void clearAllAnimations()
  {
    ((ArrayList)sAnimations.get()).clear();
    ((ArrayList)sPendingAnimations.get()).clear();
    ((ArrayList)sDelayedAnims.get()).clear();
  }

  private boolean delayedAnimationFrame(long paramLong)
  {
    if (!this.mStartedDelay)
    {
      this.mStartedDelay = true;
      this.mDelayStartTime = paramLong;
    }
    long l;
    do
    {
      return false;
      l = paramLong - this.mDelayStartTime;
    }
    while (l <= this.mStartDelay);
    this.mStartTime = (paramLong - (l - this.mStartDelay));
    this.mPlayingState = 1;
    return true;
  }

  private void endAnimation()
  {
    ((ArrayList)sAnimations.get()).remove(this);
    ((ArrayList)sPendingAnimations.get()).remove(this);
    ((ArrayList)sDelayedAnims.get()).remove(this);
    this.mPlayingState = 0;
    if ((this.mRunning) && (this.mListeners != null))
    {
      ArrayList localArrayList = (ArrayList)this.mListeners.clone();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
        ((Animator.AnimatorListener)localArrayList.get(j)).onAnimationEnd(this);
    }
    this.mRunning = false;
    this.mStarted = false;
  }

  public static int getCurrentAnimationsCount()
  {
    return ((ArrayList)sAnimations.get()).size();
  }

  public static long getFrameDelay()
  {
    return sFrameDelay;
  }

  public static ValueAnimator ofFloat(float[] paramArrayOfFloat)
  {
    ValueAnimator localValueAnimator = new ValueAnimator();
    localValueAnimator.setFloatValues(paramArrayOfFloat);
    return localValueAnimator;
  }

  public static ValueAnimator ofInt(int[] paramArrayOfInt)
  {
    ValueAnimator localValueAnimator = new ValueAnimator();
    localValueAnimator.setIntValues(paramArrayOfInt);
    return localValueAnimator;
  }

  public static ValueAnimator ofObject(TypeEvaluator paramTypeEvaluator, Object[] paramArrayOfObject)
  {
    ValueAnimator localValueAnimator = new ValueAnimator();
    localValueAnimator.setObjectValues(paramArrayOfObject);
    localValueAnimator.setEvaluator(paramTypeEvaluator);
    return localValueAnimator;
  }

  public static ValueAnimator ofPropertyValuesHolder(PropertyValuesHolder[] paramArrayOfPropertyValuesHolder)
  {
    ValueAnimator localValueAnimator = new ValueAnimator();
    localValueAnimator.setValues(paramArrayOfPropertyValuesHolder);
    return localValueAnimator;
  }

  public static void setFrameDelay(long paramLong)
  {
    sFrameDelay = paramLong;
  }

  private void start(boolean paramBoolean)
  {
    if (Looper.myLooper() == null)
      throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    this.mPlayingBackwards = paramBoolean;
    this.mCurrentIteration = 0;
    this.mPlayingState = 0;
    this.mStarted = true;
    this.mStartedDelay = false;
    ((ArrayList)sPendingAnimations.get()).add(this);
    if (this.mStartDelay == 0L)
    {
      setCurrentPlayTime(getCurrentPlayTime());
      this.mPlayingState = 0;
      this.mRunning = true;
      if (this.mListeners != null)
      {
        ArrayList localArrayList = (ArrayList)this.mListeners.clone();
        int i = localArrayList.size();
        for (int j = 0; j < i; j++)
          ((Animator.AnimatorListener)localArrayList.get(j)).onAnimationStart(this);
      }
    }
    ValueAnimator.AnimationHandler localAnimationHandler = (ValueAnimator.AnimationHandler)sAnimationHandler.get();
    if (localAnimationHandler == null)
    {
      localAnimationHandler = new ValueAnimator.AnimationHandler(null);
      sAnimationHandler.set(localAnimationHandler);
    }
    localAnimationHandler.sendEmptyMessage(0);
  }

  private void startAnimation()
  {
    initAnimation();
    ((ArrayList)sAnimations.get()).add(this);
    if ((this.mStartDelay > 0L) && (this.mListeners != null))
    {
      ArrayList localArrayList = (ArrayList)this.mListeners.clone();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
        ((Animator.AnimatorListener)localArrayList.get(j)).onAnimationStart(this);
    }
  }

  public void addUpdateListener(ValueAnimator.AnimatorUpdateListener paramAnimatorUpdateListener)
  {
    if (this.mUpdateListeners == null)
      this.mUpdateListeners = new ArrayList();
    this.mUpdateListeners.add(paramAnimatorUpdateListener);
  }

  void animateValue(float paramFloat)
  {
    float f = this.mInterpolator.getInterpolation(paramFloat);
    this.mCurrentFraction = f;
    int i = this.mValues.length;
    for (int j = 0; j < i; j++)
      this.mValues[j].calculateValue(f);
    if (this.mUpdateListeners != null)
    {
      int k = this.mUpdateListeners.size();
      for (int m = 0; m < k; m++)
        ((ValueAnimator.AnimatorUpdateListener)this.mUpdateListeners.get(m)).onAnimationUpdate(this);
    }
  }

  boolean animationFrame(long paramLong)
  {
    int i = 0;
    if (this.mPlayingState == 0)
    {
      this.mPlayingState = 1;
      if (this.mSeekTime >= 0L)
        break label58;
      this.mStartTime = paramLong;
    }
    while (true)
      switch (this.mPlayingState)
      {
      default:
        return false;
        label58: this.mStartTime = (paramLong - this.mSeekTime);
        this.mSeekTime = -1L;
      case 1:
      case 2:
      }
    float f1;
    if (this.mDuration > 0L)
      f1 = (float)(paramLong - this.mStartTime) / (float)this.mDuration;
    boolean bool;
    float f2;
    while (true)
    {
      if (f1 < 1.0F)
        break label279;
      if ((this.mCurrentIteration < this.mRepeatCount) || (this.mRepeatCount == -1))
      {
        if (this.mListeners != null)
        {
          int j = this.mListeners.size();
          int k = 0;
          while (true)
            if (k < j)
            {
              ((Animator.AnimatorListener)this.mListeners.get(k)).onAnimationRepeat(this);
              k++;
              continue;
              f1 = 1.0F;
              break;
            }
        }
        if (this.mRepeatMode == 2)
        {
          if (!this.mPlayingBackwards)
            break;
          bool = false;
          this.mPlayingBackwards = bool;
        }
        else
        {
          this.mCurrentIteration += (int)f1;
          f2 = f1 % 1.0F;
          this.mStartTime += this.mDuration;
        }
      }
    }
    while (true)
    {
      if (this.mPlayingBackwards)
        f2 = 1.0F - f2;
      animateValue(f2);
      return i;
      bool = true;
      break;
      f2 = Math.min(f1, 1.0F);
      i = 1;
      continue;
      label279: f2 = f1;
      i = 0;
    }
  }

  public void cancel()
  {
    if ((this.mPlayingState != 0) || (((ArrayList)sPendingAnimations.get()).contains(this)) || (((ArrayList)sDelayedAnims.get()).contains(this)))
    {
      if ((this.mRunning) && (this.mListeners != null))
      {
        Iterator localIterator = ((ArrayList)this.mListeners.clone()).iterator();
        while (localIterator.hasNext())
          ((Animator.AnimatorListener)localIterator.next()).onAnimationCancel(this);
      }
      endAnimation();
    }
  }

  public ValueAnimator clone()
  {
    int i = 0;
    ValueAnimator localValueAnimator = (ValueAnimator)super.clone();
    if (this.mUpdateListeners != null)
    {
      ArrayList localArrayList = this.mUpdateListeners;
      localValueAnimator.mUpdateListeners = new ArrayList();
      int k = localArrayList.size();
      for (int m = 0; m < k; m++)
        localValueAnimator.mUpdateListeners.add(localArrayList.get(m));
    }
    localValueAnimator.mSeekTime = -1L;
    localValueAnimator.mPlayingBackwards = false;
    localValueAnimator.mCurrentIteration = 0;
    localValueAnimator.mInitialized = false;
    localValueAnimator.mPlayingState = 0;
    localValueAnimator.mStartedDelay = false;
    PropertyValuesHolder[] arrayOfPropertyValuesHolder = this.mValues;
    if (arrayOfPropertyValuesHolder != null)
    {
      int j = arrayOfPropertyValuesHolder.length;
      localValueAnimator.mValues = new PropertyValuesHolder[j];
      localValueAnimator.mValuesMap = new HashMap(j);
      while (i < j)
      {
        PropertyValuesHolder localPropertyValuesHolder = arrayOfPropertyValuesHolder[i].clone();
        localValueAnimator.mValues[i] = localPropertyValuesHolder;
        localValueAnimator.mValuesMap.put(localPropertyValuesHolder.getPropertyName(), localPropertyValuesHolder);
        i++;
      }
    }
    return localValueAnimator;
  }

  public void end()
  {
    if ((!((ArrayList)sAnimations.get()).contains(this)) && (!((ArrayList)sPendingAnimations.get()).contains(this)))
    {
      this.mStartedDelay = false;
      startAnimation();
      if ((this.mRepeatCount <= 0) || ((0x1 & this.mRepeatCount) != 1))
        break label82;
      animateValue(0.0F);
    }
    while (true)
    {
      endAnimation();
      return;
      if (this.mInitialized)
        break;
      initAnimation();
      break;
      label82: animateValue(1.0F);
    }
  }

  public float getAnimatedFraction()
  {
    return this.mCurrentFraction;
  }

  public Object getAnimatedValue()
  {
    if ((this.mValues != null) && (this.mValues.length > 0))
      return this.mValues[0].getAnimatedValue();
    return null;
  }

  public Object getAnimatedValue(String paramString)
  {
    PropertyValuesHolder localPropertyValuesHolder = (PropertyValuesHolder)this.mValuesMap.get(paramString);
    if (localPropertyValuesHolder != null)
      return localPropertyValuesHolder.getAnimatedValue();
    return null;
  }

  public long getCurrentPlayTime()
  {
    if ((!this.mInitialized) || (this.mPlayingState == 0))
      return 0L;
    return AnimationUtils.currentAnimationTimeMillis() - this.mStartTime;
  }

  public long getDuration()
  {
    return this.mDuration;
  }

  public Interpolator getInterpolator()
  {
    return this.mInterpolator;
  }

  public int getRepeatCount()
  {
    return this.mRepeatCount;
  }

  public int getRepeatMode()
  {
    return this.mRepeatMode;
  }

  public long getStartDelay()
  {
    return this.mStartDelay;
  }

  public PropertyValuesHolder[] getValues()
  {
    return this.mValues;
  }

  void initAnimation()
  {
    if (!this.mInitialized)
    {
      int i = this.mValues.length;
      for (int j = 0; j < i; j++)
        this.mValues[j].init();
      this.mInitialized = true;
    }
  }

  public boolean isRunning()
  {
    return (this.mPlayingState == 1) || (this.mRunning);
  }

  public boolean isStarted()
  {
    return this.mStarted;
  }

  public void removeAllUpdateListeners()
  {
    if (this.mUpdateListeners == null)
      return;
    this.mUpdateListeners.clear();
    this.mUpdateListeners = null;
  }

  public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener paramAnimatorUpdateListener)
  {
    if (this.mUpdateListeners == null);
    do
    {
      return;
      this.mUpdateListeners.remove(paramAnimatorUpdateListener);
    }
    while (this.mUpdateListeners.size() != 0);
    this.mUpdateListeners = null;
  }

  public void reverse()
  {
    if (!this.mPlayingBackwards);
    for (boolean bool = true; ; bool = false)
    {
      this.mPlayingBackwards = bool;
      if (this.mPlayingState != 1)
        break;
      long l1 = AnimationUtils.currentAnimationTimeMillis();
      long l2 = l1 - this.mStartTime;
      this.mStartTime = (l1 - (this.mDuration - l2));
      return;
    }
    start(true);
  }

  public void setCurrentPlayTime(long paramLong)
  {
    initAnimation();
    long l = AnimationUtils.currentAnimationTimeMillis();
    if (this.mPlayingState != 1)
    {
      this.mSeekTime = paramLong;
      this.mPlayingState = 2;
    }
    this.mStartTime = (l - paramLong);
    animationFrame(l);
  }

  public ValueAnimator setDuration(long paramLong)
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("Animators cannot have negative duration: " + paramLong);
    this.mDuration = paramLong;
    return this;
  }

  public void setEvaluator(TypeEvaluator paramTypeEvaluator)
  {
    if ((paramTypeEvaluator != null) && (this.mValues != null) && (this.mValues.length > 0))
      this.mValues[0].setEvaluator(paramTypeEvaluator);
  }

  public void setFloatValues(float[] paramArrayOfFloat)
  {
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length == 0))
      return;
    if ((this.mValues == null) || (this.mValues.length == 0))
    {
      PropertyValuesHolder[] arrayOfPropertyValuesHolder = new PropertyValuesHolder[1];
      arrayOfPropertyValuesHolder[0] = PropertyValuesHolder.ofFloat("", paramArrayOfFloat);
      setValues(arrayOfPropertyValuesHolder);
    }
    while (true)
    {
      this.mInitialized = false;
      return;
      this.mValues[0].setFloatValues(paramArrayOfFloat);
    }
  }

  public void setIntValues(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
      return;
    if ((this.mValues == null) || (this.mValues.length == 0))
    {
      PropertyValuesHolder[] arrayOfPropertyValuesHolder = new PropertyValuesHolder[1];
      arrayOfPropertyValuesHolder[0] = PropertyValuesHolder.ofInt("", paramArrayOfInt);
      setValues(arrayOfPropertyValuesHolder);
    }
    while (true)
    {
      this.mInitialized = false;
      return;
      this.mValues[0].setIntValues(paramArrayOfInt);
    }
  }

  public void setInterpolator(Interpolator paramInterpolator)
  {
    if (paramInterpolator != null)
    {
      this.mInterpolator = paramInterpolator;
      return;
    }
    this.mInterpolator = new LinearInterpolator();
  }

  public void setObjectValues(Object[] paramArrayOfObject)
  {
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0))
      return;
    if ((this.mValues == null) || (this.mValues.length == 0))
    {
      PropertyValuesHolder[] arrayOfPropertyValuesHolder = new PropertyValuesHolder[1];
      arrayOfPropertyValuesHolder[0] = PropertyValuesHolder.ofObject("", null, paramArrayOfObject);
      setValues(arrayOfPropertyValuesHolder);
    }
    while (true)
    {
      this.mInitialized = false;
      return;
      this.mValues[0].setObjectValues(paramArrayOfObject);
    }
  }

  public void setRepeatCount(int paramInt)
  {
    this.mRepeatCount = paramInt;
  }

  public void setRepeatMode(int paramInt)
  {
    this.mRepeatMode = paramInt;
  }

  public void setStartDelay(long paramLong)
  {
    this.mStartDelay = paramLong;
  }

  public void setValues(PropertyValuesHolder[] paramArrayOfPropertyValuesHolder)
  {
    int i = paramArrayOfPropertyValuesHolder.length;
    this.mValues = paramArrayOfPropertyValuesHolder;
    this.mValuesMap = new HashMap(i);
    for (int j = 0; j < i; j++)
    {
      PropertyValuesHolder localPropertyValuesHolder = paramArrayOfPropertyValuesHolder[j];
      this.mValuesMap.put(localPropertyValuesHolder.getPropertyName(), localPropertyValuesHolder);
    }
    this.mInitialized = false;
  }

  public void start()
  {
    start(false);
  }

  public String toString()
  {
    String str = "ValueAnimator@" + Integer.toHexString(hashCode());
    if (this.mValues != null)
      for (int i = 0; i < this.mValues.length; i++)
        str = str + "\n    " + this.mValues[i].toString();
    return str;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nineoldandroids.animation.ValueAnimator
 * JD-Core Version:    0.6.0
 */