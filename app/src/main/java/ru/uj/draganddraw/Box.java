package ru.uj.draganddraw;

import android.graphics.PointF;

/**
 * Created by Blokhin Evgeny on 20.09.2018.
 */
public class Box {
    private PointF mOrigin;
    private PointF mCurrent;
    private PointF mPointerOrigin;
    private float  angle;

    public Box(PointF origin) {
        mOrigin = origin;
        mCurrent = origin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }

    public PointF getOrigin() {
        return mOrigin;
    }

    public PointF getPointerOrigin() {
        return mPointerOrigin;
    }

    public void setPointerOrigin(PointF pointerOrigin) {
        mPointerOrigin = pointerOrigin;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }
}
