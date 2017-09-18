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

    private boolean running;
    private int lapCount;
    private long totalTime;
    private long lastTime;
    private int lapLength;
    private long lapStartTime;

    /**
     * Create a TimingEngine object. The object will be initialized at 0,
     * status is "Stopped", ready to start timing. The default lap length
     * is 400m.
     */
    public TimingEngine()
    {
        
    }

    
    /**
     * Instruct the timer to start timing a lap.
     * If we were not timing before, this starts the timer for a new 
     * run. If we were already timing, this starts a new lap, adding the
     * current lap time to the total.
     */
    public void startLap()
    {
        
    }
    
    
    /**
     * Stop timing. Add the current lap time to the total, and set
     * the timer into idle mode (waiting for a new run).
     */
    public void stop()
    {
    }
    
    
    /**
     * Return the current status of the timer. The status is one of the
     * two Strings "Timing..." or "Stopped", indicating whether this 
     * timer is currently running or stopped.
     */
    public String getStatus()
    {
       return ""; //return the current status
    }
    
    
    /**
     * Return the number of laps completed in this run.
     */
    public int getLapCount()
    {
        return 0; // return number of laps
    }
    
    
    /**
     * Return the time of the last lap completed.
     * 
     */
    public long getLastTime()
    {
        return 0; //return the time of the last lap
    }
    

    /**
     * Return the average time for a lap in this run.
     */
    public long getAverageTime()
    {
       return 0; //return the average time
    }
    
    
    /**
     * Return the total time of the last or current run.
     */
    public long getTotalTime()
    {
        return 0; //return the total time
    }
    
    
    /**
     * Return the average speed in this run in meters per second.
     * The result is a String such as "73 m/s".
     */
    public String getAverageSpeed()
    {
    	return ""; //return the average speed
    }
    
    
    /**
     * Return the length of a lap.
     */
    public int getLapLength()
    {
    	return 0; //return the length of the lap
    }
    
    
    /**
     * Set the length of a lap.
     */
    public void setLapLength(int length)
    {
    }
    

    /**
     * Private method called whenever a lap is finished. This method
     * updates the statistics.
     */
    private void finishLap()
    {
    }
    

    
    
    
    /**
     * Return the current time of the system clock (in milli-seconds).
     */
    private long getSystemTime()
    {
        return System.currentTimeMillis();
    }
}



