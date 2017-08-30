package gov.jiusan.star.score;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Marcus Lin
 */
@Entity
@Table(name = "score")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Long seq;

    /**
     * 会议活动得分，多个评选项，用 JSON 存放
     */
    @Column(name = "confer_activity", nullable = false)
    private String conferActivity;

    /**
     * 社务工作得分，多个评选项，用 JSON 存放
     */
    @Column(name = "social_work", nullable = false)
    private String socialWork;

    /**
     * 参政议政得分，多个评选项，用 JSON 存放
     */
    @Column(name = "politic_activity", nullable = false)
    private String politicActivity;

    /**
     * 社会服务得分，多个评选项，用 JSON 存放
     */
    @Column(name = "social_contribution", nullable = false)
    private String socialContribution;

    /**
     * 宣传报道得分
     */
    @Column(name = "publicity", nullable = false)
    private int publicity;

    /**
     * 下属支社年度考核结果得分
     */
    @Column(name = "sub_assessment", nullable = false)
    private int subAssessment;

    /**
     * 总分
     */
    @Column(name = "total", nullable = false)
    private int total;

    public Score() {
    }

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public String getConferActivity() {
        return conferActivity;
    }

    public void setConferActivity(String conferActivity) {
        this.conferActivity = conferActivity;
    }

    public String getSocialWork() {
        return socialWork;
    }

    public void setSocialWork(String socialWork) {
        this.socialWork = socialWork;
    }

    public String getPoliticActivity() {
        return politicActivity;
    }

    public void setPoliticActivity(String politicActivity) {
        this.politicActivity = politicActivity;
    }

    public String getSocialContribution() {
        return socialContribution;
    }

    public void setSocialContribution(String socialContribution) {
        this.socialContribution = socialContribution;
    }

    public int getPublicity() {
        return publicity;
    }

    public void setPublicity(int publicity) {
        this.publicity = publicity;
    }

    public int getSubAssessment() {
        return subAssessment;
    }

    public void setSubAssessment(int subAssessment) {
        this.subAssessment = subAssessment;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
