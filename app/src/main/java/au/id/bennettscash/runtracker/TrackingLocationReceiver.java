package au.id.bennettscash.runtracker;

import android.content.Context;
import android.location.Location;

/**
 * Created by chris on 18/04/2016.
 */
public class TrackingLocationReceiver extends LocationReceiver {

    @Override
    protected void onLocationReceived(Context c, Location loc) {
        RunManager.get(c).insertLocation(loc);
    }
}
