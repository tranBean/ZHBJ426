package com.example.zhbj426;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
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
	    				
	    				rl_root.startAnimation(animaSet);
		            
	}
}
