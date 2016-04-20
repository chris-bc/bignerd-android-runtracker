package au.id.bennettscash.runtracker;

import java.util.Date;

/**
 * Created by chris on 4/09/15.
 */
public class Run {
    private long id;
    private Date startDate;

    public Run() {
        id = -1;
        startDate = new Date();
    }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public int getDurationSeconds(long endMillis) {
        return (int)((endMillis - startDate.getTime()) / 1000);
    }

    public static String formatDuration(int durationSeconds) {
        int seconds = durationSeconds % 60;
        int minutes = ((durationSeconds - seconds) / 60) % 60;
        int hours = (durationSeconds - (minutes * 60) - seconds) / 3600;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
