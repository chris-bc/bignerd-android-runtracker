package au.id.bennettscash.runtracker;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

/**
 * Created by chris on 30/04/2016.
 */
public abstract class DataLoader<D> extends AsyncTaskLoader<D> {
    private D data;

    public DataLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        if (data != null) {
            deliverResult(data);
        } else {
            forceLoad();
        }
    }

    @Override
    public void deliverResult(D data) {
        this.data = data;
        if (isStarted())
            super.deliverResult(data);
    }
}
