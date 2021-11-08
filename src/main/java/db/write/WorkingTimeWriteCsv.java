package db.write;

import db.data.WorkingTime;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WorkingTimeWriteCsv {
    private final int id;
    private final int eid;
    private final String datebeginn;
    private final String dateend;
    private final String timestart;
    private final String timeend;
    private final String worktime;
    private final String breaktime;
    private String raw;

    public WorkingTimeWriteCsv(WorkingTime workingtime) {
        this.id = workingtime.getID();
        this.eid = workingtime.getEID();
        this.datebeginn = workingtime.getDateBeginn();
        this.dateend = workingtime.getDateEnd();
        this.timestart = workingtime.getTimeStart();
        this.timeend = workingtime.getTimeEnd();
        this.worktime = workingtime.getWorkTime();
        this.breaktime = workingtime.getBreakTime();
    }

    public String Raw() {
        raw = id + "," + eid + "," + datebeginn + "," + dateend + "," + timestart + "," + timeend + "," + worktime + "," + breaktime;
        return raw;
    }

    public void WriteCsv() {
        try {
            String filepath = "D:\\Worktime\\src\\main\\resources\\employee.csv";
            File file = new File(filepath);
            file.createNewFile();
            PrintWriter writeraw = new PrintWriter(new FileWriter(file, true), true);
            writeraw.println(raw);
            writeraw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
