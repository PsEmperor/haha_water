package ps.emperor.hyyyyy;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

public class ActivityCollector {
	
	public static List<Activity> list  = new ArrayList<Activity>();
	
	public static void addAct(Activity act){
		list.add(act);
	}
	
	public static void removeAct(Activity act){
		list.remove(act);
	}
	
	public static void removeAll(){
		for(Activity act : list){
			if(!act.isFinishing()){
				act.finish();
			}
		}
	}

}
