package App.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Holger Szuesz <hszuesz@live.com>
 */
public class Task extends Base
{
    private int     UID;
    private int     lngParent;
    private String  strName;
    private String  txtDescription;
    private Date    dtmCreated;
    private Date    dtmDeadline;
    private String  strStatus;
    private Boolean flgDeleted;
    private int     tblProject_UID;
    private int     tblUser_UID;
    
    public Task(Map<String, String> mapData) {
        super();
        
        SimpleDateFormat objParser = new SimpleDateFormat("yyyy-mm-dd");
        
        this.UID            = Integer.parseInt(mapData.get("UID"));
        this.lngParent      = Integer.parseInt(mapData.get("LNGPARENT"));
        this.strName        = mapData.get("STRNAME");
        this.txtDescription = mapData.get("TXTDESCRIPTION");
        
        try {
            this.dtmCreated     = objParser.parse(mapData.get("DTMCREATED"));
            this.dtmDeadline    = objParser.parse(mapData.get("DTMDEADLINE"));
        } catch (ParseException ex) {
            Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.strStatus      = mapData.get("STRSTATUS");
        this.flgDeleted     = Boolean.parseBoolean(mapData.get("FLGDELETED"));
        this.tblProject_UID = Integer.parseInt(mapData.get("TBLPROJECT_UID"));
        this.tblUser_UID    = Integer.parseInt(mapData.get("TBLUSER_UID"));
    }

    public int getUID() {
        return UID;
    }

    public Task setUID(int UID) {
        this.UID = UID;
        
        return this;
    }

    public int getLngParent() {
        return lngParent;
    }

    public Task setLngParent(int lngParent) {
        this.lngParent = lngParent;
        
        return this;
    }

    public String getStrName() {
        return strName;
    }

    public Task setStrName(String strName) {
        this.strName = strName;
        
        return this;
    }

    public String getTxtDescription() {
        return txtDescription;
    }

    public Task setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
        
        return this;
    }

    public Date getDtmCreated() {
        return dtmCreated;
    }

    public Task setDtmCreated(Date dtmCreated) {
        this.dtmCreated = dtmCreated;
        
        return this;
    }

    public Date getDtmDeadline() {
        return dtmDeadline;
    }

    public Task setDtmDeadline(Date dtmDeadline) {
        this.dtmDeadline = dtmDeadline;
        
        return this;
    }

    public String getStrStatus() {
        return strStatus;
    }

    public Task setStrStatus(String strStatus) {
        this.strStatus = strStatus;
        
        return this;
    }

    public Boolean isFlgDeleted() {
        return flgDeleted;
    }

    public Task setFlgDeleted(Boolean flgDeleted) {
        this.flgDeleted = flgDeleted;
        
        return this;
    }

    public int getTblProject_UID() {
        return tblProject_UID;
    }

    public Task setTblProject_UID(int tblProject_UID) {
        this.tblProject_UID = tblProject_UID;
        
        return this;
    }

    public int getTblUser_UID() {
        return tblUser_UID;
    }

    public Task setTblUser_UID(int tblUser_UID) {
        this.tblUser_UID = tblUser_UID;
        
        return this;
    }
    
    
}
