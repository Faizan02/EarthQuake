package project.com.myapplication;


public class Earthquake {
    private Double mMaggnitude;
    private String mLocation;
     private long mTimeInMilliseconds;
    private String mUrl;

    public     Earthquake(Double mamgnitude, String location , long date, String url)
    {
        mMaggnitude=mamgnitude;
        mLocation=location;
        mTimeInMilliseconds=date;
        mUrl=url;

    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmLocation() {
        return mLocation;
    }

    public Double getmMaggnitude() {
        return mMaggnitude;
    }

    public String getmUrl() {
        return mUrl;
    }
}
