package dk.nodes.ntemplatemap;

import android.os.Bundle;

import com.google.android.maps.GeoPoint;

import dk.nodes.map.v1.NMapViewV1;
import dk.nodes.map.v1.NMapViewV1.NOnMapListener;
import dk.nodes.map.v1.overlays.nballon.OnBalloonViewListener;
import dk.nodes.map.v1.overlays.ncluster.model.NOverlayItemV1;
import dk.nodes.map.v1.overlays.nclusterwithballoon.NClusterOverlayWithBalloonV1;
import dk.nodes.ntemplatemap.baseactivities.BaseMapActivity;


public class MapActivity extends BaseMapActivity{
	NClusterOverlayWithBalloonV1 clusterOverlay;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.page_map);

		mapView = (NMapViewV1) findViewById(R.id.googlemap_mv);	
		mapView.setNOnMapListener(new NOnMapListener() {
			
			@Override
			public void NOnMapListenerOnZoom() {
		
			}
			
			@Override
			public void NOnMapListenerOnPan() {
	
			}
			
			@Override
			public void NOnMapListenerOnMapIsStill() {
				clusterOverlay.recalculatePOI(250);
			}
		});
		
		mapOverlays = mapView.getOverlays();


		clusterOverlay = new NClusterOverlayWithBalloonV1(getBaseContext(),mapView,this, new OnBalloonViewListener(){

			@Override
			public void onBalloonViewSet() {
			}
			
		});
		mapOverlays.add(clusterOverlay);
		
		setPins();
	}

	private void setPins() {
		clusterOverlay.clear();

		for(GeoPoint gp : App.tempList){
			NOverlayItemV1 mOverlayItem = new NOverlayItemV1(gp,"", "Point", "LOOOOOOOOOOOOOOOOOOOOOOO \n OOOOOOOOOOOOOOOOONG");
			clusterOverlay.addOverlay(mOverlayItem);
		}
		clusterOverlay.recalculatePOI();
	}	
}
