package nyc.c4q.rafaelsoto.nowfeed.models.darksky;

/**
 * Created by dannylui on 10/25/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Daily {

    @SerializedName("summary")
    @Expose
    public String summary;
    @SerializedName("icon")
    @Expose
    public String icon;
    @SerializedName("data")
    @Expose
    public List<Datum__> data = new ArrayList<Datum__>();

    public String getSummary() {
        return summary;
    }

    public String getIcon() {
        return icon;
    }

    public List<Datum__> getData() {
        return data;
    }
}
