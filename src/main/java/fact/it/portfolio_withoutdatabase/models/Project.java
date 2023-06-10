package fact.it.portfolio_withoutdatabase.models;

public class Project {
    private String title;
    private String course;
    private String year;
    private String type;
    private String summary;
    private String technical;
    private String roles;
    private String solution;
    private String background;
    private String image1;
    private String image2;

    public Project() {
    }

    public Project(String title, String course, String year, String type, String summary, String technical, String roles, String solution, String background, String image1, String image2) {
        this.title = title;
        this.course = course;
        this.year = year;
        this.type = type;
        this.summary = summary;
        this.technical = technical;
        this.roles = roles;
        this.solution = solution;
        this.background = background;
        this.image1 = image1;
        this.image2 = image2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTechnical() {
        return technical;
    }

    public void setTechnical(String technical) {
        this.technical = technical;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }}

