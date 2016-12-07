
/**
 * Created by fat on 2016/12/6.
 */

public class ReportCard {

    private int mYear;

    private String mCourseName;

    private String mGrade;

    // Constructor
    public ReportCard(int year, String courseName, String grade) {
        mYear = year;
        mCourseName = courseName;
        mGrade = grade;
    }

    public void setmCouseName(String mCourseName) {
        this.mCourseName = mCourseName;
    }

    public void setmGrade(String mGrade) {
        this.mGrade = mGrade;
    }

    public void setmYear(int mYear) {
        this.mYear = mYear;
    }

    public int getmYear() {
        return mYear;
    }

    public String getmCourseName() {
        return mCourseName;
    }

    public String getmGrade() {
        return mGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mCourseName='" + mCourseName + '\'' +
                ", mYear=" + mYear +
                ", mGrade='" + mGrade + '\'' +
                '}';
    }
}

