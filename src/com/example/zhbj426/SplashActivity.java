package com.example.zhbj426;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;

public class SplashActivity extends Activity {

	RelativeLayout rl_root; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		rl_root = (RelativeLayout)findViewById(R.id.rl_root);
		startAnima();
	}
	
	public void startAnima(){
		AnimationSet animaSet = new AnimationSet(false);
		
		
		RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF
								, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
	                    rotate.setDuration(1000);
	                    rotate.setFillAfter(true);
    
	    ScaleAnimation  scale = new ScaleAnimation(0, 1, 0, 1, Animation.RELATIVE_TO_SELF
	    						, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
	    				scale.setDuration(1000);
	    				scale.setFillAfter(true);
	    
	    AlphaAnimation	alpha = new AlphaAnimation(0,1);
	    				scale.setDuration(1000);
	    				scale.setFillAfter(true);
	    				
	    				
	    				animaSet.addAnimation(rotate);
	    				animaSet.addAnimation(scale);
	    				animaSet.addAnimation(alpha);
	    				
	    				animaSet.setAnimationListener(new AnimationListener() {
							
							@Override
							public void onAnimationStart(Animation animation) {
								// TODO Auto-generated method stub
								
							}
							
							@Override
							public void onAnimationRepeat(Animation animation) {
								// TODO Auto-generated method stub
								
							}
							
							@Override//SplashActivity-->GuideActivity 跳转
							public void onAnimationEnd(Animation animation) {
								startActivity(new Intent(SplashActivity.this, GuideActivity.class));
								finish();//跳转完后结束当前页面
							}
						});
	    				
	    				rl_root.startAnimation(animaSet);
		            
	}
}
