package au.id.bennettscash.runtracker;

import android.support.v4.app.Fragment;

/**
 * Created by chris on 19/04/2016.
 */
public class RunListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new RunListFragment();
    }
}
