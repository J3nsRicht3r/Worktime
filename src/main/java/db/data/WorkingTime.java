package db.data;

public class WorkingTime {
    int ID;
    int EID;
    String DateBeginn;
    String DateEnd;
    String TimeStart;
    String TimeEnd;
    String WorkTime;
    String BreakTime;


    public WorkingTime(String id, String eid, String datebeginn, String dateend, String timestart, String timeend, String worktime, String breaktime) {
        this.ID = Integer.parseInt(id);
        this.EID = Integer.parseInt(eid);
        this.DateBeginn = datebeginn;
        this.DateEnd = dateend;
        this.TimeStart = timestart;
        this.TimeEnd = timeend;
        this.WorkTime = worktime;
        this.BreakTime = breaktime;

    }

    public int getID() {
        return ID;
    }

    public int getEID() {
        return EID;
    }

    public String getDateBeginn() {
        return DateBeginn;
    }

    public String getDateEnd() {
        return DateEnd;
    }

    public String getTimeStart() {
        return TimeStart;
    }

    public String getTimeEnd() {
        return TimeEnd;
    }

    public String getWorkTime() {
        return WorkTime;
    }

    public String getBreakTime() {
        return BreakTime;
    }
}
