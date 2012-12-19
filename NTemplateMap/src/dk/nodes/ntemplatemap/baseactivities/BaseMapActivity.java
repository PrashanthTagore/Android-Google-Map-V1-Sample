package dk.nodes.ntemplatemap.baseactivities;

import android.location.Location;
import android.os.Bundle;
import dk.nodes.map.v1.NBaseMapActivityV1;
import dk.nodes.ntemplatemap.App;
	public class BaseMapActivity extends NBaseMapActivityV1{

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
		}

		@Override
		public void onLocationChanged(Location mLocation) {
			App.myLocation.setMyLocation(getBaseContext(), mLocation, false);
			super.onLocationChanged(mLocation);
		}
	
		
}