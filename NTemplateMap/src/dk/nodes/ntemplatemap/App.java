package dk.nodes.ntemplatemap;

import java.util.ArrayList;

import android.app.Application;
import android.location.Location;

import com.google.android.maps.GeoPoint;

import dk.nodes.controllers.NScreenParameterController;
import dk.nodes.controllers.nheap.NHeapController;
import dk.nodes.map.NGetMyPositionNow;
import dk.nodes.map.NGetMyPositionNow.NGetMyPositionNowListener;
import dk.nodes.map.NMyLocation;
import dk.nodes.map.v1.NLocationCalculatorV1;


public class App extends Application {

	public static final int DEFINITION_OF_SMALL_HEAP = 31;
	public static NMyLocation myLocation = new NMyLocation();
	public static ArrayList<GeoPoint> tempList = new ArrayList<GeoPoint>();
	
	@Override
	public void onCreate() {
		NScreenParameterController.getScreenParameters(getBaseContext(),false);
		NHeapController.logHeap();
		setGeoPointList();
		new NGetMyPositionNow(getBaseContext(),new NGetMyPositionNowListener() {
			
			@Override
			public void onOtherLocationsFound(Location location) {
				myLocation.setMyLocation(getBaseContext(), location, false);
			}
			
			@Override
			public void onFirstLocationFound(Location location) {
				myLocation.setMyLocation(getBaseContext(), location, true);		
			}
		});
	}

	private void setGeoPointList(){
		tempList.clear();
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6692,12.5796));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6659,12.5785));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6711,12.5766));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6722,12.5797));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6722,12.5797));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6728,12.5768));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.676,12.5751));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6757,12.5736));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6763,12.5742));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6753,12.5728));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6771,12.5756));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6777,12.5782));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6777,12.5765));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6776,12.5811));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6764,12.5734));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6779,12.5773));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6778,12.5767));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6778,12.5767));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.678,12.5776));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.678,12.5807));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6781,12.5803));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6787,12.5789));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6758,12.5715));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6787,12.5792));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6788,12.5802));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6759,12.5712));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6768,12.5721));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6765,12.5713));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6784,12.5741));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6784,12.5741));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6794,12.5776));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6794,12.5774));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6776,12.5721));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6771,12.5713));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.68,12.5787));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6794,12.5749));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6794,12.5749));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6787,12.5732));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6779,12.5719));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6768,12.5706));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6793,12.5744));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6801,12.579));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.68,12.5757));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6796,12.5828));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6783,12.5718));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6774,12.5706));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6783,12.5716));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.678,12.5712));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6802,12.5755));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6802,12.5755));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6788,12.5722));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6806,12.5771));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6798,12.5831));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6807,12.5792));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6796,12.5836));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6801,12.5824));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6737,12.5895));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6801,12.5745));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6779,12.5706));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6779,12.5705));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6778,12.5703));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6776,12.57));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6811,12.5786));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6811,12.5792));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6773,12.5696));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.681,12.5805));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6811,12.5798));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6797,12.5844));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6811,12.5804));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.672,12.5906));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6774,12.5695));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6811,12.5806));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6774,12.5694));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6812,12.5807));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6709,12.591));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6798,12.5848));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6798,12.5848));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6813,12.581));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6802,12.5843));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6805,12.5732));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.679,12.5707));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6737,12.5907));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6715,12.5914));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6816,12.5817));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6815,12.5821));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6814,12.5828));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6815,12.5826));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6758,12.5671));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6812,12.5837));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6806,12.5719));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6786,12.5691));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6821,12.5814));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6782,12.5686));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6819,12.5825));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6757,12.5667));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6757,12.5667));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6757,12.5667));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6757,12.5667));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.682,12.5824));
		tempList.add(NLocationCalculatorV1.doubleToGeoPoint(55.6823,12.5816));
	}
}
