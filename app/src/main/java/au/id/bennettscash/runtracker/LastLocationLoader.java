package au.id.bennettscash.runtracker;

import android.content.Context;
import android.location.Location;

/**
 * Created by chris on 30/04/2016.
 */
public class LastLocationLoader extends DataLoader<Location> {
    private long runId;

    public LastLocationLoader(Context context, long runId) {
        super(context);
        this.runId = runId;
    }

    @Override
    public Location loadInBackground() {
        return RunManager.get(getContext()).getLastLocationForRun(runId);
    }
}
