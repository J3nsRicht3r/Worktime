package db.read;

import db.data.WorkingTime;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class WorkingTimeReadCsv {
    private int id = 0;
    private int eid = 1;
    private int datebeginn = 2;
    private int dateend = 3;
    private int timebeginn = 4;
    private int timeend = 5;
    private int worktime = 6;
    private int breaktime = 7;

    public ArrayList<WorkingTime> ReadCsv() {

        String filename = "D:\\Worktime\\src\\main\\resources\\workingtime.csv";
        String raw;
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))) {
            ArrayList<WorkingTime> workingtimelist = new ArrayList();
            raw = fileReader.readLine();

            while (raw != null) {
                String[] tokens = raw.split(",");
                if (tokens.length >= 0) {
                    var workingtime = new WorkingTime(tokens[id], tokens[eid], tokens[datebeginn], tokens[dateend], tokens[timebeginn], tokens[timeend], tokens[worktime], tokens[breaktime]);
                    workingtimelist.add(workingtime);
                }
                raw = fileReader.readLine();
            }
            return workingtimelist;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
