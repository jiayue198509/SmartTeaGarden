package com.tianciqinyun.smartteagarden.animators;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;


public class BaseAnimation {
    public AnimatorSet animator;
    private final View rootView;

    public BaseAnimation(View rootView) {
        this.rootView = rootView;
        initializeAnimator();
    }

    private void initializeAnimator() {
        Animator avatar1Animator = getScaleAnimator(rootView);

        animator = new AnimatorSet();
        animator.play(avatar1Animator);
    }

    private AnimatorSet getScaleAnimator(final View targetView) {
        AnimatorSet animator = new AnimatorSet();
        animator.setDuration(2500);
        animator.setInterpolator(new BounceInterpolator());
        ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(targetView, View.SCALE_X, 0f, 1f);
        ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(targetView, View.SCALE_Y, 0f, 1f);
        animator.playTogether(scaleXAnimator, scaleYAnimator);
        return animator;
    }

    public void play() {
        animator.start();
    }

}

