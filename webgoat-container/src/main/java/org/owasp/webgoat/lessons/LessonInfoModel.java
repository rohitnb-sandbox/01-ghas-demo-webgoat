package org.owasp.webgoat.lessons;

/**
 * <p>LessonInfoModel class.</p>
 *
 * @author dm
 * @version $Id: $Id
 */
public class LessonInfoModel {
    private String lessonTitle;
    private boolean hasSource;
    private boolean hasSolution;
    private boolean hasPlan;

    public String getLessonTitle() {
        return this.lessonTitle;
    }

    public boolean isHasSource() {
        return this.hasSource;
    }

    public boolean isHasSolution() {
        return this.hasSolution;
    }

    public boolean isHasPlan() {
        return this.hasPlan;
    }

    public LessonInfoModel(final String lessonTitle, final boolean hasSource, final boolean hasSolution, final boolean hasPlan) {
        this.lessonTitle = lessonTitle;
        this.hasSource = hasSource;
        this.hasSolution = hasSolution;
        this.hasPlan = hasPlan;
    }
}
