package au.id.bennettscash.runtracker;

import android.content.Context;

/**
 * Created by chris on 30/04/2016.
 */
public class RunLoader extends DataLoader<Run> {
    private long runId;

    public RunLoader(Context context, long runId) {
        super (context);
        this.runId = runId;
    }

    @Override
    public Run loadInBackground() {
        return RunManager.get(getContext()).getRun(runId);
    }
}
