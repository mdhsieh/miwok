// completely UNRELATED class that simulates a student's report card
// this has its own main method, right click to run this class
public class ReportCard {

    private String name;
    private double englishGrade;
    private double mathGrade;
    private double historyGrade;
    private double chemistryGrade;

    public ReportCard(String name, double englishGrade, double mathGrade,
                      double historyGrade, double chemistryGrade)
    {
        this.name = name;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.chemistryGrade = chemistryGrade;
    }

    @Override
    public String toString() {
        String reportCard = "";
        reportCard += "Name: " + getName() + "\n";
        reportCard += "English grade: " + getEnglishGrade() + "\n";
        reportCard += "Math grade: " + getMathGrade() + "\n";
        reportCard += "History grade: " + getHistoryGrade() + "\n";
        reportCard += "Chemistry grade: " + getChemistryGrade() + "\n";
        return reportCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double grade) {
        englishGrade = grade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double grade) {
        mathGrade = grade;
    }

    public double getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(double grade) {
        historyGrade = grade;
    }

    public double getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(double grade) {
        chemistryGrade = grade;
    }

    public static void main(String[] args)
    {
        ReportCard reportCard = new ReportCard("Michael Hsieh", 90.5, 85.0, 95, 89.3);
        System.out.println(reportCard);

        System.out.println("next semester's report card:");
        reportCard.setName("Michael Hsieh");
        reportCard.setEnglishGrade(99);
        reportCard.setMathGrade(100);
        reportCard.setHistoryGrade(100.5);
        reportCard.setChemistryGrade(98.0);
        System.out.println(reportCard);
    }
}
