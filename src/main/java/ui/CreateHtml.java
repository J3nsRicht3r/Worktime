package ui;


import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateHtml {


    public void WriteHtml() {
        Document doc = Document.createShell("");

        Element headline = doc.body().appendElement("h1").text("Arbeitszeiterfassung");
        Element pTag = doc.body().appendElement("p").text("some text ...");
        Element span = pTag.prependElement("span").text("That's");
        try {
            String filepath = "D:\\Worktime\\src\\main\\index.html";
            File file = new File(filepath);
            file.createNewFile();
            PrintWriter writer = new PrintWriter(new FileWriter(file), true);
            writer.print(doc);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
