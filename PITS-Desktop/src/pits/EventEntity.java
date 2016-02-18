package pits;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import com.kinvey.java.model.KinveyMetaData;

/**
 * Created by sandi on 2/13/2016.
 */
public class EventEntity extends GenericJson {
    @Key("_id")
    private String id;
    @Key
    private String name;
    @Key
    private String location;
    @Key
    private String date;
    @Key("_kmd")
    private KinveyMetaData meta; // Kinvey metadata, OPTIONAL
    @Key("_acl")
    private KinveyMetaData.AccessControlList acl; //Kinvey access control, OPTIONAL
    public EventEntity(){}  //GenericJson classes must have a public empty constructor

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
       //
    }
}