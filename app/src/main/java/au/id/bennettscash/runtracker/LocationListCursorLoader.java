package au.id.bennettscash.runtracker;

import android.content.Context;
import android.database.Cursor;

/**
 * Created by chris on 30/04/2016.
 */
public class LocationListCursorLoader extends SQLiteCursorLoader {
    private long runId;

    public LocationListCursorLoader(Context context, long runId) {
        super(context);
        this.runId = runId;
    }

    @Override
    protected Cursor loadCursor() {
        return RunManager.get(getContext()).queryLocationsForRun(runId);
    }
}
