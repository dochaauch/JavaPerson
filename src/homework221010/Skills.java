package homework221010;

public class Skills {
    private boolean javaSkill = true;
    private boolean englishSkill  = true;

    public Skills(boolean javaSkill, boolean englishSkill) {
        this.javaSkill = javaSkill;
        this.englishSkill = englishSkill;
    }

    public Skills() {
    }

    @Override
    public String toString() {
        return "Skills{" +
                "Java skill: " + javaSkill +
                ", english language skill: " + englishSkill +
                '}';
    }
}
