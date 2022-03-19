package com.company;

public abstract class AirTransport extends Transport {
    private int wingspan;
    private int minRunwayLengthForTakeoff;

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinRunwayLengthForTakeoff() {
        return minRunwayLengthForTakeoff;
    }

    public void setMinRunwayLengthForTakeoff(int minRunwayLengthForTakeoff) {
        this.minRunwayLengthForTakeoff = minRunwayLengthForTakeoff;
    }
}
