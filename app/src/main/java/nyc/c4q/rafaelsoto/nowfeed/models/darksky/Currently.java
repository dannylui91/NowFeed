package nyc.c4q.rafaelsoto.nowfeed.models.darksky;

/**
 * Created by dannylui on 10/25/16.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Currently {

    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("summary")
    @Expose
    public String summary;
    @SerializedName("icon")
    @Expose
    public String icon;
    @SerializedName("nearestStormDistance")
    @Expose
    public Integer nearestStormDistance;
    @SerializedName("nearestStormBearing")
    @Expose
    public Integer nearestStormBearing;
    @SerializedName("precipIntensity")
    @Expose
    public Double precipIntensity;
    @SerializedName("precipProbability")
    @Expose
    public Double precipProbability;
    @SerializedName("temperature")
    @Expose
    public Double temperature;
    @SerializedName("apparentTemperature")
    @Expose
    public Double apparentTemperature;
    @SerializedName("dewPoint")
    @Expose
    public Double dewPoint;
    @SerializedName("humidity")
    @Expose
    public Double humidity;
    @SerializedName("windSpeed")
    @Expose
    public Double windSpeed;
    @SerializedName("windBearing")
    @Expose
    public Integer windBearing;
    @SerializedName("visibility")
    @Expose
    public Double visibility;
    @SerializedName("cloudCover")
    @Expose
    public Double cloudCover;
    @SerializedName("pressure")
    @Expose
    public Double pressure;

    public Double getOzone() {
        return ozone;
    }

    public String getSummary() {
        return summary;
    }

    public String getIcon() {
        return icon;
    }

    public Integer getNearestStormDistance() {
        return nearestStormDistance;
    }

    public Integer getNearestStormBearing() {
        return nearestStormBearing;
    }

    public Double getPrecipIntensity() {
        return precipIntensity;
    }

    public Double getPrecipProbability() {
        return precipProbability;
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getApparentTemperature() {
        return apparentTemperature;
    }

    public Double getDewPoint() {
        return dewPoint;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public Integer getWindBearing() {
        return windBearing;
    }

    public Double getVisibility() {
        return visibility;
    }

    public Double getCloudCover() {
        return cloudCover;
    }

    public Double getPressure() {
        return pressure;
    }

    public Integer getTime() {
        return time;
    }

    @SerializedName("ozone")
    @Expose
    public Double ozone;


}
