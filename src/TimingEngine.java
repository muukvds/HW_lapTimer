/**
 * The timer engine for a lap timer application. This engine can keep
 * track of a 'run'. A run is a sequence of one or more consecutive laps.
 * The timer records single lap times and the time for the total run,
 * and it calculate averages and speed.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

 /*# 
  * Your task: 
  * - complete the comment above (add your names and version)
  * - implement this class
  * - test until you are convinced that it works correctly
  */

public class TimingEngine {

    /**
     * instance variablest
     */
    private String status;
    private boolean running;
    private int lapCount;
    private long totalTime;
    private long lastTime;
    private int lapLength ;
    private long lapStartTime;

    /**
     * Create a TimingEngine object. The object will be initialized at 0,
     * status is "Stopped", ready to start timing. The default lap length
     * is 400m.
     */
    public TimingEngine() {

        status ="Stopped";
        running = false;
        lapCount =1;
        totalTime =0;
        lastTime=0;
        lapLength = 400;
        lapStartTime = 0;
    }


    /**
     * Instruct the timer to start timing a lap.
     * If we were not timing before, this starts the timer for a new
     * run. If we were already timing, this starts a new lap, adding the
     * current lap time to the total.
     */
    public void startLap() {
        status = "Timing...";
        if(running)
        {
            finishLap();
        }
        else
        {
            running = true;
            lapStartTime = getSystemTime();
            totalTime =0;
            lapCount =1;
            lastTime =0;
        }
    }


    /**
     * Stop timing. Add the current lap time to the total, and set
     * the timer into idle mode (waiting for a new run).
     */
    public void stop() {
        if(running) {
            running = false;
            status = "waiting for a new run";
            totalTime += lastTime;
        }
    }


    /**
     * Return the current status of the timer. The status is one of the
     * two Strings "Timing..." or "Stopped", indicating whether this
     * timer is currently running or stopped.
     */
    public String getStatus() {
        return status; //return the current status
    }


    /**
     * Return the number of laps completed in this run.
     */
    public int getLapCount() {
        return lapCount; // return number of laps
    }


    /**
     * Return the time of the last lap completed.
     */
    public long getLastTime() {
        return lastTime; //return the time of the last lap
    }


    /**
     * Return the average time for a lap in this run.
     */
    public long getAverageTime() {
        return totalTime / lapCount; //return the average time
    }


    /**
     * Return the total time of the last or current run.
     */
    public long getTotalTime() {
        return totalTime; //return the total time
    }


    /**
     * Return the average speed in this run in meters per second.
     * The result is a String such as "73 m/s".
     */
    public String getAverageSpeed() {
        return getAverageTime() / lapLength/ lapCount + " m/s"; //return the average speed
    }


    /**
     * Return the length of a lap.
     */
    public int getLapLength() {
        return lapLength; //return the length of the lap
    }


    /**
     * Set the length of a lap.
     */
    public void setLapLength(int length) {
        this.lapLength = length;
    }


    /**
     * Private method called whenever a lap is finished. This method
     * updates the statistics.
     */
    private void finishLap() {
        lastTime = getSystemTime() - lapStartTime;
        totalTime += lastTime;
        lapStartTime = getSystemTime();
        lapCount++;
    }


    /**
     * Return the current time of the system clock (in milli-seconds).
     */
    private long getSystemTime() {
        return System.currentTimeMillis();
    }
}



