package au.id.bennettscash.runtracker;

import android.support.v4.app.Fragment;

/**
 * Created by chris on 30/04/2016.
 */
public class RunMapActivity extends SingleFragmentActivity {
    /** A key for passing in a run ID as a long */
    public static final String EXTRA_RUN_ID = "au.id.bennettscash.android.runtracker.run_id";

    @Override
    protected Fragment createFragment() {
        long runId = getIntent().getLongExtra(EXTRA_RUN_ID, -1);
        if (runId != -1) {
            return RunMapFragment.newInstance(runId);
        } else {
            return new RunMapFragment();
        }
    }
}
