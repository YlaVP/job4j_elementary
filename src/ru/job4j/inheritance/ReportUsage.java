package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate("name", "body");
        System.out.println(text);

        HtmlReport report1 = new HtmlReport();
        String text1 = report1.generate("name", "body");
        System.out.println(text1);


        TextReport report2 = new TextReport();
        String text2 = report2.generate("Report's name", "Report's body");
        System.out.println(text2);
    }
}
